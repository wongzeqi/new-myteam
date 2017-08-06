package com.nun.wjq.project.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.nun.wjq.project.fileupload.UploadStatus;
import com.nun.wjq.project.mapper.MajorMapper;
import com.nun.wjq.project.mapper.ProjectMapper;
import com.nun.wjq.project.mapper.ProjectfileMapper;
import com.nun.wjq.project.mapper.StudentMapper;
import com.nun.wjq.project.mapper.TeacherMapper;
import com.nun.wjq.project.model.Major;
import com.nun.wjq.project.model.Project;
import com.nun.wjq.project.model.ProjectWithBLOBs;
import com.nun.wjq.project.model.Projectfile;
import com.nun.wjq.project.model.Student;
import com.nun.wjq.project.model.Teacher;
import com.nun.wjq.project.result.Pst;
import com.nun.wjq.project.service.ProjectService;
import com.nun.wjq.project.service.StudentService;

@Controller
@RequestMapping("/studentgoto")
public class StudentController {
	//----------------------依赖注入--------------------------------//
	@Autowired StudentService studentService;
	@Autowired StudentMapper studentMapper;
	@Autowired ProjectMapper projectMapper;
	@Autowired ProjectService projectService;
	@Autowired TeacherMapper teacherMapper;
	@Autowired ProjectfileMapper projectfileMapper;
	@Autowired MajorMapper majorMapper;
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
	
	//点击去文件中心
	@RequestMapping("/gotofilelist")
	public String gotofilelist(){
		return "/project/filelist.jsp";
	}
	
	
	//一期答辩
	@RequestMapping("/uploadcheckfile/{jieduan}")
	public ModelAndView firstcheck(HttpSession session,@PathVariable("jieduan") int jieduan){
		ModelAndView m = new ModelAndView();
		Project p = new Project();
		Student s = (Student)session.getAttribute("student");
		p.setSid(s.getSid());
		List<Project> projectList =  projectMapper.selectProjectBySid(p);
		m.addObject("projectList", projectList);
		m.addObject("jieduan", jieduan);
		m.setViewName("/WEB-INF/upload.jsp");
		return m;
		
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
		List<Pst> myProjects = new ArrayList<Pst>();
		List<Pst> notMyProject = new ArrayList<Pst>();
		//分成两大类我参与的项目 以及我负责的项目
		for(Project p: projectList){
			if(p.getSid()==s.getSid()){
				myProjects.add((Pst) p);
			}else{
				notMyProject.add((Pst) p);
			}
		}
		
		m.addObject("myProjects", myProjects);
		m.addObject("notMyProject", notMyProject);
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
	
	
	//点击项目撤项申请（列出变更的项目除国家级区级的之外）  项目名称  项目的
	@RequestMapping("/listprojecttoexit.action")
	public ModelAndView listprojecttoexit(HttpSession session){
		ModelAndView m = new ModelAndView();
		Project p = new Project();
		Student s = (Student)session.getAttribute("student");
		p.setSid(s.getSid());
		List<Project> projectList =  projectMapper.selectProjectBySid(p);
		m.addObject("projectList", projectList);
		m.setViewName("/WEB-INF/student/submitexit.jsp");
		return m;
	}
		
	//点击查看详情
	@RequestMapping("/getProjectInfoById.action")
	public ModelAndView getProjectInfoById(int pid){
		ModelAndView m = new ModelAndView();
		//查询到项目的信息
		ProjectWithBLOBs project = projectMapper.selectByPrimaryKey(pid);
		//查询老师的信息
		Teacher teacher = teacherMapper.selectByPrimaryKey(project.getTid());
		//获取学生的信息
		m.addObject("teacher",teacher);
		m.addObject("project", project);
		m.setViewName("/WEB-INF/student/projectinfo.jsp");
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
			m.setViewName("/WEB-INF/student/pass.jsp");
		}else{
			m.addObject("message", "两次密码不一致，或者当前密码错误！");
			m.setViewName("/WEB-INF/student/pass.jsp");
		}
		return m;
	}
	
