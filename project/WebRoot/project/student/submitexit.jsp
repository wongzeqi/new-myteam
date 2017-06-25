<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
			editor = K.create('textarea[name="content"]', {
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
    <form method="post" class="form-x" action="">    
      <div class="form-group">
        <div class="label">
          <label>项目名称：</label>
        </div>
        <div class="field">
          <select style="padding:5px 15px; border:1px solid #ddd;">
        		<option>基于微信的团队管理系统的设计与实现</option>
        		<option>区级项目</option>
        		<option>团队项目</option>
        		<option>校级项目</option>
        	</select>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>负责人：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="url" value=""  />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>指导老师：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="url" value=""  />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>变更级别：</label>
        </div>
        <div class="field">
        	<select style="padding:5px 15px; border:1px solid #ddd;">
	          <option>国家级</option>
	    			<option>区级</option>
	    			<option>校级</option>
    			</select>
        </div>
      </div>
      
      
     <div class="panel-head" style="margin-bottom: 20px;"><strong>变更原因</strong></div>
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>一、原因（理由）：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">KindEditor</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body></html>