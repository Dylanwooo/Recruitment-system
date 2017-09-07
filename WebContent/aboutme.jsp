<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="common/common_header.jsp"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=2.0">
<link rel="stylesheet" href="${webroot }/resource/css/aboutme.css">
<jsp:include page="common/common_header.jsp"></jsp:include>
<title>走进苏研院</title>
</head>
<body>
	<jsp:include page="common/common_body.jsp"></jsp:include>
	<div id="outsideContent">
	<div class="container-fluid" id="mainContainer">
		<div class="row">
			<div class="col-md-3 col-sm-3 hidden-xs" id="leftContent">
				<div class="btn-group-vertical" role="group" aria-label="...">
		          <button class="btn btn-default active" type="button"><span class="glyphicon glyphicon-globe"></span>苏州研究院介绍</button>
		          <button data-toggle="modal" data-target="#carsoulPlay" class="btn btn-default" type="button"><span class="glyphicon glyphicon-home"></span>工作环境</button>
		          <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-phone-alt"></span>联系我们</button>
	            </div>
			</div>
			<div class="col-md-9 col-sm-9" id="rightContent">
				<span style="font:bold 2rem '微软雅黑';color:#333">中国科学院电子学研究所苏州研究院简介</span>
				<hr/>
				<textarea style="width:600px;height:420px;" readonly>    中国科学院电子学研究所苏州研究院（简称电子所苏州研究院）由中科院电子所和苏州工业园区共建，设立于苏州工业园区纳米城内，为苏州地方事业法人单位。电子所苏州研究院总占地面积约150亩，位于苏州工业园区纳米城金鸡湖大道、星华街、独墅湖大道之间，环境优美，交通便利，配套完善。

   电子所苏州研究院是以开展电子信息技术研发与应用为主的实体机构，将承继中科院电子所服务国家战略需求的光荣传统和优良作风，是中科院电子所实现先进技术向现实生产力转化的技术创新平台，更是中科院电子所为实现“创新2020计划”和创建世界一流研究型机构的重要组成部分。电子所苏州研究院主要研究领域包括电子信息一体化融合、空间信息应用、综合智能终端等，地理空间信息应用技术将首批入驻苏州研究院，后续还将陆续引入MEMS和探测技术。电子所苏州研究院将按照基础科研、系统工程、项目管理等方向培养和建设队伍，为不同类型的优秀人才提供广阔的职业发展平台。

   电子所苏州研究院计划于2020年底，投资8亿元，建设6－8万平米科研和综合配套设施，各类科研人员达到1500-2000人。在未来发展和建设中，电子所苏州研究院将依托中科院电子所的科研优势，结合区域特色，在国家创新体系和区域源头创新活动中，打造“示范效应”。在与区域发展战略接轨的基础上，汇聚和造就一流人才、培育和转化一流成果、催生和布局一流产业、为国家战略需求和区域经济发展做出一流贡献！
				</textarea>
				
				<div id="imgHolder">
					<img src="resource/img/4.jpg">
				</div>
			</div>
		</div>		
	</div>
	</div>
	<div class="modal fade" id="carsoulPlay" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content" style="border-radius:0px; width:680px;">
				<div class="modal-body" style="height:500px;">
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
				    			<div class="carousel-caption" style="font:bold 16px '微软雅黑'">办公环境</div>
				    		</div>
				    		<div class="item">
				    			<img class="img-responsive" src="resource/img/4.jpg" >
				    			<div class="carousel-caption" style="font:bold 16px '微软雅黑'">工作氛围</div>
				    		</div>
				    		<div class="item">
				    			<img class="img-responsive" src="resource/img/2.jpg" >
				    			<div class="carousel-caption" style="font:bold 16px '微软雅黑'">办公环境</div>
				    		</div>
				    		<div class="item">
				    			<img class="img-responsive" src="resource/img/4.jpg" >
				    			<div class="carousel-caption" style="font:bold 16px '微软雅黑'">工作氛围</div>
				    		</div>
				    	</div>	
				    </div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="common/common_bottom.jsp"></jsp:include>
</body>
<script type="text/javascript" src="${webroot}/resource/js/aboutme.js"></script>
</html>