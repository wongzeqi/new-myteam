package com.nun.wjq.project.controller;  
  
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;

import com.nun.wjq.project.fileupload.UploadStatus;
import com.nun.wjq.project.mapper.ProjectfileMapper;
import com.nun.wjq.project.model.Projectfile;

  
@Controller  
@RequestMapping("/fileupload")
public class UploadAction {  
  
	@Autowired ProjectfileMapper projectfileMapper;
	
    @RequestMapping(value = "/upload.do")  
    public String upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request, ModelMap model) {  
  
        System.out.println("开始");  
        String path = request.getSession().getServletContext().getRealPath("upload");  
        String fileName = file.getOriginalFilename();  
//      String fileName = new Date().getTime()+".jpg";  
        System.out.println(path);  
        File targetFile = new File(path, fileName);  
        if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
  
        //保存  
        try {  
            file.transferTo(targetFile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        model.addAttribute("fileUrl", request.getContextPath()+"/upload/"+fileName);  
  
        return "result";  
    }  
    
    
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
            	 pf.setFiletype(realpath.split(".")[1]);
            	 pf.setPath(realpath);
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
  
}  