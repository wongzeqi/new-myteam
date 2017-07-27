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
    <div class="panel-head"><strong class="icon-reorder">已提交的变更申请</strong></div>
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
        <th>变更等级</th>
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
          		->
          		<c:if test="${project.torank eq 'a' }">国家级</c:if>
          		<c:if test="${project.torank eq 'b' }">区级</c:if>
          	</td>
          
          <td>
           <c:if test="${project.changestatus eq -3 }">学校审核未通过</c:if>
           <c:if test="${project.changestatus eq -2 }">学院审核未通过</c:if>
           <c:if test="${project.changestatus eq -1 }">指导老师审核未通过</c:if>
           <c:if test="${project.changestatus eq 3 }">学校通过</c:if>
           <c:if test="${project.changestatus eq 2 }">学校审核中</c:if>
           <c:if test="${project.changestatus eq 1 }">学院审核中</c:if>
           <c:if test="${project.changestatus eq 0 }">指导老师审核中</c:if>
          </td>
          
         
        <td>
       	<div class="button-group"> 
       	<a class="button border-blue" href="<%=basePath %>academyadmin/getProjectInfoById.action?pid=${project.pid}" onclick="">详情</a>
       	
       	<c:if test="${project.changestatus eq 1}">
       	
	       	<a class="button border-blue" href="<%=basePath %>academyadmin/agreechange.action?pid=${project.pid}" ></span>同意</a>
	       	<a class="button border-blue" href="<%=basePath %>academyadmin/disagreechange.action?pid=${project.pid}" onclick="">不同意</a>
       	</c:if>
       	</div>
       	</td>
          
        </tr>
       </c:forEach> 
    </table>
    
     <hr>
    <!-- f分页 -->
    
    
    	<a style="margin-left:100px" class="button border-blue">上一页</a>
    	<a class="button border-blue">下一页</a>
    	<form>
    	<input type="text"  style="height:40px;padding:0 20px; width:80px"  value="${pst.sname }"  />
    	<a class="button border-blue">跳转</a>
    	</form>
    	
    	<span style="margin-right:50px;float:right">
    	<span style="font-size:20px ;float:right">--共10页</span>
    	
    	<span  style="font-size:20px ;float:right">当前第5页--</span>
    	</span>
    
    
    
    
    
    
    
    
    
    
  </div>
</form>
<script type="text/javascript">

function del(id){
	if(confirm("您确定要删除吗?")){
		
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