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
	<h1>${title}</h1>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<table class="table">
					<thead>
						<tr>
							<th>序号</th>
							<th>编号</th>
							<th>名称</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${cityList }" var="city">
							<tr>
								<td>${city.id }</td>
								<td>${city.cityid }</td>
								<td><a target="_blank"
									href="area?cityid=${city.cityid}">${city.city }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<jsp:include page="common/common_bottom.jsp"></jsp:include>
</body>
</html>