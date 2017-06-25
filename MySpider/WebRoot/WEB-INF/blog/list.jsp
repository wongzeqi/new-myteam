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
		<script type="text/javascript">
			$(function() {
				$('main').css({
					'margin-top': $('header').height() + 'px'
				});
			})
		</script>
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
		<!--主体<-->
		<main>
			<div class="container">

				<!--右侧-->
				<div class="right w66">
					<asid>
						<div class="">

							<div class="border tags-cloud">
								<section>
									<ul class="nav-pills">
										<li>
											<a href="javascript:;" class="left">最新文章</a>
											<a class="right">时间：2017-09-09</a>
										</li>
									</ul>
									<div class="bottom">
										<div id="" class="tags-cloud-show link">
											<ul>
												<li>
													<a href="../../../../index.php/Home/Content/index/aid/21.html" target="_block">
														<span>centos7下yum 安装mysql5.7</span>
														<span style="float: right;"><i class="icon iconfont">&#xe6c5;</i> 系统</span>
													</a>
												</li>
												<li>
													<a href="../../../../index.php/Home/Content/index/aid/21.html" target="_block">
														<span>centos7下yum 安装mysql5.7</span>
														<span style="float: right;"><i class="icon iconfont">&#xe6c5;</i> 系统</span>
													</a>
												</li>
												<li>
													<a href="../../../../index.php/Home/Content/index/aid/21.html" target="_block">
														<span>centos7下yum 安装mysql5.7</span>
														<span style="float: right;"><i class="icon iconfont">&#xe6c5;</i> 系统</span>
													</a>
												</li>
												<li>
													<a href="../../../../index.php/Home/Content/index/aid/21.html" target="_block">
														<span>centos7下yum 安装mysql5.7</span>
														<span style="float: right;"><i class="icon iconfont">&#xe6c5;</i> 系统</span>
													</a>
												</li>
												<li>
													<a href="../../../../index.php/Home/Content/index/aid/21.html" target="_block">
														<span>centos7下yum 安装mysql5.7</span>
														<span style="float: right;"><i class="icon iconfont">&#xe6c5;</i> 系统</span>
													</a>
												</li>
												<li>
													<a href="../../../../index.php/Home/Content/index/aid/21.html" target="_block">
														<span>centos7下yum 安装mysql5.7</span>
														<span style="float: right;"><i class="icon iconfont">&#xe6c5;</i> 系统</span>
													</a>
												</li>
											</ul>
										</div>
									</div>
								</section>
							</div>

						</div>
					</asid>
				</div>

				<div class="w33 right">

					<div class="border tags-cloud">
						<section>
							<ul class="nav-pills">
								<li>
									<a href="javascript:;">热门标签</a>
								</li>
							</ul>
							<div class="bottom">
								<div id="" class="tags-cloud-show tag">
									<a href="" class="btn btn-read" style="font-size:12px;margin-right:20px;margin-bottom:10px;">android(1)</a>
									<a href="14.html" class="btn btn-read" style="font-size:12px;margin-right:20px;margin-bottom:10px;">插件(1)</a>
									<a href="13.html" class="btn btn-read" style="font-size:12px;margin-right:20px;margin-bottom:10px;">微信(2)</a>
									<a href="6.html" class="btn btn-read" style="font-size:12px;margin-right:20px;margin-bottom:10px;">基础(2)</a>
									<a href="7.html" class="btn btn-read" style="font-size:12px;margin-right:20px;margin-bottom:10px;">MySQL(0)</a>
									<a href="8.html" class="btn btn-read" style="font-size:12px;margin-right:20px;margin-bottom:10px;">Mongodb(0)</a>
									<a href="9.html" class="btn btn-read" style="font-size:12px;margin-right:20px;margin-bottom:10px;">js(5)</a>
									<a href="10.html" class="btn btn-read" style="font-size:12px;margin-right:20px;margin-bottom:10px;">css3(0)</a>
									<a href="11.html" class="btn btn-read" style="font-size:12px;margin-right:20px;margin-bottom:10px;">html5(0)</a>
									<a href="12.html" class="btn btn-read" style="font-size:12px;margin-right:20px;margin-bottom:10px;">错误类型(0)</a>
									<a href="16.html" class="btn btn-read" style="font-size:12px;margin-right:20px;margin-bottom:10px;">系统(1)</a>

								</div>
							</div>
						</section>
					</div>

					<div class="border tags-cloud">
						<section>
							<ul class="nav-pills">
								<li>
									<a href="javascript:;">最新文章</a>
								</li>
							</ul>
							<div class="bottom">
								<div id="" class="tags-cloud-show link">
									<ul>
										<li>
											<a href="../../../../index.php/Home/Content/index/aid/21.html" target="_block">centos7下yum 安装mysql5.7</a>
										</li>
										<li>
											<a href="../../../../index.php/Home/Content/index/aid/20.html" target="_block">ajax加载数据点击返回按钮可以回去</a>
										</li>
										<li>
											<a href="../../../../index.php/Home/Content/index/aid/19.html" target="_block">linux 常用命令小结</a>
										</li>
										<li>
											<a href="../../../../index.php/Home/Content/index/aid/18.html" target="_block">Android 五大布局</a>
										</li>
										<li>
											<a href="../../../../index.php/Home/Content/index/aid/17.html" target="_block">微信发送模板消息</a>
										</li>
										<li>
											<a href="../../../../index.php/Home/Content/index/aid/16.html" target="_block">微信获取accress_token(不验证服务器)</a>
										</li>
										<li>
											<a href="../../../../index.php/Home/Content/index/aid/21.html" target="_block">centos7下yum 安装mysql5.7</a>
										</li>
										<li>
											<a href="../../../../index.php/Home/Content/index/aid/20.html" target="_block">ajax加载数据点击返回按钮可以回去</a>
										</li>
										<li>
											<a href="../../../../index.php/Home/Content/index/aid/19.html" target="_block">linux 常用命令小结</a>
										</li>
										<li>
											<a href="../../../../index.php/Home/Content/index/aid/18.html" target="_block">Android 五大布局</a>
										</li>
										<li>
											<a href="../../../../index.php/Home/Content/index/aid/17.html" target="_block">微信发送模板消息</a>
										</li>
										<li>
											<a href="../../../../index.php/Home/Content/index/aid/16.html" target="_block">微信获取accress_token(不验证服务器)</a>
										</li>
									</ul>
								</div>
							</div>
						</section>
					</div>

				</div>
				<!--右侧结束-->
			</div>
		</main>
		<!--主体结束-->
		</block>
		<!--底部-->
		<footer>
			<div class="w100 foot">
				<div class="container center footercontainer">
					<p>ICP证：豫ICP备16006040号 联系邮箱：1352726123@qq.com</p>
				</div>
			</div>
		</footer>
		<!--底部结束-->
		<!-- 返回顶部 -->
		<div id="to-top"><i class="iconfont to-top">&#xe6a5;</i></div>

	</body>

</html>
