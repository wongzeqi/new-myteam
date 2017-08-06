package com.nun.wjq.project.controller;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.nun.wjq.project.mapper.NoticeMapper;
import com.nun.wjq.project.mapper.ProjectMapper;
import com.nun.wjq.project.mapper.StudentMapper;
import com.nun.wjq.project.mapper.TeacherMapper;
import com.nun.wjq.project.model.Notice;
import com.nun.wjq.project.model.ProjectAndPage;
import com.nun.wjq.project.model.ProjectWithBLOBs;
import com.nun.wjq.project.model.Schooladmin;
import com.nun.wjq.project.model.Student;
import com.nun.wjq.project.model.Teacher;
import com.nun.wjq.project.parameter.AcademySelectProject;
import com.nun.wjq.project.result.Pst;
import com.nun.wjq.project.service.ProjectService;
import com.nun.wjq.project.service.SchooladminService;
import com.nun.wjq.project.service.StudentService;
import com.nun.wjq.project.utils.ExportExcel;
import com.nun.wjq.project.utils.Page;

@Controller
@RequestMapping("/schooladmin")
public class SchoolController {
	// ----------------------依赖注入--------------------------------//
	@Autowired
	StudentService studentService;
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	ProjectMapper projectMapper;
	@Autowired
	ProjectService projectService;
	@Autowired
	TeacherMapper teacherMapper;
	@Autowired
	SchooladminService schooladminService;
	@Autowired 
	NoticeMapper noticeMapper;

	// ----------------------点击菜单跳转页面--------------------------//

	// 点击去修改密码的页面
	@RequestMapping("/gotosetpass.action")
	public String gotosetpass() {
		return "/WEB-INF/schooladmin/pass.jsp";
	}
	
	// 点击去修改密码的页面
	@RequestMapping("/gotoaddnotice.action")
	public String gotoaddnotice() {
		return "/WEB-INF/schooladmin/addnotice.jsp";
	}
	
	
	

	// 学校点击项目审核
	@RequestMapping("/schoollistproject/{prank}/{tostatus}")
	public ModelAndView schoollistproject(
			@PathVariable("prank") String prank, @PathVariable("tostatus") int tostatus, Page page,HttpServletRequest request) {
		ModelAndView m = new ModelAndView();
		//先将分页model给移除
		request.removeAttribute("page");
		
		
		if(null!=page.getTatalPage()){
			if(page.getPageCount()>page.getTatalPage()){
				m.addObject("message", "跳转页数超出范围！");
				m.setViewName("/WEB-INF/tips.jsp");
			}
		}
		
		// 查询条件
		// 学院查询项目的条件
		ProjectWithBLOBs p = new ProjectWithBLOBs();
		// 学院已经审核的项目
		p.setTostatus(tostatus);
		// 不是团队的项目
		p.setPrank(prank);

		ProjectAndPage pg = new ProjectAndPage();

		pg.setPage(page);
		pg.setProject(p);

		List<Pst> projectList = projectMapper.schooladminSelectProject(pg);
		int count = projectMapper.selectCount(pg);
		page.setTotalItemCount(count);
		page.setTatalPage(count%page.getItemCount() == 0 ? count/page.getItemCount() : count/page.getItemCount()+1);
		
		m.addObject("page",page);
		m.addObject("projectList", projectList);
		System.out.println(page.toString());
		m.addObject("prank", prank);
		m.addObject("tostatus", tostatus);
		m.setViewName("/WEB-INF/schooladmin/projectlist.jsp");
		return m;
	}

