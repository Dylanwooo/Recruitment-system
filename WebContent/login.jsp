<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<jsp:include page="common/common_header.jsp"></jsp:include>
	
	<link rel="stylesheet" href="${webroot }/resource/css/login.css">
    <title>登录</title>
</head>
<body>
<jsp:include page="common/common_body.jsp"></jsp:include>
  <div style="width:100%;position:relative;height:100%; background-color:#f5f7fa;top:20px;" >
	<div class="container" id="mainContainer" style="position:relative; top:80px; height:500px;">
		<div class="row" >
			<div class="col-md-offset-4 col-md-4 col-sm-offset-3 col-sm-6" >

				<div class="panel panel-primary" style="box-shadow:0 0 5px #9C9C9C; border:none;border-radius:0px;">
					<div class="panel-body">
						<h3 style="font: bold 18px '黑体'">登录</h3>
						<form action="logincheck" method="post" name="login" id="login">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-user" aria-hidden="true"></span>
									</div>
									<input style="border-radius:0px"type="text" name="username" class="form-control"
										id="username" placeholder="请输入用户名" />
								</div>
							</div>
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-lock" aria-hidden="true"></span>
									</div>
									<input style="border-radius:0px"type="password" name="password" class="form-control"
										id="password" placeholder="请输入密码" />
								</div>
							</div>
							<div class="form-group">							   
							    <label class="checkbox" style="left: 20px;"> <input
									type="checkbox" name="remember" value="1" checked /> 记住我   
								</label>													  													  														  
							</div>
							<div class="form-group">
								<button style="border-radius:0px;background-color:#eca614; border:none;" type="submit" onclick=""
								class="btn btn-primary form-control" name="log_in">
								<span style="font: bold 16px '黑体'">登 录</span></button>
							</div>
							<div class="form-group">
							    <label>
								   <span>没有账号？</span>
								</label>						
								<button style="border-radius:0px;background-color:white;" type="button" class="btn btn-primary form-control"
									onclick="window.location='register'"><span style="color:#053e91;font: bold 16px '黑体'">立即注册</span></button>
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
						</form>
					</div>
				</div>			
			</div>
		</div>
	</div>
 </div>
	<jsp:include page="common/common_bottom.jsp"></jsp:include>
</body>
<script type="text/javascript" src="${webroot}/resource/js/login.js"></script>
</html>
