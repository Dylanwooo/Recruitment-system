<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
   <meta name="viewport" content="width=device-width,initial-scale=1">
   <jsp:include page="common/common_header.jsp"></jsp:include>
   <link rel="stylesheet" href="${webroot }/resource/css/index.css"> 
<title>中科院电子所苏州研究院</title>
</head>
<body>
	<jsp:include page="common/common_body.jsp"></jsp:include>
 <div id="mainContainer">
    <div id="circleContent" class="carousel slide">
    	<ol class="carousel-indicators">
    		<li data-target="#circleContent" data-slide-to="0" class="active"></li>
    		<li data-target="#circleContent" data-slide-to="1"></li>
    		<li data-target="#circleContent" data-slide-to="2"></li>
    		<li data-target="#circleContent" data-slide-to="3"></li>  		
    	</ol>
    	<div class="carousel-inner">
    		<div class="item active">
    			<img class="img-responsive" src="resource/img/2.jpg" >
    			<div class="carousel-caption"></div>
    		</div>
    		<div class="item">
    			<img class="img-responsive" src="resource/img/4.jpg" >
    			<div class="carousel-caption"></div>
    		</div>
    		<div class="item">
    			<img class="img-responsive" src="resource/img/2.jpg" >
    			<div class="carousel-caption"></div>
    		</div>
    		<div class="item">
    			<img class="img-responsive" src="resource/img/4.jpg" >
    			<div class="carousel-caption"></div>
    		</div>
    	</div>	
    </div>	
 </div>
	<jsp:include page="common/common_bottom.jsp"></jsp:include>
</body>

<script type="text/javascript" src="${webroot }/resource/libs/jquery.js"></script>
<script type="text/javascript" src="${webroot }/resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${webroot }/resource/js/index.js"></script>
</html>
