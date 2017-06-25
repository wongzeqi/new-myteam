<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"	+ request.getServerName() + ":" + request.getServerPort()		+ path + "/";
%>
<!DOCTYPE html>
	<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>主页</title>

		<meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta name="format-detection" content="telephone=no">
		<meta charset="utf-8">

		<link href="<%=basePath %>aui/css/style.css" rel="stylesheet" type="text/css" />
		<link href="<%=basePath %>aui/css/iscroll.css" rel="stylesheet" type="text/css" />
		<style>
			* {
				margin: 0;
				padding: 0;
			}
			
			.slideshow {
				position: absolute;
				width: 100vw;
				height: 100vh;
				overflow: hidden;
			}
			
			.slideshow-image {
				position: absolute;
				width: 100%;
				height: 100%;
				background: no-repeat 50% 50%;
				background-size: cover;
				-webkit-animation-name: kenburns;
				animation-name: kenburns;
				-webkit-animation-timing-function: linear;
				animation-timing-function: linear;
				-webkit-animation-iteration-count: infinite;
				animation-iteration-count: infinite;
				-webkit-animation-duration: 16s;
				animation-duration: 16s;
				opacity: 1;
				-webkit-transform: scale(1.2);
				transform: scale(1.2);
			}
			
			.slideshow-image:nth-child(1) {
				-webkit-animation-name: kenburns-1;
				animation-name: kenburns-1;
				z-index: 3;
			}
			
			.slideshow-image:nth-child(2) {
				-webkit-animation-name: kenburns-2;
				animation-name: kenburns-2;
				z-index: 2;
			}
			
			.slideshow-image:nth-child(3) {
				-webkit-animation-name: kenburns-3;
				animation-name: kenburns-3;
				z-index: 1;
			}
			
			.slideshow-image:nth-child(4) {
				-webkit-animation-name: kenburns-4;
				animation-name: kenburns-4;
				z-index: 0;
			}
			
			@-webkit-keyframes kenburns-1 {
				0% {
					opacity: 1;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
				1.5625% {
					opacity: 1;
				}
				23.4375% {
					opacity: 1;
				}
				26.5625% {
					opacity: 0;
					-webkit-transform: scale(1);
					transform: scale(1);
				}
				100% {
					opacity: 0;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
				98.4375% {
					opacity: 0;
					-webkit-transform: scale(1.21176);
					transform: scale(1.21176);
				}
				100% {
					opacity: 1;
				}
			}
			
			@keyframes kenburns-1 {
				0% {
					opacity: 1;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
				1.5625% {
					opacity: 1;
				}
				23.4375% {
					opacity: 1;
				}
				26.5625% {
					opacity: 0;
					-webkit-transform: scale(1);
					transform: scale(1);
				}
				100% {
					opacity: 0;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
				98.4375% {
					opacity: 0;
					-webkit-transform: scale(1.21176);
					transform: scale(1.21176);
				}
				100% {
					opacity: 1;
				}
			}
			
			@-webkit-keyframes kenburns-2 {
				23.4375% {
					opacity: 1;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
				26.5625% {
					opacity: 1;
				}
				48.4375% {
					opacity: 1;
				}
				51.5625% {
					opacity: 0;
					-webkit-transform: scale(1);
					transform: scale(1);
				}
				100% {
					opacity: 0;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
			}
			
			@keyframes kenburns-2 {
				23.4375% {
					opacity: 1;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
				26.5625% {
					opacity: 1;
				}
				48.4375% {
					opacity: 1;
				}
				51.5625% {
					opacity: 0;
					-webkit-transform: scale(1);
					transform: scale(1);
				}
				100% {
					opacity: 0;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
			}
			
			@-webkit-keyframes kenburns-3 {
				48.4375% {
					opacity: 1;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
				51.5625% {
					opacity: 1;
				}
				73.4375% {
					opacity: 1;
				}
				76.5625% {
					opacity: 0;
					-webkit-transform: scale(1);
					transform: scale(1);
				}
				100% {
					opacity: 0;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
			}
			
			@keyframes kenburns-3 {
				48.4375% {
					opacity: 1;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
				51.5625% {
					opacity: 1;
				}
				73.4375% {
					opacity: 1;
				}
				76.5625% {
					opacity: 0;
					-webkit-transform: scale(1);
					transform: scale(1);
				}
				100% {
					opacity: 0;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
			}
			
			@-webkit-keyframes kenburns-4 {
				73.4375% {
					opacity: 1;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
				76.5625% {
					opacity: 1;
				}
				98.4375% {
					opacity: 1;
				}
				100% {
					opacity: 0;
					-webkit-transform: scale(1);
					transform: scale(1);
				}
			}
			
			@keyframes kenburns-4 {
				73.4375% {
					opacity: 1;
					-webkit-transform: scale(1.2);
					transform: scale(1.2);
				}
				76.5625% {
					opacity: 1;
				}
				98.4375% {
					opacity: 1;
				}
				100% {
					opacity: 0;
					-webkit-transform: scale(1);
					transform: scale(1);
				}
			}
		</style>


	</head>

	<body>

		

		<script type="text/javascript" src="<%=basePath %>aui/script/jquery.min.js"></script>

		<script type="text/javascript">
			var playbox = (function() {
				//author:eric_wu
				var _playbox = function() {
					var that = this;
					that.box = null;
					that.player = null;
					that.src = null;
					that.on = false;
					//
					that.autoPlayFix = {
						on: true,
						//evtName: ("ontouchstart" in window)?"touchend":"click"
						evtName: ("ontouchstart" in window) ? "touchstart" : "mouseover"

					}
				}

				_playbox.prototype = {
					init: function(box_ele) {
						this.box = "string" === typeof(box_ele) ? document.getElementById(box_ele) : box_ele;
						this.player = this.box.querySelectorAll("audio")[0];
						this.src = this.player.src;
						this.init = function() {
							return this;
						}
						this.autoPlayEvt(true);
						return this;
					},
					play: function() {
						if(this.autoPlayFix.on) {
							this.autoPlayFix.on = false;
							this.autoPlayEvt(false);
						}
						this.on = !this.on;
						if(true == this.on) {
							this.player.src = this.src;
							this.player.play();
						} else {
							this.player.pause();
							this.player.src = null;
						}
						if("function" == typeof(this.play_fn)) {
							this.play_fn.call(this);
						}
					},
					handleEvent: function(evt) {
						this.play();
					},
					autoPlayEvt: function(important) {
						if(important || this.autoPlayFix.on) {
							document.body.addEventListener(this.autoPlayFix.evtName, this, false);
						} else {
							document.body.removeEventListener(this.autoPlayFix.evtName, this, false);
						}
					}
				};

				return new _playbox();

			})();

			playbox.play_fn = function() {
				this.box.className = this.on ? "btn_music on" : "btn_music";
			};
		</script>

		<script type="text/javascript">
			$(document).ready(function() {
				playbox.init("playbox");
			});
		</script>

		<span id="playbox" class="btn_music" onclick="playbox.init(this).play();"><audio id="audio" loop src="<%=basePath %>aui/home_image/music.mp3"></audio></span>
		<div class="slideshow">
			
			<div class="slideshow-image" style=" background-image: url('<%=basePath %>aui/home_image/2_.jpg')">

			</div>
			
			<div class="slideshow-image" style="background-image: url('<%=basePath %>aui/home_image/3_.jpg')">

			</div>
			<div class="slideshow-image" style="background-image: url('<%=basePath %>aui/home_image/4_.jpg')">

			</div>
			<div class="slideshow-image" style="background-image: url('<%=basePath %>aui/home_image/1_.jpg')">

			</div>
		</div>
		
		
		<ul class="mainmenu" style="z-index: 99;  position: absolute; bottom: 10px;">
				<li>
					<a href="/"><b><img src="<%=basePath %>aui/home_image/tb01.png"/></b><span>团队简介</span></a>
				</li>
				<li>
					<a href="/"><b><img src="<%=basePath %>aui/home_image/tb02.png" /></b><span>加入团队</span></a>
				</li>
				<li>
					<a href="/"><b><img src="<%=basePath %>aui/home_image/tb03.png" /></b><span>我要请假</span></a>
				</li>
				<li>
					<a href="/"><b><img src="<%=basePath %>aui/home_image/tb04.png" /></b><span>报名比赛</span></a>
				</li>
				<li>
					<a href="/"><b><img src="<%=basePath %>aui/home_image/tb05.png" /></b><span>下载中心</span></a>
				</li>
				<li>
					<a href="/"><b><img src="<%=basePath %>aui/home_image/tb06.png" /></b><span>联系我们</span></a>
				</li>
				<li>
					<a href="/"><b><img src="<%=basePath %>aui/home_image/tb06.png" /></b><span>我要签到</span></a>
				</li>
				<li>
					<a href="/"><b><img src="<%=basePath %>aui/home_image/tb07.png" /></b><span>联系我们</span></a>
				</li>
				<li>
					<a href="/"><b><img src="<%=basePath %>aui/home_image/tb08.png" /></b><span>在线留言</span></a>
				</li>
			</ul>
		

		

		<div class="copyright"><br /><br />Copyright © 2017 wangzeqi
			<a href="#"><br>Java项目开发创新团队</a> All rights reserved.</div>

	</body>

</html>