package com.nun.wjq.project.controller;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.nun.wjq.project.mapper.ProjectMapper;
import com.nun.wjq.project.mapper.StudentMapper;
import com.nun.wjq.project.model.Project;
import com.nun.wjq.project.model.ProjectWithBLOBs;
import com.nun.wjq.project.model.Student;
import com.nun.wjq.project.result.Pst;
import com.nun.wjq.project.service.ProjectService;
import com.nun.wjq.project.service.StudentService;

@Controller
@RequestMapping("/studentgoto")
public class StudentGoController {
	//----------------------依赖注入--------------------------------//
	@Autowired StudentService studentService;
	@Autowired StudentMapper studentMapper;
	@Autowired ProjectMapper projectMapper;
	@Autowired ProjectService projectService;
	//----------------------点击菜单跳转页面--------------------------//
	//点击完善信息将session传递进来
	@RequestMapping("/setinfo.action")
	public ModelAndView setinfo(HttpSession session){
		ModelAndView m = new ModelAndView();
		Student s =  (Student)session.getAttribute("student");
		if(s!=null){
			m.setViewName("/WEB-INF/student/setinfo.jsp");
			m.addObject("student", s);
		}else{
			m.setViewName("/WEB-INF/login.jsp");
		}
		return m;
	}
	//点击去修改密码的页面
	@RequestMapping("/gotosetpass.action")
	public String gotosetpass(){
		return "/WEB-INF/student/pass.jsp";
	}
	
	
	
	//点击申请项目页面
	@RequestMapping("/applyproject.action")
	public ModelAndView applyproject(HttpSession session){
		Student s  = (Student) session.getAttribute("student");
		ModelAndView m = new ModelAndView();
		m.addObject("student", s);
		m.setViewName("/WEB-INF/student/applyproject.jsp");
		return m;
	}
	//点击查看我的项目(包括我参与的项目)
	@RequestMapping("/listproject.action")
	public ModelAndView listproject(HttpSession session){
		Student s  = (Student) session.getAttribute("student");
		ModelAndView m = new ModelAndView();
		List <Pst>  projectList = projectMapper.selectBySidOrStu(s);
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/student/projectlist.jsp");
		return m;
	}
	
	//点击项目变更申请（列出变更的项目除国家级区级的之外）  项目名称  项目的
	@RequestMapping("/listprojecttochange.action")
	public ModelAndView listprojecttochange(HttpSession session){
		ModelAndView m = new ModelAndView();
		Project p = new Project();
		Student s = (Student)session.getAttribute("student");
		p.setSid(s.getSid());
		p.setPrank("c");//团队项目
		p.setOfficemark("d");//校级项目
		List<Project> projectList =  projectMapper.selectBySidAndPrank(p);
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/student/submitchange.jsp");
		return m;
	}
	//点击项目变更申请（列出变更的项目除国家级区级的之外）  项目名称  项目的
		@RequestMapping("/listprojecttoexit.action")
		public ModelAndView listprojecttoexit(HttpSession session){
			ModelAndView m = new ModelAndView();
			Project p = new Project();
			Student s = (Student)session.getAttribute("student");
			p.setSid(s.getSid());
			p.setPrank("c");//团队项目
			p.setOfficemark("d");//校级项目
			List<Project> projectList =  projectMapper.selectBySidAndPrank(p);
			m.addObject("projectList", projectList);
			m.setViewName("/WEB-INF/student/submitexit.jsp");
			return m;
		}
	
	
	//----------------------数据操作---------------------------------//
	
	/**
	 * 学生更新自己的信息
	 * @param session
	 * @param student
	 * @return
	 */
	@RequestMapping("/updateinfo.action")
	public ModelAndView updateinfo(HttpSession session,Student student){
		ModelAndView m = new ModelAndView();
		studentService.updateStudentInfoById(student);
		session.setAttribute("student", student);
		m.setViewName("/WEB-INF/student/setinfo.jsp");
		m.addObject("message", "信息修改成功！");
		return m;
	}
	/**
	 * 更新密码
	 * @param session
	 * @param student
	 * @return
	 */
	@RequestMapping("/updatepass.action")
	public ModelAndView updatepass(HttpSession session,String newpass,String renewpass,String mpass){
		ModelAndView m = new ModelAndView();
		Student s = (Student)session.getAttribute("student");
		if(renewpass.equals(newpass)&&mpass.equals(s.getSpassword())){
			s.setSpassword(renewpass);
			studentService.updateStudentInfoById(s);
			session.setAttribute("student", s);
			m.addObject("message", "密码修改成功！");
			m.setViewName("/WEB-INF/teacher/pass.jsp");
		}else{
			m.addObject("message", "两次密码不一致，或者当前密码错误！");
			m.setViewName("/WEB-INF/teacher/pass.jsp");
		}
		return m;
	}
	
	/**
	 * 学生申请竞赛项目
	 * @param session
	 * @param content
	 * @param projectWithBLOBs
	 * @return
	 */
	@RequestMapping("/applyprojectsubmit.action")
	public ModelAndView applyproject(HttpSession session,String[] content,ProjectWithBLOBs projectWithBLOBs){
		ModelAndView m = new ModelAndView();
		Student s = (Student)session.getAttribute("student");
		//设置项目简介
		projectWithBLOBs.setPintroduction(content[0]);
		//设置项目背景
		projectWithBLOBs.setPbackground(content[1]);
		//设置项目的主要内容
		projectWithBLOBs.setPcontent(content[2]);
		//设置项目方案
		projectWithBLOBs.setPscheme(content[3]);
		//设置项目的基本条件
		projectWithBLOBs.setPcondition(content[4]);
		//设置项目的总体目标
		projectWithBLOBs.setPtarget(content[5]);
		//设置项目的进度
		projectWithBLOBs.setPprogress(content[6]);
		//设置项目负责人
		projectWithBLOBs.setSid(s.getSid());
		//设置项目年份
		Calendar cal = Calendar.getInstance();
		projectWithBLOBs.setTheyear(cal.get(Calendar.YEAR));
		if(projectWithBLOBs.getPrank().equals("c")){
			projectWithBLOBs.setIsissue(1);
		}
		projectService.insertProject(projectWithBLOBs);
		m.setViewName("/WEB-INF/tips.jsp");
		m.addObject("message", "项目成功申请！");
		m.addObject("success", "success");
		return m;
	}
	
	
	//----------------------json---------------------//
	@RequestMapping("/getName.action")
	public @ResponseBody Student getTeacherByTnumber(String snumber){
		Student s = studentMapper.selectByTnumber(snumber);
		if(s!=null){
			return s;
		}else{
			s = new Student();
			s.setSname("");
		}
		return s;
	}
	
	
	
}
