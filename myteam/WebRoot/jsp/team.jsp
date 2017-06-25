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
		<title>AUI快速完成布局</title>
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
						
						<span class="aui-margin-l-5">Sim Chen 发表的热门文章</span>
					</div>
					<div class="aui-info-item">
						<i class="aui-iconfont aui-icon-more"></i>
					</div>
				</div>
				<div id="aui-slide">
					<div class="aui-slide-wrap">
						<div class="aui-slide-node bg-dark">
							<img src="<%=basePath %>aui/image/slide1.jpg" />
						</div>
						<div class="aui-slide-node bg-dark">
							<img src="<%=basePath %>aui/image/slide2.jpg" />
						</div>
						<div class="aui-slide-node bg-dark">
							<img src="<%=basePath %>aui/image/slide3.jpg" />
						</div>
					</div>
					<div class="aui-slide-page-wrap">
						<!--分页容器-->
					</div>
				</div>
				<div class="aui-card-list-header aui-padded-t-5 aui-padded-b-5">
					中国拥有世界顶级航天芯片产品：俄罗斯造不出来了只能求中国分享
				</div>
				<div class="aui-card-list-content-padded aui-padded-t-0 aui-padded-b-0" style="color:#7b7b7b;">
					如果谈及中国在技术领域的短板，那么大家可能想到的是发动机，其实还有一样：高级电子芯片！人们通常所说的CPU，所谓CPU即中央处理器，就是其代表产品，它可是为电子信息产品的心脏,是集成电路产品的终端级产品。
				</div>
				
			</div>
			
		</section>
		
		<section class="aui-content">
			<div class="aui-card-list aui-border-t aui-border-b">
				<div class="aui-info aui-padded-l-15 aui-padded-r-15">
					<div class="aui-info-item aui-font-size-12">
						
						<span class="aui-margin-l-5">Sim Chen 发表的热门文章</span>
					</div>
					<div class="aui-info-item">
						<i class="aui-iconfont aui-icon-more"></i>
					</div>
				</div>
				<div id="aui-slide1">
					<div class="aui-slide-wrap">
						<div class="aui-slide-node bg-dark">
							<img src="<%=basePath %>aui/image/slide1.jpg" />
						</div>
						<div class="aui-slide-node bg-dark">
							<img src="<%=basePath %>aui/image/slide2.jpg" />
						</div>
						<div class="aui-slide-node bg-dark">
							<img src="<%=basePath %>aui/image/slide3.jpg" />
						</div>
					</div>
					<div class="aui-slide-page-wrap">
						<!--分页容器-->
					</div>
				</div>
				<div class="aui-card-list-header aui-padded-t-5 aui-padded-b-5">
					中国拥有世界顶级航天芯片产品：俄罗斯造不出来了只能求中国分享
				</div>
				<div class="aui-card-list-content-padded aui-padded-t-0 aui-padded-b-0" style="color:#7b7b7b;">
					如果谈及中国在技术领域的短板，那么大家可能想到的是发动机，其实还有一样：高级电子芯片！人们通常所说的CPU，所谓CPU即中央处理器，就是其代表产品，它可是为电子信息产品的心脏,是集成电路产品的终端级产品。
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