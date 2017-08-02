<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String mypath = basePath+"project/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>文件上传</title>
    <link href="<%=mypath %>css/iconfont.css" rel="stylesheet" type="text/css"/>
    <link href="<%=mypath %>css/fileUpload.css" rel="stylesheet" type="text/css">
</head>
<body>
    <div style="padding:60px" id="fileUploadContent" class="fileUploadContent">
       
    </div>
</body>
</html>
<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script src="<%=mypath %>js/jquery.js"></script> 
<script type="text/javascript" src="<%=mypath %>js/fileUpload.js"></script>
<script type="text/javascript">
    $("#fileUploadContent").initUpload({
        "uploadUrl":"fileUpload3.do",
        //上传文件信息地址
        //"progressUrl":"getStatus.do",//获取进度信息地址，可选，注意需要返回的data格式如下（{bytesRead: 102516060, contentLength: 102516060, items: 1, percent: 100, startTime: 1489223136317, useTime: 2767}）
        //"showSummerProgress":false,//总进度条，默认限制
        //"size":350,//文件大小限制，单位kb,默认不限制
        // "maxFileNumber":3,//文件个数限制，为整数
        //"filelSavePath":"",//文件上传地址，后台设置的根目录
        //"beforeUpload":beforeUploadFun,//在上传前执行的函数
        //"onUpload":onUploadFun，//在上传后执行的函数
        //autoCommit:true,//文件是否自动上传
        //"fileType":['png','jpg','docx','doc']//文件类型限制，默认不限制，注意写的是文件后缀
    })
  
</script>