	// 学校点击项目审核
		@RequestMapping("/schoollistprojectjson/{prank}/{tostatus}")
		public @ResponseBody List<Pst> schoollistprojectjson(
				String academyname,int theyear,	@PathVariable("prank") String prank, @PathVariable("tostatus") int tostatus, Page page,HttpServletRequest request) {
			//先将分页model给移除
			request.removeAttribute("page");
			
			//暂时不处理
			if(null!=page.getTatalPage()){
				if(page.getPageCount()>page.getTatalPage()){
				}
			}
			
			// 查询条件
			// 学院查询项目的条件
			ProjectWithBLOBs p = new ProjectWithBLOBs();
			// 学院已经审核的项目
			p.setTostatus(tostatus);
			// 不是团队的项目
			p.setPrank(prank);
			p.setTheyear(theyear);
			ProjectAndPage pg = new ProjectAndPage();
			
			pg.setPage(page);
			pg.setProject(p);
			//封装查询条件
			pg.setAcademyname(academyname);
			List<Pst> projectList = projectMapper.schooladminSelectProject(pg);
			int count = projectMapper.selectCount(pg);
			page.setTotalItemCount(count);
			page.setTatalPage(count%page.getItemCount() == 0 ? count/page.getItemCount() : count/page.getItemCount()+1);
			
			request.setAttribute("page",page);
			//request.setAttribute("projectList", projectList);
			System.out.println(page.toString());
			request.setAttribute("prank", prank);
			request.setAttribute("tostatus", tostatus);
			return projectList;
		}
	
	
	////////////////////////这里是到处excel
	@RequestMapping("/download")
	 public  void downloadExcelFile(HttpServletResponse response){
    	List<Pst> projectList = projectMapper.schoolSelectProject(null);
        try {
            ExportExcel.exportExcel(projectList, response.getOutputStream());
            OutputStream out = new FileOutputStream("E://b.xls");
            ExportExcel.exportExcel(projectList,out);
            // 设置response参数，可以打开下载页面
            response.reset();  
            //设置response流信息的头类型，MIME码  
            response.setContentType("application/msexcel;charset=UTF-8");  
              
            response.addHeader("Content-Disposition", "attachment;filename=\""  
                        + new String(("创新实践项目信息表" +new Date().toString()+ ".xls").getBytes("GBK"),  
                                "UTF-8") + "\"");  
                
        }catch(Exception e){
        	
        }
	}

	////////这里是变更申请和侧向申请审核管理
	
	// 学校列出所有项目的变更申请schoollistchangeproject   s
	@RequestMapping("/schoollistchangeprojects/{torank}")
	public ModelAndView schoollistchangeprojects(
			@PathVariable("torank") String torank, Page page) {
		ModelAndView m = new ModelAndView();
		// 查询条件
		// 学院查询项目的条件
		ProjectWithBLOBs p = new ProjectWithBLOBs();
		// 学院已经审核的项目
		p.setTostatus(3);
		// 变更状态为2
		p.setIschange(1);
		p.setChangestatus(2);
		// 设置变更的等级
		p.setTorank(torank);
		
		//封装查询条件
		ProjectAndPage pg = new ProjectAndPage();
		pg.setPage(page);
		pg.setProject(p);
		
		//获取所需结果数据model
		List<Pst> projectList = projectMapper.schooladminSelectProject(pg);
		int count = projectMapper.selectCount(pg);
		page.setTotalItemCount(count);
		page.setTatalPage(count%page.getItemCount() == 0 ? count/page.getItemCount() : count/page.getItemCount()+1);
		m.addObject("page",page);
		m.addObject("projectList", projectList);
		
		
		if(torank.equals("a")){//变更到国家级
			m.setViewName("/WEB-INF/schooladmin/changetoranka.jsp");
		}else{
			m.setViewName("/WEB-INF/schooladmin/changetorankb.jsp");
		}
		return m;
	}
	
