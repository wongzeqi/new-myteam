package com.nun.wjq.project.fileupload.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UploadCommtools {
	public static boolean FileUpload(HttpServletRequest request,HttpServletResponse response){
		
		return true;
	}
	
	public static String getFileNameTimes(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String timeValue = sdf.format(date);
		return timeValue;
	}
	
}
