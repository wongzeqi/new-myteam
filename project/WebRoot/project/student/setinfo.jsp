<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String mypath = basePath+"project/";
%>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>网站信息</title>  
    <link rel="stylesheet" href="<%=mypath %>css/pintuer.css">
	<link rel="stylesheet" href="<%=mypath %>css/admin.css">
	<script src="<%=mypath %>js/jquery.js"></script> 
    <script src="<%=mypath %>js/pintuer.js"></script>
    <style>
		label{
			font-size: 15px;
		}    	
    </style>
</head>
<body>
<div class="">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span>完善个人信息</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="">
      <div class="form-group">
        <div class="label">
          <label>姓名:</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="stitle" value="" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>学号:</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="surl" value="" />
        </div>
      </div>
      <div class="form-group" style="display:none">
        <div class="label">
          <label>学院：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="sentitle" value="" placeholder="请输入学院..." data-validate="required:请输入学院..." />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>专业：</label>
        </div>
        <div class="field">
           <input type="text" class="input" name="sentitle" value=""  placeholder="请输入专业..." data-validate="required:请输入专业..."/>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>班级：</label>
        </div>
        <div class="field">
           <input type="text" class="input" name="sentitle" value=""  placeholder="请输入班级..." data-validate="required:请输入班级..."/>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>民族：</label>
        </div>
        <div class="field">
           <input type="text" class="input" name="sentitle" value="" placeholder="请输入班级（请加上族字）..." data-validate="required:请输入民族..."/>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>手机：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="s_name" value="" placeholder="请输入手机号..." data-validate="required:请输入手机号..."/>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>邮箱：</label>
        </div>
        <div class="field">
          <input type="email" class="input" name="s_phone" value="" placeholder="请输入邮箱..." data-validate="required:请输入邮箱..."/>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body></html>