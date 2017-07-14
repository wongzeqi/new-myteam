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
    <title>网站信息</title>  
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

        $("#txtEndDate").calendar();

    });

</script>
	<script type="text/javascript">
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
	<h4 style="color:red">&nbsp;&nbsp;&nbsp;&nbsp;请仔细检查你的基本信息，后果自负！</h4>
  	<p>&nbsp;&nbsp;&nbsp;&nbsp;负责人姓名 ： ${student.sname} 负责人学号：${student.snumber }</p>
  <c:if test="${empty student.nation or empty student.academy or empty student.major or student.clazz eq 0 or empty student.phone or empty student.email}">
  	<h3 style="color:red">请将信息完善后进行项目申请，且确保基本信息准确无误！</h3>
  </c:if>
  <c:if test="${!empty student.nation and !empty student.academy and !empty student.major and  !empty student.phone and !empty student.email}">
  <div class="body-content">
    <form method="post" class="form-x" action="<%= basePath%>studentgoto/applyprojectsubmit.action">
    	
      <div class="panel-head" style="margin-bottom: 20px;"><strong></span>选择指导老师</strong></div>
      <div class="form-group">
        <div class="label">
          <label>指导老师：</label>
        </div>
        <div class="field">
           <input id="tnmuber" type="text" class="input w50"   value="${teacher.tnumber }" placeholder="请输入指导老师教工号..." data-validate="required:请输入指导老师教工号..."/>
           <input id="tname" class="input w50" value="${teacher.tname }" style="margin-left: 50px;" placeholder="老师姓名">
           <input id="tid"  type="hidden" name="tid"> 
          <div class="tips"></div>
        </div>
      </div>
      <div class="panel-head" style="margin-bottom: 20px;"><strong></span>添加项目成员<span style="color:red">(成员不包括负责人，且不可以重复添加成员)</span></strong></div>
      <div class="form-group">
        <div class="label">
          <label>成员一：</label>
        </div>
        <div class="field">
           <input id="stu1" type="text" class="stu input w50" name="stu1" value="${project.stu1 }" placeholder="请输入指导学生学号..." data-validate="required:请输入指导学生学号..."/>
           <input id="sname1" class="stuvalue input w50" style="margin-left: 50px;" placeholder="学生姓名">
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>成员二：</label>
        </div>
        <div class="field">
           <input id="stu2" type="text"  class="stu input w50" name="stu2" value="${project.stu2 }" placeholder="请输入指导学生学号..." data-validate="required:请输入指导学生学号..."/>
           <input id="sname2" class="stuvalue input w50" style="margin-left: 50px;" placeholder="学生姓名">
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>成员三：</label>
        </div>
        <div class="field">
           <input id="stu3" type="text" class="stu input w50" name="stu3" value="${project.stu3 }" placeholder="请输入指导学生学号..." data-validate="required:请输入指导学生学号..."/>
           <input id="sname3" class="stuvalue input w50" style="margin-left: 50px;" placeholder="学生姓名">
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>成员四：</label>
        </div>
        <div class="field">
           <input id="stu4" type="text" class="stu input w50" name="stu4" value="${project.stu4 }" placeholder="请输入指导学生学号..." data-validate="required:请输入指导学生学号..."/>
           <input id="sname4" class="stuvalue input w50" style="margin-left: 50px;" placeholder="学生姓名">
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>成员五：</label>
        </div>
        <div class="field">
           <input id="stu5" type="text" class="stu input w50" name="stu5" value="${project.stu5 }" placeholder="请输入指导学生学号..." data-validate="required:请输入指导学生学号..."/>
           <input id="sname5" class="stuvalue input w50" style="margin-left: 50px;" placeholder="学生姓名">
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="panel-head" style="margin-bottom: 20px;"><strong></span>项目基本信息</strong></div>
      <div class="form-group">
        <div class="label">
          <label>项目名称：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="pname" value="${project.pname }" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>项目类型：</label>
        </div>
        <div class="field">
        	<select style="padding:5px 15px; border:1px solid #ddd;" name="prank">
        		<c:if test="${project.prank }=='a'">
        			<option value="a">国家级项目</option>
        		</c:if>
        		<c:if test="${project.prank }=='b'">
        			<option value="b">区级项目</option>
        		</c:if>
        		<c:if test="${project.prank }=='c'">
        			<option value="c">校级项目(团队)</option>
        		</c:if>
        		<c:if test="${project.prank }=='d'">
        			<option value="d">校级项目</option>
        		</c:if>
        		
        	</select>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>开始日期：</label>
        </div>
        <div class="field">
          <input id="txtBeginDate" type="text" class="input w50" name="begintime" value="" placeholder="请填写项目开始日期..." data-validate="required:请填写项目开始日期.." />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>结束日期：</label>
        </div>
        <div class="field">
           <input id="txtEndDate" type="text" class="input w50" name="endtime" value=""  placeholder="请填写项目结束日期..." data-validate="required:请填写项目结束日期..."/>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>技术领域：</label>
        </div>
        <div class="field">
           <input type="text" class="input" name="technology" value="${project.technology }"  placeholder="请输入项目涉及技术领域..." data-validate="required:请输入项目涉及技术领域..."/>
          <div class="tips"></div>
        </div>
      </div>
      
      
      
      
      
      <div class="panel-head" style="margin-bottom: 20px;"><strong>经费预算及使用说明</strong></div>
      <div class="form-group">
        <div class="label">
          <label>办公用品：</label>
        </div>
        <div class="field">
           <input type="number" class="input w50" name="officecost" value="${project.officecost }" placeholder="请输入办公用品费用..." data-validate="required:请输入办公用品费用..."/>
           <input  class="input w50" style="margin-left: 50px;" name="officemark" value="${project.officemark }" placeholder="备注...">
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>实验材料：</label>
        </div>
        <div class="field">
           <input type="number" class="input w50" name="materialcost" value="${project.materialcost }" placeholder="请输入实验材料费用..." data-validate="required:请输入实验材料费用..."/>
           <input  class="input w50" style="margin-left: 50px;" name="materialmark" value="${project.materialmark }" placeholder="备注...">
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>书籍资料：</label>
        </div>
        <div class="field">
           <input type="number" class="input w50" name="bookcost" value="${project.bookcost }" placeholder="请输入书籍资料费用..." data-validate="required:请输入书籍资料费用..."/>
           <input  class="input w50" name="bookmark" value="${project.bookmark }"  style="margin-left: 50px;" placeholder="备注...">
          <div class="tips"></div>
        </div>
      </div>
   
   	 <div class="form-group">
        <div class="label">
          <label>邮费：</label>
        </div>
        <div class="field">
           <input type="number" class="input w50" name="postcost" value="${project.postcost }" placeholder="请输入邮费费用..." data-validate="required:请输入邮费费用..."/>
           <input  class="input w50" name="postmark" value="${project.postmark }" style="margin-left: 50px;" placeholder="备注...">
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>电话：</label>
        </div>
        <div class="field">
           <input type="number" class="input w50" name="phonecost" value="${project.phonecost }" placeholder="请输入电话费用..." data-validate="required:请输入电话费用..."/>
           <input  class="input w50" name="phonemark" value="${project.phonemark }" style="margin-left: 50px;" placeholder="备注...">
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>交通：</label>
        </div>
        <div class="field">
           <input type="number" class="input w50" name="transportationcost" value="${project.transportationcost }" placeholder="请输入交通费用..." data-validate="required:请输入交通费用..."/>
           <input  class="input w50" name="transportationmark" value="${project.transportationmark }" style="margin-left: 50px;" placeholder="备注...">
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>维修：</label>
        </div>
        <div class="field">
           <input type="number" class="input w50" name="maintaincost" value="${project.maintaincost }" placeholder="请输入维修费用..." data-validate="required:请输入维修费用..."/>
           <input  class="input w50" name="maintainmark" value="${project.maintainmark }" style="margin-left: 50px;" placeholder="备注...">
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>印刷：</label>
        </div>
        <div class="field">
          <input type="number" class="input w50" name="printcost" value="${project.printcost }" placeholder="请输入印刷费用..." data-validate="required:请输入印刷费用..."/>
           <input  class="input w50" name="printmark" value="${project.printmark }" style="margin-left: 50px;" placeholder="备注...">
          <div class="tips"></div>
        </div>
      </div>
      
      
     
      
      <div class="panel-head" style="margin-bottom: 20px;"><strong>项目详细内容及说明</strong></div>
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>一、项目简介：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">${project.pintroduction }</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>二、项目背景：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">${project.pbackground }</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>三、项目主要研究的内容：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">${project.pcontent }</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>四、项目的计划方案：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">${project.pscheme }</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>五、项目的基础条件：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">${project.pcondition }</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>六、项目的总体目标：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">${project.ptarget }</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group" style="margin-left: 5%;">
        <div class="label" style="width: 30%; text-align: left;">
          <label>七、项目的进度计划：</label>
        </div>
        <div class="field">
          <textarea name="content" style="width:800px;height:200px;">${project.pprogress }</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
        </div>
      </div>
    </form>
  </div>
