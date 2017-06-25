<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
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
		<title>AUI快速完成布局</title>
		<link rel="stylesheet" type="text/css" href="<%=basePath %>aui/css/aui.css" />

	</head>
	<style type="text/css">
		.aui-bar-nav {
			background-color: #37363b;
		}
	</style>

	<body>
		<header class="aui-bar aui-bar-nav" id="aui-header">
			<a class="aui-btn aui-pull-left" tapmode onclick="closeWin()">
				<span class="aui-iconfont aui-icon-left"></span>
			</a>
			<div class="aui-title">成员信息</div>

		</header>
		<div class="aui-content aui-margin-b-15">
			<ul class="aui-list aui-media-list">

				<li class="aui-list-item aui-list-item-middle">
					<div class="aui-media-list-item-inner">
						<div class="aui-list-item-media wechat-avatar">
							<div class="aui-badge">9</div>
							
						</div>
						<div class="aui-list-item-inner">
							<div class="aui-list-item-text">
								<div class="aui-list-item-title">流浪男</div>
								<div class="aui-list-item-right">星期一</div>
							</div>
							<div class="aui-list-item-text aui-font-size-12">
								Hello AUI 2.0!
							</div>
						</div>
					</div>
				</li>
				<li class="aui-list-item aui-list-item-middle">
					<div class="aui-media-list-item-inner">
						<div class="aui-list-item-media wechat-avatar">
							
						</div>
						<div class="aui-list-item-inner">
							<div class="aui-list-item-text">
								<div class="aui-list-item-title">张三</div>
								<div class="aui-list-item-right">1天前</div>
							</div>
							<div class="aui-list-item-text aui-font-size-12">
								Hello AUI 2.0!
							</div>
						</div>
					</div>
				</li>
				<li class="aui-list-item aui-list-item-middle">
					<div class="aui-media-list-item-inner">
						<div class="aui-list-item-media wechat-avatar">
							<div class="aui-dot"></div>
							
						</div>
						<div class="aui-list-item-inner">
							<div class="aui-list-item-text">
								<div class="aui-list-item-title">李四</div>
								<div class="aui-list-item-right">星期一</div>
							</div>
							<div class="aui-list-item-text aui-font-size-12">
								Hello AUI 2.0!
							</div>
						</div>
					</div>
				</li>
			</ul>
		</div>

	</body>
	<script type="text/javascript" src="<%=basePath %>aui/script/api.js"></script>
	<script type="text/javascript" src="<%=basePath %>aui/script/aui-tab.js"></script>
	<script type="text/javascript">
		apiready = function() {
			api.parseTapmode();
		}
		var tab = new auiTab({
			element: document.getElementById("footer")
		}, function(ret) {
			console.log(ret);
			if(ret) {
				document.getElementById("demo").textContent = ret.index;
			}
		});
	</script>

</html>