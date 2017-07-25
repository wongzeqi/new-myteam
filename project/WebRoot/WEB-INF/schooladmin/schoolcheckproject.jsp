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
    
    <link rel="stylesheet" href="<%=mypath %>kindeditor-4.1.10/themes/default/default.css" />
	<script charset="utf-8" src="<%=mypath %>kindeditor-4.1.10/kindeditor-all-min.js"></script>
	<script charset="utf-8" src="<%=mypath %>kindeditor-4.1.10/lang/zh_CN.js"></script>
	<script>
		var editor;
		KindEditor.ready(function(K) {
			editor = K.create('textarea[name="idea"]', {
				allowFileManager : true
			});
			K('input[name=getHtml]').click(function(e) {
				alert(editor.html());
			});
			K('input[name=isEmpty]').click(function(e) {
				alert(editor.isEmpty());
			});
			K('input[name=getText]').click(function(e) {
				alert(editor.text());
			});
			K('input[name=selectedHtml]').click(function(e) {
				alert(editor.selectedHtml());
			});
			K('input[name=setHtml]').click(function(e) {
				editor.html('<h3>Hello KindEditor</h3>');
			});
			K('input[name=setText]').click(function(e) {
				editor.text('<h3>Hello KindEditor</h3>');
			});
			K('input[name=insertHtml]').click(function(e) {
				editor.insertHtml('<strong>插入HTML</strong>');
			});
			K('input[name=appendHtml]').click(function(e) {
				editor.appendHtml('<strong>添加HTML</strong>');
			});
			K('input[name=clear]').click(function(e) {
				editor.html('');
			});
		});
	</script>
</head>
<body>
<script type="text/javascript">
function del(id,mid){
	if(confirm("您确定要删除吗?")){
	
	}
}
</script>
<div  id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span>项目基本信息</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="<%=basePath %>academyadmin/fullcheckidea.action">    
      <div class="form-group">
        <div class="label">
          <label>项目名称：</label>
        </div>
        <div class="field">
          <input type="text" class="input w100"  value="${pst.pname }"  />
          <input type="hidden" class="input w100" name="pid" value="${pst.pid }"  />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>负责人：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  value="${pst.sname }"  />
          <div class="tips"></div>
        </div>
      </div>
      
      
      
      <div class="form-group">
        <div class="label">
          <label>项目级别：</label>
        </div>
        <div class="field">
        	<select style="padding:5px 15px; border:1px solid #ddd;">
			      <option id="prank" >
			      	<c:if test="${pst.prank eq 'c'}">校级(团队)</c:if>
			      	<c:if test="${pst.prank eq 'd'}">校级</c:if>
			      	<c:if test="${pst.prank eq 'a'}">国家级</c:if>
			      	<c:if test="${pst.prank eq 'b'}">区级</c:if>
			      </option>
    		</select>
        </div>
      </div>
      
    
      
      
     <div class="panel-head" style="margin-bottom: 20px;"><strong>项目指导老师意见：</strong></div>
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>意见：</label>
        </div>
        <div class="field">
          <textarea name="idea" style="width:800px;height:200px;">${pst.teachercheckidea }</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="panel-head" style="margin-bottom: 20px;"><strong>学院意见：</strong></div>
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>意见：</label>
        </div>
        <div class="field">
          <textarea name="idea" style="width:800px;height:200px;"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="panel-head" style="margin-bottom: 20px;"><strong style="color:red">请填写学校意见：</strong></div>
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>意见：</label>
        </div>
        <div class="field">
          <textarea name="idea" style="width:800px;height:200px;"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="panel-head" style="margin-bottom: 20px;"><strong>是否通过审核：</strong></div>
      <div class="form-group">
        <div class="label">
          <label>是否通过：</label>
        </div>
        <div class="field">
          <select name="ispass" style="padding:5px 15px; border:1px solid #ddd;">
        		<option value="1">通过</option>
        		<option value="0">不通过</option>
        	</select>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit">提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body></html>