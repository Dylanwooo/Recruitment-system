<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<jsp:include page="common/common_header.jsp"></jsp:include>
	<link rel="stylesheet" href="${webroot }/resource/css/RegisterPage.css"> 
<title>用户注册</title>
</head>
<body>
  <jsp:include page="common/common_body.jsp"></jsp:include>
  
<div id="outsideContainer">
  <div class="container" id="mainContent">
     <div class="row">
	     <div class="col-md-12 col-sm-11 col-xs-10" id="header" style="position:absolute; top:60px;">
	        <span style="font: bold 20px '黑体'; position:absolute;">注册</span>
	        <span style="position:absolute;right:5px; font: bold 16px '黑体' ">已有账号？
	        <a href="login" style="text-decoration:underline;font: bold 16px '黑体'">立即登陆</a></span>                          
	     </div>
	     <div id="contentBody" class="col-md-12 col-sm-11 col-xs-10">
	       <div style="float:left; display:inline; position:absolute; left:250px; top:50px;">
	         <div style="float:left">
			   <span style="font: bold 15px '黑体'"><strong>账号：</strong></span>
			 </div>
			 <div style="float:left">
			   <input type="text" class="form-control" placeholder="用户名" style="width:200px;" id="username">
			 </div>
	       </div>
	       <div style="float:left; display:inline; position:absolute; left:250px; top:110px;">
	         <div style="float:left">
			   <span style="font: bold 15px '黑体'"><strong>密码：</strong></span>
			 </div>
			 <div style="float:left">
			   <input type="password" class="form-control" placeholder="6-16位密码，区分大小写" style="width:200px;" id="password">
			 </div>
	       </div>
	       <div style="float:left; display:inline; position:absolute; left:223px; top:170px;">
	         <div style="float:left">
			   <span style="font: bold 15px '黑体'"><strong>确认密码：</strong></span>
			 </div>
			 <div style="float:left">
			   <input type="password" class="form-control" placeholder="再次输入密码" style="width:200px;" id="password2">
			 </div>
	       </div>
	       <div style="float:left; display:inline; position:absolute; left:223px; top:230px;">
	         <div style="float:left">
			   <span style="font: bold 15px '黑体'"><strong>手机号码：</strong></span>
			 </div>
			 <div style="float:left">
			   <input type="text" class="form-control" placeholder="输入手机号" style="width:200px;" id="phonenumber">
			 </div>
	       </div>
	       <div style="float:left; display:inline; position:absolute; left:223px; top:290px;">
	         <div style="float:left">
			   <span style="font: bold 15px '黑体'"><strong>真实姓名：</strong></span>
			 </div>
			 <div style="float:left">
			   <input type="text" class="form-control" placeholder="输入姓名" style="width:200px;" id="realname">
			 </div>
	       </div>
	       <div style="float:left; display:inline; position:absolute; left:223px; top:350px;">
	         <div style="float:left">
			   <span style="font: bold 15px '黑体'"><strong>个人邮箱：</strong></span>
			 </div>
			 <div style="float:left">
			   <input type="text" class="form-control" placeholder="输入邮箱" style="width:200px;" id="email">
			 </div>
	       </div>
			<div style="float:left; display:inline; position:absolute; left:290px; top:410px;">
			  <button style="width:200px;background-color:#eca614; border:none;" type="button" class="btn btn-primary" onclick = "registeUser()" >
	                         注册
	          </button>
			</div>
			<div style="float:left; display:inline; position:absolute; left:290px; top:460px;">
			  <button style="width:200px; background-color:black; border:none;" type="button" class="btn btn-primary" data-toggle="button" aria-pressed="false" autocomplete="off">
	                         取消
	          </button>
			</div>
				<c:if test="${info != null }">
					<div class="alert alert-danger alert-dismissible login-tip"
						role="alert">
						<button type="button" class="close" data-dismiss="alert"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<strong>${info}</strong>
					</div>
				</c:if>
	     </div>
	  </div>
  </div>
  <jsp:include page="common/common_bottom.jsp"></jsp:include>
</div>
  
  <script type="text/javascript" src="${webroot}/resource/js/user.js"></script>
</body>
</html>