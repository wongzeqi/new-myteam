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
				<a class="button button-little bg-green" href="Javascript:void(0)" target="_blank">
					<span class="icon-home"></span>
					欢迎
					<c:if test="${!empty student}">
						${student.sname }同学
					</c:if>
					<c:if test="${!empty teacher}">
						${teacher.tname }老师
					</c:if>
					<c:if test="${!empty academyadmin}">
						${academyadmin.academyname}学院管理员
					</c:if>
					<c:if test="${!empty schooladmin}">
						学校管理员
					</c:if>
					
				</a> &nbsp;&nbsp;
				<a href="<%=basePath %>project/notice.jsp" target="right" class="button button-little bg-green"><span class="icon-info"></span>&nbsp;&nbsp;查看通知</a>&nbsp;&nbsp;
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
		
		
		<div class="admin" style="height:1900px">
			<div style="width: 100%; height: 100%; z-index: -1; position: fixed; top: 110px; padding-right:15% ;" >
				
			<div class="leftnav" style="float: left; width:15%;">
				<div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
				<c:forEach items = "${meun.pmeun}" var="p">
				
				<h2 style="padding-left:20px"><span class="icon-caret-right"></span>${p.pmeunname}</h2>
				<ul style="display:block">
					<c:forEach items = "${meun.smeun }" var="s">
					
						<c:if test="${p.pid == s.pid}">
							<li>
								<c:if test="${s.smeunname eq '申请项目' or s.smeunname eq '项目列表'}">
									<a onclick="setIframeHeight()" style="font-size:16px;margin-left:40px" href="<%=basePath %>${s.meunurl}" target="right">${s.smeunname}</a>
								</c:if>
								<c:if test="${s.smeunname ne '申请项目' and s.smeunname ne '项目列表'}">
									<a onclick="setIframeHeight100()" style="font-size:16px;margin-left:40px" href="<%=basePath %>${s.meunurl}" target="right">${s.smeunname}</a>
								</c:if>
							</li>
						</c:if>
					</c:forEach>
				</ul>
				</c:forEach>
				
				
				
			</div>
			</div>
			<iframe id="myframe" bo style="width:85%; margin-left: 16%; float: left; border-left:1px solid #c0c0c0;" scrolling="auto" src="<%=basePath %>/project/notice.jsp" name="right" height="100%"  ></iframe>
		</div>
	</body>
	 
	<script type="text/javascript">
		function setIframeHeight() {
			$("#myframe").attr("height","250%");
		};
		function setIframeHeight100(){
			$("#myframe").attr("height","100%");
		};
		
	</script>
	
</html>