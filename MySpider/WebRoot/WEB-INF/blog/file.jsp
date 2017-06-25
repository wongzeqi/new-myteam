<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String blogPath = basePath+"blog";
%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>赵贤博客</title>
		<!--移动端设置-->
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<meta property="qc:admins" content="171255133211636" />
		<link rel="shortcut icon" type="image/x-icon" href="zqiqi.ico" />

		<meta name="keywords" content="赵贤博客,七七,赵七七,技术博客,个人博客,zqiqiblog" />
		<meta name="description" content="赵贤的个人技术博客,zqiqiblog官方网站" />
		<meta name="author" content="zqiqi,1352726123@qq.com">

		<link rel="stylesheet" href="<%=blogPath %>css/iconfont.css">
		<link rel="stylesheet" type="text/css" href="<%=blogPath %>css/common.css" />
		<link rel="stylesheet" type="text/css" href="<%=blogPath %>css/index.css" />

		<script src="<%=blogPath %>js/jquery-2.1.0.js" type="text/javascript" charset="utf-8"></script>
		<script src="<%=blogPath %>js/index.js" type="text/javascript" charset="utf-8" defer="defer"></script>

	</head>

	<body>
		<!--头部-->

		<header>
			<div class="w100">
				<nav>
					<div class="container nav-box">
						<ul class="big-nav">
							<li class="bg-red">
								<a href="index.html">首页</a>
							</li>

							<li>
								<a href="sort.html">资源共享</a>
							</li>
							<li>
								<a href="list.html">文章归档</a>
							</li>
							<li>
								<a href="fileupload.html">文件下载</a>
							</li>
							<li>
								<a href="linux.html">关于我们</a>
							</li>
						</ul>
					</div>
				</nav>
			</div>
		</header>
		<!--头部结束-->
		<div id="bg"></div>

		<!--主体-->
		<main>
			<div class="container">

				<div class="w100 left">
					<article>
						<div class="article">
							<!-- 首页文章 -->
							<block name="list_art">
								<div class="border">
									<section>
										<h2>ssh.jar</h2>
										<a>下载</a>
									</section>
								</div>
							</block>
						</div>
					</article>
				</div>

				<!--文章-->
				
				<!--分页-->

			</div>
			</div>
		</main>
		<!--主体结束-->
		</block>
		<!--底部-->
		<footer>
			<div class="w100 foot">
				<div class="container center">
					<p>ICP证：豫ICP备16006040号 联系邮箱：1352726123@qq.com</p>
				</div>
			</div>
		</footer>
		<!--底部结束-->
		<!-- 返回顶部 -->
		<div id="to-top"><i class="iconfont to-top">&#xe6a5;</i></div>

		<!-- 返回顶部结束 -->
	</body>

</html>
