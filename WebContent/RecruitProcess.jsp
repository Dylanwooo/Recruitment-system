<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<jsp:include page="common/common_header.jsp"></jsp:include>
	<link rel="stylesheet" href="${webroot }/resource/css/RecruitProcess.css">
	<link rel="stylesheet" href="${webroot }/resource/css/bootstrap-table.css">
	<title>Insert title here</title>
</head>
<body>
 <jsp:include page="common/common_body.jsp"></jsp:include> 
 <div class="container" id="mainContainer">
 	<div class="row" >
 		<div class="col-md-offset-3"id="upperContent">
			<img src="resource/img/1.PNG" oncontextmenu="return false" ondragstart="return false">					
		</div>
		<hr />								
		<div class="col-md-offset-3"id="downContent" >
		    <div style="padding:0" class="col-md-12">
		    	<p>宣讲日程：</p>
		    </div>
			<div class="col-md-12">
				<span>日期：</span>
				<input id="dateCell" placeholder="选择日期" class="layui-input" onclick="layui.laydate({elem:this, istime:true, format: 'YYYY-MM-DD'})">
				<span style="position:relative;left:10px;">时间：</span>
				<input id="timeCell" style="position:relative;left:10px;"placeholder="输入时间">
			</div>	
			<div class="col-md-12 col-sm-12 col-xs-12" style="position:relative;top:10px;">
				<span>学校：</span>
				<input id="schoolCell"placeholder="学校名称">
				<span style="position:relative;left:10px;">地点：</span>
				<input id="placeCell" style="position:relative;left:10px;"placeholder="输入地点">
				<button style="background-color:#eca614;color:white;height:30px;width:50px;border:none;position:relative;left:20px;" 
				type="button" onclick="addSchedule()">添加</button>
			</div>
			<div class="col-md-12" style="position:relative;top:30px; left:-100px">
				<table class="table" id="scheduleTable">
					<thead >
						<tr>
							<th class="oTh">日期</th>							
							<th class="oTh">时间</th>								
							<th class="oTh">学校</th>
							<th class="oTh">地点</th>
							<th class="oTh">修改</th>
							<th class="oTh">删除</th>											
						</tr>
					</thead>
					<tbody id="tbContent">
						<c:forEach items="${recruitlist}" var="recruit">
							<tr id="scheduleRow">
							<td class="oTh">${recruit.date}</td>							
							<td class="oTh">${recruit.time}</td>								
							<td class="oTh">${recruit.school}</td>
							<td class="oTh">${recruit.place}</td>							
							<td class="oTh"><button style="border-radius:0;"type="button" class="btn btn-default" data-toggle="modal"
										data-date='${recruit.date}' data-time='${recruit.time}'
										data-school='${recruit.school}' data-place='${recruit.place}'	
										data-id='${recruit.id}'							
										data-target="#modifyModal">修改</button></td>	
							<td class="oTh"><button type="button" class="btn btn-link" onclick="delSchedule('${recruit.id}',this)">
							<span style="color:black"class="glyphicon glyphicon-trash" aria-hidden="true"></span></button></td>										
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>	
 	</div>
 </div>
 <!-- 修改行程 -->
 <div class="modal fade" id="modifyModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<span style="font:bold 18px '微软雅黑'">修改行程</span>
				</div>
				<div class="modal-body">

					<form id="updateUserForm">
						<div class="form-group">
							<label for="username">日期</label> <input type="text" onclick="layui.laydate({elem:this, istime:true, format: 'YYYY-MM-DD'})"
								class="form-control" id="updatedate" placeholder="日期">
						</div>
						<div class="form-group">
							<label for="password">时间</label> <input type="text"
								class="form-control" id="updatetime" placeholder="时间">
						</div>
						<div class="form-group">
							<label for="realname">学校</label> <input type="text"
								class="form-control" id="updateschool" placeholder="学校">
						</div>
						<div class="form-group">
							<label for="realname">地点</label> <input type="text"
								class="form-control" id="updateplace" placeholder="地点">				
						</div>
					</form>
				</div>
				<div class="modal-footer">
					 <button style="border-radius:0;background-color:#eca614;border:none;width:80px;font-family:'微软雅黑'" 
					     type="button" class="btn btn-primary"data-dismiss="modal" onclick="updateProcess()">确定</button>
				 	 <button style="border-radius:0;width:80px;font-family:'微软雅黑'"type="button" class="btn btn-default" data-dismiss="modal">取消</button>				
				</div>
			</div>
		</div>
	</div>
 
 <jsp:include page="common/common_bottom.jsp"></jsp:include>
</body>
<script src="${webroot }/resource/libs/bootstrap-table.js"></script>
<script src="${webroot }/resource/js/RecruitProcess.js"></script>
<script type="text/javascript" src="${webroot}/resource/libs/bootstrap-table-zh-CN.js"></script>
<script type="text/javascript" src="${webroot}/resource/lay/dest/layui.all.js"></script>
<script type="text/javascript" src="${webroot}/resource/lay/modules/laydate.js"></script>
</html>