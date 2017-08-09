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
    
    <title>My JSP 'test.jsp' starting page</title>
    
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
    <table>
    	<th>
    		<td>项目名称</td>
    		<td>负责人</td>
    		<td>文件</td>
    		<td><a>点击下载</a></td>
    	</th>
    	<c:forEach items="${files }" var = "file">
    		<tr>
    			<td>${file.pname }</td>
    			<td>${file.sid }</td>
    			<td>${file.path }</td>
    			<td><a href="<%=basePath %>schooladmin/springmvcdownload?path=${file.path}">点击下载</a></td>
    		</tr>
    	</c:forEach>
    
    </table>
  </body>
</html>
