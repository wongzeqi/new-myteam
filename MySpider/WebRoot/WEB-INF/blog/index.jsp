<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String blogPath = basePath+"blog/";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>王泽奇</title>
        <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
        <meta property="qc:admins" content="171255133211636" />
        <link rel="shortcut icon" type="image/x-icon" href="zqiqi.ico" />
        <meta name="keywords" content=",王泽奇,技术博客,个人博客" />
        <meta name="description" content="王泽奇的个人博客,一个程序员的博客" />
        <meta name="author" content="wzq,1016484945@qq.com">
        <link rel="stylesheet" href="<%=blogPath %>css/iconfont.css">
        <link rel="stylesheet" type="text/css" href="<%=blogPath %>css/common.css"/>
        <link rel="stylesheet" type="text/css" href="<%=blogPath %>css/index.css"/>
        <script src="<%=blogPath %>js/jquery-2.1.0.js" type="text/javascript" charset="utf-8"></script>
        <script src="<%=blogPath %>js/index.js" type="text/javascript" charset="utf-8" defer="defer"></script>
        <style type="text/css">
        	.search{
				height: 50px;
			    border-radius: 3px;
			    border: solid 1px #0a0a0a;
			    width: 75%;
			    padding: 0 20px;
			    font-size:18px;
			    cursor: text;
			    margin:0 auto;
			   	margin-left:2%; 
			   
			}
			.button{
				height: 50px;
				width: 15%;
			    border-radius: 3px;
			    border: solid 1px #0a0a0a;
			    font-size:14px;
			    cursor: pointer
			}
			a :hover{
				color:red;
			}
			
        </style>
    </head>
    <body>
        <header>
            <div class="w100" style="opacity: 0.7;">
                <nav>
                    <div class="container nav-box">
                        
                        <ul class="big-nav">
							<li class="bg-red">
								<a href="<%=basePath %>blog/listAllBlogs.action?page.pageCount=1&blog.blogTitle=">博客分享</a>
							</li>
							
							<li >
								<a href="sort.html">资源共享</a>
							</li>
							<li >
								<a href="list.html">文章归档</a>
							</li>
							<li >
								<a href="fileupload.html">文件下载</a>
							</li>
							<li >
								<a href="linux.html">关于我们</a>
							</li>
                        </ul>
                       
                        <div class="nav-toggle">
                                <i class="icon iconfont">&#xe696;</i>
                        </div>
                    </div>
                    
                </nav>
            </div>
        </header>
        <!--头部结束-->
		<div id="bg"></div>

		
		
        <!--主体-->
        <main>
	       
            <div class="container">
            	<div class="w66 left" style="height:100px; line-height:100px;  border:solid #ccc blue">
            		<form method="get" action="<%=basePath %>blog/listAllBlogs.action">
            			<input type="hidden" name="page.pageCount" value="1" />
		            	<input class="search" name="blog.blogTitle" placeholder="请输入关键字搜索..."/>
		            	<input type="submit" class="button" value="搜索"/>
	            	</form>
	        	</div>
            
                <!--文章-->
                <div class="w66 left">
                    <article>
                        <div class="article">
                            <!-- 首页文章 -->
                            <block name="list_art"> 
                            	<c:forEach items="${blogs}" var="blog">
                            	<div class="border">
                                    <section>
                                        <a style="color:#000" href="<%=basePath %>blog/getBlogContent.action?blog_id=${blog.blogId}" ><h1>${blog.blogTitle }</h1></a>
                                        
                                        <div class="tips"><p>${blog.blogDiscription }</p></div>
                                        
                                        <div class="tips">
                                        	<span class="btn-black btn  tip">
                                                <i class="icon iconfont">&#xe6c5;</i> 
                                                <a href="16.html" target="_block">${blog.blogSort }</a>
                                            </span>
                                            <span class="con-time" style="padding: 0 10px;">发表时间：2017-01-23</span>
                                       		<span class="con-author">作者：wzq</span>
                                       		
			                              	 <a href="<%=basePath %>blog/getBlogContent.action?blog_id=${blog.blogId}" class="btn btn-more read-more" target="_black">
												阅读更多
                                        	</a>
                                        </div>
                                    </section>
                                </div>
                                </c:forEach>
                                
                                
                                
                              
                                
                                
	                            <!-- 首页文章结束 -->
	                            <!--分页-->
								<div class="">
								    <section>
								    	<c:if test="${totalPage >=7}">
								        <div class="page">
								        	<c:if test="${pageCount!=1 }">
									        	<a class="first" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=1&blog.blogTitle=${blogTitle}">首页</a>
									        	
									        	<a class="prev" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${pageCount-1}&blog.blogTitle=${blogTitle}">上一页</a> 
								        	</c:if>
								        	<c:if test="${pageCount <=4 }">	
									        	<a class="num  <c:if test="${pageCount == 1 }">current</c:if>" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=1&blog.blogTitle=${blogTitle}">1</a>
									        	<a class="num <c:if test="${pageCount == 2 }">current</c:if>" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=2&blog.blogTitle=${blogTitle}">2</a>
									        	<a class="num <c:if test="${pageCount == 3 }">current</c:if>" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=3&blog.blogTitle=${blogTitle}">3</a> 
									        	<a class="num <c:if test="${pageCount == 4 }">current</c:if>" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=4&blog.blogTitle=${blogTitle}">4</a> 
									        	<a class="num" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=5&blog.blogTitle=${blogTitle}">5</a> 
									        	<a class="num" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=6&blog.blogTitle=${blogTitle}">6</a>
								        	</c:if>
								        	<c:if test="${pageCount >4 && pageCount <=totalPage-4}">	
								        		<a class="num  " href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${pageCount-3}&blog.blogTitle=${blogTitle}">${pageCount-3 }</a>
									        	<a class="num " href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${pageCount-2}&blog.blogTitle=${blogTitle}">${pageCount-2 }</a>
									        	<a class="num " href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${pageCount-1}&blog.blogTitle=${blogTitle}">${pageCount-1 }</a> 
									        	<a class="num current" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${pageCount}&blog.blogTitle=${blogTitle}">${pageCount}</a> 
									        	<a class="num" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${pageCount+1}&blog.blogTitle=${blogTitle}">${pageCount+1 }</a> 
									        	<a class="num" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${pageCount+2}&blog.blogTitle=${blogTitle}">${pageCount+2 }</a>
								        	</c:if>
								        	
								        	<c:if test="${pageCount >totalPage-4 }">	
									        	<a class="num " href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${totalPage-5}&blog.blogTitle=${blogTitle}">${totalPage-5 }</a>
									        	<a class="num " href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${totalPage-4}&blog.blogTitle=${blogTitle}">${totalPage-4 }</a>
									        	<a class="num <c:if test="${pageCount == totalPage-3 }">current</c:if>" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${totalPage-3}&blog.blogTitle=${blogTitle}">${totalPage-3 }</a> 
									        	<a class="num <c:if test="${pageCount == totalPage-2 }">current</c:if>" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${totalPage-2}&blog.blogTitle=${blogTitle}">${totalPage-2 }</a> 
									        	<a class="num <c:if test="${pageCount == totalPage-1 }">current</c:if>" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${totalPage-1}&blog.blogTitle=${blogTitle}">${totalPage-1 }</a> 
									        	<a class="num  <c:if test="${pageCount == totalPage }">current</c:if>" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${totalPage}&blog.blogTitle=${blogTitle}">${totalPage }</a>
								        	</c:if>
								        	
								        	
								        	<c:if test="${pageCount!=totalPage }">
								        	<a class="next" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${pageCount+1}&blog.blogTitle=${blogTitle}">下一页</a> 
								        	<a class="end" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${totalPage}&blog.blogTitle=${blogTitle}">末页</a> 
								        	</c:if>
								        	<span class="rows">共 ${totalItemCount } 条记录</span>
								        	<span class="rows">共${totalPage } 条页</span>
								        	
								        </div>  
								        </c:if> 
								        
								        
								        <c:if test="${totalPage <=6}">
									         <div class="page">
									        	<c:if test="${pageCount!=1 }">
										        	<a class="first" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=1&blog.blogTitle=${blogTitle}">首页</a>
										        	
										        	<a class="prev" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${pageCount-1}&blog.blogTitle=${blogTitle}">上一页</a> 
									        	</c:if>
									        	
									        	<c:forEach begin="1" end="${totalPage}" varStatus="status">
								        			<a class="num  <c:if test="${pageCount == status.index }">current</c:if>" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${status.index }&blog.blogTitle=${blogTitle}">${status.index }</a>
									        	</c:forEach>
									        	
									        	<c:if test="${pageCount!=totalPage }">
										        	<a class="next" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${pageCount+1}&blog.blogTitle=${blogTitle}">下一页</a> 
										        	<a class="end" href="<%= basePath%>blog/listAllBlogs.action?page.pageCount=${totalPage}&blog.blogTitle=${blogTitle}">末页</a> 
									        	</c:if>
									        	<span class="rows">共 ${totalItemCount } 条记录</span>
									        	<span class="rows">共${totalPage } 条页</span>
								        	</div> 
								       </c:if> 
								        
								    </section>
								</div>
	                            <!--分页结束-->
							</block>
	                    </div>
                	</article>
                </div>
				<!--文章结束-->
                
                
                
             	<!--右侧-->
                <div class="right w33">
                    <asid>
                        <div class="">
                         
                            <div class="border tags-cloud">
                                <section>
                                    <ul class="nav-pills">
                                        <li><a href="javascript:;">最新文章</a></li>
                                    </ul>
                                    <div class="bottom">
                                        <div id="" class="tags-cloud-show link">
                                            <ul>
                                                <li><a href="../../../../index.php/Home/Content/index/aid/21.html" target="_block">centos7下yum 安装mysql5.7</a></li>
												<li><a href="../../../../index.php/Home/Content/index/aid/20.html" target="_block">ajax加载数据点击返回按钮可以回去</a></li>
												<li><a href="../../../../index.php/Home/Content/index/aid/19.html" target="_block">linux 常用命令小结</a></li>
												<li><a href="../../../../index.php/Home/Content/index/aid/18.html" target="_block">Android 五大布局</a></li>
												<li><a href="../../../../index.php/Home/Content/index/aid/17.html" target="_block">微信发送模板消息</a></li>
												<li><a href="../../../../index.php/Home/Content/index/aid/16.html" target="_block">微信获取accress_token(不验证服务器)</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </section>
                            </div>
                            
                            <!--标签-->
                            <div class="border tags-cloud">
                                <section>
                                    <ul class="nav-pills">
                                        <li><a href="javascript:;">热门标签</a></li>
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
                            <!--标签结束-->
                            
                            <div class="border tags-cloud">
                                <section>
                                    <ul class="nav-pills">
                                        <li><a href="javascript:;">友情链接</a></li>
                                    </ul>
                                    <div class="bottom">
                                        <div id="" class="tags-cloud-show link">
                                            <ul>
                                                <li><a href="" target="_block">白俊遥</a></li><li><a href="../../../../../www.cxiansheng.cn" target="_block">命中水</a></li><li><a href="../../../../../www.liqingkuo.com" target="_block">李庆阔</a></li>                                            </ul>
                                        </div>
                                    </div>
                                </section>
                            </div>
                            <!--标签结束-->
                        </div>
                    </asid>
                </div>
                <!--右侧结束-->
            </div>
        </main>
        <!--主体结束-->
        <footer>
            <div class="w100 foot"  style="opacity: 0.7;">
                <div class="container center">
                    <p style="color:#000">CopyRight：NUNWZQ    联系邮箱：18795207136@163.com</p>
                </div>
            </div>
        </footer>


		 <div id="to-top" ><i class="iconfont to-top">&#xe6a5;</i></div>
    </body>
</html>

