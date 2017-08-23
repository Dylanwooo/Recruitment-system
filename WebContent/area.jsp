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
	<button onclick="javascript:output('areatable')">导出表格</button>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<table class="table" id="areatable">
					<thead>
						<tr>
							<th>序号</th>
							<th>编号</th>
							<th>名称</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${areaList }" var="area">
							<tr>
								<td>${area.id }</td>
								<td>${area.areaid }</td>
								<td>${area.area }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<jsp:include page="common/common_bottom.jsp"></jsp:include>
</body>
<script src="${webroot }/resource/js/ToExcel.js"></script>
</html>