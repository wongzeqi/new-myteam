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
<link href="<%=basePath %>bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" >
<link href="<%=basePath %>css/include.css" rel="stylesheet" type="text/css" >
<link href="<%=basePath %>css/comm.css" rel="stylesheet" type="text/css" >
<script src="<%=basePath %>js/jquery.js"></script>
<script src="<%=basePath %>bootstrap/js/bootstrap.min.js"></script>
<title>文章内容页面</title>
<style type="text/css">
	#outline {
	margin: 0 auto;
	height: auto;
	text-indent: 28px;
	line-height: 24px;
	text-align: justify;
	text-justify: inter-ideograph;
	font-size: 16px;
	padding:5px;
}

p {
	display: block;
	-webkit-margin-before: 1em;
	-webkit-margin-after: 1em;
	-webkit-margin-start: 0px;
	-webkit-margin-end: 0px;
}

img {
	display: block;
	max-width: 100%;
	margin: auto;
}
.ep-source{
	float:right;
}
</style>
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
          <h1 href="/" title="个人博客网站">新闻资讯网</h1>
        </div>
        <div id="navbar" class="collapse col-lg-8 col-md-8 col-sm-12" aria-expanded="false">
             <ul class="nav navbar-nav">
             <li class="active"><a href="index.html">首页</a></li>
                <li><a href="<%=basePath%>news/list.action">政治风雨</a></li>
                <li><a href="list.html">国际视野</a></li>
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
              <li><a href="list.html">一带一路</a></li>
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
  
  <div class="row arctile">
    <div class="col-md-8">
       
       <div class="row" id="outline" style="border:1px solid #ccc; padding:20px; margin-top:20px">
       		<div><h3>${news.title }<h3/></div>
        	${news.newscontent }
       <hr/>
       <p class="col-md-5 left">上一篇：<a href="#">站的文章和资源部站的文章和资源部</a></p>
       <p class="col-md-5 right">上一篇：<a href="#">站的文章和资源部站的文章和资源部</a></p>
       </div>  
      
    </div><!--右边结束-->   
    <div class="col-md-4 list">
     <div class="row  list_c">
      <ul class="col-md-11 col-sm-6  col-xs-11">
      <h4 class="title">下载</h4>
        <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
        <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
        <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
        <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
        <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
      </ul>
      <ul class="col-md-11 col-sm-6 col-xs-11">
       <h4 class="title">下载</h4>
        <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
        <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
        <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
        <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
        <li><a href="#">站的文章和资源部站的文章和资源部</a></li>
      </ul>
      </div>
    </div><!--左边结束-->
    
   </div>
  
</div><!-- 内容 -->


<footer>
      <p>
          版权声明：本站的文章和资源部分来自互联网收集，分享目的仅供大家学习与
          参考，一切关于该资源商业行为与本网站无关。如有侵犯您的
          版权，请联系站长，我们会在72h内删
          除有争议的资源！欢迎加入交流群：12345
          </p>
</footer> <!--底部-->
<div class="lfooter navbar-fixed-bottom visible-xs">
  <ul>
    <li><a href="index.html"><img src="<%=basePath%>img/dbsy.png" >网站首页</a></li>
    <li><a href="index.html"><i class="glyphicon glyphicon-indent-left"></i><br>网站地图</a></li>
    <li><a href="index.html"><i class="glyphicon glyphicon-envelope"></i><br>建议留言</a></li>
    <li><a href="mqqwpa_CBF95620"><img src="<%=basePath%>img/dbqq.png" >QQ好友</a></li>
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
