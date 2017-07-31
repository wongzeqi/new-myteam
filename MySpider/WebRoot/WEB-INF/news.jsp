<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'news.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
#outline {
	margin: 0 auto;
	width: 700px;
	height: auto;
	text-indent: 28px;
	line-height: 24px;
	text-align: justify;
	text-justify: inter-ideograph;
	font-size: 14px;
	border:1px solid blue;
	padding:5px;
}

p {
	display: block;
	-webkit-margin-before: 1em;
	-webkit-margin-after: 1em;
	-webkit-margin-start: 0px;
	-webkit-margin-end: 0px;
}

img {
	display: block;
	max-width: 100%;
	margin: auto;
}
.ep-source{
	float:right;
}
</style>
</head>

<body>
	<div class="news" id="outline"></div>

</body>
</html>
