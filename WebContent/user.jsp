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
				<h1>${title}</h1>
			</div>
		</div>

		<div class="col-md-12">
			<table class="table">
				<thead>
					<tr>
						<th>序号</th>
						<th>用户名</th>
						<th>姓名</th>
						<th>角色</th>
						<th>删除</th>
						<th>修改</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${userList }" var="user">
						<tr>
							<td>${user.id }</td>
							<td>${user.userName }</td>
							<td>${user.realName }</td>
							<td>${user.roleCode }</td>
			<!--删除用户事件  --><td><button onclick="deleteUser('${user.id }',this)"
									class="btn btn-link">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
								</button></td>
			<!--修改用户事件  --><td><button type="button" class="btn btn-primary" data-toggle="modal"
										data-username='${user.userName}' data-id='${user.id}'
										data-password='${user.password}' data-realname='${user.realName}'
										data-rolecode='${user.roleCode} '
										data-target="#updateUserModal">修改</button></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		<div class="col-md-12">
			<button type="button" class="btn btn-primary" data-toggle="modal"
				data-target="#addUserModal">添加</button>
		</div>
	</div>
<!-- 添加用户 -->
	<div class="modal fade" id="addUserModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">添加用户</h4>
				</div>
				<div class="modal-body">

					<form id="addUserForm">
						<div class="form-group">
							<label for="username">用户名</label> <input type="text"
								class="form-control" id="username" placeholder="用户名">
						</div>
						<div class="form-group">
							<label for="password">密码</label> <input type="password"
								class="form-control" id="password" placeholder="密码">
						</div>
						<div class="form-group">
							<label for="realname">姓名</label> <input type="text"
								class="form-control" id="realname" placeholder="姓名">
						</div>
						<!-- <div class="form-group">
							 <label for="roleCode">角色</label> <input type="text"
								class="form-control" id="roleCode" placeholder="角色">  -->
						 <div>
						 	<label for="roleCode">角色</label>
								<select id = "select">
									<option value = "0" selected>请选择</option>
									<option value = "1">管理员</option>
									<option value = "2">面试官</option>
									<option value = "3">HR</option>
								</select>
						</div>
								
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-primary" onclick="addUser()">确定</button>
				</div>
			</div>
		</div>
	</div>
	<!-- 修改用户 -->
		<div class="modal fade" id="updateUserModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改用户</h4>
				</div>
				<div class="modal-body">

					<form id="updateUserForm">
						<div class="form-group">
							<label for="username">用户名</label> <input type="text"
								class="form-control" id="updateusername" >
						</div>
						<div class="form-group">
							<label for="password">密码</label> <input type="text"
								class="form-control" id="updatepassword" placeholder="密码">
						</div>
						<div class="form-group">
							<label for="realname">姓名</label> <input type="text"
								class="form-control" id="updaterealname" placeholder="姓名">
						</div>
						<div class="form-group">
							<label for="roleCode">角色</label>
							 	<select id = "select2">
									<option value = "0" >请选择</option>
									<option value = "1">manager</option>
									<option value = "2">interviewer</option>
									<option value = "3">hr</option>
								</select>	
						
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-primary" onclick="updateUser()">确定</button>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="common/common_bottom.jsp"></jsp:include>
	<script type="text/javascript" src="${webroot}/resource/js/user.js"></script>
</body>
</html>