</c:if>
</div>
<script type="text/javascript">
	$("#tnmuber").keyup(function(event){ 
		var tnumber = $(this).val();
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
	
	$("#stu1").keyup(function(event){ 
		var snumber = $(this).val();
		$.ajax({
			type : 'get',
			url : '${pageContext.request.contextPath}/studentgoto/getName.action',
			contentType : 'application/json;charset=utf-8',
			data : {
				"snumber" : snumber
			},
			success : function(data) {//返回json结果
				$("#sname1").val(data.sname);
			},
			error : function() {
			}
		});
	}); 
	
	
	$("#stu2").keyup(function(event){ 
		var snumber = $(this).val();
		$.ajax({
			type : 'get',
			url : '${pageContext.request.contextPath}/studentgoto/getName.action',
			contentType : 'application/json;charset=utf-8',
			data : {
				"snumber" : snumber
			},
			success : function(data) {//返回json结果
				$("#sname2").val(data.sname);
			},
			error : function() {
			}
		});
	}); 
	
	
	$("#stu3").keyup(function(event){ 
		var snumber = $(this).val();
		$.ajax({
			type : 'get',
			url : '${pageContext.request.contextPath}/studentgoto/getName.action',
			contentType : 'application/json;charset=utf-8',
			data : {
				"snumber" : snumber
			},
			success : function(data) {//返回json结果
				$("#sname3").val(data.sname);
			},
			error : function() {
				alert("失败");
			}
		});
	}); 
	
	
	$("#stu4").keyup(function(event){ 
		var snumber = $(this).val();
		$.ajax({
			type : 'get',
			url : '${pageContext.request.contextPath}/studentgoto/getName.action',
			contentType : 'application/json;charset=utf-8',
			data : {
				"snumber" : snumber
			},
			success : function(data) {//返回json结果
				$("#sname4").val(data.sname);
			},
			error : function() {
			}
		});
	}); 
	
	$("#stu5").keyup(function(event){ 
		var snumber = $(this).val();
		$.ajax({
			type : 'get',
			url : '${pageContext.request.contextPath}/studentgoto/getName.action',
			contentType : 'application/json;charset=utf-8',
			data : {
				"snumber" : snumber
			},
			success : function(data) {//返回json结果
				$("#sname5").val(data.sname);
			},
			error : function() {
			}
		});
	}); 
</script>
</body>
</html>