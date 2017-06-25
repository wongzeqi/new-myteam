<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
    
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
  	<form action="<%=basePath%>crawl/crawl.action" name="form" method="post">
  		<span>
  			<input type="text" name="content" /><input type="submit"/>
  		</span>
  	
  	<h1>你想搜索的内容是：${page.content}</h1>
  	<table border="1">
  		<thead>
	  		<tr>
	  			<th>标题</th>
	  			<th>时间</th>
	  			<th>大小</th>
	  			<th>云盘类型</th>
	  			<th>链接</th>
	  		</tr>
  		</thead>
  		<tbody>
	  		<c:forEach items="${page.results}" var="result">
		  		<tr>
		  			<td style="width:600px;overflow: hidden">${result.title}</td>
		  			<td>${result.time}</td>
		  			<td>${result.size}</td>
		  			<td>${result.pan}</td>
		  			<td><a target="_blank" href="${result.href}">点击查看</a></td>
		  		</tr>
	  		</c:forEach>
  		</tbody>
  		
  	</table>
  	<span>第${page.current }页,共${page.pageCount}页,共${page.total}项</span>
  	<span>
  	
	  	<c:if test="${page.current > 1}"><a href="<%=basePath %>crawl/crawl.action?content=${page.content}&current=${page.current-1}">上一页</a></c:if>
	  	
	  	<c:if test="${page.pageCount> page.current}"></c:if><a href="<%=basePath %>crawl/crawl.action?content=${page.content}&current=${page.current+1}">下一页</a>
  	
		<select name="current">
			 <option value="1">1</option>
			 <option value="2">2</option>
			 <option value="3">3</option>
			 <option value="4">4</option>
			 <option value="5">5</option>
			 <option value="6">6</option>
		</select>
	</span>
	</form>
	<script type="text/javascript">
		
	</script>
	
  </body>
</html>
