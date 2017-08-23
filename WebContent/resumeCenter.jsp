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
	<link rel="stylesheet" href="${webroot }/resource/css/bootstrap-table.css">
	
<title>简历查看</title>
</head>
<body>
  <jsp:include page="common/common_body.jsp"></jsp:include>
  <div id="outsideContent">
  <div class="container-fluid" id="mainContainer"> 
  <div class="row">   
     <div id="rightContent" class="col-md-12 col-sm-10 col-xs-9">        
          <div id="one" class="col-md-12 col-sm-12 col-xs-12" style="position:relative; float:left; display:inline;">
	             <span ><strong>性别：</strong></span>         
	             <div class="col-md-4" style="float:left; left:45px; position:absolute; width:50px">
	               <span><a onclick="select('男','${department}','${major}','${type}','${degree}','${search}','${start}','${end}')">男</a></span>  
	             </div>   
	             <div class="col-md-4" style="float:left; left:100px; position:absolute;">
	                <span><a onclick="select('女','${department}','${major}','${type}','${degree}','${search}','${start}','${end}')">女</a></span>  
	             </div>  	                     
	      </div>   
	      <div id="oneOne" class="col-md-12 col-sm-12 col-xs-12" style="position:relative;float:left; display:inline;padding-top:15px;">
	             <span ><strong>部门：</strong></span>
	             <div class="col-md-4" style="float:left; left:45px; position:absolute; width:100px">
	               <span><a onclick="select('${sex}','1','${major}','${type}','${degree}','${search}','${start}','${end}')">21室</a></span>  
	             </div>   
	             <div class="col-md-4" style="float:left; left:100px; position:absolute;">
	                <span><a onclick="select('${sex}','2','${major}','${type}','${degree}','${search}','${start}','${end}')">22室</a></span>  
	             </div>  	                     
	      </div>
          <div id="two" class="col-md-12 col-sm-12 col-xs-12" style="position:relative; float:left; display:inline;padding-top:15px;">
	             <span ><strong>专业：</strong></span>	             
	             <div class="col-md-4" style="float:left; position:absolute;width:500px;">
	                <ul>
	                   <c:forEach items="${majorList }" var="majorList">
						  <li role="presentation" style="float:left; list-style:none;">
								<span><a onclick="select('${sex}','${department}','${majorList.majorName}','${type}','${degree}','${search}','${start}','${end}')"">${majorList.majorName }</a></span>
								&nbsp &nbsp 
						  </li>
					   </c:forEach>	
	                </ul>	
	             </div>           
	       </div>
          <div id="three" class="col-md-12 col-sm-12 col-xs-12" style="position:relative; float:left;display:inline;padding-top:15px;">
	             <span><strong>岗位类型：</strong></span>
	             <div style="float:left; left:90px; position:absolute;width:50px;">
	                <span style=" font-size:15px;"><a href="resumeCenter">全部</a></span>
	             </div>
	             <div style="float:left; left:140px; position:absolute;width:100px;">
	                <span><a onclick="select('${sex}','${department}','${major}','1','${degree}','${search}','${start}','${end}')">校园招聘</a></span>
	             </div>
	             <div style="float:left; left:220px; position:absolute;width:100px;">
	                <span><a onclick="select('${sex}','${department}','${major}','2','${degree}','${search}','${start}','${end}')">社会招聘</a></span>
	             </div>
	             <div style="float:left; left:305px; position:absolute;width:100px;">
	                <span><a onclick="select('${sex}','${department}','${major}','3','${degree}','${search}','${start}','${end}')">实习生招聘</a></span>
	             </div>
	          </div>
          <div id="four"class="col-md-12 col-sm-12 col-xs-12" style="position:relative; float:left;display:inline; padding-top:15px;">
	             <span><strong>最高学历：</strong></span>
	             <div style="float:left; left:90px; position:absolute;width:50px;">
	                <span><a href="resumeCenter">全部</a></span>
	             </div>
	             <div style="float:left; left:130px; position:absolute;width:100px;">
	                <span><a onclick="select('${sex}','${department}','${major}','${type}','1','${search}','${start}','${end}')">本科</a></span>
	             </div>
	             <div style="float:left; left:210px; position:absolute;width:100px;">
	                <span><a onclick="select('${sex}','${department}','${major}','${type}','2','${search}','${start}','${end}')">研究生</a></span>
	             </div>
	             <div style="float:left; left:295px; position:absolute;width:100px;">
	                <span><a onclick="select('${sex}','${department}','${major}','${type}','3','${search}','${start}','${end}')">博士</a></span>
	             </div>            
          </div>       
             	        
          <div id="five" class="col-md-6 col-sm-12 col-xs-12" style="position:relative; float:left;display:inline; padding-top:15px;">
             <span><strong>学校搜索：</strong></span>
             <div class="col-md-12 col-sm-10 col-xs-9" style="float:left; position:absolute; left:110px;">
			       <input style="width:220px;" id="searchSchool" type="text" class="form-control" value="${search}">   		  	                	      
			 </div>	
		     <div style="float:left; position:absolute; left:280px;">
		       <button style="background-color:black;width:70px;"type="button" class="btn btn-primary" 
		       onclick="searchSchool('${sex}','${department}','${major}','${type}','${degree}','${start}','${end}')">搜索  </button>
		     </div>		     
          </div>
          <div id="six" class="col-md-6 col-sm-12" style="position:relative;float:left;display:inline; padding-top:15px;">
             <span><strong>时间搜索：</strong></span>
             <div class="col-md-12 col-sm-10 col-xs-9" style="float:left; position:absolute; left:110px;">
			       <input id="startDate" style="width:120px;"  type="text" class="form-control" value="${start}" 
			       onclick="layui.laydate({elem:this, istime:true, format: 'YYYY-MM-DD'})">   		  	                	      
			 </div>
			 <div style="float:left; position:absolute; left:245px;">
			   <span>至</span>
			 </div>		 
			 <div class="col-md-12 col-sm-10 col-xs-9" style="float:left; position:absolute; left:250px;">			       
			       <input id="endDate" style="width:120px;"  type="text" class="form-control" value="${end}" 
			       onclick="layui.laydate({elem:this, istime:true, format: 'YYYY-MM-DD'})">   		  	                	      
			 </div>	
		     <div style="float:left; position:absolute; left:390px;">
		       <button style="background-color:black;width:70px;"type="button" class="btn btn-primary" 
		       onclick="searchtime('${sex}','${department}','${major}','${type}','${degree}','${search}')">搜索  </button>
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
			            <th class="oTd">学校</th>
		                <th class="oTd">学历</th>
			            <th class="oTd">专业</th>
			            <th class="oTd">简历预览</th>		            
			          </tr>
			       </thead>
			       <tbody id="first">
			          <c:forEach items="${resumeList }" var="resume">
							<tr>
								<td>${resume.name }</td>
								<td>${resume.sex }</td>
							<td>${resume.phone }</td>
							<td>${resume.email }</td>
								<td>${resume.jobname }</td>		
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
								<td><label><a href="resumePreview?id=${resume.resumeId}&rolecode=${user.roleCode}">预览</a></label></td>										
							</tr>
					  </c:forEach>	
			       </tbody>
			    </table>			    		    
			</div>	
			<div class="col-md-offset-5 col-sm-offset-3 col-xs-offset-2" style="position:absolute;bottom:-80px;">
			    <button type="button" class="btn btn-default" onclick="javascript:tableToExcel('resumeTable')"
			    style="border:none;background-color:#eca614;font:bold 16px '黑体';height:35px;border-radius:0px;color:white;width:200px">
			             批量导出</button>
			</div>		
	      </div> 
	 </div>
 </div>
	   
  <jsp:include page="common/common_bottom.jsp"></jsp:include> 
</body>
    <script src="${webroot }/resource/libs/jquery-3.2.1.min.js"></script>
    <script src="${webroot }/resource/libs/bootstrap-table.js"></script>
    <script type="text/javascript" src="${webroot}/resource/lay/dest/layui.all.js"></script>
	<script type="text/javascript" src="${webroot}/resource/lay/modules/laydate.js"></script> 
    <script src="${webroot }/resource/js/resumeCenter.js"></script>
    <script src="${webroot }/resource/js/ToExcel.js"></script>
</html>