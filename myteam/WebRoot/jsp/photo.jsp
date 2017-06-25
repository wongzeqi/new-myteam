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
		<meta name="format-detection" content="telephone=no,email=no,date=no,aItemress=no">
		<title>java团队历届合影</title>
		<link rel="stylesheet" type="text/css" href="<%=basePath %>aui/css/aui.css" />
		<link rel="stylesheet" type="text/css" href="<%=basePath %>aui/css/aui-slide.css" />
		<style type="text/css">
			body {
				background: #ffffff;
			}
			
			.bg-dark {
				background: #333333 !important;
			}
			
			.aui-slide-node img {
				width: auto;
				height: 100%;
			}
		</style>
	</head>

	<body>
		<section class="aui-content">
			<div class="aui-card-list aui-border-t aui-border-b">
				<div class="aui-info aui-padded-l-15 aui-padded-r-15">
					<div class="aui-info-item aui-font-size-12">
						
						<span class="aui-margin-l-5">团队合影</span>
					</div>
					<div class="aui-info-item">
						<i class="aui-iconfont aui-icon-more"></i>
					</div>
				</div>
				<div id="aui-slide">
					<div class="aui-slide-wrap">
						<div class="aui-slide-node bg-dark">
							<img src="<%=basePath %>aui/image/13s.jpg" />
						</div>
						<div class="aui-slide-node bg-dark">
							<img src="<%=basePath %>aui/image/14s.jpg" />
						</div>
						<div class="aui-slide-node bg-dark">
							<img src="<%=basePath %>aui/image/15s.jpg" />
						</div>
					</div>
					<div class="aui-slide-page-wrap">
						<!--分页容器-->
					</div>
				</div>
				<div class="aui-card-list-header aui-padded-t-5 aui-padded-b-5">
					最丑的是王嘉琪
				</div>
				<div class="aui-card-list-content-padded aui-padded-t-0 aui-padded-b-0" style="color:#7b7b7b;">
					为什么这么丑，15级的成员合影为什么没有王嘉琪
				</div>
				
			</div>
			
		</section>
		
		
	</body>
	<script type="text/javascript" src="<%=basePath %>aui/script/aui-slide.js"></script>
	<script type="text/javascript">
		var slide = new auiSlide({
			container: document.getElementById("aui-slide"),
			// "width":300,
			"height": 240,
			"speed": 500,
			"autoPlay": 3000, //自动播放
			"loop": true,
			"pageShow": true,
			"pageStyle": 'line',
			'dotPosition': 'center'
		})
		var slide1 = new auiSlide({
			container: document.getElementById("aui-slide1"),
			// "width":300,
			"height": 240,
			"speed": 500,
			"autoPlay": 3000, //自动播放
			"loop": true,
			"pageShow": true,
			"pageStyle": 'line',
			'dotPosition': 'center'
		})
	</script>
	<script type="text/javascript">
		apiready = function() {
			api.parseTapmode();
		}
	</script>

</html>