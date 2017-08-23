<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<jsp:include page="common/common_header.jsp"></jsp:include>
<title>${title}</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1>${title}</h1>
			</div>
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
						<c:forEach items="${provinceList }" var="province">
							<tr>
								<td>${province.id }</td>
								<td>${province.provinceid }</td>
								<td><a target="_blank"
									href="city?provinceid=${province.provinceid}">${province.province }</a></td>
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