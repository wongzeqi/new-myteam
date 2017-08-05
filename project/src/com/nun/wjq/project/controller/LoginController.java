package com.nun.wjq.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nun.wjq.project.fileupload.UploadStatus;
import com.nun.wjq.project.mapper.AcademyMapper;
import com.nun.wjq.project.mapper.AcademyadminMapper;
import com.nun.wjq.project.mapper.NoticeMapper;
import com.nun.wjq.project.mapper.ParentmeunMapper;
import com.nun.wjq.project.mapper.SchooladminMapper;
import com.nun.wjq.project.mapper.SonmeunMapper;
import com.nun.wjq.project.mapper.StudentMapper;
import com.nun.wjq.project.mapper.TeacherMapper;
import com.nun.wjq.project.model.Academy;
import com.nun.wjq.project.model.Academyadmin;
import com.nun.wjq.project.model.Notice;
import com.nun.wjq.project.model.Parentmeun;
import com.nun.wjq.project.model.Schooladmin;
import com.nun.wjq.project.model.Sonmeun;
import com.nun.wjq.project.model.Student;
import com.nun.wjq.project.model.Teacher;
import com.nun.wjq.project.parameter.User;
import com.nun.wjq.project.result.Meun;
/**
 * 
 * @author 王嘉琪
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	TeacherMapper teacherMapper;
	@Autowired
	ParentmeunMapper parentmeunMapper;
	@Autowired
	AcademyadminMapper academyadminMapper;
	@Autowired 
	SchooladminMapper schooladminMapper;
	@Autowired 
	SonmeunMapper sonmeunMapper;
	@Autowired
	AcademyMapper academyMapper;
	@Autowired 
	NoticeMapper noticeMapper; 
	/**
	 * 学院登录
	 * @param user
	 * @param session
	 * @return
	 * @throws Exception
	 */
	private void  removesession(HttpSession session){
		session.removeAttribute("teacher");
		session.removeAttribute("student");
		session.removeAttribute("academyadmin");
		session.removeAttribute("schooladmin");
	}
	
	
	@RequestMapping("/academylogin.html")
	public ModelAndView academylogin(User user,HttpSession session) throws Exception{
		
		ModelAndView modelAndView = new ModelAndView();
		Academyadmin a = academyadminMapper.login(user);
		if(a!=null){
			removesession(session);
			session.setAttribute("academyadmin", a);
			List <Notice> notices = noticeMapper.selectAllNotice();
			session.setAttribute("notices", notices);
			//查询权限菜单
			List <Parentmeun> allParentmeun = parentmeunMapper.getParentMeuns3();
			List <Sonmeun> sonmeun = sonmeunMapper.getSonmeuns3();
			Meun m = new Meun();
			m.setPmeun(allParentmeun);
			m.setSmeun(sonmeun);
			modelAndView.addObject("meun", m);
			modelAndView.setViewName("/WEB-INF/index.jsp");
			
			//....
		}else{
			modelAndView.addObject("message", "用户名密码有错！");
			modelAndView.setViewName("/WEB-INF/error/error.jsp");
		}
		return modelAndView;
	}
	/**
	 * 学校登录最高权限
	 * @param user
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/schoollogin.html")
	public ModelAndView schoollogin(User user,HttpSession session) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		Schooladmin s = schooladminMapper.login(user);
		if(s!=null){
			removesession(session);
			session.setAttribute("schooladmin", s);
			//查询权限菜单
			List <Notice> notices = noticeMapper.selectAllNotice();
			session.setAttribute("notices", notices);
			List <Parentmeun> allParentmeun = parentmeunMapper.getParentMeuns4();
			List <Sonmeun> sonmeun = sonmeunMapper.getSonmeuns4();
			
			List<Academy> academys = academyMapper.selectByExample(null);
			Meun m = new Meun();
			m.setPmeun(allParentmeun);
			m.setSmeun(sonmeun);
			modelAndView.addObject("meun", m);
			session.setAttribute("academys", academys);
			modelAndView.setViewName("/WEB-INF/index.jsp");
			//....
		}else{
			modelAndView.addObject("message", "用户名密码有错！");
			modelAndView.setViewName("/WEB-INF/error/error.jsp");
		}
		return modelAndView;
	}
	/**
	 * 学生登录方法
	 * @param user
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/studentlogin.html")
	public ModelAndView studentlogin(User user,HttpSession session) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		Student s = studentMapper.login(user);
		if(s!=null){
			System.out.println(s.getSname());
			removesession(session);
			session.setAttribute("student", s);
			UploadStatus uploadStatus = new UploadStatus();
			session.setAttribute("upload_status", uploadStatus);
			//查询权限菜单
			List <Parentmeun> allParentmeun = parentmeunMapper.getParentMeuns1();
			List <Sonmeun> sonmeun = sonmeunMapper.getSonmeuns1();
			List <Notice> notices = noticeMapper.selectAllNotice();
			for(Parentmeun son :allParentmeun ){
				System.out.println(son.getPmeunname());
			}
			for(Sonmeun son :sonmeun ){
				System.out.println(son.getSmeunname());
			}
			Meun m = new Meun();
			m.setPmeun(allParentmeun);
			m.setSmeun(sonmeun);
			modelAndView.addObject("meun", m);
			session.setAttribute("notices", notices);
			modelAndView.setViewName("/WEB-INF/index.jsp");
			//....
		}else{
			modelAndView.addObject("message", "用户名密码有错！");
			modelAndView.setViewName("/WEB-INF/error/error.jsp");
		}
		return modelAndView;
	}
	/**
	 * 老师登录方法
	 * @param user
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/teacherlogin.html")
	public ModelAndView teacherlogin(User user,HttpSession session) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		Teacher t = teacherMapper.login(user);
		if(t!=null){
			removesession(session);
			session.setAttribute("teacher",t);
			List <Notice> notices = noticeMapper.selectAllNotice();
			session.setAttribute("notices", notices);
			//查询权限菜单
			List <Parentmeun> allParentmeun = parentmeunMapper.getParentMeuns2();
			List <Sonmeun> sonmeun = sonmeunMapper.getSonmeuns2();
			Meun m = new Meun();
			m.setPmeun(allParentmeun);
			m.setSmeun(sonmeun);
			modelAndView.addObject("meun", m);
			modelAndView.setViewName("/WEB-INF/index.jsp");
			//....
		}else{
			modelAndView.addObject("message", "用户名密码有错！");
			modelAndView.setViewName("/WEB-INF/error/error.jsp");
		}
		return modelAndView;
	}
	
	@RequestMapping("/goto.html")
	public String gotoLogin(HttpSession session) throws Exception{
		removesession(session);
		return "/WEB-INF/login.jsp";
	}
	
}
