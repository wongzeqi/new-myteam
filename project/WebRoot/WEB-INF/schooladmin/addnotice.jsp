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
	<link href="<%=basePath %>project/css/lyz.calendar.css" rel="stylesheet" type="text/css" />

	<script src="<%=basePath %>project/js/jquery-1.4.4.min.js"></script>

	<script src="<%=basePath %>project/js/lyz.calendar.min.js" type="text/javascript"></script>
	<script>

    $(function () {

        $("#txtBeginDate").calendar({

            controlId: "divDate",                                 // 弹出的日期控件ID，默认: $(this).attr("id") + "Calendar"

            speed: 200,                                           // 三种预定速度之一的字符串("slow", "normal", or "fast")或表示动画时长的毫秒数值(如：1000),默认：200

            complement: true,                                     // 是否显示日期或年空白处的前后月的补充,默认：true

            readonly: true,                                       // 目标对象是否设为只读，默认：true



            callback: function () {                               // 点击选择日期后的回调函数


            }

        });


    });
	</script>
	
	
	
	<script>
		var editor;
		KindEditor.ready(function(K) {
			editor = K.create('textarea[name="context"]', {
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
   <div class="panel-head" style="margin-bottom: 20px;"><strong>标题日期</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="<%=basePath %>schooladmin/addnotice.action">    
      <div class="form-group">
        <div class="label">
          <label>通知标题：</label>
        </div>
        <div class="field">
          <input type="text" name="title" class="input w50"  value=""  />
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>开始日期：</label>
        </div>
        <div class="field">
          <input id="txtBeginDate" type="text" class="input w50" name="dat" value="" placeholder="请填写项目开始日期..." data-validate="required:请填写项目开始日期.." />
          <div class="tips"></div>
        </div>
      </div>
      
      
      
     
      
     
      
      
     <div class="panel-head" style="margin-bottom: 20px;"><strong>通知正文</strong></div>
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>一、通知正文：</label>
        </div>
        <div class="field">
          <textarea name="context" style="width:800px;height:200px;"></textarea>
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