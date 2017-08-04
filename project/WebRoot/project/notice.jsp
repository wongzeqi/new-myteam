<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%String path = request.getContextPath();String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";String mypath = basePath+"project/";%><!DOCTYPE html>
<html lang="en" class="no-js">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>Blueprint: Vertical Timeline</title>
		<meta name="description" content="Blueprint: Vertical Timeline" />
		<meta name="keywords" content="timeline, vertical, layout, style, component, web development, template, responsive" />
		<meta name="author" content="Codrops" />
		<link rel="shortcut icon" href="../favicon.ico">
		<link rel="stylesheet" type="text/css" href="<%=mypath %>css/default.css" />
		<link rel="stylesheet" type="text/css" href="<%=mypath %>css/component.css" />
		<script src="<%=mypath %>js/modernizr.custom.js"></script>
	</head>
	<body>
		<div class="container" style="padding-bottom:1000px">
			<header class="clearfix">
				<span></span>
				<h1>通知</h1>
				
			</header>	
			<div class="main">
				<ul class="cbp_tmtimeline">					<c:forEach items="${notices}" var="notice" >
					<li>
						<time  class="cbp_tmtime" datetime="${notice.dat }"><span>${notice.year }年</span> <span>${notice.mouth }-${notice.day }</span></time>
						<div class="cbp_tmicon cbp_tmicon-phone"></div>
						<div class="cbp_tmlabel">
							<h2>${notice.title }</h2>
							<p>${notice.context }</p>
						</div>
					</li>					</c:forEach>
					
				</ul>
			</div>
		</div>
	</body>
</html>
