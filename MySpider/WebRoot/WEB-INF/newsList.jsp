<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'newsList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<table border="1">
		<thead>
			<tr>
				<th>新闻标题</th>
				<th>发布时间</th>
				<th>点击量</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${newsList }" var="news">
			<tr>
				<td><a href="${news.newscontenthref }">${news.title}</a></td>
				<td>${news.date}</td>
				<td>${news.view}</td>
			</tr>
			${news.newscontent}
		</c:forEach>
		
		</tbody>
	</table>
  </body>
</html>
