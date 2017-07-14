package com.nun.wjq.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.nun.wjq.project.mapper.ProjectMapper;
import com.nun.wjq.project.mapper.TeacherMapper;
import com.nun.wjq.project.model.Project;
import com.nun.wjq.project.model.ProjectWithBLOBs;
import com.nun.wjq.project.model.Teacher;
import com.nun.wjq.project.result.Pst;
import com.nun.wjq.project.service.ProjectService;
import com.nun.wjq.project.service.TeacherService;

@Controller
@RequestMapping("/teachergoto")
public class TeacherController {
	@Autowired TeacherMapper teacherMapper;
	@Autowired TeacherService teacherService;
	@Autowired ProjectMapper projectMapper;
	@Autowired ProjectService projectService;
	
	//---------------------数据操作--------------------------//
	@RequestMapping("/getName.action")
	public @ResponseBody Teacher getTeacherByTnumber(String tnumber){
		System.out.println(tnumber);
		Teacher t = teacherMapper.selectByTnumber(tnumber);
		if(t!=null){
			return t;
		}else{
			t = new Teacher();
			t.setTname("");
		}
		return t;
	}
	
	/**
	 * 更新密码
	 * @param session
	 * @return
	 */
	@RequestMapping("/updatepass.action")
	public ModelAndView updatepass(HttpSession session,String newpass,String renewpass,String mpass){
		ModelAndView m = new ModelAndView();
		Teacher t = (Teacher)session.getAttribute("teacher");
		if(renewpass.equals(newpass)&&mpass.equals(t.getTpassword())){
			t.setTpassword(renewpass);
			teacherService.updateTeacherInfoById(t);
			session.setAttribute("teacher", t);
			m.addObject("message", "密码修改成功！");
			m.setViewName("/WEB-INF/teacher/pass.jsp");
		}else{
			m.addObject("message", "两次密码不一致，或者当前密码错误！");
			m.setViewName("/WEB-INF/teacher/pass.jsp");
		}
		return m;
	}
	
	/**
	 * 老师更新信息
	 * @param session
	 * @param t
	 * @return
	 */
	@RequestMapping("/updateinfo.action")
	public ModelAndView updateinfo(HttpSession session,Teacher t){
		ModelAndView m = new ModelAndView();
		teacherService.updateTeacherInfoById(t);
		session.setAttribute("teacher", t);
		m.setViewName("/WEB-INF/teacher/setinfo.jsp");
		m.addObject("message", "信息修改成功！");
		return m;
	}
	/**
	 * 指导老师老师填写审核意见
	 * @param session
	 * @param t
	 * @return
	 */
	@RequestMapping("/fullcheckidea.action")
	public ModelAndView fullcheckidea(ProjectWithBLOBs project,int ispass){
		ModelAndView m = new ModelAndView();
		//老师审核完毕设置为1
		if(ispass==1){
			project.setTostatus(1);
		}else{
			project.setTostatus(0);
		}
		projectService.updateProjectInfoById(project);
		m.setViewName("/WEB-INF/tips.jsp");
		m.addObject("message", "审核成功！");
		return m;
	}
	
	
	//---------------------页面跳转--------------------------//
	
	//点击去修改密码的页面
	@RequestMapping("/gotosetpass.action")
	public String gotosetpass(){
		return "/WEB-INF/teacher/pass.jsp";
	}
	//点击完善信息	
	@RequestMapping("/setinfo.action")
	public ModelAndView setinfo(HttpSession session){
		ModelAndView m = new ModelAndView();
		Teacher t =  (Teacher)session.getAttribute("teacher");
		if(t!=null){
			m.setViewName("/WEB-INF/teacher/setinfo.jsp");
			m.addObject("teacher", t);
		}else{
			m.setViewName("/WEB-INF/login.jsp");
		}
		return m;
	}
	//老师点击审核项目列出需要审核的项目
	@RequestMapping("/listAllProjecByTid.action")
	public ModelAndView listAllProjecByTid(HttpSession session){
		ModelAndView m = new ModelAndView();
		Teacher t = (Teacher) session.getAttribute("teacher");
		Project p = new Project();
		p.setTid(t.getTid());
		p.setTostatus(0);
		p.setIsissue(1);
		List <Pst> projectList = projectMapper.selectProjectByTid(p);
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/teacher/projectlist.jsp");
		return m;
	}
	//老师点击变更申请
	@RequestMapping("/listAllChangeProjecByTid.action")
	public ModelAndView listChangeProjectByTeacher(HttpSession session){
		ModelAndView m = new ModelAndView();
		Teacher t = (Teacher) session.getAttribute("teacher");
		int tid = t.getTid();
		Project p = new Project();
		//封装project老师的id
		p.setTid(tid);
		//设置是否改变状态为1
		p.setIschange(1);
		//变更状态为0（0等待老师审核，-1不通过，1等待学院审核，2等待学校审核，3审核通过）
		p.setChangestatus(0);
		//团队项目不需要指导老师审核变更（直接是创新创业学院审核就可以）
		//设置是团队项目
		p.setIsteam(0);
		List <Pst> projectList = projectMapper.selectProjectByTid(p);
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/teacher/changeprojectlist.jsp");
		return m;
	}
	
	
	//老师点击撤项申请
	@RequestMapping("/listAllRemoveProjecByTid.action")
	public ModelAndView listRemoveProjectByTeacher(HttpSession session){
		ModelAndView m = new ModelAndView();
		Teacher t = (Teacher) session.getAttribute("teacher");
		int tid = t.getTid();
		Project p = new Project();
		//封装project老师的id
		p.setTid(tid);
		//设置是否改变状态为1
		p.setIsremove(1);
		//变更状态为0（0等待老师审核，-1不通过，1等待学院审核，2等待学校审核，3审核通过）
		p.setRemovestatus(0);
		//设置是团队项目
		p.setIsteam(0);
		List <Pst> projectList = projectMapper.selectProjectByTid(p);
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/teacher/removeprojectlist.jsp");
		return m;
	}
	
	
	//老师点击全部项目
	@RequestMapping("/selectAllProjecByTid.action")
	public ModelAndView selectAllProjecByTid(HttpSession session){
		ModelAndView m = new ModelAndView();
		Teacher t = (Teacher) session.getAttribute("teacher");
		int tid = t.getTid();
		Project p = new Project();
		//封装project老师的id
		p.setTid(tid);
		//变更状态为0（0等待老师审核，-1不通过，1等待学院审核，2等待学校审核，3审核通过）
		p.setTostatus(3);
		//设置是团队项目
		List <Pst> projectList = projectMapper.selectProjectByTid(p);
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/teacher/removeprojectlist.jsp");
		return m;
	}
	
	//老师点击审核项目，跳转到审核的页面上去
	@RequestMapping("/teachergotocheck.action")
	public ModelAndView teachergotocheck(Pst p){
		ModelAndView m = new ModelAndView();
		m.addObject("pst", p);
		m.setViewName("/WEB-INF/teacher/teachercheckproject.jsp");
		return m;
	}
	
	
}
