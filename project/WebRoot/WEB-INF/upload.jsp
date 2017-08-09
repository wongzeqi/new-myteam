<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String mypath = basePath+"project/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>文件上传</title>
     
    <link rel="stylesheet" href="<%=mypath %>css/css/pintuer.css" type="text/css">
	<link rel="stylesheet" href="<%=mypath %>css/css/admin.css" type="text/css">
    <link href="<%=mypath %>css/fileUpload.css" rel="stylesheet" type="text/css">
    <link href="<%=mypath %>css/iconfont.css" rel="stylesheet" type="text/css"/>
    
    
</head>
<body>

	<div class="panel-head"><strong><span class="icon-pencil-square-o"></span>项目基本信息</strong></div>
  
  <h3 style="color:red">${message }</h3>
  <div class="body-content">
    <form method="post" class="form-x" action="<%=basePath %>studentgoto/submitremoveproject.action">    
      <div class="form-group">
        <div class="label">
          <label>项目名称：</label>
        </div>
        <div class="field">
          <select id="pid" style="padding:5px 15px; border:1px solid #ddd;">
          	<c:forEach items="${projectList}" var="project" >
        		<option value="${project.pid }">${project.pname }</option>
        	</c:forEach>
        	</select>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>负责人：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  value="${student.sname }"  />
          <input id="jieduan" type="hidden" value="${jieduan}"  />
          <input id="sid" type="hidden" value="${student.sid}"  />
          <input id="basepath" type="hidden" value="<%=basePath %>"  />
          <div class="tips"></div>
        </div>
      </div>
      
    <form>
  </div>
<div class="panel-head"><strong><span class="icon-pencil-square-o"></span>上传材料<span style="color:red">(文件最大100MB)</span></strong></div>
    <div style="padding:60px" id="fileUploadContent" class="fileUploadContent">
       
    </div>
    <div style="padding:60px;display:none" id="fileUploadContent2" class="fileUploadContent">
       
    </div>
</body>
</html>
<script src="<%=mypath %>js/jquery.js"></script> 
<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>

<script type="text/javascript" src="<%=mypath %>js/fileUpload.js"></script>
<script type="text/javascript">
		
   $(document).ready(function (){
   		
   	
   });
   
  $(document).ready(function(){
  		//数据参数
  		var sid = $("#sid").val();
    	var jieduan = $("#jieduan").val();
    	var basepath = $("#basepath").val();
    	var pid = $("#pid  option:selected").val();
	   	//上传插件初始化
  		$("#fileUploadContent").initUpload({
	        "uploadUrl":basepath+"studentgoto/fileUpload3/"+jieduan+"/"+pid+"/"+sid,
	        //上传文件信息地址
	        "progressUrl":basepath+"studentgoto/getStatus.do"//获取进度信息地址，可选，注意需要返回的data格式如下（{bytesRead: 102516060, contentLength: 102516060, items: 1, percent: 100, startTime: 1489223136317, useTime: 2767}）
	        //"showSummerProgress":false,//总进度条，默认限制//"size":350,//文件大小限制，单位kb,默认不限制// "maxFileNumber":3,//文件个数限制，为整数//"filelSavePath":"",//文件上传地址，后台设置的根目录//"beforeUpload":beforeUploadFun,//在上传前执行的函数
	        //"onUpload":onUploadFun，//在上传后执行的函数 //autoCommit:true,//文件是否自动上传//"fileType":['png','jpg','docx','doc']//文件类型限制，默认不限制，注意写的是文件后缀
	    });
  		//
  		$("#pid").change(function(){
  			pid = $("#pid  option:selected").val();
  			$("#fileUploadContent").empty();
  			$("#fileUploadContent").initUpload({
		        "uploadUrl":basepath+"studentgoto/fileUpload3/"+jieduan+"/"+pid+"/"+sid,
		        //上传文件信息地址
		        "progressUrl":basepath+"studentgoto/getStatus.do"//获取进度信息地址，可选，注意需要返回的data格式如下（{bytesRead: 102516060, contentLength: 102516060, items: 1, percent: 100, startTime: 1489223136317, useTime: 2767}）
		        //"showSummerProgress":false,//总进度条，默认限制//"size":350,//文件大小限制，单位kb,默认不限制// "maxFileNumber":3,//文件个数限制，为整数//"filelSavePath":"",//文件上传地址，后台设置的根目录//"beforeUpload":beforeUploadFun,//在上传前执行的函数
		        //"onUpload":onUploadFun，//在上传后执行的函数 //autoCommit:true,//文件是否自动上传//"fileType":['png','jpg','docx','doc']//文件类型限制，默认不限制，注意写的是文件后缀
	    	});
  
  		});
  		
  		
  		
  
  
  
  
  
  
  
  
  });
   
   
  
</script>