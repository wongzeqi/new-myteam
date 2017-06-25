<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<title>北方民族大学创新实践项目申报系统</title>
		<link rel="stylesheet" href="<%=mypath %>css/pintuer.css">
		<link rel="stylesheet" href="<%=mypath %>css/admin.css">
		<script src="<%=mypath %>js/jquery.js"></script>
		<script type="text/javascript">
			$(function() {
				$(".leftnav h2").click(function() {
					$(this).next().slideToggle(200);
					$(this).toggleClass("on");
				})
				$(".leftnav ul li a").click(function() {
					$("#a_leader_txt").text($(this).text());
					$(".leftnav ul li a").removeClass("on");
					$(this).addClass("on");
				})
			});
		</script>
	</head>

	<body style="background-color:#f2f9fd; width: ;">
		<div class="header bg-main" style="margin: 0 10%; ">
			<div class="logo margin-big-left fadein-top">
				<h1><img src="<%=mypath %>images/logo.jpg" class="radius-circle rotate-hover" height="50" alt="" />北方民族大学创新实践项目申报系统${message }</h1>
			</div>
			<div class="head-l" style="float: right; padding-right: 50px;">
				<a class="button button-little bg-green" href="" target="_blank"><span class="icon-home"></span>欢迎${student.sname }${teacher.tname }${academyadmin.academyname}超级管理员<c:if test="${empty schooladmin}">管理员</c:if></a> &nbsp;&nbsp;
				<a class="button button-little bg-red" href="<%=basePath %>login/goto.html"><span class="icon-power-off"></span> 退出登录</a>
			</div>
		</div>
		<ul class="bread" style="margin: 0 10%;">
			<li>
				<a href="{:U('Index/info')}" target="right" class="icon-home"> 首页</a>
			</li>
			<li>
				<a href="##" id="a_leader_txt"></a>
			</li>
		</ul>
		
		
		<div class="admin" style="height:3000px">
			<div style="width: 100%; height: 100%; z-index: -1; position: fixed; top: 110px; padding-right:15% ;" >
				
			<div class="leftnav" style="float: left; width:15%;">
				<div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
				<c:forEach items = "${meun.pmeun}" var="p">
				
				<h2><span class="icon-caret-right"></span>${p.pmeunname}</h2>
				<ul style="display:block">
					<c:forEach items = "${meun.smeun }" var="s">
					
						<c:if test="${p.pid == s.pid}">
							<li>
								<a href="<%=basePath %>${s.meunurl}" target="right">${s.smeunname}</a>
							</li>
						</c:if>
					</c:forEach>
				</ul>
				</c:forEach>
				
				<div style="width:12%; height: 80px ; position: fixed; bottom: 0px; text-align: center;">
					<address><a href="#">Copyright:北方民族大学创新创业学院</a></address><br />
					<address><a href="#">java项目开发创新团队王嘉琪制作维护</a></address>
				</div>
				
			</div>
			</div>
			<iframe  style="width: 82%; margin-left: 20%; float: left;"  src="<%=basePath %>project/tips.html" name="right"  height="250%"></iframe>
		</div>
	</body>

</html>