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
<title></title>
<link rel="stylesheet" href="<%=mypath %>css/pintuer.css">
<link rel="stylesheet" href="<%=mypath %>css/admin.css">
<script src="<%=mypath %>js/jquery.js"></script> 
<script src="<%=mypath %>js/pintuer.js"></script>
<style type="text/css">
	label{
		font-size: 15px;
	}
</style>
</head>
<body>
<div>
  <div class="panel-head"><strong><span class="icon-key"></span> 修改密码</strong><h2 style="color:red; text-align: right">${message }</h2></div>
 
  <div class="body-content">
    <form method="post" class="form-x" action="<%=basePath%>teachergoto/updatepass.action">
      <div class="form-group">
        <div class="label">
          <label for="sitename">登录帐号：</label>
        </div>
        <div class="field">
          <label style="line-height:33px;">
           <c:if test="${!empty student}">
          	 ${student.sname }
          </c:if>
          <c:if test="${!empty teacher}">
          	 ${teacher.sname }
          </c:if>
          <c:if test="${!empty academyadmin}">
          	 ${academyadmin.academyname }
          </c:if>
          <c:if test="${!empty teacher}">
          	 ${teacher.sname }
          </c:if>
          <c:if test="${!empty schooladmin}">
          	超级管理员
          </c:if>
          </label>
        </div>
      </div>      
      <div class="form-group">
        <div class="label">
          <label for="sitename">原始密码：</label>
        </div>
        <div class="field">
          <input type="password" class="input w80" id="mpass" name="mpass" size="50" placeholder="请输入原始密码" data-validate="required:请输入原始密码" />       
        </div>
      </div>      
      <div class="form-group">
        <div class="label">
          <label for="sitename">新密码：</label>
        </div>
        <div class="field">
          <input type="password" class="input w80" name="newpass" size="50" placeholder="请输入新密码" data-validate="required:请输入新密码,length#>=5:新密码不能小于5位" />         
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">确认密码：</label>
        </div>
        <div class="field">
          <input type="password" class="input w80" name="renewpass" size="50" placeholder="请再次输入新密码" data-validate="required:请再次输入新密码,repeat#newpass:两次输入的密码不一致" />          
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
