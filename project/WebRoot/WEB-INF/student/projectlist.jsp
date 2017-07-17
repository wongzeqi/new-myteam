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
    <title></title>  
    <link rel="stylesheet" href="<%=mypath %>css/pintuer.css">
	<link rel="stylesheet" href="<%=mypath %>css/admin.css">
	<script src="<%=mypath %>js/jquery.js"></script> 
    <script src="<%=mypath %>js/pintuer.js"></script>
</head>
<body>
<form method="post" action="">
  <div>
    <div class="panel-head"><strong class="icon-reorder">我负责的项目</strong></div>
    <div class="padding border-bottom">
      <ul class="search">
        <li>
        	<input type="text" placeholder="请输入搜索关键字" name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
          <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()" > 搜索</a></li>
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
      <c:forEach items="${myProjects }" var="project">
        <tr <c:if test="${project.tostatus eq -3 }">style="color:red"</c:if> <c:if test="${project.tostatus eq 3 }">style="color:green"</c:if>>
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
          
          <td>
           <c:if test="${project.isissue eq 1 and project.tostatus eq 0 and project.prank ne 'c'}">指导老师审核中</c:if>
           <c:if test="${project.isissue eq 1 and project.tostatus eq -1 and project.prank ne 'c'}">指导老师未通过</c:if>
           <c:if test="${project.isissue eq 1 and project.tostatus eq 1 and project.prank ne 'c'}">学院审核中</c:if>
           <c:if test="${project.isissue eq 1 and project.tostatus eq -2 and project.prank ne 'c'}">学院未通过</c:if>
           <c:if test="${project.isissue eq 1 and project.tostatus eq 2 and project.prank ne 'c'}">学校审核中</c:if>
           <c:if test="${project.isissue eq 1 and project.tostatus eq -3}">学校未通过</c:if>
           <c:if test="${project.isissue eq 1 and project.tostatus eq 3}">审核通过</c:if>
           
           <c:if test="${project.isissue eq 1 and project.tostatus eq 1 and project.prank eq 'c'}">学校审核中</c:if>
           <c:if test="${project.isissue eq 0 }">未提交</c:if>
          </td>
          
         
         
	          <c:if test="${project.isissue eq 0 and project.sid eq student.sid}">
	          	<td>
		          	<div class="button-group"> 
			          	<a class="button border-blue" href="<%=basePath %>studentgoto/getProjectInfoById.action?pid=${project.pid}" onclick=""><span class="icon-info"></span>修改</a>
			          	<a class="button border-blue" href="<%=basePath %>studentgoto/submitproject.action?pid=${project.pid}" onclick="submit()"><span class="icon-info"></span>提交</a>
			          	<a class="button border-red" href="<%=basePath %>studentgoto/deleteProjectById.action?pid=${project.pid}" onclick="del()"><span class="icon"></span>删除</a>
		          	</div>
	          	</td>
	         </c:if>
	          <c:if test="${project.isissue eq 1 and project.sid eq student.sid}">
	          	<td>
		          	<div class="button-group">
		         	 	<a class="button border-blue" href="<%=basePath %>studentgoto/getProjectInfoById.action?pid=${project.pid}" onclick=""><span class="icon-info"></span>详情</a>
		          	</div>
	          	</td>
	          </c:if>
        
	          <c:if test="${project.sid ne student.sid}">
	          	<td>
	          	<button class="button border-green disabled" href="#" onclick=""><span class="icon"></span>非负责人无法操作</button>
	          	</td>
	          </c:if>
         
         
         
        </tr>
       </c:forEach> 
    </table>
    
    <hr />
    <br /><br />
    
    <div class="panel-head"><strong class="icon-reorder">我参与的项目</strong></div>
    <div class="padding border-bottom">
      <ul class="search">
        <li>
        	<input type="text" placeholder="请输入搜索关键字" name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
          <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()" > 搜索</a></li>
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
      <c:forEach items="${notMyProject }" var="project">
        <tr <c:if test="${project.tostatus eq -3 }">style="color:red"</c:if> <c:if test="${project.tostatus eq 3 }">style="color:green"</c:if>>
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
          
          <td>
           <c:if test="${project.isissue eq 1 and project.tostatus eq 0 and project.prank ne 'c'}">指导老师审核中</c:if>
           <c:if test="${project.isissue eq 1 and project.tostatus eq -1 and project.prank ne 'c'}">指导老师未通过</c:if>
           <c:if test="${project.isissue eq 1 and project.tostatus eq 1 and project.prank ne 'c'}">学院审核中</c:if>
           <c:if test="${project.isissue eq 1 and project.tostatus eq -2 and project.prank ne 'c'}">学院未通过</c:if>
           <c:if test="${project.isissue eq 1 and project.tostatus eq 2 and project.prank ne 'c'}">学校审核中</c:if>
           <c:if test="${project.isissue eq 1 and project.tostatus eq -3}">学校未通过</c:if>
           <c:if test="${project.isissue eq 1 and project.tostatus eq 3}">审核通过</c:if>
           
           <c:if test="${project.isissue eq 1 and project.tostatus eq 1 and project.prank eq 'c'}">学校审核中</c:if>
           <c:if test="${project.isissue eq 0 }">未提交</c:if>
          </td>
          
         
         
	          <c:if test="${project.isissue eq 0 and project.sid eq student.sid}">
	          	<td>
		          	<div class="button-group"> 
			          	<a class="button border-blue" href="<%=basePath %>studentgoto/getProjectInfoById.action?pid=${project.pid}" onclick=""><span class="icon-info"></span>修改</a>
			          	<a class="button border-blue" href="<%=basePath %>studentgoto/submitproject.action?pid=${project.pid}" onclick="submit()"><span class="icon-info"></span>提交</a>
			          	<a class="button border-red" href="<%=basePath %>studentgoto/deleteProjectById.action?pid=${project.pid}" onclick="del()"><span class="icon"></span>删除</a>
		          	</div>
	          	</td>
	         </c:if>
	          <c:if test="${project.isissue eq 1 and project.sid eq student.sid}">
	          	<td>
		          	<div class="button-group">
		         	 	<a class="button border-blue" href="<%=basePath %>studentgoto/getProjectInfoById.action?pid=${project.pid}" onclick=""><span class="icon-info"></span>详情</a>
		          	</div>
	          	</td>
	          </c:if>
        
	          <c:if test="${project.sid ne student.sid}">
	          	<td>
	          	<button class="button border-green disabled" href="#" onclick=""><span class="icon"></span>无法操作</button>
	          	</td>
	          </c:if>
         
         
         
        </tr>
       </c:forEach> 
    </table>
  <hr>
    
    
  </div>
</form>
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
</body></html>