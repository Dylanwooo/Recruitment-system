<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<head>
  <link rel="stylesheet" href="${webroot }/resource/css/common_body.css">
  <script src="${webroot }/resource/libs/jquery-3.2.1.min.js"></script>
  <script type="text/javascript" src="${webroot}/resource/js/common_body.js"></script>
</head>
 
<header class="navbar navbar-static-top bs-docs-nav" id="top" role="banner" >
	<div class="container">
		<div class="navbar-header">
			<button class="navbar-toggle collapsed" type="button"
				data-toggle="collapse" data-target=".bs-navbar-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>
		<nav class="collapse navbar-collapse bs-navbar-collapse ">
		    <ul class="nav navbar-nav" id="olist">
			<!-- 在herf后加入想要跳转的页面 -->	
				<li><img src="resource/img/logo.jpg" style="width:50px;height:50px;"></li>
			    <li><a href="index" class="fontStyle" style="color:#a0a0a0;" >首页</a></li>					
				<li><a href="jobinfo?type=1" class="fontStyle" style="color:#a0a0a0;" >校园招聘</a></li>
				<li><a href="jobinfo?type=2" class="fontStyle" style="color:#a0a0a0;">社会招聘</a></li>
				<li><a href="jobinfo?type=3" class="fontStyle" style="color:#a0a0a0;">实习生招聘</a></li>
				<c:if test="${user.roleCode==null}">
				  <li>
				  <c:if test="${user.userName==null}">
				  	<a href="login" class="fontStyle" style="color:#a0a0a0;">个人中心</a>
				  </c:if>
				  <c:if test="${user.userName!=null}">
				  	<a href="center?username=${user.userName}" class="fontStyle" style="color:#a0a0a0;">个人中心</a>
				  </c:if>				  					  
				  </li>	
				</c:if>	
				<c:if test="${user.roleCode=='manager'}">
				  <li><a href="user" class="fontStyle" style="color:#a0a0a0;">用户中心</a></li>
				</c:if>	
				<c:if test="${user.roleCode=='hr'}">
				  <li><a href="resumeCenter" class="fontStyle" style="color:#a0a0a0;">简历中心</a></li>
				</c:if>	
				<c:if test="${user.roleCode=='interviewer'}">
				  <li><a href="resumeCenter" class="fontStyle" style="color:#a0a0a0;">简历中心</a></li>
				</c:if>									
				<li><a href="aboutme" class="fontStyle" style="color:#a0a0a0;">走进苏研院</a></li>
				<li><a href="feedback" class="fontStyle" style="color:#a0a0a0;">内测反馈</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:choose>
					<c:when test="${user == null}">					
						<li style="top:10px;">
						    <button type="button" style="border:none;border-radius:8px;height:28px; width:80px;background-color:#5baffa"
							onclick="window.location='login'">
							    <span style="font-family:'微软雅黑';color:white;">登陆</span>
							</button>				
						</li>
						<li><a data-action="register" href="register" style="color:black;font: bold 15px '黑体'">注册</a></li>
					</c:when>
					<c:otherwise>
						<li style="top:10px;">
						  <button type="button" style="border:none;border-radius:8px;height:28px; width:80px;background-color:#5baffa">
						    <span style="font-family:'微软雅黑';color:white;">${user.realName }</span>
						  </button>
						</li>
						<li><a data-action="logout" href="logout" style="color:black;font: bold 15px '黑体'">退出</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</nav>
	</div>
</header>