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
		<title>我要签到</title>
		<link rel="stylesheet" type="text/css" href="<%=basePath %>aui/css/aui.css" />
		<link rel="stylesheet" type="text/css" href="<%=basePath %>aui/script/datedropper.css">
		<link rel="stylesheet" type="text/css" href="<%=basePath %>aui/script/timedropper.min.css">
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
			<div class="aui-title">我要签到</div>
			
		</header>
		<form action="<%=basePath %>qiandao/qd.action" method="post">

			<div class="aui-content aui-margin-b-15">
				<ul class="aui-list aui-form-list">
					<!--学号-->
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								学号
							</div>
							<div class="aui-list-item-input">
								<input onblur="getInfoBySchoolNumber()" id="schoolnumber" type="text" name ="schoolnumber" placeholder="学号" class="required" type="text"  data-valid="isNonEmpty||between:8-8" data-error="&nbsp;&nbsp;&nbsp;学号不能为空||&nbsp;&nbsp;&nbsp;学号必须为8位">
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
								<input id="name" type="text" placeholder="">
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
								<input id="academy" type="text" placeholder="">
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
								<input id="mid" name="mId" type="hidden" />
							</div>
						</div>
					</li>
					<!--专业-->
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								周次
							</div>
							<div class="aui-list-item-input">
								<input id="qdweek" type="text" placeholder="周次" class="required" type="text"  data-valid="isNonEmpty||between:1-1">
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
								<input name="qdtime" type="text" class="input" id="pickdate" />
							</div>
						</div>
					</li>
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								经度
							</div>
							<div class="aui-list-item-input">
								<input id="jingdu" name="jd" type="text" placeholder="">
							</div>
						</div>
					</li>
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								纬度
							</div>
							<div class="aui-list-item-input">
								<input id="weidu" name="wd" type="text" placeholder="">
							</div>
						</div>
					</li>
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								类型
							</div>
							<div class="aui-list-item-input">
								<select name="qdtype">
									<option>值班</option>
									<option>会议</option>
									<option>培训</option>
								</select>
							</div>
						</div>
					</li>
					<li class="aui-list-item">
						<div class="aui-list-item-inner aui-list-item-center aui-list-item-btn">
							<input class="aui-btn aui-btn-info aui-margin-r-5" value="我要签到" type="submit" />
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
	
	<script type="text/javascript">
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

		var range = new auiRange({
			element: document.getElementById("range")
		}, function(ret) {})
	</script>
	
	<script type="text/javascript">
		function showPosition(position) {
			document.getElementById("weidu").value=position.coords.longitude ;
			document.getElementById("jingdu").value=position.coords.latitude ;
		}
		function getLocation() {
			if(navigator.geolocation) {
				navigator.geolocation.getCurrentPosition(showPosition);
				showPosition();
			} else {
				x.innerHTML = "Geolocation is not supported by this browser.";
			}
		}
		window.onload=getLocation;
	</script>
</html>