<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>后台管理系统-HTML5后台管理系统</title>
<meta name="keywords"  content="设置关键词..." />
<meta name="description" content="设置描述..." />
<meta name="author" content="DeathGhost" />
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
<link rel="icon" href="images/icon/favicon.ico" type="image/x-icon">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="javascript/jquery.js"></script>
<script src="javascript/plug-ins/customScrollbar.min.js"></script>
<script src="javascript/plug-ins/echarts.min.js"></script>
<script src="javascript/plug-ins/layerUi/layer.js"></script>
<script src="editor/ueditor.config.js"></script>
<script src="editor/ueditor.all.js"></script>
<script src="javascript/plug-ins/pagination.js"></script>
<script src="javascript/public.js"></script>
</head>
<body>
<div class="main-wrap">
	<div class="side-nav">
		<div class="side-logo">
			<div class="logo">
				<span class="logo-ico">
					<i class="i-l-1"></i>
					<i class="i-l-2"></i>
					<i class="i-l-3"></i>
				</span>
				<strong>Java项目开发创新创业团队</strong>
			</div>
		</div>
		
		<nav class="side-menu content mCustomScrollbar" data-mcs-theme="minimal-dark">
			<!--<h2>
				<a href="index.html" class="InitialPage"><i class="icon-dashboard"></i>数据概况</a>
			</h2>-->
			<ul>
				
				<li>
					<dl>
						<dt>
							<i class="icon-user"></i>用户管理<i class="icon-angle-right"></i>
						</dt>
						<dd>
							<a href="flex-layout.html">成员列表</a>
						</dd>
						<dd>
							<a href="flow-layout.html">添加成员</a>
						</dd>
					</dl>
				</li>
				
				
				
				<li>
					<dl>
						<dt>
							<i class="icon-table"></i>值班管理<i class="icon-angle-right"></i>
						</dt>
						<dd>
							<a href="flex-layout.html">签到情况</a>
						</dd>
						<dd>
							<a href="flow-layout.html">请假情况</a>
						</dd>
						<dd>
							<a href="flow-layout.html">这就比较严重了</a>
						</dd>
						
					</dl>
				</li>
				
				
				
				
				
				
				<li>
					<dl>
						<dt>
							<i class="icon-laptop""></i>培训管理<i class="icon-angle-right"></i>
						</dt>
						<dd>
							<a href="flex-layout.html">签到情况</a>
						</dd>
						<dd>
							<a href="flow-layout.html">请假情况</a>
						</dd>
						<dd>
							<a href="flow-layout.html">这就比较严重了</a>
						</dd>
					</dl>
				</li>
				
				
				
				<li>
					<dl>
						<dt>
							<i class="icon-bar-chart"></i>数据统计<i class="icon-angle-right"></i>
						</dt>
						<dd>
							<a href="flex-layout.html">值班统计</a>
						</dd>
						<dd>
							<a href="flow-layout.html">培训统计</a>
						</dd>
						<dd>
							<a href="flow-layout.html">其他</a>
						</dd>
						
					</dl>
				</li>
			</ul>
		</nav>
		
		<footer class="side-footer">© DeathGhost 版权所有</footer>
		
	</div>
	<div class="content-wrap">
		<header class="top-hd">
			<div class="hd-lt">
				<a class="icon-reorder"></a>
			</div>
			<div class="hd-rt">
				<ul>
					<li>
						<a><i class="icon-user"></i>管理员:<em>DeathGhost</em></a>
					</li>
					<li>
						<a><i class="icon-bell-alt"></i>系统消息</a>
					</li>
					<li>
						<a href="javascript:void(0)" id="JsSignOut"><i class="icon-signout"></i>安全退出</a>
					</li>
				</ul>
			</div>
		</header>
		<main class="main-cont content mCustomScrollbar">
			<div class="page-wrap">
				<!--开始::内容-->
				<section class="page-hd">
					<header>
						<h2 class="title">添加成员</h2>
					</header>
					<hr>
				</section>
				
				<div class="form-group-col-2">
					<div class="form-label">姓名：</div>
					<div class="form-cont">
						<input type="text" placeholder="请输入姓名..." class="form-control form-boxed" style="width:300px;">
					</div>
				</div>
				
				<div class="form-group-col-2">
					<div class="form-label">学号：</div>
					<div class="form-cont">
						<input type="text" placeholder="请输入学号..." class="form-control form-boxed" style="width:300px;">
					</div>		
				</div>
				
				<div class="form-group-col-2">
					<div class="form-label">手机号码：</div>
					<div class="form-cont">
						<input type="tel" placeholder="手机号码..." class="form-control form-boxed" style="width:300px;">
						<span class="word-aux"><i class="icon-warning-sign"></i>清正确输入11位手机号码</span>
					</div>
				</div>
				
				
				<div class="form-group-col-2">
					<div class="form-label">QQ号码：</div>
					<div class="form-cont">
						<input type="" placeholder="qq..." class="form-control form-boxed" style="width:300px;">
						<span class="word-aux"><i class="icon-warning-sign"></i>清正确输入QQ号码</span>
					</div>
				</div>
				
				<div class="form-group-col-2">
					<div class="form-label">学院：</div>
					<div class="form-cont">
						<select style="width:auto;">
							<option>请选择学院</option>
							<option>计算机科学与工程学院</option>
							<option>男装</option>
						</select>
					</div>	
				</div>
				
				<div class="form-group-col-2">
					<div class="form-label">专业：</div>
					<div class="form-cont">
						<select style="width:auto;">
							<option>请选择专业</option>
							<option>女装</option>
							<option>男装</option>
						</select>
					</div>	
				</div>
				
				
				
				<div class="form-group-col-2">
					<div class="form-label">性别：</div>
					<div class="form-cont">
						<label class="radio">
							<input type="radio" name="sex"/>
							<span>男</span>
						</label>
						<label class="radio">
							<input type="radio" name="sex"  checked="checked"/>
							<span>女</span>
						</label>
						<label class="radio">
							<input type="radio" name="sex"/>
							<span>保密</span>
						</label>
					</div>
				</div>
				
				<div class="form-group-col-2">
					<div class="form-label">民族：</div>
					<div class="form-cont">
						<select style="width:auto;">
							<option>请选择民族</option>
							<option>汉族</option>
							<option>土家族</option>
						</select>
					</div>	
				</div>
				
				<div class="form-group-col-2">
					<div class="form-label">摘要：</div>
					<div class="form-cont">
						<textarea class="form-control form-boxed">摘要信息</textarea>
					</div>
				</div>
				<div class="form-group-col-2">
					<div class="form-label"></div>
					<div class="form-cont">
						<input type="submit" class="btn btn-primary" value="提交表单" />
						<input type="reset" class="btn btn-disabled" value="禁止" />
					</div>
				</div>
				<!--开始::结束-->
			</div>
		</main>
		<footer class="btm-ft">
			<p class="">
				<span class="fr">©Copyright 2017 <a href="#" title="DeathGhost" target="_blank">北方民族大学-Java项目开发创新创业团队</a></span>
			</p>
		</footer>
	</div>
</div>

<div class="mask"></div>
<div class="dialog">
	<div class="dialog-hd">
		<strong class="lt-title">标题</strong>
		<a class="rt-operate icon-remove JclosePanel" title="关闭"></a>
	</div>
	<div class="dialog-bd">
		<!--start::-->
		<p>这里是基础弹窗,可以定义文本信息，HTML信息这里是基础弹窗,可以定义文本信息，HTML信息。</p>
		<!--end::-->
	</div>
	<div class="dialog-ft">
		<button class="btn btn-info JyesBtn">确认</button>
		<button class="btn btn-secondary JnoBtn">关闭</button>
	</div>
</div>
</body>
</html>
