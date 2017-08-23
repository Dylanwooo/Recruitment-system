<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<jsp:include page="common/common_header.jsp"></jsp:include>
<title>页面名称</title>
</head>
<body>
	<jsp:include page="common/common_body.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1>你没有权限访问该页面！！！</h1>
			</div>
		</div>
	</div>

	<jsp:include page="common/common_bottom.jsp"></jsp:include>
</body>
</html>