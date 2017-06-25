<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<title>填写信息</title>
		<link rel="stylesheet" type="text/css" href="<%=basePath %>aui/css/aui.css" />
		<style type="text/css">
			.aui-bar-nav {
				background-color: #37363b;
			}
			.error{
				color: red;
			}
		</style>
		<script type="text/javascript">
		function createXMLHttpRequest() {
			try {
				return new XMLHttpRequest();//大多数浏览器
			} catch (e) {
				try {
					return ActvieXObject("Msxml2.XMLHTTP");//IE6.0
				} catch (e) {
					try {
						return ActvieXObject("Microsoft.XMLHTTP");//IE5.5及更早版本	
					} catch (e) {
						alert("哥们儿，您用的是什么浏览器啊？");
						throw e;
					}
				}
			}
		}
		/*
		 * 1. 在文档加载完毕时发送请求，得到所有省份名称，显示在<select name="province"/>中
		 * 2. 在选择了新的省份时，发送请求（参数为省名称），得到xml文档，即<province>元素
		 *   解析xml文档，得到其中所有的<city>，再得到每个<city>元素的内容，即市名，使用市名生成<option>，插入到<select name="city">元素中
		 */
		
		window.onload = function() {
			/*
			ajax四步，请求ProvinceServlet，得到所有省份名称
			使用每个省份名称创建一个<option>元素，添加到<select name="province">中
			*/
			var xmlHttp = createXMLHttpRequest();
			xmlHttp.open("GET", "<c:url value='/AcademyServlet'/>", true);
			xmlHttp.send(null);
			xmlHttp.onreadystatechange = function() {
				if(xmlHttp.readyState == 4 && xmlHttp.status == 200) {
					// 获取服务器的响应
					var text = xmlHttp.responseText;
					// 使用逗号分隔它，得到数组
					var arr = text.split(",");
					// 循环遍历每个省份名称，每个名称生成一个option对象，添加到<select>中
					for(var i = 0; i < arr.length; i++) {
						var op = document.createElement("option");//创建一个指名名称元素
						op.value = arr[i];//设置op的实际值为当前的省份名称
						var textNode = document.createTextNode(arr[i]);//创建文本节点
						op.appendChild(textNode);//把文本子节点添加到op元素中，指定其显示值
						
						document.getElementById("academy").appendChild(op);
					}
				}
			};
			
			
			/*
			第二件事情：给<select name="province">添加改变监听
			使用选择的省份名称请求CityServlet，得到<province>元素(xml元素)！！！
			获取<province>元素中所有的<city>元素，遍历之！获取每个<city>的文本内容，即市名称
			使用每个市名称创建<option>元素添加到<select name="city">
			*/
			var proSelect = document.getElementById("academy");
			proSelect.onchange = function() {
				$("#major").empty();
				var xmlHttp = createXMLHttpRequest();
				xmlHttp.open("POST", "<c:url value='/MajorServlet'/>", true);
				xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
				xmlHttp.send("pname=" + proSelect.value);//把下拉列表中选择的值发送给服务器！
				xmlHttp.onreadystatechange = function() {
					if(xmlHttp.readyState == 4 && xmlHttp.status == 200) {
						/*
						把select中的所有option移除（除了请选择）
						*/
						var citySelect = document.getElementById("major");
						// 获取其所有子元素
						var optionEleList = citySelect.getElementsByTagName("option");
						// 循环遍历每个option元素，然后在citySelect中移除
						while(optionEleList.length > 1) {//子元素的个数如果大于1就循环，等于1就不循环了！
							citySelect.removeChild(optionEleList[1]);//总是删除1下标，因为1删除了，2就变成1了！
						}
						
						
						var doc = xmlHttp.responseXML;
						// 得到所有名为city的元素
						var cityEleList = doc.getElementsByTagName("major");
						// 循环遍历每个city元素
						for(var i = 0; i < cityEleList.length; i++) {
							var cityEle = cityEleList[i];//得到每个city元素
							var cityName;
							// 获取市名称
							if(window.addEventListener) {//处理浏览器的差异
								cityName = cityEle.textContent;//支持FireFox等浏览器
							} else {
								cityName = cityEle.text;//支持IE
							}
							
							// 使用市名称创建option元素，添加到<select name="city">中
							var op = document.createElement("option");
							op.value = cityName;
							// 创建文本节点
							var textNode = document.createTextNode(cityName);
							op.appendChild(textNode);//把文本节点追加到op元素中
							
							//把op添加到<select>元素中
							citySelect.appendChild(op);
						}
					}
				};		
			};
		};
		</script>
	</head>

	<body>
		<header class="aui-bar aui-bar-nav" id="aui-header">
			<a class="aui-btn aui-pull-left" tapmode onclick="closeWin()">
				<span class="aui-iconfont aui-icon-left"></span>
			</a>
			<div class="aui-title">基本信息填写</div>
			<a class="aui-btn aui-pull-right">

			</a>
		</header>
		<form id="myform" method="post" action="<%=basePath %>member/addMember.html">

			<div class="aui-content aui-margin-b-15">
				<ul class="aui-list aui-form-list">

					<!--姓名-->
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								姓名
							</div>
							<div class="aui-list-item-input">
								<input name="name" class="required" type="text" placeholder="姓名"  data-valid="isNonEmpty||onlyZh||between:2-10" data-error="&nbsp;&nbsp;&nbsp;姓名不能为空||&nbsp;&nbsp;&nbsp;姓名只能为中文||&nbsp;&nbsp;&nbsp;2-10位">
							</div>
						</div>
					</li>
					<!--学号-->
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								学号
							</div>
							<div class="aui-list-item-input">
								<input name="schoolnumber" type="text" placeholder="学号" class="required" type="text"  data-valid="isNonEmpty||between:8-8" data-error="&nbsp;&nbsp;&nbsp;学号不能为空||&nbsp;&nbsp;&nbsp;学号必须为8位">
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
								<select id="academy" name="academy" class="required" data-valid="isNonEmpty" data-error="&nbsp;&nbsp;&nbsp;学院必填">
								</select>
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
								<select id="major" name="major" class="required" data-valid="isNonEmpty" data-error="&nbsp;&nbsp;&nbsp;专业必填">
									
								</select>
							</div>
						</div>
					</li>
					<!--班级-->
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								班级
							</div>
							<div class="aui-list-item-input">
								<select  name="clazz" class="required" data-valid="isNonEmpty" data-error="&nbsp;&nbsp;&nbsp;班级必填">
									<option value="1">1</option>
									<option  value="2">2</option>
									<option value="3">3</option>
								</select>
							</div>
						</div>
					</li>
					<!---->
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								性别
							</div>
							<div class="aui-list-item-input required" data-valid="isChecked" data-error="&nbsp;&nbsp;&nbsp;性别必选" data-type="radio">
								<label><input class="aui-radio" type="radio" value="男" name="sex" checked> 男</label>
								<label><input class="aui-radio" type="radio" value="女" name="sex"> 女</label>
							</div>
						</div>
					</li>
					<li class="aui-list-item">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label">
								民族
							</div>
							<div class="aui-list-item-input">
								<input type="text" name="nation" placeholder="民族（一定要加上族字）" class=" required " type="text "
									data-valid="isNonEmpty||onlyZh||between:2-10" data-error="&nbsp;&nbsp;&nbsp;民族不能为空||&nbsp;&nbsp;&nbsp;必须中文||&nbsp;&nbsp;&nbsp;长度必须为2-10位">
							</div>
						</div>
					</li>
					<!---->
					<!--电话-->
					<li class="aui-list-item ">
						<div class="aui-list-item-inner">
							<div class="aui-list-item-label ">
								电话
							</div>
							<div class="aui-list-item-input">
								<input name="phone" type="text " placeholder="电话 " class="required" type="text"  
								data-valid="isNonEmpty||between:11-11||isNumber" data-error="&nbsp;&nbsp;&nbsp;电话不能为空||&nbsp;&nbsp;&nbsp;请输入11位数字||&nbsp;&nbsp;&nbsp;请输入11位数字">
							</div>
						</div>
					</li>
					<!---->
					<!--qq-->
					<li class="aui-list-item ">
						<div class="aui-list-item-inner ">
							<div class="aui-list-item-label ">
								QQ
							</div>
							<div class="aui-list-item-input ">
								<input name="qq" type="text " placeholder="QQ " class="required" type="text"  data-valid="isNonEmpty||between:5-10||isNumber" 
								data-error="&nbsp;&nbsp;&nbsp;QQ不能为空||&nbsp;&nbsp;请输入5-10位||&nbsp;&nbsp;qq必须是数字">
							</div>
						</div>
					</li>
					<!--身份证-->
					<li class="aui-list-item ">
						<div class="aui-list-item-inner ">
							<div class="aui-list-item-label ">
								身份证号
							</div>
							<div class="aui-list-item-input ">
								<input name="idcard" type="text " placeholder="身份证号 " 
								data-valid="isNonEmpty||between:5-10||isNumber" data-error="&nbsp;&nbsp;&nbsp;身份证号不能为空||&nbsp;&nbsp;请输入18位||&nbsp;&nbsp;身份证号必须是数字">
							</div>
						</div>
					</li>
				
				
					<li class="aui-list-item ">
						<div class="aui-list-item-inner aui-list-item-center aui-list-item-btn ">
							<div class="aui-btn aui-btn-info aui-margin-r-5 " tapmode onclick="openDialog( 'text ') ">提交</div>
						</div>
					</li>

					
				</ul>
			</div>
		</form>

	</body>
	<script type="text/javascript " src="<%=basePath %>aui/script/api.js "></script>
	<script type="text/javascript " src="<%=basePath %>aui/script/aui-dialog.js "></script>
	<script type="text/javascript " src="<%=basePath %>aui/script/aui-range.js "></script>
	<script type="text/javascript ">
		
		apiready = function() {
			api.parseTapmode();
		}
		apiready = function() {
			api.parseTapmode();
			var header = $api.byId('aui-header');
			$api.fixStatusBar(header);
			var headerPos = $api.offset(header);
			var body_h = $api.offset($api.dom('body')).h;
			api.openFrame({
				name: 'demo_wechat_frm',
				url: 'demo_wechat_frm.html',
				bounces: true,
				rect: {
					x: 0,
					y: headerPos.h,
					w: 'auto',
					h: 'auto'
				}
			})

		};

		function closeWin() {
			api.closeWin({});
		}
		var dialog = new auiDialog();

		function openDialog(type) {
			switch(type) {
				case "text ":
					dialog.alert({
						title: "确认 ",
						msg: '确定提交！',
						buttons: ['取消', '确定']
					}, function(ret) {
						document.forms[0].submit();
						//alert("提交成功！ ");
					})
				case "reset":
					break;

			}
		}

		
	</script>
	<script type="text/javascript " src="<%=basePath %>aui/script/jquery-1.11.1.js"></script>

		<script type="text/javascript " src="<%=basePath %>aui/script/jquery-validate.js "></script>

		<script type="text/javascript ">
			$('form').validate({

				onFocus: function() {

					this.parent().addClass('active');

					return false;

				},

				onBlur: function() {

					var $parent = this.parent();

					var _status = parseInt(this.attr('data-status'));

					$parent.removeClass('active');

					if(!_status) {

						$parent.addClass('error');

					}

					return false;

				}

			});

			$('form').on('submit', function(event) {

				event.preventDefault();

				$(this).validate('submitValidate'); //return boolean;

			});
		</script>
</html>