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

		<div class="w66 left">
			<article>
				<div class="article">
					<!-- 首页文章 -->
					<block name="list_art">
						<div class="border">
							<section>
								<h1>centos7下yum 安装mysql5.7</h1>
								<div class="tips">
									<span class="btn-black btn  tip">
                                                <i class="icon iconfont">&#xe6c5;</i> 
                                                <a href="16.html" target="_block">系统</a>
                                            </span>
									<span class="con-time" style="padding: 0 10px;">发表时间：2017-01-23</span>
									<span class="con-author">作者：赵七七</span>
									<!--  <span class="con-click" style="padding-left: 10px;">浏览次数：58</span> -->
									<a href="21.html" class="btn btn-more read-more" target="_black">
										阅读更多<span class="read">58</span>
									</a>
								</div>
							</section>
						</div>

						<!-- 首页文章结束 -->

					</block>
				</div>
			</article>
		</div>

		<!--主体-->
		<main>
			<div class="container">
				<!--文章-->
				<div class="w30 left">
					<article>
						<div class="article">
							<!-- 首页文章 -->
							<block name="list_art">
								<div class="border">
									<section>
										<h1>php 格式化金钱</h1>
										<div class="tips">
											<span class="btn-black btn  tip">
                                                    <i class="icon iconfont">&#xe6c5;</i> 
                                                    <a href="../../../../index.php/Home/List/index/tid/6.html" target="_block">基础</a>
                                                </span> <span class="con-time" style="padding: 0 10px;">发表时间：2016-06-02</span>
											<span class="con-author">作者：七七</span>
											<!--  <span class="con-click" style="padding-left: 10px;">浏览次数：472</span> -->
										</div>
										<div class="box-content">
											<p class="content arc">终于找到php格式化数字的函数啦 好开心好开心的</p>
											</p>

										</div>
										<a href="../../../../index.php/Home/Content/index/aid/10.html" class="btn btn-more read-more" target="_black">
											阅读更多
											<span class="read">472</span>
										</a>
									</section>
								</div>
						</div>
					</article>
				</div>

				<div class="w30 left">
					<article>
						<div class="article">
							<!-- 首页文章 -->
							<block name="list_art">
								<div class="border">
									<section>
										<h1>php 格式化金钱</h1>
										<div class="tips">
											<span class="btn-black btn  tip">
                                                    <i class="icon iconfont">&#xe6c5;</i> 
                                                    <a href="../../../../index.php/Home/List/index/tid/6.html" target="_block">基础</a>
                                                </span> <span class="con-time" style="padding: 0 10px;">发表时间：2016-06-02</span>
											<span class="con-author">作者：七七</span>
											<!--  <span class="con-click" style="padding-left: 10px;">浏览次数：472</span> -->
										</div>
										<div class="box-content">
											<p class="content arc">终于找到php格式化数字的函数啦 好开心好开心的</p>
											</p>

										</div>
										<a href="../../../../index.php/Home/Content/index/aid/10.html" class="btn btn-more read-more" target="_black">
											阅读更多
											<span class="read">472</span>
										</a>
									</section>
								</div>
						</div>
					</article>
				</div>

				<div class="w30 left">
					<article>
						<div class="article">
							<!-- 首页文章 -->
							<block name="list_art">
								<div class="border">
									<section>
										<h1>php 格式化金钱</h1>
										<div class="tips">
											<span class="btn-black btn  tip">
                                                    <i class="icon iconfont">&#xe6c5;</i> 
                                                    <a href="../../../../index.php/Home/List/index/tid/6.html" target="_block">基础</a>
                                                </span> <span class="con-time" style="padding: 0 10px;">发表时间：2016-06-02</span>
											<span class="con-author">作者：七七</span>
											<!--  <span class="con-click" style="padding-left: 10px;">浏览次数：472</span> -->
										</div>
										<div class="box-content">
											<p class="content arc">终于找到php格式化数字的函数啦 好开心好开心的</p>
											</p>

										</div>
										<a href="../../../../index.php/Home/Content/index/aid/10.html" class="btn btn-more read-more" target="_black">
											阅读更多
											<span class="read">472</span>
										</a>
									</section>
								</div>
						</div>
					</article>
				</div>

				<div class="w30 left">
					<article>
						<div class="article">
							<!-- 首页文章 -->
							<block name="list_art">
								<div class="border">
									<section>
										<h1>php 格式化金钱</h1>
										<div class="tips">
											<span class="btn-black btn  tip">
                                                    <i class="icon iconfont">&#xe6c5;</i> 
                                                    <a href="../../../../index.php/Home/List/index/tid/6.html" target="_block">基础</a>
                                                </span> <span class="con-time" style="padding: 0 10px;">发表时间：2016-06-02</span>
											<span class="con-author">作者：七七</span>
											<!--  <span class="con-click" style="padding-left: 10px;">浏览次数：472</span> -->
										</div>
										<div class="box-content">
											<p class="content arc">终于找到php格式化数字的函数啦 好开心好开心的</p>
											</p>

										</div>
										<a href="../../../../index.php/Home/Content/index/aid/10.html" class="btn btn-more read-more" target="_black">
											阅读更多
											<span class="read">472</span>
										</a>
									</section>
								</div>
						</div>
					</article>
				</div>

				<div class="w30 left">
					<article>
						<div class="article">
							<!-- 首页文章 -->
							<block name="list_art">
								<div class="border">
									<section>
										<h1>php 格式化金钱</h1>
										<div class="tips">
											<span class="btn-black btn  tip">
                                                    <i class="icon iconfont">&#xe6c5;</i> 
                                                    <a href="../../../../index.php/Home/List/index/tid/6.html" target="_block">基础</a>
                                                </span> <span class="con-time" style="padding: 0 10px;">发表时间：2016-06-02</span>
											<span class="con-author">作者：七七</span>
											<!--  <span class="con-click" style="padding-left: 10px;">浏览次数：472</span> -->
										</div>
										<div class="box-content">
											<p class="content arc">终于找到php格式化数字的函数啦 好开心好开心的</p>
											</p>

										</div>
										<a href="../../../../index.php/Home/Content/index/aid/10.html" class="btn btn-more read-more" target="_black">
											阅读更多
											<span class="read">472</span>
										</a>
									</section>
								</div>
						</div>
					</article>
				</div>

				<div class="w30 left">
					<article>
						<div class="article">
							<!-- 首页文章 -->
							<block name="list_art">
								<div class="border">
									<section>
										<h1>php 格式化金钱</h1>
										<div class="tips">
											<span class="btn-black btn  tip">
                                                    <i class="icon iconfont">&#xe6c5;</i> 
                                                    <a href="../../../../index.php/Home/List/index/tid/6.html" target="_block">基础</a>
                                                </span> <span class="con-time" style="padding: 0 10px;">发表时间：2016-06-02</span>
											<span class="con-author">作者：七七</span>
											<!--  <span class="con-click" style="padding-left: 10px;">浏览次数：472</span> -->
										</div>
										<div class="box-content">
											<p class="content arc">终于找到php格式化数字的函数啦 好开心好开心的</p>
											</p>

										</div>
										<a href="../../../../index.php/Home/Content/index/aid/10.html" class="btn btn-more read-more" target="_black">
											阅读更多
											<span class="read">472</span>
										</a>
									</section>
								</div>
						</div>
					</article>
				</div>

				<div class="w30 left">
					<article>
						<div class="article">
							<!-- 首页文章 -->
							<block name="list_art">
								<div class="border">
									<section>
										<h1>php 格式化金钱</h1>
										<div class="tips">
											<span class="btn-black btn  tip">
                                                    <i class="icon iconfont">&#xe6c5;</i> 
                                                    <a href="../../../../index.php/Home/List/index/tid/6.html" target="_block">基础</a>
                                                </span> <span class="con-time" style="padding: 0 10px;">发表时间：2016-06-02</span>
											<span class="con-author">作者：七七</span>
											<!--  <span class="con-click" style="padding-left: 10px;">浏览次数：472</span> -->
										</div>
										<div class="box-content">
											<p class="content arc">终于找到php格式化数字的函数啦 好开心好开心的</p>
											</p>

										</div>
										<a href="../../../../index.php/Home/Content/index/aid/10.html" class="btn btn-more read-more" target="_black">
											阅读更多
											<span class="read">472</span>
										</a>
									</section>
								</div>
						</div>
					</article>
				</div>

				<div class="w30 left">
					<article>
						<div class="article">
							<!-- 首页文章 -->
							<block name="list_art">
								<div class="border">
									<section>
										<h1>php 格式化金钱</h1>
										<div class="tips">
											<span class="btn-black btn  tip">
                                                    <i class="icon iconfont">&#xe6c5;</i> 
                                                    <a href="../../../../index.php/Home/List/index/tid/6.html" target="_block">基础</a>
                                                </span> <span class="con-time" style="padding: 0 10px;">发表时间：2016-06-02</span>
											<span class="con-author">作者：七七</span>
											<!--  <span class="con-click" style="padding-left: 10px;">浏览次数：472</span> -->
										</div>
										<div class="box-content">
											<p class="content arc">终于找到php格式化数字的函数啦 好开心好开心的</p>
											</p>

										</div>
										<a href="../../../../index.php/Home/Content/index/aid/10.html" class="btn btn-more read-more" target="_black">
											阅读更多
											<span class="read">472</span>
										</a>
									</section>
								</div>
						</div>
					</article>
				</div>

				<div class="w30 left">
					<article>
						<div class="article">
							<!-- 首页文章 -->
							<block name="list_art">
								<div class="border">
									<section>
										<h1>php 格式化金钱</h1>
										<div class="tips">
											<span class="btn-black btn  tip">
                                                    <i class="icon iconfont">&#xe6c5;</i> 
                                                    <a href="../../../../index.php/Home/List/index/tid/6.html" target="_block">基础</a>
                                                </span> <span class="con-time" style="padding: 0 10px;">发表时间：2016-06-02</span>
											<span class="con-author">作者：七七</span>
											<!--  <span class="con-click" style="padding-left: 10px;">浏览次数：472</span> -->
										</div>
										<div class="box-content">
											<p class="content arc">终于找到php格式化数字的函数啦 好开心好开心的</p>
											</p>

										</div>
										<a href="../../../../index.php/Home/Content/index/aid/10.html" class="btn btn-more read-more" target="_black">
											阅读更多
											<span class="read">472</span>
										</a>
									</section>
								</div>
						</div>
					</article>
				</div>
				<!--文章结束-->
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
