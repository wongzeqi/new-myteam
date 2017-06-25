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
    <title>网站信息</title>  
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
    <style>
		label{
			font-size: 15px;
		}    	
		.l{
			float: left;
		}
    </style>
    
</head>
<body>
<div class="">
	
	

	
	
	
	
 <div class="panel-head" style="margin-bottom: 20px;"><strong><span class="icon-pencil-square-o"></span>负责人基本信息</strong></div>
姓名	
郭鹏
性别	
男
学院	
计算机科学与工程
年级	
2014级
联系方式	
13895413314
电子邮箱
1016484945@qq.com
  
  <div class="body-content">
    <form method="post" class="form-x" action="">
    	
      <div class="panel-head" style="margin-bottom: 20px;"><strong></span>选择指导老师</strong></div>
      <div class="form-group">
        <div class="label">
          <label>指导老师：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入指导老师教工号..." data-validate="required:请输入指导老师教工号..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="老师姓名"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="panel-head" style="margin-bottom: 20px;"><strong></span>添加项目成员</strong></div>
      <div class="form-group">
        <div class="label">
          <label>成员一：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入指导学生学号..." data-validate="required:请输入指导学生学号..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="学生姓名"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>成员二：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入指导学生学号..." data-validate="required:请输入指导学生学号..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="学生姓名"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>成员三：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入指导学生学号..." data-validate="required:请输入指导学生学号..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="学生姓名"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>成员四：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入指导学生学号..." data-validate="required:请输入指导学生学号..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="学生姓名"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>成员五：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入指导学生学号..." data-validate="required:请输入指导学生学号..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="学生姓名"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="panel-head" style="margin-bottom: 20px;"><strong></span>项目基本信息</strong></div>
      <div class="form-group">
        <div class="label">
          <label>项目名称：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="stitle" value="" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>项目类型：</label>
        </div>
        <div class="field">
        	<select style="padding:5px 15px; border:1px solid #ddd;">
        		<option>国家级项目</option>
        		<option>区级项目</option>
        		<option>团队项目</option>
        		<option>校级项目</option>
        	</select>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>开始日期：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="sentitle" value="" placeholder="请填写项目开始日期..." data-validate="required:请填写项目开始日期.." />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>结束日期：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value=""  placeholder="请填写项目结束日期..." data-validate="required:请填写项目结束日期..."/>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>技术领域：</label>
        </div>
        <div class="field">
           <input type="text" class="input" name="sentitle" value=""  placeholder="请输入项目涉及技术领域..." data-validate="required:请输入项目涉及技术领域..."/>
          <div class="tips"></div>
        </div>
      </div>
      
      
      
      
      
      <div class="panel-head" style="margin-bottom: 20px;"><strong>经费预算及使用说明</strong></div>
      <div class="form-group">
        <div class="label">
          <label>办公用品：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入办公用品费用..." data-validate="required:请输入办公用品费用..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="备注..."></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>实验材料：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入实验材料费用..." data-validate="required:请输入实验材料费用..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="备注..."></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>书籍资料：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入书籍资料费用..." data-validate="required:请输入书籍资料费用..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="备注..."></textarea>
          <div class="tips"></div>
        </div>
      </div>
   
   	 <div class="form-group">
        <div class="label">
          <label>邮费：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入邮费费用..." data-validate="required:请输入邮费费用..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="备注..."></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>电话：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入电话费用..." data-validate="required:请输入电话费用..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="备注..."></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>交通：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入交通费用..." data-validate="required:请输入交通费用..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="备注..."></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>维修：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入维修费用..." data-validate="required:请输入维修费用..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="备注..."></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>印刷：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="sentitle" value="" placeholder="请输入印刷费用..." data-validate="required:请输入印刷费用..."/>
           <textarea  class="input w50" style="margin-left: 50px;" placeholder="备注..."></textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      
     
      
      <div class="panel-head" style="margin-bottom: 20px;"><strong>项目详细内容及说明</strong></div>
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>一、项目简介：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">KindEditor</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>二、项目背景及立项的重要性：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">KindEditor</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>三、项目主要研究的内容：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">KindEditor</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>四、项目的计划方案：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">KindEditor</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>五、项目的基础条件：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">KindEditor</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>六、项目的总体目标：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">KindEditor</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>七、项目的进度计划：</label>
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
</body>
</html>