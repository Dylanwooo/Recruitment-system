<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<jsp:include page="common/common_header.jsp"></jsp:include>
	<link rel="stylesheet" href="${webroot }/resource/css/layui.css" media="all"> 
	<link rel="stylesheet" href="${webroot }/resource/css/feedback.css"> 
	<title>内测反馈</title>
</head>
<body>
	<jsp:include page="common/common_body.jsp"></jsp:include>
	<div id="outsideContent">
	<div id="mainContainer">
	    <span style=" padding-bottom:10px;font-family:'黑体'">请输入您的意见：</span>
		<textarea id="inputContent" style="height:200px;width:620px;box-shadow:0 0 3px #000; resize:none;" ></textarea>	
		<div class="col-md-offset-4 col-sm-offset-4 col-xs-offset-4" style="padding-top:20px;">
			<button style="width:200px" class="layui-btn" onclick="onUpload()">提交</button>
		</div>			
	</div>
	</div>
	<jsp:include page="common/common_bottom.jsp"></jsp:include>
</body>
<script type="text/javascript" src="${webroot}/resource/lay/dest/layui.all.js"></script>
<script type="text/javascript" src="${webroot}/resource/js/feedback.js"></script>
</html>