	/**
	 * 学生申请项目
	 * @param session
	 * @param content
	 * @param projectWithBLOBs
	 * @return
	 */
	@RequestMapping(value="/applyprojectsubmit.action",method=RequestMethod.POST)
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
		//项目审核的状态
		projectWithBLOBs.setTostatus(0);
		projectWithBLOBs.setIsissue(0);
		//设置项目年份
		Calendar cal = Calendar.getInstance();
		projectWithBLOBs.setTheyear(cal.get(Calendar.YEAR));
		if(projectWithBLOBs.getPrank().equals("c")){
			//如果是团队项目就设在为1
			projectWithBLOBs.setIsteam(1);
		}else{
			projectWithBLOBs.setIsteam(0);
		}
		projectService.insertProject(projectWithBLOBs);
		m.setViewName("/WEB-INF/tips.jsp");
		m.addObject("message", "项目成功申请！");
		m.addObject("success", "success");
		return m;
	}
	/**
	 * 修改未提交的项目申请
	 * @param session
	 * @param content
	 * @param projectWithBLOBs
	 * @return
	 */
	@RequestMapping(value="/modifyprojectsubmit.action",method=RequestMethod.POST)
	public ModelAndView modifyproject(HttpSession session,String[] content,ProjectWithBLOBs projectWithBLOBs){
		
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
		//项目审核的状态
		projectWithBLOBs.setTostatus(0);
		projectWithBLOBs.setIsissue(0);
		//设置项目年份
		Calendar cal = Calendar.getInstance();
		projectWithBLOBs.setTheyear(cal.get(Calendar.YEAR));
		if(projectWithBLOBs.getPrank().equals("c")){
			//如果是团队项目就设在为1
			projectWithBLOBs.setIsteam(1);
		}
		projectService.updateProjectInfoById(projectWithBLOBs);
		m.setViewName("/WEB-INF/tips.jsp");
		m.addObject("message", "修改成功！");
		m.addObject("success", "success");
		return m;
	}
	/**
	 * 提交变更申请
	 * @param session
	 * @return
	 */
	@RequestMapping("/submitChange.action")
	public ModelAndView submitChange(ProjectWithBLOBs pb){
		ModelAndView m = new ModelAndView();
		projectService.setChangeReason(pb);
		m.addObject("message", "申请提交成功！");
		m.setViewName("/WEB-INF/student/submitexit.jsp");
		return m;
	}
	
	
	/**
	 * 提交撤项申请
	 * @param session
	 * @return
	 */
	@RequestMapping("/submitRemove.action")
	public ModelAndView submitRemove(ProjectWithBLOBs pb){
		ModelAndView m = new ModelAndView();
		projectService.submitRemove(pb);
		m.addObject("message", "申请提交成功！");
		m.setViewName("/WEB-INF/student/submitexit.jsp");
		return m;
	}
	
	/**
	 * 根据id删除未提交的申请
	 * @param pid
	 * @return
	 */
	@RequestMapping("/deleteProjectById.action")
	public ModelAndView deleteProjectById(int pid){
		ModelAndView m = new ModelAndView();
		projectService.deleteProjectById(pid);
		m.addObject("message","删除成功");
		m.setViewName("/WEB-INF/tips.jsp");
		return m;
	}
	/**
	 * 提交撤项申请
	 * @param project
	 * @return
	 */
	@RequestMapping("/submitremoveproject.action")
	public ModelAndView submitremoveproject(ProjectWithBLOBs project){
		ModelAndView m = new ModelAndView();
		//设置是否撤项为1
		project.setIsremove(1);
		projectService.updateProjectInfoById(project);
		m.addObject("message","撤项申请提交成功，请耐心等待审核。");
		m.setViewName("/WEB-INF/tips.jsp");
		return m;
	}
	
	/**
	 * 提交变更申请
	 * @param project
	 * @return
	 */
	@RequestMapping("/submitchangeproject.action")
	public ModelAndView submitchangeproject(ProjectWithBLOBs project){
		ModelAndView m = new ModelAndView();
		//设置是否撤项为1
		project.setIschange(1);
		project.setChangestatus(0);
		projectService.updateProjectInfoById(project);
		m.addObject("message","变更申请提交成功，请耐心等待审核。");
		m.setViewName("/WEB-INF/tips.jsp");
		return m;
	}
	
	
	/**
	 * 将暂存的信息进行提交
	 * @param project
	 * @return
	 */
	@RequestMapping("/submitproject.action")
	public ModelAndView submitproject(ProjectWithBLOBs project){
		ModelAndView m = new ModelAndView();
		
		project.setIsissue(1);
		project.setTostatus(0);
		
		projectService.updateProjectInfoById(project);
		m.addObject("message","申请项目已经提交，请耐心等待审核！");
		m.setViewName("/WEB-INF/tips.jsp");
		return m;
	}
	//----------------------------------------json------------------------------------------------//
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
	
	//json数据
	/**
	 * 根据aid(学院的id获取专业的id)
	 * @param aid
	 * @return
	 */
	@RequestMapping("/getMajorByaid.action")
	public @ResponseBody List <Major> getMajorByAcademyid(int aid){
		return   majorMapper.getAllMajorByAid(aid);
	}
	
	
	
	
	
	
	
	
	//文件上传
	@RequestMapping("/fileUpload3/{jieduan}/{pid}/{sid}")
    public String fileUpload3(@PathVariable("jieduan") int jieduan,@PathVariable("pid") int pid,@PathVariable("sid") int sid ,@RequestParam(value="file",required= false) MultipartFile[] files,HttpServletRequest request) throws IOException{
    	try{
    	 long  startTime=System.currentTimeMillis();
    	 String path = request.getSession().getServletContext().getRealPath("upload");
    	 File pathFile = new File(path);
    	 
    	 if(!pathFile.exists()&&!pathFile.isDirectory()){
    		 pathFile.mkdirs();
    	 }
    	 
    	 if(files!=null&&files.length>0){  
             //循环获取file数组中得文件  
    		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
    		 String dateNowString = sdf.format(new Date());
             for(int i = 0;i<files.length;i++){  
                 MultipartFile file = files[i];  
                 //获取uuid
                 String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                 //这个方法最慢
                 /*FileUtils.writeByteArrayToFile(new File("E:\\"+file.getOriginalFilename()), file.getBytes());*/
                 
                 //这个方法最快
                 String realpath = path+"\\"+uuid+file.getOriginalFilename();
                 file.transferTo(new File(realpath));
                 
                 //这个方法其次
                /*OutputStream os=new FileOutputStream("E:/"+file.getOriginalFilename());
                 //获取输入流 CommonsMultipartFile 中可以直接得到文件的流
                 InputStream is=file.getInputStream();
                 byte[] bts = new byte[2048];
                 //一个一个字节的读取并写入
                 while(is.read(bts)!=-1)
                 {
                     os.write(bts);
                 }
                os.flush();
                os.close();
                is.close();*/
                 //将文件对象保存到数据库中
                 Projectfile pf = new Projectfile();
            	 pf.setSid(sid);
            	 pf.setPid(pid);
            	 //pf.setFiletype(realpath.split(".")[1]);
            	 pf.setPath(realpath);
            	 
            	 pf.setUploaddate(dateNowString);
            	 projectfileMapper.insert(pf);
             }  
         } 
    	 long  endTime=System.currentTimeMillis();
    	 System.out.println("方法四的运行时间："+String.valueOf(endTime-startTime)+"ms");
    	 
    	}catch(MaxUploadSizeExceededException e){
    		return "/WEB-INF/tips.jsp";
    	}
    	 
    	 
		return "success";
    }
	    
	    /**
	     * 这里是获取上传文件状态信息的访问接口
	     * @param session
	     * @return
	     */
	    @ResponseBody
		@RequestMapping("getStatus.do")
		public UploadStatus getStatus(HttpSession session){
	    	System.out.println((UploadStatus)session.getAttribute("upload_status"));
			return (UploadStatus)session.getAttribute("upload_status");
		}
	
	
	
	////////////////////////////////////////////////////异常处理代码
	    
    /**  
     * 用于处理异常的  
     * @return  
     * @throws IOException 
     */  
    @ExceptionHandler({NullPointerException.class})   
    public String exception(NullPointerException e,HttpServletResponse response,HttpServletRequest request) throws IOException {   
        System.out.println(e.getMessage());   
        e.printStackTrace();   
        response.sendRedirect(request.getContextPath() + "/login/goto.html");
        return "null";   
    }
	
}
