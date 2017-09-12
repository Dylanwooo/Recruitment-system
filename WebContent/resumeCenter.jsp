<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="common/common_header.jsp"></jsp:include>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="${webroot }/resource/css/resumeCenter.css">
	<link rel="stylesheet" href="${webroot }/resource/css/jquery-ui-1.10.0.custom.css"> 
	<link rel="stylesheet" href="${webroot }/resource/css/bootstrap-table.css">
	
<title>简历查看</title>
</head>
<body>
  <jsp:include page="common/common_body.jsp"></jsp:include>
  <div id="outsideContent">
  <div class="container-fluid" id="mainContainer"> 
  <div class="row">   
     <div id="rightContent" class="col-md-12 col-sm-10 col-xs-9">        
          <div id="one" class="col-md-6 col-sm-6 col-xs-6" style="position:relative; float:left; display:inline;margin-top:10px;">
	             <span ><strong>性别：</strong></span>         
	             <div style="float:left; position:relative;margin-right:20px;">
	               <span><a onclick="select('男','${department}','${major}','${type}','${degree}','${search}','${start}','${end}','${searchjob }','${status}')">男</a></span>  
	             </div>   
	             <div style="float:left; position:relative;">
	                <span><a onclick="select('女','${department}','${major}','${type}','${degree}','${search}','${start}','${end}','${searchjob }','${status}')">女</a></span>  
	             </div>  	                     
	      </div>
	       <div class="col-md-6 col-sm-6 col-xs-6" style="position:relative; float:left; display:inline;margin-top:10px;">
	            <span style="float:left; font: bold 15px '微软雅黑';">重置选择:</span>
	            <div class="col-md-1">
	            	<a href="resumeCenter"> <span class="glyphicon glyphicon-repeat" aria-hidden="true"></span></a>	
	            </div>   	                                                 
	      </div>  
	      <div id="two" class="col-md-6 col-sm-6 col-xs-6" style="position:relative; float:left; display:inline;padding-top:15px;height:auto;">
	             <span ><strong>专业类别：</strong></span>	             
	             <div class="col-md-4" style="float:left; position:absolute;width:500px;margin-left:20px;">
	                <ul>
	                   <c:forEach items="${majorList }" var="majorList">
						  <li role="presentation" style="float:left; list-style:none;">
								<span><a onclick="select('${sex}','${department}','${majorList.majorName}','${type}','${degree}','${search}','${start}','${end}','${searchjob }','${status}')">${majorList.majorName }</a></span>
								&nbsp &nbsp 
						  </li>
					   </c:forEach>	
	                </ul>	
	             </div>           
	       </div> 
	     <%--  <div id="oneOne" class="col-md-6 col-sm-6 col-xs-6" style="position:relative;float:left; display:inline;padding-top:15px;">
	             <span ><strong>部门：</strong></span>
	             <c:forEach items="${departmentList }" var="departmentList">
	              <span style="padding-right:8px;"><a onclick="select('${sex}','${departmentList.id} }','${major}','${type}','${degree}','${search}','${start}','${end}','${searchjob }','${status}')">${departmentList.name}</a></span>  
	             </c:forEach>	              	                     
	      </div> --%>
	      <div id="five" class="col-md-6 col-sm-6 col-xs-6" style="position:relative; float:left;display:inline; padding-top:15px;">
             <span><strong>学校搜索：</strong></span>
             <div class="col-md-4 col-sm-3 col-xs-2" style="float:left; position:relative;">
			       <input style="width:180px;" id="searchSchool" type="text" class="form-control" value="${search}">   		  	                	      
			 </div>	
		     <div class="col-md-4 col-sm-3 col-xs-2" style="float:left; position:relative;">
		       <button style="background-color:black;width:70px;"type="button" class="btn btn-primary" 
		       onclick="searchSchool('${sex}','${department}','${major}','${type}','${degree}','${start}','${end}','${searchjob }','${status}')">搜索  </button>
		     </div>		     
          </div>
          <div id="three" class="col-md-6 col-sm-6 col-xs-6" style="position:relative; float:left;display:inline;padding-top:15px;">
             <span><strong>岗位类型：</strong></span>          
             <div style="float:left; position:relative;padding-right:20px;">
                <span><a onclick="select('${sex}','${department}','${major}','1','${degree}','${search}','${start}','${end}','${searchjob }','${status}')">校园招聘</a></span>
             </div>
             <div style="float:left; position:relative;padding-right:20px;">
                <span><a onclick="select('${sex}','${department}','${major}','2','${degree}','${search}','${start}','${end}','${searchjob }','${status}')">社会招聘</a></span>
             </div>
             <div style="float:left; position:relative;">
                <span><a onclick="select('${sex}','${department}','${major}','3','${degree}','${search}','${start}','${end}','${searchjob }','${status}')">实习生招聘</a></span>
             </div>
	       </div>
	       <div id="twotwo" class="col-md-6 col-sm-6 col-xs-6" style="position:relative; float:left;display:inline; padding-top:15px;padding-left:15px;">
             <span><strong>岗位搜索：</strong></span>
             <div class="col-md-2" style="float:left; position:relative;">
			      <input style="width:180px;" id="searchJob" type="text" class="form-control" value="${searchjob}">   		  	                	      
			 </div>	
		     <div style="float:left; position:relative;left:127px;">
		       <button style="background-color:black;width:70px;"type="button" class="btn btn-primary" 
		        onclick="searchJob('${sex}','${department}','${major}','${type}','${degree}','${start}','${end}','${search }','${status}')">搜索  </button>
		     </div>		     
          </div>
          <div id="four"class="col-md-6 col-sm-6 col-xs-6" style="position:relative; float:left;display:inline; padding-top:15px;">
	             <span><strong>最高学历：</strong></span>	            
	             <div style="float:left; position:relative;padding-right:20px;">
	                <span><a onclick="select('${sex}','${department}','${major}','${type}','1','${search}','${start}','${end}','${searchjob }','${status}')">本科</a></span>
	             </div>
	             <div style="float:left; position:relative;padding-right:20px;">
	                <span><a onclick="select('${sex}','${department}','${major}','${type}','2','${search}','${start}','${end}','${searchjob }','${status}')">研究生</a></span>
	             </div>
	             <div style="float:left; position:relative;">
	                <span><a onclick="select('${sex}','${department}','${major}','${type}','3','${search}','${start}','${end}','${searchjob }','${status}')">博士</a></span>
	             </div>            
          </div>
	       <div id="six" class="col-md-6 col-sm-6 col-xs-6" style="position:relative;float:left;display:inline; padding-top:15px;">
             <span><strong>时间搜索：</strong></span>
             <div class="col-md-4 col-sm-4 col-xs-4" style="float:left; position:relative;margin-right:-20px;margin-left:-5px;">
			       <input id="startDate" style="width:120px;"  type="text" class="form-control" value="${start}" 
			       onclick="layui.laydate({elem:this, istime:true, format: 'YYYY-MM-DD'})">   		  	                	      
			 </div>		
			   <span>至</span>				 
			 <div class="col-md-4 col-sm-4 col-xs-4" style="float:left; position:relative;margin-right:-20px;margin-left:-20px;">			       
			       <input id="endDate" style="width:120px;"  type="text" class="form-control" value="${end}" 
			       onclick="layui.laydate({elem:this, istime:true, format: 'YYYY-MM-DD'})">   		  	                	      
			 </div>	
		     <div style="float:left; position:relative;">
		       <button style="background-color:black;width:70px;"type="button" class="btn btn-primary" 
		       onclick="searchtime('${sex}','${department}','${major}','${type}','${degree}','${search}','${searchjob }','${status}')">搜索  </button>
		     </div>	
          </div>
           
          <div id="ten"class="col-md-6 col-sm-6 col-xs-6" style="position:relative; float:left;display:inline; padding-top:15px;padding-right:0;">
          		<span><strong>简历状态：</strong></span>
          		<c:if test="${user.roleCode=='hr'}">
          			<div style="float:left; position:relative;padding-right:15px;">
          				<span><a onclick="select('${sex}','${department}','${major}','${type}','${degree}','${search}','${start}','${end}','${searchjob }','简历投递成功')">未查看</a></span>
          			</div>
          			<div style="float:left; position:relative;padding-right:15x;">
          				<span><a onclick="select('${sex}','${department}','${major}','${type}','${degree}','${search}','${start}','${end}','${searchjob }','通过简历筛选')">通过简历筛选</a></span>
          			</div>
          			<div style="float:left; position:relative;padding-right:15px;padding-left:7px;">
          				<span><a onclick="select('${sex}','${department}','${major}','${type}','${degree}','${search}','${start}','${end}','${searchjob }','通过专业面试')">通过专业面试</a></span>
          			</div>
          			<div style="float:left; position:relative;padding-right:15px;">
          				<span><a onclick="select('${sex}','${department}','${major}','${type}','${degree}','${search}','${start}','${end}','${searchjob }','通过综合面试')">通过综合面试</a></span>
          			</div>	
          			<div style="float:left; position:relative;padding-right:15px;padding-right:0">
          				<span><a onclick="select('${sex}','${department}','${major}','${type}','${degree}','${search}','${start}','${end}','${searchjob }','已储备')">已储备</a></span>
          			</div>
          		</c:if>
          		<c:if test="${user.roleCode=='interviewer'}">
          			<div style="float:left; position:relative;padding-right:20px;padding-left:10px;">
          				<span><a onclick="select('${sex}','${department}','${major}','${type}','${degree}','${search}','${start}','${end}','${searchjob }','通过简历筛选')">未查看</a></span>
          			</div>
          			<div style="float:left; position:relative;padding-right:20px;padding-left:10px;">
          				<span><a onclick="select('${sex}','${department}','${major}','${type}','${degree}','${search}','${start}','${end}','${searchjob }','通过专业面试')">通过专业面试</a></span>
          			</div>
          			<div style="float:left; position:relative;padding-right:20px;">
          				<span><a onclick="select('${sex}','${department}','${major}','${type}','${degree}','${search}','${start}','${end}','${searchjob }','已储备')">已储备</a></span>
          			</div>
          		</c:if>
          		         
          </div>  
          <div id="nine" class="col-md-6 col-sm-6 col-xs-6" style="position:relative;float:left;display:inline; padding-top:15px;">
             <span><strong>部门搜索：</strong></span>
             <div class="col-md-4 col-sm-4 col-xs-4" style="float:left; position:relative;margin-right:-20px;margin-left:-5px;">
			       <input id="department" style="width:120px;"  type="text" class="form-control" value="${department}" >   		  	                	      
			 </div>					
		     <div style="float:left; position:relative;">
		       <button style="background-color:black;width:70px;"type="button" class="btn btn-primary" 
		       onclick="searchdepartment('${sex}','${major}','${type}','${degree}','${search}','${searchjob }','${start}','${end}','${status}')">搜索  </button>
		     </div>	
          </div>                           	                                     
        </div>

        <div class="col-md-12 col-sm-10 col-xs-9" style="position:relative; top:300px; height:450px;background-color:white;padding-top:10px;box-shadow:0 0 1px #c0c0c0; ">			   
			    <table class="table table-hover " id="resumeTable" >
			       <thead>
			          <tr>			            
			            <th class="oTd">姓名</th>
			            <th class="oTd">性别</th>
                        <th class="oTd">手机</th>
		                <th class="oTd">邮件</th>
			            <th class="oTd">应聘岗位</th>
			            <th class="oTd">提交时间</th>
			            <th class="oTd">学校</th>
		                <th class="oTd">学历</th>
			            <th class="oTd">专业</th>
			            <th class="oTd">简历状态</th>		
			            <th class="oTd">删除</th>	            
			          </tr>
			       </thead>
			       <tbody id="first">
			          <c:forEach items="${resumeList }" var="resume">
							<tr>								
								<td><label><a href="resumePreview?id=${resume.resumeId}&rolecode=${user.roleCode}">${resume.name }</a></label></td>
								<td>${resume.sex }</td>
								<td>${resume.phone }</td>
								<td>${resume.email }</td>
								<td>${resume.jobname }</td>	
								<td>${resume.submittime }</td>	
								<td>${resume.school }</td>	
								 <c:if test="${resume.degree==1}">
								<td>本科</td>	
								</c:if>
								 <c:if test="${resume.degree==2}">
								<td>硕士</td>	
								</c:if>
								 <c:if test="${resume.degree==3}">
								<td>博士</td>	
								</c:if>
								<td>${resume.major }</td>	
								<td>${resume.status}</td>		
								<td><button type="button" class="btn btn-link" onclick="delResume('${resume.resumeId}',this)">
									<span style="color:black"class="glyphicon glyphicon-trash" aria-hidden="true"></span>
									</button>
								</td>						
							</tr>
					  </c:forEach>	
			       </tbody>
			    </table>			    		    
			</div>
			<c:if test="${user.roleCode!='interviewer'}">
				<div class="col-md-offset-5 col-sm-offset-3 col-xs-offset-2" style="position:absolute;bottom:-100px;">
				    <button type="button" class="btn btn-default" onclick="javascript:tableToExcel('resumeTable')"
				    style="border:none;background-color:#eca614;font:bold 16px '黑体';height:35px;border-radius:0px;color:white;width:200px">
				             批量导出</button>
				</div>
			</c:if>	
					
	      </div> 
	 </div>
 </div>
	   
  <jsp:include page="common/common_bottom.jsp"></jsp:include> 
</body>
    <script src="${webroot }/resource/libs/jquery-3.2.1.min.js"></script>
    <script src="${webroot }/resource/libs/bootstrap-table.js"></script>
    <script type="text/javascript" src="${webroot}/resource/libs/bootstrap-table-zh-CN.js"></script>
    <script type="text/javascript" src="${webroot}/resource/lay/dest/layui.all.js"></script>
	<script type="text/javascript" src="${webroot}/resource/lay/modules/laydate.js"></script> 
    <script src="${webroot }/resource/js/resumeCenter.js"></script>
    <script src="${webroot }/resource/js/ToExcel.js"></script>
</html>