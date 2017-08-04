<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
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
<link rel="icon" href="<%=basePath %>team/images/icon/favicon.ico" type="image/x-icon">
<link rel="stylesheet" type="text/css" href="<%=basePath %>team/css/style.css" />
<script src="<%=basePath %>team/javascript/jquery.js"></script>
<script src="<%=basePath %>team/javascript/plug-ins/customScrollbar.min.js"></script>
<script src="<%=basePath %>team/javascript/plug-ins/echarts.min.js"></script>
<script src="<%=basePath %>team/javascript/plug-ins/layerUi/layer.js"></script>
<script src="<%=basePath %>team/editor/ueditor.config.js"></script>
<script src="<%=basePath %>team/editor/ueditor.all.js"></script>
<script src="<%=basePath %>team/javascript/plug-ins/pagination.js"></script>
<script src="<%=basePath %>team/javascript/public.js"></script>
<script type="text/javascript">
$(document).ready(function (){


	$('#a1').click(function(){
		layer.alert('内容');
	});
	$('.a2').click(function(){
		layer.confirm('你确定要删除？', {
		  btn: ['确定','取消'] //按钮
		}, function(){
			
			//ajax点确定发生的事情
			
		  layer.msg('的确很重要', {icon: 1});
		}, function(){
		  layer.msg('也可以这样', {
			time: 20000, //20s后自动关闭
			btn: ['明白了', '知道了']
		  });
		});
	});
});
	
</script>
<style>
	
	.table td{
		line-height: 2.5
	}
</style>
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
							<i class="icon-laptop"></i>培训管理<i class="icon-angle-right"></i>
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
		<footer class="side-footer">© wongzeqi.wang 版权所有</footer>
	</div>
	<!--菜单结束 -->
	
	
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
			<section style="padding-left:30px ;" class="page-hd">
				<header>
					<h2 class="title">Java团队成员信息</h2>
				</header>
			</section>
			<!--<hr />-->
			<section style="padding-left:30px ;" class="page-hd">
				<!--//组合查询-->
				
				
				<div class="form-group">
					<form></form>
					
					<div class="form-cont">
						<select style="width:auto;">
							<option>请选择学院</option>
							<option>计算机科学与工程学院</option>
							<option>男装</option>
						</select>
						
						<select style="width:auto;">
							<option>性别</option>
							<option>男</option>
							<option>女</option>
						</select>
						
						<input type="text" placeholder="请输入姓名..." class="form-control form-boxed" style="width:300px;">
						
						<input type="text" placeholder="请输入学号..." class="form-control form-boxed" style="width:300px;">
						
						<button class="btn btn-group btn-primary radius">搜索</button>
					</div>	
				</div>
				
			</section>
			<div class="page-wrap">
				
				<table  class="table  table-striped table-hover">
					<thead>
						<tr>
							<th>届</th>
							<th>姓名</th>
							<th>学号</th>
							<th>性别</th>
							<th>民族</th>
							<th>学院</th>
							<th>专业</th>
							<th>班级</th>
							<th>qq</th>
							<th>手机号</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody style="font-size: 24px;">
						<c:forEach items="${members}" var="member">
						<tr class="cen">
							<td>2015</td>
							<td>${member.name }</td>
							<td>${member.schoolnumber }</td>
							<td>${member.sex}</td>
							<td>${member.nation }</td>
							<td>${member.academy }</td>
							<td>${member.major }</td>
							<td>${member.clazz }</td>
							<td>${member.qq }</td>
							<td>${member.phone }</td>
							<td style="display:none">${member.id }</td>
							<td>
								<button  class="btn btn-group btn-danger radius a2">删除</button>
								<button class="btn btn-group btn-primary radius">修改</button>
							</td>
						</tr>
						</c:forEach>
						
					</tbody>
					
				</table>
				
				<!--开始::结束-->
				<div class="panel panel-default">
					<div class="panel-bd">
						<div class="pagination">
							<span class="disabled">上一页</span>
							<span class="current">1</span>
							<a href="javascript:;" class="tcdNumber">2</a>
							<a href="javascript:;" class="tcdNumber">3</a>
							<a href="javascript:;" class="tcdNumber">4</a>
							<a href="javascript:;" class="tcdNumber">5</a>
							<a href="javascript:;" class="nextPage">下一页</a>
						</div>
					</div>
				</div>
				
			</div>
		</main>
		<footer class="btm-ft">
			<p class="clear">
				<span class="fr">©Copyright 2016 <a href="#" title="DeathGhost" target="_blank">DeathGhost.cn</a></span>
			</p>
		</footer>
	</div>
			
			
			<script>
				//分页
				$(".pagination").createPage({
			        pageCount:5,
			        current:1,
			        backFn:function(p){
			            console.log(p);
			        }
			    });
				//demo1
				var dom = document.getElementById("demo1");
				var myChart = echarts.init(dom);
				var app = {};
				option = null;
				function randomData() {
					now = new Date(+now + oneDay);
					value = value + Math.random() * 21 - 10;
					return {
						name: now.toString(),
						value: [
							[now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/'),
							Math.round(value)
						]
					}
				}
			
				var data = [];
				var now = +new Date(1997, 9, 3);
				var oneDay = 24 * 3600 * 1000;
				var value = Math.random() * 1000;
				for (var i = 0; i < 1000; i++) {
					data.push(randomData());
				}
			
				option = {
					tooltip: {
						trigger: 'axis',
						formatter: function (params) {
							params = params[0];
							var date = new Date(params.name);
							return date.getDate() + '/' + (date.getMonth() + 1) + '/' + date.getFullYear() + ' : ' + params.value[1];
						},
						axisPointer: {
							animation: false
						}
					},
					xAxis: {
						type: 'time',
						splitLine: {
							show: false
						}
					},
					yAxis: {
						type: 'value',
						boundaryGap: [0, '100%'],
						splitLine: {
							show: false
						}
					},
					series: [{
						name: '模拟数据',
						type: 'line',
						showSymbol: false,
						hoverAnimation: false,
						data: data
					}]
				};
			
				setInterval(function () {
			
					for (var i = 0; i < 5; i++) {
						data.shift();
						data.push(randomData());
					}
			
					myChart.setOption({
						series: [{
							data: data
						}]
					});
				}, 1000);;
				if (option && typeof option === "object") {
					myChart.setOption(option, true);
				}
				
				
			</script>
			<!--开始::结束-->
		</main>
		<footer class="btm-ft">
			<p class="clear">
				<span class="fr">©Copyright 2016 <a href="#" title="DeathGhost" target="_blank">DeathGhost.cn</a></span>
				
			</p>
		</footer>
	</div>




</body>
</html>
