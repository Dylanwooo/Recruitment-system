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
			<div class="col-md-12"></div>
		</div>
	</div>
	<button type="button" onclick="ToExcel('tableExcel')">表格数据导出</button>
	<table id="tableExcel">
		<tr>
			<td><h2>表格导出Excel</h2></td>
		</tr>
		
		<tr>
			<td>列标题1</td>
			<td>列标题2</td>
			<td>列标题3</td>
			<td>列标题4</td>
		</tr>
		
		<tr>
			<td>aaa</td>
			<td>bbb</td>
			<td>ccc</td>
			<td>ddd</td>
		</tr>
	</table>
	<jsp:include page="common/common_bottom.jsp"></jsp:include>
	
</body>
<script src="${webroot }/resource/js/ToExcel.js"></script>
</html>