<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false" %>
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
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="<%=mypath %>css/pintuer.css">
<link rel="stylesheet" href="<%=mypath %>css/admin.css">
<script src="<%=mypath %>js/jquery.js"></script>
<script src="<%=mypath %>js/pintuer.js"></script>
</head>
<body>
	<form method="post" action="">
		<div>
			<div class="panel-head">
				<strong class="icon-reorder">我的项目</strong>
			</div>
			<div class="padding border-bottom">
				<ul class="search">
					<li id="s1"><input type="text" placeholder="请输入搜索关键字" name="keywords"
						class="input"
						style="width:250px; line-height:17px;display:inline-block" /> <a
						href="javascript:void(0)" class="button border-main icon-search"
						onclick="changesearch()"> 搜索</a>
						
					</li>
					<li id="s2">
						<select class="myselect" style="padding:10px 20px; border:1px solid #ddd;">
							<option value="a">国家级项目</option>
			        		<option value="b">区级项目</option>
			        		<option value="c">校级项目</option>
						</select>
					</li>
					
					<li>
						<select class="myselect" style="padding:10px 20px; border:1px solid #ddd;">
							<c:forEach items="${academys }" var ="a">
								<option value="${a.academyname }"> ${a.academyname }</option>
				        	</c:forEach>	
						</select>
					</li>
					
				</ul>
			</div>
			<table class="table table-hover text-center">
				<tr>
					<th>年份</th>
					<th>项目名称</th>
					<th>负责人</th>
					<th>学号</th>
					<th>手机号</th>
					<th>指导老师</th>
					<th>学院</th>
					<th>项目等级</th>
					<th>审核状态</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${projectList }" var="project">
					<tr>
						<td>${project.theyear }</td>
						<td>${project.pname}</td>
						<td>${project.sname }</td>
						<td>${project.snumber }</td>
						<td>${project.phone }</td>
						<td>${project.tname }</td>
						<td>${project.academy }</td>

						<td>
							<c:if test="${project.prank eq 'a' }">国家级<c:if test="${project.isteam eq 1 }">(团队)</c:if></c:if>
          					<c:if test="${project.prank eq 'b' }">区级<c:if test="${project.isteam eq 1 }">(团队)</c:if></c:if>
       						<c:if test="${project.prank eq 'c' }">校级(团队)</c:if>
          					<c:if test="${project.prank eq 'd' }">校级</c:if>
						</td>

						<td><c:if test="${project.tostatus eq 0 and project.prank ne 'c'}">指导老师审核中</c:if>
							<c:if test="${project.tostatus eq -1 and project.prank ne 'c'}">指导老师未通过</c:if>
							<c:if test="${project.tostatus eq 1 and project.prank ne 'c'}">学院审核中</c:if>
							<c:if test="${project.tostatus eq -2 and project.prank ne 'c'}">学院未通过</c:if>
							<c:if test="${project.tostatus eq 2 and project.prank ne 'c'}">学校审核中</c:if>
							<c:if test="${project.tostatus eq -3}">学校未通过</c:if> 
							<c:if test="${project.tostatus eq 3}">审核通过</c:if> 
							<c:if test="${project.tostatus eq 1 and project.prank eq 'c'}">学校审核中</c:if>
							<c:if test="${project.isissue eq 0 }">未提交</c:if>
						</td>

						<td>
							<div class="button-group">
								<a class="button border-blue" href="<%=basePath %>schooladmin/getProjectInfoById.action?pid=${project.pid}&pname=${project.pname}&prank=${project.prank}&sname=${project.sname}" onclick=""><span class="icon-info"></span>详情</a>
								<c:if test="${project.tostatus eq 2}">
									<a class="button border-blue" href="<%=basePath %>schooladmin/schooladmingotocheck.action?pid=${project.pid}&pname=${project.pname}&prank=${project.prank}&sname=${project.sname}" onclick=""><span class="icon-info"></span>审核</a>
								</c:if>
							</div>
						</td>
					</tr>
				</c:forEach>
			</table>
			<hr>
			
			
			<!-- f分页 -->
			<span style="margin-left:100px">
			<c:if test="${page.pageCount>1 }">
				<a href="<%=basePath %>schooladmin/schoollistproject/0?pageCount=${page.pageCount-1}"  class="button border-blue">上一页</a>
			</c:if>
			
			<c:if test="${page.pageCount<page.tatalPage }">
				<a href="<%=basePath %>schooladmin/schoollistproject/0?pageCount=${page.pageCount+1}" class="button border-blue">下一页</a>
			</c:if>
			</span>
			
				<input  type="text" style="height:40px;padding:0 20px; width:80px" name="pageCount" /> 
				<input type="hidden" name="tatalPage" value="${page.tatalPage }" /> 
				<a class="button border-blue">跳转</a>
			

			<span style="margin-right:50px;float:right"> 
				<span style="font-size:20px ;float:right">--共${page.tatalPage }页</span>
				<span style="font-size:20px ;float:right">当前第${page.pageCount }页--</span>
			</span>
			
			
		</div>
	</form>
	<form action="<%=basePath %>schooladmin/schoollistproject/0" method="get">
	</form>
	<script type="text/javascript">
		$(document).ready(function(){
			$('.myselect').change(function(){
				
				var value1 =$('.myselect').children('option:selected').val();//这就是selected的值
				var value2 =$('.myselect').last('option:selected').val();//这就是selected的值
				
				$.ajax({
					type : 'get',
					url : '${pageContext.request.contextPath}/teachergoto/getName.action',
					contentType : 'application/json;charset=utf-8',
					data : {
						"tnumber" : tnumber
					},
					success : function(data) {//返回json结果
						$("#tname").val(data.tname);
						$("#tid").val(data.tid);
					},
					error : function() {
					}
				});
			});
		});
</script>
	</script>
	
	
	
	<script type="text/javascript">
		function del() {
		var msg = "您确定要删除吗？\n\n请确认！";
			if (confirm(msg)==true){
			}	
		}
		
		
		function submit() {
		var msg = "您确定要删除吗？\n\n请确认！";
			if (confirm(msg)==true){
			}	
		}
		
		$("#checkall").click(function(){ 
		  $("input[name='id[]']").each(function(){
			  if (this.checked) {
				  this.checked = false;
			  }
			  else {
				  this.checked = true;
			  }
		  });
		})
		
		function DelSelect(){
			var Checkbox=false;
			 $("input[name='id[]']").each(function(){
			  if (this.checked==true) {		
				Checkbox=true;	
			  }
			});
			if (Checkbox){
				var t=confirm("您确认要删除选中的内容吗？");
				if (t==false) return false; 		
			}
			else{
				alert("请选择您要删除的内容!");
				return false;
			}
		}
</script>
</body>


</html>