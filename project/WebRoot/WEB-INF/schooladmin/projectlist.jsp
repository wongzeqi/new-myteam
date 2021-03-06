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
					<li id="s1">
						<input type="text" id="pname" placeholder="请输入项目名称..." name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" /> 
						<a  class="button border-main icon-search" id ="search"> 搜索</a>
					</li>
					
					<li id="s2">
						<select class="myselect" style="padding:10px 20px; border:1px solid #ddd;">
							<option value="2017">2017年</option>
			        		<option value="2016">2016年</option>
			        		<option value="2015">2015年</option>
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
				<tbody id="tbody">
				<c:forEach items="${projectList }" var="project">
					<tr>
						<td id="theyear">${project.theyear }</td>
						<td id="pname">${project.pname}</td>
						<td id="sname">${project.sname }</td>
						<td id="snumber">${project.snumber }</td>
						<td id="phone">${project.phone }</td>
						<td id="tname">${project.tname }</td>
						<td id="academy">${project.academy }</td>

						<td id="prank">
							<c:if test="${project.prank eq 'a' }">国家级<c:if test="${project.isteam eq 1 }">(团队)</c:if></c:if>
          					<c:if test="${project.prank eq 'b' }">区级<c:if test="${project.isteam eq 1 }">(团队)</c:if></c:if>
       						<c:if test="${project.prank eq 'c' }">校级(团队)</c:if>
          					<c:if test="${project.prank eq 'd' }">校级</c:if>
						</td>

						<td id="tostatus"><c:if test="${project.tostatus eq 0 and project.prank ne 'c'}">指导老师审核中</c:if>
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
								<a class="button border-blue" href="<%=basePath %>schooladmin/getProjectInfoById.action?pid=${project.pid}&pname=${project.pname}&prank=${project.prank}&sname=${project.sname}&snumber=${project.snumber}" onclick=""></span>详情</a>
								<c:if test="${project.tostatus eq 2}">
									<a class="button border-blue" href="<%=basePath %>schooladmin/schooladmingotocheck.action?pid=${project.pid}&pname=${project.pname}&prank=${project.prank}&sname=${project.sname}" onclick="">审核</a>
								</c:if>
							</div>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
			
		
			<!-- f分页 -->
			<c:if test="${page.tatalPage>1 }">
			<hr>
			<span style="margin-left:100px">
			<c:if test="${page.pageCount>1 }">
				<a href="<%=basePath %>schooladmin/schoollistproject/${prank }/${tostatus}?pageCount=${page.pageCount-1}"  class="button border-blue">上一页</a>
			</c:if>
			
			<c:if test="${page.pageCount<page.tatalPage }">
				<a href="<%=basePath %>schooladmin/schoollistproject/${prank }/${tostatus}?pageCount=${page.pageCount+1}" class="button border-blue">下一页</a>
			</c:if>
			</span>
				
				<input id="pageCount" form="jumpf" type="number" style="height:40px;padding:0 20px; width:80px" name="pageCount" min="1" max="${tatalPage }" /> 
				<input type="hidden" name="tatalPage" value="${page.tatalPage }" /> 
				<a id="jump"  class="button border-blue">跳转</a>
			

			<span style="margin-right:50px;float:right"> 
				<span style="font-size:20px ;float:right">--共${page.tatalPage }页</span>
				<span style="font-size:20px ;float:right">当前第${page.pageCount }页--</span>
			</span>
			</c:if>
			
		</div>
	</form>
	<form id="jumpf" action="" name="jumpf"></form>
	
	
	<script type="text/javascript">
		$(document).ready(function(){
			$("#jump").click(function(){
				$("#jumpf").submit();
			});
		});
	</script>
	
	
	
	<script type="text/javascript">
		$(document).ready(function(){
			$("#search").click(function(){
				var pname = $("#pname").val();
				$.ajax({
					type : 'get',
					url : '/project/schooladmin/jsonlikename/${prank}/${tostatus}/'+pname,
					contentType : 'application/json;charset=utf-8',
					data : {
						
					},
					success : function(msg) {//返回json结果
						$("#tbody").html('');
						var json = eval(msg); //数组  
					    $.each(json, function (index, item) {
					     //循环获取数据
					     var theyear = json[index].theyear;
					     var pname = json[index].pname;
					     var sname = json[index].sname;
					     var snumber = json[index].snumber;
					     var phone = json[index].phone;
					     var tname = json[index].tname;
					     var academy = json[index].academy;
					     var prank = '';
					     var tostatus = '';
					     var shhref = '<%=basePath %>schooladmin/schooladmingotocheck.action?pid=${project.pid}&pname=${project.pname}&prank=${project.prank}&sname=${project.sname}';
					     var xqhref = '<%=basePath %>schooladmin/getProjectInfoById.action?pid=${project.pid}&pname=${project.pname}&prank=${project.prank}&sname=${project.sname}';
					     var html = '';
					     if(json[index].prank=='a'){
					     	prank='国家级';
					     }
					     if(json[index].prank=='b'){
					     	prank='区级';
					     }
					     if(json[index].prank=='d'){
					     	prank='校级';
					     }
					     if(json[index].tostatus==2){
					     	tostatus="学校审核中";
					     	html +=  "<td>"+
									"<div class='button-group'>"+
										"<a class='button border-blue' href="+
										xqhref
										">详情</a>"+
										"<a class='button border-blue' href="+
										shhref
										">审核</a>"+
									"</div>"+
								"</td>";
					     }
					     if(json[index].tostatus==3){
					     	tostatus="审核通过";
					     	html +=  "<td>"+
									"<div class='button-group'>"+
										"<a class='button border-blue' href="+
										xqhref
										">详情</a>"+
									"</div>"+
								"</td>";
					     }
					     if(json[index].tostatus==-3){
					     	tostatus="审核不通过";
					     	html +=  "<td>"+
									"<div class='button-group'>"+
										"<a class='button border-blue' href="+
										xqhref
										">详情</a>"+
									"</div>"+
								"</td>";
					     }
					     
					       
					     str= str + "<tr>" +  
		                        "<td>" + theyear + "</td>" +  
		                        "<td>" + pname + "</td>" + 
		                        "<td>" + sname + "</td>" +  
		                        "<td>" + snumber + "</td>" +  
		                        "<td>" + phone + "</td>" +  
		                        "<td>" + tname + "</td>" +  
		                        "<td>" + academy + "</td>" + 
		                        "<td>" + prank + "</td>" +  
		                        "<td>" + tostatus + "</td>" +  
		                        html+
		                        "</tr>";
					    });					
					
						
						$("#tbody").html(str);
						
					}
				});
			
			
			});
		});
		
		
	
	</script>
	
	
	
	<script type="text/javascript">
		$(document).ready(function(){
			$('.myselect').change(function(){
				var str = "";
				
				var value1 =$('.myselect').children('option:selected').val();//这就是selected的值
				var value2 =$('.myselect').last('option:selected').val();//这就是selected的值
				alert(value1);
				alert(value2);
				$.ajax({
					type : 'get',
					url : '/project/schooladmin/schoollistprojectjson/${prank}/${tostatus}',
					contentType : 'application/json;charset=utf-8',
					data : {
						"academyname" : value2,
						"theyear" : value1
					},
					success : function(msg) {//返回json结果
						var json = eval(msg); //数组  
					    $.each(json, function (index, item) {
					     //循环获取数据
					     var theyear = json[index].theyear;
					     var pname = json[index].pname;
					     var sname = json[index].sname;
					     var snumber = json[index].snumber;
					     var phone = json[index].phone;
					     var tname = json[index].tname;
					     var academy = json[index].academy;
					     var prank = '';
					     var tostatus = '';
					     var shhref = '<%=basePath %>schooladmin/schooladmingotocheck.action?pid=${project.pid}&pname=${project.pname}&prank=${project.prank}&sname=${project.sname}';
					     var xqhref = '<%=basePath %>schooladmin/getProjectInfoById.action?pid=${project.pid}&pname=${project.pname}&prank=${project.prank}&sname=${project.sname}';
					     var html = '';
					     if(json[index].prank=='a'){
					     	prank='国家级';
					     }
					     if(json[index].prank=='b'){
					     	prank='区级';
					     }
					     if(json[index].prank=='d'){
					     	prank='校级';
					     }
					     if(json[index].tostatus==2){
					     	tostatus="学校审核中";
					     	html +=  "<td>"+
									"<div class='button-group'>"+
										"<a class='button border-blue' href="+
										xqhref+
										">详情</a>"+
										"<a class='button border-blue' href="+
										shhref+
										">审核</a>"+
									"</div>"+
								"</td>";
					     }
					     if(json[index].tostatus==3){
					     	tostatus="审核通过";
					     	html +=  "<td>"+
									"<div class='button-group'>"+
										"<a class='button border-blue' href="+
										xqhref+
										">详情</a>"+
									"</div>"+
								"</td>";
					     }
					     if(json[index].tostatus==-3){
					     	tostatus="审核不通过";
					     	html +=  "<td>"+
									"<div class='button-group'>"+
										"<a class='button border-blue' href="+
										xqhref+
										">详情</a>"+
									"</div>"+
								"</td>";
					     }
					     
					       
					     str= str + "<tr>" +  
		                        "<td>" + theyear + "</td>" +  
		                        "<td>" + pname + "</td>" + 
		                        "<td>" + sname + "</td>" +  
		                        "<td>" + snumber + "</td>" +  
		                        "<td>" + phone + "</td>" +  
		                        "<td>" + tname + "</td>" +  
		                        "<td>" + academy + "</td>" + 
		                        "<td>" + prank + "</td>" +  
		                        "<td>" + tostatus + "</td>" +  
		                        html+
		                        "</tr>";
					    });					
					
						
						$("#tbody").html(str);
						
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