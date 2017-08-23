<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="common/common_header.jsp"></jsp:include>
<link rel="stylesheet" href="${webroot }/resource/css/personalCenter.css">
<title>个人中心</title>
</head>
<body>
  <jsp:include page="common/common_body.jsp"></jsp:include>
<div style="position:relative; width:100% height:600px;background-color: #f5f7fa;"> 
  <div id="mainContainer">
     <div id="leftPanel">
       <div style="top:10px;position:absolute;left:25px;">
         &nbsp &nbsp &nbsp<span>您好，${user.realName }</span><br>
       </div> 
       <div style="top:70px;position:absolute;left:25px;">
         <div class="btn-group-vertical" role="group" aria-label="...">
           <button class="btn btn-default active" type="button">个人信息</button>         
           <button class="btn btn-default" type="button" data-toggle="modal" data-target="#statusModal" 
           >已投简历查询</button>
         </div>
       </div>          
     </div>
     <div id="rightContent">
		<div style="position:relative">
		  <div id="one" style="float:left; display:inline; position:absolute; top:20px; left:50px;">
		    <div style="float:left">
		       <span><strong>姓名：</strong></span>
		    </div>
		    <div style="float:left">
		       <span><strong>${user.realName}</strong></span>
		    </div>		         
		  </div>		  
		  <div id="two" style="float:left; display:inline; position:absolute; top:60px; left:50px;">
		     <div style="float:left;">
		      <span><strong>用户名：</strong></span>
		    </div>
		    <div style="float:left;">
		      <span><strong>${user.userName}</strong></span>
		    </div>
		    
		  </div>
		  
		  <div id="three" style="float:left; display:inline; position:absolute; top:100px; left:50px;">
		    <div style="float:left;">
		      <span><strong>联系方式：${user.phoneNumber}</strong></span>
		    </div>
		    <div style="float:left;">
		      <span><strong>${user.address}</strong></span>
		    </div>
		  </div>
		  
		  <div id="five" style="float:left; display:inline; position:absolute; top:140px; left:50px;">
		   <div style="float:left;">
		      <span><strong>邮箱：</strong></span>
		    </div>
		    <div style="float:left;">
		      <span><strong>${user.email}</strong></span>
		    </div>
		  </div>
		 
		</div>	
		<div style="position:absolute; right:50px; top:20px;">
		  <button class="btn btn-default" type="button" data-toggle="modal" 
		  data-target="#updateUserModal"
		  data-username='${user.userName}' data-id='${user.id}'
					data-password='${user.password}' data-realname='${user.realName}'
					data-sex='${user.sex}' data-idcardnumber='${user.idCardNumber}'
					data-phone='${user.phoneNumber}' data-email='${user.email}' >
		    <span class="glyphicon glyphicon-edit"><strong>修改</strong></span>
		  </button>
		 
		</div>	
     </div>
  </div>
  <!-- 修改岗位信息模态框 -->
	<div class="modal fade" id="upmodifyModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
			  <span style="font:bold 18px '微软雅黑'">岗位信息修改</span>
			  <button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
			  </button>
			</div>
			<div class="modal-body" style="position:relative; height:500px;">			   
			    <div style="position:absolute;">
                  <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:18px;"><strong>岗位描述</strong></span>
		        </div>
		        <div style="position:absolute; top:50px; left:20px;">
		           <textarea rows="5" cols="70" style="border:1 solid #888888;resize:none;" id="updatejobdesc">${jobinfo.jobDesc}</textarea>
		        </div>		       
		        <div id="label2" style="position:absolute; top:160px;">
		           <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:18px;"><strong>岗位要求</strong></span>
		        </div>
		        <div style="position:absolute; top:190px; left:20px;">
		           <textarea rows="5" cols="70" style="border:1 solid #888888;resize:none;" id="updatejobrequire">${jobinfo.jobRequire}</textarea>
		        </div>			        
		        <div  id="label4" style="position:absolute; top:310px;">
		           <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:18px;"><strong>学历要求：</strong></span>    
		        </div>
		        <div style="position:absolute; top:315px; left:130px;">
		           <select style="width:50px;" id="updatedegreerequire">
	                <option value="本科">本科</option>
	                <option value="研究生">研究生</option>
	                <option value="博士">博士</option>
	              </select>
		        </div>
		        <div  id="label5" style="position:absolute; top:350px;">
		           <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:18px;"><strong>招聘人数：</strong></span>         
		        </div>
			    <div style="position:absolute; top:350px; left:130px;">
			       <input type="text" class="form-control" placeholder="招聘人数" id="number" style="width:150px;">
			    </div>
			    <div  id="label6" style="position:absolute; top:385px;">
		           <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:18px;"><strong>截止时间：</strong></span>         
		        </div>
			    <div style="position:absolute; top:385px; left:130px;">
			       <input type="text" class="form-control" placeholder="截止时间" id="time"  style="width:150px;" 
			       onclick="layui.laydate({elem:this, istime:true, format: 'YYYY-MM-DD'})">
			    </div>
			</div>
			<div class="modal-footer">
			   <button style="font:bold 16px '微软雅黑'" type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			   <button style="background-color:#eca614;border:none; font:bold 16px '微软雅黑'" type="button" 
			   class="btn btn-primary" onclick="updatejobinfo()">提交更改</button>
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
				<h4 style="font:bold 18px '微软雅黑'" class="modal-title" id="myModalLabel">修改用户</h4>
			</div>
			<div class="modal-body">
				<form id="updateUserForm">
					<div class="form-group">
						<label for="username">用户名</label> <input type="text" 
							class="form-control" id="updateusername" >
					</div>
					<div class="form-group">
						<label for="password">密码</label> <input type="password"
							class="form-control" id="updatepassword" >
					</div>
					<div class="form-group">
						<label for="realname">姓名</label> <input type="text"
							class="form-control" id="updaterealname" >
					</div>					
				
					<div class="form-group">
						<label for="realname">联系方式</label> <input type="text"
							class="form-control" id="updatephone" >								
					</div>
					<div class="form-group">
						<label for="realname">邮箱</label> <input type="text"
							class="form-control" id="updateemail" >								
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button style="border-radius:0;font:bold 16px '黑体'" type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				<button style="border-radius:0;font:bold 16px '黑体';background-color:#eca614;border:none;" type="button" class="btn btn-primary" onclick="updateEmployee()">确定</button>
			</div>
		</div>
	  </div>
   </div>
  
   <!-- 简历状态查询模态框 -->
   <div class="modal fade" id="statusModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
			  <button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
			  </button>
			</div>
			<div class="modal-body">
			  <table class="table">
				<thead>
					<tr>
						
						<th>职位名称</th>
						<th>职位类别</th>
						<th>简历状态</th>		
						<th>查看简历</th>			
					</tr>
				</thead>
				
				
				  <tbody>		
				        <c:if test="${resume!=null}">		
							<tr>
								
								<td>${resume.jobname}</td>
								<td>${resume.majorName}</td>	
								<c:if test="${resume.status==1}">
									<td>已成功投递</td> 
								</c:if>
								<c:if test="${resume.status==2}">
									<td>已被查看</td> 
								</c:if>
								<c:if test="${resume.status==3}">
									<td>通过筛选</td> 
								</c:if>
								<td><a href="resumePreview?id=${resume.resumeId}&rolecode=${user.roleCode}">跳转</a></td>
							</tr>	
							</c:if>
							<c:if test="${resume==null}">	
							<tr>
				      <td>还没有填写简历，快去申请个岗位吧~</td>
				    </tr>				</c:if>
					</tbody>					 		
			 </table>
			</div>
		</div>
	</div>     
   </div>
 </div>
  <jsp:include page="common/common_bottom.jsp"></jsp:include>
  <script type="text/javascript" src="${webroot}/resource/js/EmployeeUser.js"></script>
</body>
</html>