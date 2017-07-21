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
import com.nun.wjq.project.model.ProjectWithBLOBs;
import com.nun.wjq.project.model.Student;
import com.nun.wjq.project.model.Teacher;
import com.nun.wjq.project.parameter.AcademySelectProject;
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
		//学院查询项目的条件
		AcademySelectProject asp = new AcademySelectProject();
		asp.setAcademyname(ac.getAcademyname()); 
		asp.setTostatus(1);
		asp.setIsteam(0);
		List<Pst> projectList = projectMapper.selectProjectByAcademyadmin(asp);
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/academyadmin/projectlist.jsp");
		return m;
	}
	
	//学院管理员点击已经项目审核（差不是团队）
	@RequestMapping("/academycheckedlistproject.action")
	public ModelAndView academycheckedlistproject(HttpSession session ){
		ModelAndView m = new ModelAndView();
		//查询条件
		Academyadmin ac = (Academyadmin)session.getAttribute("academyadmin");
		//学院查询项目的条件
		AcademySelectProject asp = new AcademySelectProject();
		asp.setAcademyname(ac.getAcademyname()); 
		//
		asp.setTostatus(1);
		List<Pst> projectList = projectMapper.selectCheckedProjectByAcademyadmin(asp);
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
		AcademySelectProject asp = new AcademySelectProject();
		asp.setAcademyname(ac.getAcademyname()); 
		asp.setIschange(1);
		//指导老师通过的审核
		asp.setChangestatus(1);
		List<Pst> projectList = projectMapper.selectProjectByAcademyadmin(asp);
		
		
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/academyadmin/changeprojectlist.jsp");
		return m;
	}
	
	
	//点击已经审核过的变更申请
	@RequestMapping("/academyyijichangecheck.action")
	public ModelAndView academyyijichangecheck(HttpSession session ){
		ModelAndView m = new ModelAndView();
		//查询条件
		Academyadmin ac = (Academyadmin)session.getAttribute("academyadmin");
		AcademySelectProject asp = new AcademySelectProject();
		asp.setAcademyname(ac.getAcademyname()); 
		asp.setIschange(1);
		//指导老师通过的审核
		List<Pst> projectList = projectMapper.selectChangeCheckedProjectByAcademyadmin(asp);
		
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
		AcademySelectProject asp = new AcademySelectProject();
		asp.setAcademyname(ac.getAcademyname()); 
		asp.setIsremove(1);
		asp.setRemovestatus(1);
		List<Pst> projectList = projectMapper.selectProjectByAcademyadmin(asp);
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/academyadmin/removeprojectlist.jsp");
		return m;
	}
	
	//点击撤项审核
	@RequestMapping("/academyyijiremovecheck.action")
	public ModelAndView academyyijremovecheck(HttpSession session ){
		ModelAndView m = new ModelAndView();
		//查询条件
		Academyadmin ac = (Academyadmin)session.getAttribute("academyadmin");
		AcademySelectProject asp = new AcademySelectProject();
		asp.setAcademyname(ac.getAcademyname()); 
		asp.setIsremove(1);
		List<Pst> projectList = projectMapper.selectRemoveProjectCheckedByAcademyadmin(asp);
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/academyadmin/removeprojectlist.jsp");
		return m;
	}
	
	
	
	//学院管理员点击审核项目
	@RequestMapping("/academyadmingotocheck.action")
	public ModelAndView academyadmingotocheck(Pst p){
		ModelAndView m = new ModelAndView();
		//还要查询出指导老师给的意见
		ProjectWithBLOBs project =  projectMapper.selectByPrimaryKey(p.getPid());
		p.setTeachercheckidea(project.getTeachercheckidea());
		m.addObject("pst", p);
		m.setViewName("/WEB-INF/academyadmin/academycheckproject.jsp");
		return m;
	}
	
	//学院点击查看详情
	@RequestMapping("/getProjectInfoById.action")
	public ModelAndView getProjectInfoById(int pid){
		ModelAndView m = new ModelAndView();
		//查询到项目的信息
		ProjectWithBLOBs project = projectMapper.selectByPrimaryKey(pid);
		//查询老师的信息
		Teacher teacher = teacherMapper.selectByPrimaryKey(project.getTid());
		//获取学生的信息
		Student s = studentMapper.selectByPrimaryKey(project.getSid());

		m.addObject("teacher",teacher);
		m.addObject("project", project);
		//添加负责人信息
		m.addObject("fzr", s);
		m.setViewName("/WEB-INF/academyadmin/projectinfo.jsp");
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
		Academyadmin s = (Academyadmin)session.getAttribute("academyadmin");
		if(renewpass.equals(newpass)&&mpass.equals(s.getPassword())){
			s.setPassword(renewpass);
			academyadminService.updateAcademyadminInfoById(s);
			session.setAttribute("academyadmin", s);
			m.addObject("message", "密码修改成功！");
			m.setViewName("/WEB-INF/academyadmin/pass.jsp");
		}else{
			m.addObject("message", "两次密码不一致，或者当前密码错误！");
			m.setViewName("/WEB-INF/academyadmin/pass.jsp");
		}
		return m;
	}
	
	/**
	 * 学院填写审核意见
	 * @param project
	 * @param ispass
	 * @param idea
	 * @return
	 */
	@RequestMapping("/fullcheckidea.action")
	public ModelAndView fullcheckidea(ProjectWithBLOBs project,int ispass,String[]  idea){
		ModelAndView m = new ModelAndView();
		//老师审核完毕设置为1
		if(ispass==1){
			project.setTostatus(2);
		}else{
			project.setTostatus(-2);
		}
		//将第二个学院填写的意见设置进去
		project.setAcademycheckidea(idea[1]);
		projectService.updateProjectInfoById(project);
		m.setViewName("/WEB-INF/tips.jsp");
		m.addObject("message", "审核成功！");
		return m;
	}	
	
	/**
	 * 学院点击同意变更
	 */
	
	@RequestMapping("/agreechange.action")
	public ModelAndView agreechange(ProjectWithBLOBs project){
		ModelAndView m = new ModelAndView();
		project.setChangestatus(2);
		//将第二个学院填写的意见设置进去
		projectService.updateProjectInfoById(project);
		m.setViewName("/WEB-INF/tips.jsp");
		m.addObject("message", "操作成功！");
		return m;
	}	
	
	
	/**
	 * 学院点击bu同意变更
	 */
	
	@RequestMapping("/disagreechange.action")
	public ModelAndView disagreechange(ProjectWithBLOBs project){
		ModelAndView m = new ModelAndView();
		project.setChangestatus(-2);
		//将第二个学院填写的意见设置进去
		projectService.updateProjectInfoById(project);
		m.setViewName("/WEB-INF/tips.jsp");
		m.addObject("message", "操作成功！");
		return m;
	}
	
}
