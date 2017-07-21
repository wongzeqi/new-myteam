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
import com.nun.wjq.project.model.ProjectWithBLOBs;
import com.nun.wjq.project.model.Schooladmin;
import com.nun.wjq.project.result.Pst;
import com.nun.wjq.project.service.ProjectService;
import com.nun.wjq.project.service.SchooladminService;
import com.nun.wjq.project.service.StudentService;

@Controller
@RequestMapping("/schooladmin")
public class SchoolController {
	//----------------------依赖注入--------------------------------//
	@Autowired StudentService studentService;
	@Autowired StudentMapper studentMapper;
	@Autowired ProjectMapper projectMapper;
	@Autowired ProjectService projectService;
	@Autowired TeacherMapper teacherMapper;
	@Autowired SchooladminService schooladminService;
	//----------------------点击菜单跳转页面--------------------------//
		
	//点击去修改密码的页面
	@RequestMapping("/gotosetpass.action")
	public String gotosetpass(){
		return "/WEB-INF/schooladmin/pass.jsp";
	}	
	
	//学院管理员点击项目审核（差不是团队）
	@RequestMapping("/schoollistproject.action")
	public ModelAndView schoollistproject(){
		ModelAndView m = new ModelAndView();
		//查询条件
		//学院查询项目的条件
		ProjectWithBLOBs p = new ProjectWithBLOBs();
		//学院已经审核的项目
		p.setTostatus(2);
		List<Pst> projectList = projectMapper.schoolSelectProject(p);
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/schooladmin/projectlist.jsp");
		return m;
	}
	
	
	
	
	/**
	 * 更新密码学院管理员 修改密码
	 * @param session
	 * @param academyadmin
	 * @return
	 */
	@RequestMapping("/updatepass.action")
	public ModelAndView updatepass(HttpSession session,String newpass,String renewpass,String mpass){
		ModelAndView m = new ModelAndView();
		Schooladmin s = (Schooladmin)session.getAttribute("schooladmin");
		if(renewpass.equals(newpass)&&mpass.equals(s.getPassword())){
			s.setPassword(renewpass);
			schooladminService.updateSchooladminInfoById(s);
			session.setAttribute("schooladmin", s);
			m.addObject("message", "密码修改成功！");
			m.setViewName("/WEB-INF/schooladmin/pass.jsp");
		}else{
			m.addObject("message", "两次密码不一致，或者当前密码错误！");
			m.setViewName("/WEB-INF/schooladmin/pass.jsp");
		}
		return m;
	}	
	
	
	
		
}
