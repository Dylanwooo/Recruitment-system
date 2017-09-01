<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<jsp:include page="common/common_header.jsp"></jsp:include>
	<link rel="stylesheet" href="${webroot }/resource/css/jobinfo.css">
	<link rel="stylesheet" href="${webroot }/resource/css/bootstrap-table.css">
<title>${title}</title>
</head>
<body>
 <jsp:include page="common/common_body.jsp"></jsp:include> 
 <div id="outsideContent">  
	<div class="container" id="mainContainer">
	   <div class="row">
			<div class="col-md-3 col-sm-3 col-xs-3" id="buttonPanel">
			   <c:if test="${user!=null}">
			     &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<span style="font:bold 16px'微软雅黑';">您好，${user.realName }</span>
			   </c:if>			   
		       <div class="btn-group-vertical" role="group" aria-label="...">
		          <button class="btn btn-default active" type="button"><span class="glyphicon glyphicon-user"></span>招聘职位</button>
		          <c:if test="${user.roleCode==null}">
		          	   <button class="btn btn-default" type="button" data-toggle="modal" data-target="#recruitModal">
		          	   <span class="glyphicon glyphicon-send"></span>招聘流程</button>		          	
		          </c:if>
		          <c:if test="${user.roleCode=='hr'}">
		          		<a href="RecruitProcess">
		          		<button class="btn btn-default" type="button"><span class="glyphicon glyphicon-send"></span>
		          		招聘流程</button></a>	
		          </c:if>
		          <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-comment"></span>常见问题</button>
	           </div>
		    </div>
		<div class="col-md-9  col-sm-8 col-xs-8" id="jobInfoContainer">
			   <div class="col-md-12 col-xs-12" style="float:left; display:inline;padding-top:10px;">
				   <div style="float:left">
				    <span class="glyphicon glyphicon-bookmark" aria-hidden="true" style="font-size:30px; color:black;"></span>		    
				  </div>   
				  <div style="float:left">
				    <span style="font:bold 25px '微软雅黑'">${title}</span>
				  </div>
			   </div>						
			   <div class="col-md-12 col-sm-10 col-xs-8" style="padding-top:10px;">
			      <ul id="test" class="nav nav-tabs" role="navigation">	
					  <li role="presentation"><a href="jobinfo?type=${jobtype}">全部分类</a></li>
					  <c:forEach items="${majorList }" var="majorList">
					  <li role="presentation">
							<a href="jobinfo?major=${majorList.majorName }&type=${jobtype}">${majorList.majorName }</a>
					  </li>
					  </c:forEach>		
					  <c:if test="${user.roleCode=='hr'}">
				         <button style="border:none;"class="btn btn-default" type="button" data-toggle="modal" data-target="#addMajorModal" >
				           <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
				         </button>
				         <button style="border:none;"class="btn btn-default" type="button" data-toggle="modal" data-target="#deleteMajorModal">
			               <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
				         </button>
				      </c:if>  				  
				  </ul>				  		  
			   </div>	
			    <c:if test="${user.roleCode=='hr'}">
			      <div class="col-md-12 col-xs-12" style="padding-top:10px;">
				      <ul class="nav nav-tabs">	
				          <li role="presentation"><a href="jobinfo?type=${jobtype}&status=1">已发布岗位</a></li>
						  <li role="presentation"><a href="jobinfo?type=${jobtype}&status=2">暂存岗位</a></li>
						  <li role="presentation"><a href="jobinfo?type=${jobtype}&status=4">已过期岗位</a></li>
						  <li role="presentation"><a href="jobinfo?type=${jobtype}&status=3">已删除岗位</a></li>	
						  <li>
						  <button class="btn btn-default" type="button" data-toggle="modal" data-target="#publishModal">
						    <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>发布岗位
						  </button>
						  </li>		
						  	   				  
					  </ul>			  		  
			       </div>
			    </c:if>
			    									
			   <div class="col-md-12 col-xs-12" style="float:left; display:inline;padding-top:10px;">
			     <div style="position:absolute;top:25px;left:30px;float:left;">
			       <span style="font:bold 16px'黑体';">岗位搜索：</span>
			     </div>	
			     <div style="float:left; position:absolute;top:17px; left:110px;">
			       <input style="border-radius:0px;"id="searchJob" type="text" class="form-control">   		  	                	      
			     </div>	
			     <div style="float:left; position:absolute;top:17px; left:280px;">
			       <button class="btn btn-primary" onclick="searchjob('${jobtype}')"
			       style="background-color:black; width:80px;border-radius:0px;font-family:'微软雅黑'">查询  </button>
			     </div>		  
			   </div>
			   		   
		   <div class="col-md-12 col-sm-10 col-xs-10" id="jobHolder">
		      <table class="table table-hover" id="jobInfoTable" >
					<thead >
						<tr>
							<th class="oTh">职位名称</th>							
							<th class="oTh">招聘人数</th>
							<c:if test="${user.roleCode==null}">
							</c:if>
							<th class="oTh">部门</th>
							<c:if test="${user.roleCode=='hr'}">
							  <th class="oTh">修改</th>
							  <th class="oTh">删除</th>
							</c:if>
						</tr>
					</thead>
					<tbody id="jobInfo">						
						<c:forEach items="${jobinfolist }" var="jobinfo">
							<tr>								
								<td class="oTd"><a href="jobDescribtion?id=${jobinfo.id}">${jobinfo.name }</a></td>								
								<td class="oTd">${jobinfo.num }</td>							
								<c:if test="${jobinfo.departmentid==1}">
								   <td class="oTd">21室</td>
								</c:if>
								<c:if test="${jobinfo.departmentid==2}">
								   <td class="oTd">22室</td>
								</c:if>			
								<c:if test="${jobinfo.departmentid==3}">
								   <td class="oTd">人事处</td>
								</c:if>				
								<c:if test="${user.roleCode=='hr'}">
								  <td class="oTd">
								  <button class="btn btn-link" type="button" data-toggle="modal" data-target="#modifyModal"
								  data-jobdesc='${jobinfo.jobDesc }' 
								  data-id='${jobinfo.id }' 
								  data-jobrequire='${jobinfo.jobRequire }'
								  data-num='${jobinfo.num }'
								  data-time='${jobinfo.endtime }'
								  data-hot='${jobinfo.hot }'><span class="glyphicon glyphicon-edit" style="color:black"></span></button></td>			
								  <td class="oTd">
								  <c:if test="${jobinfo.jobStatus!=3}">
								  <button class="btn btn-link" type="button" data-toggle="modal" onclick = "deleteJob('${jobinfo.id}',this)"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
								  </button>
								  </c:if>								    
								   <c:if test="${jobinfo.jobStatus==3}">								
								  <button class="btn btn-link" type="button" data-toggle="modal" onclick = "deletehrJob('${jobinfo.id}',this)">
								  	<span style="color:black" class="glyphicon glyphicon-trash" aria-hidden="true"></span>
								  </button>
								  </c:if>								  
								  </td>									  		
								</c:if>														
							</tr>
						</c:forEach>						
					</tbody>
				</table>
		   </div>		 		 
	</div>
	<!-- 修改岗位信息模态框 -->
	<div class="modal fade" id="modifyModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
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
			    <div style="position:relative;">
                  <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:18px;"><strong>岗位描述</strong></span>
		        </div>
		        <div style="position:relative; padding-top:5px; left:20px;">
		           <textarea rows="5" cols="70" style="border:1 solid #888888;resize:none;" id="updatejobdesc">${jobinfo.jobDesc }</textarea>
		        </div>		       
		        <div id="label2" style="position:relative; padding-top:5px;">
		           <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:18px;"><strong>岗位要求</strong></span>
		        </div>
		        <div style="position:relative; padding-top:5px; left:20px;">
		           <textarea rows="5" cols="70" style="border:1 solid #888888;resize:none;" id="updatejobrequire">${jobinfo.jobRequire }</textarea>
		        </div>			        
		        <div  id="label4" style="position:relative; padding-top:5px;">
		           <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:18px;"><strong>学历要求：</strong></span>  
		           &nbsp &nbsp
		           <select style="width:100px;" id="updatedegreerequire">
		                <option value="本科">本科及以上</option>
		                <option value="研究生">研究生及以上</option>
		                <option value="博士">博士及以上</option>
	               </select> 
	               &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp 
	               <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:18px;"><strong>专业类别：</strong></span>
	               <select onchange="select('${sex}','${department}',$('#option').text(),'${type}','${degree}','${search}','${start}','${end}','${searchjob }','${status}')">				  
					  <c:forEach items="${majorList }" var="majorList">					  							   
					   		<option id="option">${majorList.majorName }</option>  				     						   
					  </c:forEach>
				 	</select>
		        </div>
		       
		        <div id="label5" style="position:relative;padding-top:8px;">
		           <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:18px;"><strong>招聘人数：</strong></span>         	                      
		        </div>
			    <div style="position:relative; left:130px;margin-top:-25px;">
			       <input type="text" class="form-control" placeholder="招聘人数" id="number" style="width:150px;"> 
			    </div>
			    <div  id="label6" style="position:relative;padding-top:5px;">
		           <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:18px;"><strong>截止时间：</strong></span>         
		        </div>
			    <div style="position:relative; left:130px;margin-top:-25px;">
			       <input type="text" class="form-control" placeholder="截止时间" id="time"  style="width:150px;"
			       onclick="layui.laydate({elem:this, istime:true, format: 'YYYY-MM-DD'})">
			    </div>
			    <div  id="label7" style="position:relative;padding-top:5px;">
		           <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:18px;"><strong>岗位热度：</strong></span>         
		        </div>
			    <div style="position:relative; left:130px;margin-top:-25px;">
			       <input type="text" class="form-control" placeholder="输入1-5之间的数" id="heat"  style="width:150px;">
			    </div>
			</div>
			<div class="modal-footer">
			   <button style="border-radius:0px;font-family:'微软雅黑'" type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			   <button style="background-color:#eca614;border:none;border-radius:0px;font-family:'微软雅黑'" type="button" class="btn btn-primary" onclick="updatejobinfo()">提交更改</button>
			</div> 
		</div>
	 </div>     
   </div>
  <!-- 发布岗位模态框 -->
   <div class="modal fade" id="publishModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
			  <span style="font:bold 18px '微软雅黑'">发布岗位</span> &nbsp&nbsp
			  <c:if test="${jobtype==1}">
			  <span style="font:bold 18px '微软雅黑'" id="jobtype"><strong>校园招聘</strong></span>
			  </c:if>
			  <c:if test="${jobtype==2}">
			  <span style="font:bold 18px '微软雅黑'" id="jobtype"><strong>社会招聘</strong></span>
			  </c:if>
			  <c:if test="${jobtype==3}">
			  <span style="font:bold 18px '微软雅黑'" id="jobtype"><strong>实习生招聘</strong></span>
			  </c:if>
			  <button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
			  </button>
			</div>
			<div class="modal-body" style="position:relative; height:500px;">			   			   	     
		         <div style="position:absolute; float:left; display:inline; left:20px;">
		           <div style="float:left">
		              <input id="jobName" type="text" class="form-control" placeholder="岗位名称" style="width:150px;">
		           </div>	           
		           <div style="float:left; position:absolute; left:160px; top:8px;">
		              <select style="width:80px;" id="major"> 
		              <c:forEach items="${majorList }" var="addMajorList">          	
		              	<option value="${addMajorList.majorName }">${addMajorList.majorName }</option>
		              	</c:forEach>
		              </select>
		           </div>
		             <div style="float:left; position:absolute; left:250px; top:8px;">
		                 <select style="width:70px;" id="departmentSelect">
			               <c:forEach items="${departmentList }" var="department">          	
		              	<option value="${department.id }">${department.name }</option>
		              	</c:forEach>		                
			              </select>
		              </div>
		          
		           <div style="float:left;position:absolute; left:350px;">
		             <input type="text" class="form-control" value="${publishtime} " placeholder="发布日期" style="width:150px;" id="publishTime"
		              onclick="layui.laydate({elem:this, istime:true, format: 'YYYY-MM-DD'})">
		           </div>             
		         </div>
	         
		         <div style="position:relative;top:50px;">
		           <div style="position:absolute; left:10px;">
	                 <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> 
	                 <span style="font-size:18px;"><strong>岗位描述</strong></span>
	               </div>
	               <div style="position:absolute; left:10px; top:30px;">
	                 <textarea rows="5" cols="60" style="border:1 solid #888888;resize:none;" id="jobDesc"></textarea>
	               </div>
		         </div>
		         <div style="position:relative;top:200px;">
		           <div style="position:absolute; left:10px;">
	                 <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span>
	                  <span style="font-size:18px;"><strong>岗位要求</strong></span>
	               </div>
	               <div style="position:absolute; left:10px; top:30px;">
	                 <textarea rows="5" cols="60" style="border:1 solid #888888;resize:none;" id="jobRequire"></textarea>
	               </div>
		         </div>
		          <div style="position:relative;top:350px;">
			          <div style="position:absolute; left:10px;float:left;">
		                 <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> 
		                 <span style="font-size:18px;"><strong>学历要求</strong></span>
		              </div>
		              <div style="float:left; position:absolute; left:130px; top:5px;">
		                 <select style="width:100px;" id="degreeRequire">
			                <option value="本科">本科及以上</option>
			                <option value="研究生">研究生及以上</option>
			                <option value="博士">博士及以上</option>
			              </select>
		              </div>	               
		              <div style="position:absolute; right:230px;float:left;">
		                 <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> 
		                 <span style="font-size:18px;"><strong>截止时间</strong></span>
		              </div>
		              <div style="position:absolute; right:10px;float:left;">
		                 <input type="text" class="form-control" placeholder="截止时间" style="width:200px;" id="endTime"
		                 onclick="layui.laydate({elem:this, istime:true, format: 'YYYY-MM-DD'})">
		              </div>
		         </div>	         
		         <div style="position:relative;top:400px;">
		           <div style="position:absolute; left:10px;float:left;">
	                 <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span>
	                 <span style="font-size:18px;"><strong>招聘人数</strong></span>
	               </div>
	               <div style="position:absolute; left:140px;float:left;">
	                 <input id="recuitNum" type="text" class="form-control" placeholder="招聘人数" style="width:150px;">
	               </div>
		         </div>
		         <div style="position:relative;top:440px;">
		           <div style="position:absolute; left:10px;float:left;">
	                 <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span>
	                 <span style="font-size:18px;"><strong>热度</strong></span>
	               </div>
	               <div style="position:absolute; left:140px;float:left;">
	                 <input id="pubhot" type="text" class="form-control" placeholder="输入1-5之间的数字" style="width:150px;">
	               </div>
		         </div>	      	         	
			</div>
			<div class="modal-footer">
			   <button style="font-family:'微软雅黑';width:80px;background-color:#eca614; border-radius:0px;border:none;" class="btn btn-primary" onclick="publishJob('${jobtype}')">提交</button>
			   <button style="font-family:'微软雅黑';width:80px;background-color:#5baffa; border-radius:0px;border:none;" class="btn btn-warning" onclick="tempJob('${jobtype}')" id="tempSave">暂存</button>			   
			</div> 
		</div>
	 </div>     
   </div>
 <!-- 增加专业模态框 -->
	<div class="modal fade" id="addMajorModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel" style="font:bold 18px '微软雅黑'">增加专业</h4>
				</div>
				<div class="modal-body">
					<form id="updateUserForm">
						<div class="form-group">
							<label for="majorName" style="font:bold 17px '微软雅黑'">专业名</label>
							<input style="border-radius:0px;"type="text" class="form-control" id="addMajor" placeholder="输入专业名">
						</div>
					</form>
				</div>
				<div class="modal-footer">
				    <button style="background-color:#eca614;border:none;border-radius:0px;width:80px;font-family:'微软雅黑'" 
				    type="button" class="btn btn-primary" onclick="addMajor()">确定</button>
					<button style="border-radius:0px;width:80px;font-family:'微软雅黑'"type="button" class="btn btn-default" data-dismiss="modal">取消</button>
					
				</div>
			</div>
		</div>
	</div>
    <!-- 删除专业模态框 -->
	<div class="modal fade" id="deleteMajorModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel" style="font:bold 18px '微软雅黑'">删除专业</h4>
				</div>
				<div class="modal-body">
					<form id="updateUserForm">
						<div class="form-group">
							<select style="width:80px;" id="deleteMajor"> 
				              <c:forEach items="${majorList }" var="deleteMajorList">          	
				              	<option value="${deleteMajorList.majorId }">${deleteMajorList.majorName }</option>
				              </c:forEach>
				            </select>
						</div>
					</form>
				</div>
				<div class="modal-footer">
				    <button style="background-color:#eca614;border-radius:0px;border:none;width:80px;font-family: '微软雅黑'" 
				     type="button" class="btn btn-primary" onclick="deleteMajor()">确定</button>
			 		<button style="width:80px;border-radius:0px;font-family:'微软雅黑'"type="button" class="btn btn-default" data-dismiss="modal">取消</button>					
				</div>
			</div>
		</div>  
    </div>  
   
    <!-- 招聘流程模态框 -->
    <div class="modal fade" id="recruitModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" style="width:600px;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel" style="font:bold 18px '微软雅黑'">招聘流程</h4>
				</div>	
				<div class="modal-body">						
						<div class="col-md-offset-1 col-sm-offset-1"id="upperContent">
							<img src="resource/img/1.PNG" oncontextmenu="return false" ondragstart="return false">					
						</div>
						<hr />
						<div id="downContent" style="position:relative;left:40px;width:500px;height:300px;">
							<div style="padding:0" class="col-md-12">
						    	<p>宣讲日程：</p>
						    </div>						    
						    <div class="col-md-12" style="position:relative;top:10px;">
								<table class="table" id="scheduleTable">
									<thead >
										<tr>
											<th class="oTh">日期</th>							
											<th class="oTh">时间</th>								
											<th class="oTh">学校</th>
											<th class="oTh">地点</th>																					
										</tr>
									</thead>
									<tbody id="tbContent">
										<c:forEach items="${recruitlist}" var="recruit">
											<tr id="scheduleRow">
											<td class="oTh">${recruit.date}</td>							
											<td class="oTh">${recruit.time}</td>								
											<td class="oTh">${recruit.school}</td>
											<td class="oTh">${recruit.place}</td>	
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>								
					</div>				
														
			</div>
		</div>  
    </div> 
</div>
</div>
</div>
   	
<jsp:include page="common/common_bottom.jsp"></jsp:include>
</body>
<script src="${webroot }/resource/libs/bootstrap-table.js"></script>
<script type="text/javascript" src="${webroot}/resource/libs/bootstrap-table-zh-CN.js"></script>
<script type="text/javascript" src="${webroot}/resource/js/jobinfo.js"></script>
<script type="text/javascript" src="${webroot}/resource/lay/dest/layui.all.js"></script>
<script type="text/javascript" src="${webroot}/resource/lay/modules/laydate.js"></script>
</html>