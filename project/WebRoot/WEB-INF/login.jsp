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
    <title>登录</title> 
    <link rel="stylesheet" href="<%=mypath %>css/pintuer.css">
	<link rel="stylesheet" href="<%=mypath %>css/admin.css">
	<script src="<%=mypath %>js/jquery.js"></script> 
    <script src="<%=mypath %>js/pintuer.js"></script>  
    <script type="text/javascript">
    $(document).ready(function() {
    	$("#submit_btn").click(function(){
 	 var role = $("#role").val();
 	 if(role=="null"){
 	 	alert("请选择登录身份...");
 	 }else{
 	 	 if(role=="student"){
 	 	    $("#login_form").attr("action", "<%= basePath%>login/studentlogin.html");
 	 	 }
	 	 else if(role=="teacher"){
	 	 	$("#login_form").attr("action", "<%= basePath%>login/teacherlogin.html");
	 	 }
	 	  else if(role=="admin"){
	 	 	$("#login_form").attr("action", "<%= basePath%>login/schoollogin.html");
	 	 }else if(role=="academyadmin"){
	 	 	$("#login_form").attr("action", "<%= basePath%>login/academylogin.html");
	 	 }
	 	 $("#login_form").submit();
 	 }
	});
});
</script>
</head>
<body>
<div class="bg"></div>
<div class="container">
    <div class="line bouncein">
        <div class="xs6 xm4 xs3-move xm4-move">
            <div style="height:150px;"></div>
            <div class="media media-y margin-big-bottom">           
            </div>         
            <form id="login_form" action="" method="post">
            <div class="panel loginbox">
                <div class="text-center margin-big padding-big-top"><h1>项目申报管理系统统一登录平台</h1></div>
                <div class="panel-body" style="padding:30px; padding-bottom:10px; padding-top:10px;">
                    <div class="form-group">
                        <div class="field field-icon-right">
                            <input type="text" class="input input-big" name="username" placeholder="登录账号" data-validate="required:请填写账号" />
                            <span class="icon icon-user margin-small"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="field field-icon-right">
                            <input type="password" class="input input-big" name="password" placeholder="登录密码" data-validate="required:请填写密码" />
                            <span class="icon icon-key margin-small"></span>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <div class="field field-icon-right">
                            <select type="" id="role" class="input input-big">
                            	<option value="null">选择登录身份</option>
                            	<option value="student">学生登录</option>
                            	<option value="teacher">老师登录</option>
                            	<option value="academyadmin">学院管理员登录</option>
                            	<option value="admin">管理员登录</option>
                            </select>
                            <span class="icon icon-check margin-small"></span>
                        </div>
                    </div>
                </div>
                <div style="padding:20px;">
                	<input id="submit_btn" type="button" class="button button-block bg-main text-big input-big" value="登录">
                </div>
            </div>
            </form>          
        </div>
    </div>
</div>





</body>
</html>