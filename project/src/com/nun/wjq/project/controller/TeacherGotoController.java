package com.nun.wjq.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.nun.wjq.project.mapper.TeacherMapper;
import com.nun.wjq.project.model.Teacher;
import com.nun.wjq.project.service.TeacherService;

@Controller
@RequestMapping("/teachergoto")
public class TeacherGotoController {
	@Autowired TeacherMapper teacherMapper;
	@Autowired TeacherService teacherService;
	
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
		m.setViewName("/WEB-INF/student/setinfo.jsp");
		m.addObject("message", "信息修改成功！");
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
	
}
