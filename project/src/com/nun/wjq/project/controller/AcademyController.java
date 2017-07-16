package com.nun.wjq.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nun.wjq.project.mapper.ProjectMapper;
import com.nun.wjq.project.mapper.StudentMapper;
import com.nun.wjq.project.mapper.TeacherMapper;
import com.nun.wjq.project.model.Academyadmin;
import com.nun.wjq.project.result.Pst;
import com.nun.wjq.project.service.AcademyadminService;
import com.nun.wjq.project.service.ProjectService;
import com.nun.wjq.project.service.StudentService;

@Controller
@RequestMapping("/academyadmin")
public class AcademyController {
	//----------------------依赖注入--------------------------------//
	@Autowired StudentService studentService;
	@Autowired StudentMapper studentMapper;
	@Autowired ProjectMapper projectMapper;
	@Autowired ProjectService projectService;
	@Autowired TeacherMapper teacherMapper;
	@Autowired AcademyadminService academyadminService;
	
	//----------------------点击菜单跳转页面--------------------------//
		
	//点击去修改密码的页面
	@RequestMapping("/gotosetpass.action")
	public String gotosetpass(){
		return "/WEB-INF/academyadmin/pass.jsp";
	}
	//学院管理员点击项目审核（差不是团队）
	@RequestMapping("/academylistproject.action")
	public ModelAndView academylistproject(HttpSession session ){
		ModelAndView m = new ModelAndView();
		//查询条件
		Academyadmin ac = (Academyadmin)session.getAttribute("academyadmin");
		List<Pst> projectList = projectMapper.selectProjectByAcademyadmin(ac.getAcademyname());
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/academyadmin/projectlist.jsp");
		return m;
	}
	//点击变更审核
	@RequestMapping("/academychangecheck.action")
	public ModelAndView academychangecheck(HttpSession session ){
		ModelAndView m = new ModelAndView();
		//查询条件
		Academyadmin ac = (Academyadmin)session.getAttribute("academyadmin");
		List<Pst> projectList = projectMapper.selectChangeProjectByAcademyadmin(ac.getAcademyname());
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/academyadmin/changeprojectlist.jsp");
		return m;
	}
	//点击撤项审核
	@RequestMapping("/academyremovecheck.action")
	public ModelAndView academyremovecheck(HttpSession session ){
		ModelAndView m = new ModelAndView();
		//查询条件
		Academyadmin ac = (Academyadmin)session.getAttribute("academyadmin");
		List<Pst> projectList = projectMapper.selectRemoveProjectByAcademyadmin(ac.getAcademyname());
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/academyadmin/removeprojectlist.jsp");
		return m;
	}
	
	
	//------------------------------------数据操作---------------------//
	/**
	 * 更新密码学院管理员 修改密码
	 * @param session
	 * @param academyadmin
	 * @return
	 */
	@RequestMapping("/updatepass.action")
	public ModelAndView updatepass(HttpSession session,String newpass,String renewpass,String mpass){
		ModelAndView m = new ModelAndView();
		Academyadmin s = (Academyadmin)session.getAttribute("academy");
		if(renewpass.equals(newpass)&&mpass.equals(s.getPassword())){
			s.setPassword(renewpass);
			academyadminService.updateAcademyadminInfoById(s);
			session.setAttribute("academy", s);
			m.addObject("message", "密码修改成功！");
			m.setViewName("/WEB-INF/academyadmin/pass.jsp");
		}else{
			m.addObject("message", "两次密码不一致，或者当前密码错误！");
			m.setViewName("/WEB-INF/academyadmin/pass.jsp");
		}
		return m;
	}
		
	
	
}
