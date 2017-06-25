<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="maximum-scale=1.0,minimum-scale=1.0,user-scalable=0,width=device-width,initial-scale=1.0" />
		<meta name="format-detection" content="telephone=no,email=no,date=no,address=no">
		<title>我要请假</title>
		<link rel="stylesheet" type="text/css" href="<%=basePath %>aui/css/aui.css" />
		<link rel="stylesheet" type="text/css" href="<%=basePath %>aui/script/datedropper.css">
		<link rel="stylesheet" type="text/css" href="<%=basePath %>aui/script/timedropper.min.css">
		<style type="text/css">
			.demo {
				margin: 80px auto 40px auto;
				width: 320px
			}
			
			.input {
				padding: 6px;
				border: 1px solid #d3d3d3
			}
		</style>
		<style type="text/css">
			.aui-bar-nav {
				background-color: #37363b;
			}
		</style>
		<script type="text/javascript">

		function getInfoBySchoolNumber(){
			$.ajax({
				type:'get',
				url:'${pageContext.request.contextPath }/getInfoBySchoolNumber.action',
				contentType:'application/json;charset=utf-8',
				//数据格式是json串，商品信息
				data:{"schoolnumber":$("#schoolnumber").val()},
				success:function(data){//返回json结果
					//alert(data);
					$("#name").val(data.name);
					$("#academy").val(data.academy);
					$("#major").val(data.major);
					$("#mid").val(data.id);
					
				},
				error:function(){
					alert($("#schoolnumber").val());
				}
			});
		}
		</script>
	</head>

	<body>
		<header class="aui-bar aui-bar-nav" id="aui-header">
			<a class="aui-btn aui-pull-left" tapmode onclick="closeWin()">
				<span class="aui-iconfont aui-icon-left"></span>
			</a>
			<div class="aui-title">我要请假</div>
			
		</header>
		<form action="<%=basePath %>qingjia/qingjia.action" method="post">

			<input type="hidden" id="mid" name="mId"/>

			<div class="aui-content aui-margin-b-15">
				<ul class="aui-list aui-form-list">
					<!--学号-->
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label" ">
								学号
							</div>
							<div class="aui-list-item-input">
								<input onblur="getInfoBySchoolNumber()" id="schoolnumber" type="text" placeholder="学号" class="required" type="text"  data-valid="isNonEmpty||between:8-8" data-error="&nbsp;&nbsp;&nbsp;学号不能为空||&nbsp;&nbsp;&nbsp;学号必须为8位">
							</div>
						</div>
					</li>
					<!--日期-->
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								日期
							</div>
							<div class="aui-list-item-input">
								<input name="qjtime" type="text" class="input" id="pickdate" />
							</div>
						</div>
					</li>
					<!--日期-->
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								周次
							</div>
							<div class="aui-list-item-input">
								<input  type="text" name="qjweek" class="input" id="pickdate" />
							</div>
						</div>
					</li>
					<!--姓名-->
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								姓名
							</div>
							<div class="aui-list-item-input">
								<input id="name" value="" type="text" placeholder="">
							</div>
						</div>
					</li>

					<!--学院-->
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								学院
							</div>
							<div class="aui-list-item-input">
								<input id="academy" type="text" placeholder="" >
							</div>
						</div>
					</li>
					<!--专业-->
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								专业
							</div>
							<div class="aui-list-item-input">
								<input id="major" type="text" placeholder="">
							</div>
						</div>
					</li>

					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								类型
							</div>
							<div class="aui-list-item-input">
								<select name="qjtype">
									<option value="值班">值班</option>
									<option value="会议">会议</option>
									<option value="培训">培训</option>
								</select>
							</div>
						</div>
					</li>
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
							原因
							</div>
							<div class="aui-list-item-input">
								<textarea name="reason" placeholder="请假原因"></textarea>
							</div>
						</div>
					</li>
					<li class="aui-list-item">
						<div class="aui-list-item-inner aui-list-item-center aui-list-item-btn">
							<div class="aui-btn aui-btn-info aui-margin-r-5" tapmode onclick="openDialog('text')">我要请假</div>
						</div>
					</li>

				</ul>
			</div>
		</form>

	</body>
	<script type="text/javascript" src="<%=basePath %>aui/script/api.js"></script>
	<script type="text/javascript" src="<%=basePath %>aui/script/aui-dialog.js"></script>
	<script type="text/javascript" src="<%=basePath %>aui/script/aui-range.js"></script>
	<script type="text/javascript" src="<%=basePath %>aui/script/jquery-1.12.3.min.js"></script>
	
	<script src="<%=basePath %>aui/script/datedropper.min.js"></script>
	<script src="<%=basePath %>aui/script/timedropper.min.js"></script>
	
	
	
	
	<script>
		$("#pickdate").dateDropper({
			animate: false,
			format: 'Y-m-d',
			maxYear: '2020'
		});
		$("#picktime").timeDropper({
			meridians: false,
			format: 'HH:mm',
		});
	</script>

	<script>
		var _hmt = _hmt || [];
		(function() {
			var hm = document.createElement("script");
			hm.src = "//hm.baidu.com/hm.js?cc58f09bfb6ccacac51c4e5d7787d7d0";
			var s = document.getElementsByTagName("script")[0];
			s.parentNode.insertBefore(hm, s);
		})();
	</script>
	<script>
	
		apiready = function() {
			api.parseTapmode();
		}

		var dialog = new auiDialog();

		function openDialog(type) {
			switch(type) {
				case "text":
					dialog.alert({
						title: "确认",
						msg: '确定提交！',
						buttons: ['取消', '确定']
					}, function(ret) {
						document.forms[0].submit();
						//alert("提交成功！");
					})
					break;

			}
		}
		
		
		
	</script>

</html>