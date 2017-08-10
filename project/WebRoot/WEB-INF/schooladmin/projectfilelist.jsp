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
					<th>文件类型</th>
					<th>上传时间</th>
					<th>文件名</th>
					<th>阶段</th>
					<th>操作</th>
				</tr>
				<tbody id="tbody">
				<c:forEach items="${projectFileList }" var="file">
					<tr>
						<td id="theyear">${file.filetype }</td>
						<td id="pname">${file.uploaddate}</td>
						<td id="sname">${file.path }</td>
						<td id="snumber">${file.stage }</td>
						
						<td>
							<div class="button-group">
								<a class="button border-blue" href="<%=basePath %>schooladmin/getProjectInfoById.action?pid=${project.pid}&pname=${project.pname}&prank=${project.prank}&sname=${project.sname}" onclick=""></span>详情</a>
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
			
				<input  type="text" style="height:40px;padding:0 20px; width:80px" name="pageCount" /> 
				<input type="hidden" name="tatalPage" value="${page.tatalPage }" /> 
				<a class="button border-blue">跳转</a>
			

			<span style="margin-right:50px;float:right"> 
				<span style="font-size:20px ;float:right">--共${page.tatalPage }页</span>
				<span style="font-size:20px ;float:right">当前第${page.pageCount }页--</span>
			</span>
			</c:if>
			
		</div>
	</form>
	<form action="<%=basePath %>schooladmin/schoollistproject/0" method="get">
	</form>
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
					     if(json[index].prank=='a'){
					     	prank='国家级';
					     }
					     if(json[index].prank=='b'){
					     	prank='区级';
					     }
					     if(json[index].prank=='d'){
					     	prank='校级';
					     }
					     
					     var tostatus = "学校审核中";
					     
					       
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
		                        
		                        
				                "<td>"+
									"<div class='button-group'>"+
										"<a class='button border-blue' href=''>详情</a>"+
										
										"<a class='button border-blue' href=''>审核</a>"+
										
									"</div>"+
								"</td>"+
		                        
		                        
		                        "</tr>";
					    });					
					
						/**
						if (msg.ret) {  
		                    var str = "";  
		                    var data = msg.data;  
		  
		                    for (i in data) {  
		                    	alert(hsdasa);
		                        str += "<tr>" +  
		                        "<td>" + i.theyear + "</td>" +  
		                        "<td>" + i.pname + "</td>" +  
		                        "<td>" + i.snumber + "</td>" +  
		                        "<td>" + i.phone + "</td>" +  
		                        "<td>" + i.tname + "</td>" +  
		                        "<td>" + i.academy + "</td>" +  
		                        "<td>" + i.tostatus + "</td>" +  
		                        "</tr>";  
		                    }  
	                    	tbody.innerHTML = str;  
               			}  
						*/
						$("#tbody").html(str);
						
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