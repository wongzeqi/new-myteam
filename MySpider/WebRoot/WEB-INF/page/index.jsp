<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/news/";
%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
<meta name="viewport" content="width=device-width, initial-scale=1,minimum-scale=1.0, maximum-scale=1.0">
<link href="<%=basePath %>WEB-INF/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" >
<link href="<%=basePath %>WEB-INF/css/comm.css" rel="stylesheet" type="text/css" >
<link href="<%=basePath %>WEB-INF/css/include.css" rel="stylesheet" type="text/css" >

<script src="<%=basePath %>WEB-INF/js/jquery.js"></script>
<script src="<%=basePath %>WEB-INF/bootstrap/js/bootstrap.min.js"></script>
<title>首页</title>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
      <div class="container-fluid">
      <div class="row">
        <div class="col-md-4  col-sm-5">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <h1 href="/" title="新闻资讯网">新闻资讯网</h1>
        </div>
        <!--导航开始-->
        <div id="navbar" class="collapse col-lg-8 col-md-8 col-sm-12" aria-expanded="false">

          <ul class="nav navbar-nav">
             <li class="active"><a href="index.html">首页</a></li>
                <li><a href="list.html">政治风云</a></li>
                <li><a href="list.html">国际新闻</a></li>
                <!--<li class="dropdown">
                  <a href="arctile.html" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">文章内容 
                     <span class="caret"></span></a>
                  <ul class="dropdown-menu">
                    <li><a href="arctile.html">文章内容</a></li>
                    <li><a href="arctile.html">文章内容</a></li>
                    <li><a href="arctile.html">文章内容</a></li>
                  </ul>
                </li>-->
               
             <li><a href="list.html">军事之旅</a></li>
            <li><a href="list.html">科技前沿</a></li>
             <li><a href="list.html">TMT</a></li>
             <li><a href="list.html">一带一路专题</a></li>
          </ul>
          <div class="clearfix"></div>
          <form action="" method="get" class="navbar-form" >
          <input type="search" value="" required class="form-control">
          <button type="submit" value="" class="glyphicon glyphicon-search"></button>
          </form>
        </div>
     
      </div>
     </div>
 </nav><!--导航结束-->
 
<div class="container con clearfix" >
	<div class="postion">
    <p>
     <span class="glyphicon glyphicon-home"></span> &nbsp;
     <a href="javascript:;">首页</a> > 源部站的文章
     </p>
   </div><!--当前位置-->
   
 <div class="row  index">
   <ul class=" col-md-4 col-sm-6 col-xs-12">
   <h4>时事政治<a href="#"  class="pull-right" >更多</a></h4>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   </ul>
    <ul class="col-md-4  col-sm-6 col-xs-12">
   <h4>国际视野<a href="#"  class="pull-right" >更多</a></h4>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   </ul>
    <ul class="col-md-4  col-sm-6 col-xs-12">
   <h4>军事新闻<a href="#"  class="pull-right" >更多</a></h4>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   </ul>
   <ul class="col-md-4  col-sm-6 col-xs-12">
   <h4>科技前沿<a href="#"  class="pull-right" >更多</a></h4>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   </ul>
    <ul class="col-md-4  col-sm-6 col-xs-12">
   <h4>TMT<a href="#"  class="pull-right">更多</a></h4>
   <li><a href="#">站的文章和资源部站的文章和资源部</a><span>2017-05-06</span></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   </ul>
    <ul class="col-md-4  col-sm-6 col-xs-12">
   <h4>一带一路<a href="#"  class="pull-right" >更多</a></h4>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
   </ul>
   
 </div><!--内容-->
</div><!-- 内容块 -->


<footer>
      <p>
      </p>
</footer> <!--底部-->

<div class="lfooter navbar-fixed-bottom visible-xs">
  <ul>
    <li><a href="index.html"><img src="img/dbsy.png" ><br>网站首页</a></li>
    <li><a href="index.html"><i class="glyphicon glyphicon-indent-left"></i><br>网站地图</a></li>
    <li><a href="index.html"><i class="glyphicon glyphicon-envelope"></i><br>建议留言</a></li>
    <li><a href="mqqwpa_CBF95620"><img src="img/dbqq.png" ><br>QQ好友</a></li>
  </ul> 
</div>
<script>
function nav_top()
	{
	var nav_h=$('.navbar-fixed-top').outerHeight();
	$('.con').css('margin-top',nav_h);
	}
	nav_top(); //--------------------------顶部距离
	
	function nav_foot()
	{
	 var b_w=$(window).outerWidth();
	 console.log(b_w);
	 if(b_w<=767)	
	 {
		$('footer').css('margin-bottom',70); 
	 }else
	 {
		 $('footer').css('margin-bottom',0); 
	 }
	}
	nav_foot()// -------------底部距离
	
	$(window).resize(function(){
		nav_top();
		nav_foot(); 
	});
</script>
      
</body>
</html>