	//撤项管理
	@RequestMapping("/schoollistremoveprojects.action")
	public ModelAndView schoollistremoveprojects(Page page) {
		ModelAndView m = new ModelAndView();
		// 查询条件
		// 学院查询项目的条件
		ProjectWithBLOBs p = new ProjectWithBLOBs();
		// 学院已经审核的项目
		p.setTostatus(3);
		// 变更状态为2
		p.setIsremove(1);
		p.setRemovestatus(2);
		ProjectAndPage pg = new ProjectAndPage();
		pg.setPage(page);
		pg.setProject(p);
		
		//获取所需结果数据model
		List<Pst> projectList = projectMapper.schooladminSelectProject(pg);
		int count = projectMapper.selectCount(pg);
		page.setTotalItemCount(count);
		page.setTatalPage(count%page.getItemCount() == 0 ? count/page.getItemCount() : count/page.getItemCount()+1);
		m.addObject("page",page);
		m.addObject("projectList", projectList);
		
		
		
		m.setViewName("/WEB-INF/schooladmin/removeprojectlist.jsp");
		
		return m;
	}
	
	//////////////////////////////////////////////上传材料管理
	
	@RequestMapping("/projectfilelist/{prank}/{jieduan}")
	public ModelAndView projectfilelist(Page page,	@PathVariable("prank") String prank,	@PathVariable("jieduan") int jieduan) {
		ModelAndView m = new ModelAndView();
		// 查询条件
		// 学院查询项目的条件
		ProjectWithBLOBs p = new ProjectWithBLOBs();
		// 学院已经审核的项目
		p.setTostatus(3);
		// 变更状态为2
		p.setIsremove(1);
		p.setRemovestatus(2);
		ProjectAndPage pg = new ProjectAndPage();
		pg.setPage(page);
		pg.setProject(p);
		
		//获取所需结果数据model
		List<Pst> projectList = projectMapper.schooladminSelectProject(pg);
		int count = projectMapper.selectCount(pg);
		page.setTotalItemCount(count);
		page.setTatalPage(count%page.getItemCount() == 0 ? count/page.getItemCount() : count/page.getItemCount()+1);
		m.addObject("page",page);
		m.addObject("projectList", projectList);
		
		
		
		m.setViewName("/WEB-INF/schooladmin/removeprojectlist.jsp");
		
		return m;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// 学校管理员点击查看详情
	@RequestMapping("/getProjectInfoById.action")
	public ModelAndView getProjectInfoById(int pid) {
		ModelAndView m = new ModelAndView();
		// 查询到项目的信息
		ProjectWithBLOBs project = projectMapper.selectByPrimaryKey(pid);
		// 查询老师的信息
		Teacher teacher = teacherMapper.selectByPrimaryKey(project.getTid());
		// 获取学生的信息
		Student s = studentMapper.selectByPrimaryKey(project.getSid());

		m.addObject("teacher", teacher);
		m.addObject("project", project);
		// 添加负责人信息
		m.addObject("fzr", s);
		
		m.setViewName("/WEB-INF/schooladmin/projectinfo.jsp");
		
		return m;
	}

	// 学校管理员点击审核项目
	@RequestMapping("/schooladmingotocheck.action")
	public ModelAndView academyadmingotocheck(Pst p) {
		ModelAndView m = new ModelAndView();
		// 还要查询出指导老师给的意见
		ProjectWithBLOBs project = projectMapper.selectByPrimaryKey(p.getPid());
		// 将刚查询出来的指导老师的意见 以及学院的意见设置进去
		p.setTeachercheckidea(project.getTeachercheckidea());
		p.setAcademycheckidea(project.getAcademycheckidea());
		m.addObject("pst", p);
		
		m.setViewName("/WEB-INF/schooladmin/schoolcheckproject.jsp");
		
		return m;
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * 更新密码学院管理员 修改密码
	 * 
	 * @param session
	 * @param academyadmin
	 * @return
	 */
	@RequestMapping("/updatepass.action")
	public ModelAndView updatepass(HttpSession session, String newpass,
			String renewpass, String mpass) {
		ModelAndView m = new ModelAndView();
		Schooladmin s = (Schooladmin) session.getAttribute("schooladmin");
		if (renewpass.equals(newpass) && mpass.equals(s.getPassword())) {
			s.setPassword(renewpass);
			schooladminService.updateSchooladminInfoById(s);
			session.setAttribute("schooladmin", s);
			m.addObject("message", "密码修改成功！");
			m.setViewName("/WEB-INF/schooladmin/pass.jsp");
		} else {
			m.addObject("message", "两次密码不一致，或者当前密码错误！");
			m.setViewName("/WEB-INF/schooladmin/pass.jsp");
		}
		return m;
	}

	/**
	 * 学院填写审核意见
	 * 
	 * @param project
	 * @param ispass
	 * @param idea
	 * @return
	 */
	@RequestMapping("/fullcheckidea.action")
	public ModelAndView fullcheckidea(ProjectWithBLOBs project, int ispass,
			String[] idea) {
		ModelAndView m = new ModelAndView();
		// 老师审核完毕设置为1
		if (ispass == 1) {
			project.setTostatus(3);
		} else {
			project.setTostatus(-3);
		}
		// 将第二个学院填写的意见设置进去
		project.setAcademycheckidea(idea[2]);
		projectService.updateProjectInfoById(project);
		m.setViewName("/WEB-INF/tips.jsp");
		m.addObject("message", "审核成功！");
		return m;
	}
	
	/**
	 * 发布通知
	 * @param notice
	 * @return
	 */
	@RequestMapping("/addnotice.action")
	public ModelAndView addnotice(Notice notice) {
		ModelAndView m = new ModelAndView();
		String dat =  notice.getDat();
		String[] dats = dat.split("-");
		notice.setYear(Integer.valueOf(dats[0]));
		notice.setMouth(Integer.valueOf(dats[1]));
		notice.setDay(Integer.valueOf(dats[2]));
		// 将第二个学院填写的意见设置进去
		noticeMapper.insertSelective(notice);
		m.setViewName("/WEB-INF/tips.jsp");
		m.addObject("message", "发布成功！");
		return m;
	}
	
	/**
	 * 查询所有通知
	 * @param
	 * @param asp
	 * @return
	 */
	@RequestMapping("/getallnotice.action")
	public ModelAndView getallnotice(Notice notice) {
		ModelAndView m = new ModelAndView();
		// 将第二个学院填写的意见设置进去
		List<Notice> notices = noticeMapper.selectAllNotice();
		m.addObject("notices", notices);
		m.setViewName("/WEB-INF/tips.jsp");
		return m;
	}
	
	
	/**
	 * 修改通知
	 * @param
	 * @param asp
	 * @return
	 */
	@RequestMapping("/motifynotice.action")
	public ModelAndView motifynotice(Notice notice) {
		ModelAndView m = new ModelAndView();
		// 将第二个学院填写的意见设置进去
		noticeMapper.updateByPrimaryKeyWithBLOBs(notice);
		m.addObject("message", "修改成功");
		m.setViewName("/WEB-INF/tips.jsp");
		return m;
	}
	
	/**
	 * 根据id删除
	 * @param
	 * @param asp
	 * @return
	 */
	@RequestMapping("/deletenotice.action")
	public ModelAndView deletenotice(int id) {
		ModelAndView m = new ModelAndView();
		// 将第二个学院填写的意见设置进去
		noticeMapper.deleteByPrimaryKey(id);
		m.addObject("message", "删除成功");
		m.setViewName("/WEB-INF/tips.jsp");
		return m;
	}
	
	
	
/////////////////////////////////////////////json数据交互/////////////////////////////////////////////////////////
	
	
	
	@RequestMapping("/jsonschoollistproject/{isteam}")
	public @ResponseBody List<Pst> jsonschoollistproject(
			@PathVariable("isteam") Integer isteam,AcademySelectProject asp) {
		
//		if(null!=page.getTatalPage()){
//			if(page.getPageCount()>page.getTatalPage()){
//				m.addObject("message", "跳转页数超出范围！");
//				m.setViewName("/WEB-INF/tips.jsp");
//			}
//		}
		
		//封装查询条件
		asp.setTostatus(2);
		asp.setIsteam(isteam);

		List<Pst> projectList = projectMapper.selectProjectByAcademyadmin(asp);
		return projectList;
	}
	
	
}
