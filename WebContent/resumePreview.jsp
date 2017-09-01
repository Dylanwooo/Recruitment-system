<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<jsp:include page="common/common_header.jsp"></jsp:include>
	<link rel="stylesheet" href="${webroot }/resource/css/resumePreview.css">
<title>简历预览</title>
</head>
<body>
  <jsp:include page="common/common_body.jsp"></jsp:include>
  
  <hr style="FILTER:alpha(opacity=100,finishopacity=0,style=3" width=80% color=black size=5>
  
   
  <div class="container-fluid" id="mainContainer">	
     <div class="row"> 
     <div class="col-md-12 col-sm-10 col-xs-9" style="position:absolute; float:left; display:inline;">
	     <div style="position:absolute;float:left; width:300px;">
	        <span class="glyphicon glyphicon-bookmark" aria-hidden="true" style="font-size:30px; color:black;"></span>
	        <span style="font:bold 30px '微软雅黑'"><strong>${resumeInfo.jobname}</strong></span>    
	     </div>
	     <div id="types" style="position:absolute; left:320px; float:left; width:300px;">
	        <c:if test= "${resumeInfo.jobtype==1}"> <span><strong>校园招聘
	        </strong></span></c:if>
	        <c:if test= "${resumeInfo.jobtype==2}"> <span><strong>社会招聘
	        </strong></span></c:if> 
	        <c:if test= "${resumeInfo.jobtype==3}"> <span><strong>实习生招聘 
	        </strong></span></c:if>  
	     </div> 
     </div>	      
	 <div class="col-md-12 col-sm-11 col-xs-10" style="top:50px;">
	     <div class="panel panel-default">
			  <div class="panel-heading" style="background-color:#f5f7fa">
			    <h3 class="panel-title">个人信息</h3>
			  </div>
			  <div class="panel-body" style="position:relative; height:auto">			   
			    <div class="col-md-3" style="float:left; display:inline; position:relative; left:20px;">
			      <div style="float:left">
			          <span><strong>姓名：</strong></span>
			      </div>
			      <div style="float:left">
			          <span>${resumeInfo.name }</span>
			      </div>
			    </div>
			    <div class="col-md-3" style="float:left; display:inline; position:relative; left:115px;">
			         <div style="float:left">
			           <span><strong>年龄：</strong></span>
			         </div>
			         <div style="float:left">
			           <span>${resumeInfo.age }</span>
			         </div>		         
			     </div> 
			     <div class="col-md-3" style="float:left; display:inline; position:relative; left:211px;">
			         <div style="float:left; ">
			           <span><strong>性别：</strong></span>
			         </div>
			         <div style="float:left">
			           <span>${resumeInfo.sex }</span>
			         </div> 		         
			     </div>
			     <div class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative; padding-top:20px;left:20px;">
			         <div style="float:left; ">
			           <span><strong>出生日期：</strong></span>
			         </div>
			         <div style="float:left">
			           <span>${resumeInfo.birthdate }</span>
			         </div> 		         
			      </div>
			      <div class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative;padding-top:20px;left:20px;">
			         <div style="float:left; ">
			           <span><strong>籍贯：</strong></span>
			         </div>
			         <div style="float:left">
			         	<c:if test="${resumeInfo.city=='市辖区'||resumeInfo.city=='县' }">
			         		<span>${resumeInfo.province } ${resumeInfo.area }</span>
			         	</c:if>	
			         	<c:if test="${resumeInfo.city!='市辖区' }">
			         		<span>${resumeInfo.province } ${resumeInfo.city } ${resumeInfo.area }</span>	
			         	</c:if>        				         			         				            
			         </div> 		         
			      </div>     
			       <div class="col-md-12" style="float:left; display:inline; position:relative; padding-top:20px;left:20px;">
			         <div style="float:left; ">
			           <span><strong>身份证：</strong></span>
			         </div>
			         <div style="float:left">
			           <span>${resumeInfo.id }</span>
			         </div> 		         
			       </div>
			       <div class="col-md-12" style="float:left; display:inline; position:relative; padding-top:20px;left:20px;">
			         <div style="float:left; ">
			           <span><strong>电话：</strong></span>
			         </div>
			         <div style="float:left">
			           <span>${resumeInfo.phone }</span>
			         </div> 		         
			       </div>
			       <div class="col-md-12" style="float:left; display:inline; position:relative;padding-top:20px;left:20px;">
			         <div style="float:left; ">
			           <span><strong>邮箱：</strong></span>
			         </div>
			         <div style="float:left">
			           <span>${resumeInfo.email }</span>
			         </div> 		         
			       </div>
			       <div class="col-md-12" style="float:left; display:inline; position:relative; padding-top:20px;left:20px;">
			         <div style="float:left; ">
			           <span><strong>地址：</strong></span>
			         </div>
			         <div style="float:left; ">
			           <span>${resumeInfo.address }</span>
			         </div>
			       </div>
			       <div class="col-md-12" style="float:left; display:inline; position:relative;padding-top:20px;left:20px;">
			         <div style="float:left; ">
			           <span><strong>奖励荣誉：</strong></span>
			         </div>
			        <div style="float:left; ;position:relative; ">
			           <textarea style="border:0px;" readonly rows="5" cols="50">${resumeInfo.awards }</textarea>
			         </div>
			       </div> 
			  </div>
		 </div>   
		 <div class="panel panel-default" style="position:relative; height:auto;">
			<div class="panel-heading" style="background-color:#f5f7fa">
			    <h3 class="panel-title">教育背景</h3>
			</div>
			 <c:forEach items="${educationExtend }" var="eduList">
			  <div class="panel-body" >
			    <div class="col-md-2 col-sm-2 col-xs-2" style="float:left;position:relative; display:inline;padding-top:20px;left:20px;">
			         <div style="float:left; ">
			           <span><strong>学历：</strong></span>
			         </div>
			         <div style="float:left; ">
			           <c:if test="${eduList.degree==1}">
			             <span>本科</span>
			           </c:if>		
			           <c:if test="${eduList.degree==2}">
			             <span>研究生</span>
			           </c:if>	 
			           <c:if test="${eduList.degree==3}">
			             <span>博士</span>
			           </c:if>			                     
			         </div>
			     </div>
			     <div class="col-md-4 col-sm-4 col-xs-4" style="float:left; display:inline; position:relative;padding-top:20px;left:20px;">
			         <div style="float:left; ">
			           <span><strong>学校：</strong></span>
			         </div>
			         <div style="float:left; ">
			           <span>${eduList.school }</span>
			         </div>
			     </div>		 
			     <div class="col-md-4 col-sm-4 col-xs-4" style="float:left; display:inline; position:relative;padding-top:20px;left:20px;">
			         <div style="float:left; ">
			           <span><strong>专业：</strong></span>
			         </div>
			         <div style="float:left; ">
			           <span>${eduList.major }</span>
			         </div>
			     </div>
			     <div class="ccol-md-2 col-sm-2 col-xs-2" style="float:left; display:inline; position:relative;padding-top:20px;left:20px;">
			         <div style="float:left; ">
			           <span><strong>排名：</strong></span>
			         </div>
			         <div style="float:left; ">
			           <span>${eduList.rank }</span>
			         </div>
			     </div>				  
			  </div>
			  </c:forEach>			
		 </div> 
		 <div class="panel panel-default" style="position:relative; height:auto;">
		      <div class="panel-heading" style="background-color:#f5f7fa">
			    <h3 class="panel-title">活动经历</h3>
			  </div>			  
			  <div class="panel-body">
			     <div class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative;padding-top:20px;left:20px;">			       			     	
			         <div style="float:left; ">
			           <span><strong>活动经历：</strong></span>
			         </div>
			         <div style="float:left;position:relative;">          
			           <textarea style="border:0px;" readonly rows="4" cols="65"><c:forEach items="${experienceExtend }" var="expList">${expList.experienceDescription }</c:forEach></textarea>          
			         </div>			       
			     </div>		     
			  </div>			  
		 </div>
		 <div class="panel panel-default" style="position:relative; height:auto;">
			  <div class="panel-heading" style="background-color:#f5f7fa">
			    <h3 class="panel-title">项目经历</h3>
			  </div>
			  <c:forEach items="${projectExtend }" var="proList">
			  <div class="panel-body">
			     <div class="col-md-12" style="float:left; display:inline; position:relative;padding-top:20px;left:20px;">
			         <div style="float:left; ">
			           <span><strong>项目名称：</strong></span>
			         </div>
			         <div style="float:left; left:100px;">
			           <span>${proList.projectsName }</span>
			         </div>
			     </div>
			     <div class="col-md-12" style="float:left; display:inline; position:relative;padding-top:20px;left:20px;">
			         <div style="float:left; ">
			           <span><strong>项目描述：</strong></span>
			         </div>
			         <div style="float:left;position:relative;">
			           <textarea style="border:0px;" readonly rows="4" cols="65">${proList.description }</textarea>
			         </div>
			     </div>		    
			  </div>
			  </c:forEach>
		 </div>
		 <c:if test="${flag}">		
			 <div class="col-md-offset-4 col-sm-offset-4 col-xs-offset-3">	       
			   <a href="download_successful?workplace=${resumeInfo.workplace}">
			     <button class="btn btn-default" type="button" name="download_resumetable"
			     style="font:bold 16px '黑体';height:35px;border-radius:0px;background-color:#eca614;color:white;border:none;width:200px;">
			               下载已上传简历
			     </button>
			   </a>	  			   
	         </div>
         </c:if>
         <c:if test="${!flag}">
         	<c:if test="${user.roleCode=='hr'}">
         		<input type="hidden" id="name" value="${resumeInfo.name}"><a id="downLoad" href="#">
         		<button class="btn btn-default" style="border-radius:0;background-color:#eca614;border:none;
         		color:white;font-family:'微软雅黑'">保存当前网页
         		</button></a>        		 
         	</c:if>        	
         </c:if>        
       	 <c:if test="${user.roleCode=='hr'}">
	       	 <div style="position:relative;top:20px;" class="col-md-offset-3 col-sm-offset-3 col-xs-offset-3">
	       	 	<c:if test="${resumeInfo.status=='简历投递成功'}">
		       	 	<span style="font:bold 15px '微软雅黑'">是否通过简历筛选：</span>
		         	<button onclick="pass('${resumeInfo.resumeId}','${user.roleCode }','通过简历筛选')" class="btn btn-default" 
		        		style="background-color:#5baffa;border:none;color:white;font-family:'微软雅黑'">
		        		<span style="font-size:17px;"class="glyphicon glyphicon-ok" aria-hidden="true"></span>
		        	</button>
		        	<button onclick="deny('${resumeInfo.resumeId}')" class="btn btn-default" 
		        		style="position:relative;left:30px;font-family:'微软雅黑'">
		        		<span style="font-size:17px;"class="glyphicon glyphicon-remove" aria-hidden="true"></span>
		        	</button>
	        	</c:if>
	        	<c:if test="${resumeInfo.status=='通过专业面试'}">
		       	 	<span style="font:bold 15px '微软雅黑'">是否通过综合面试：</span>
		         	<button onclick="pass('${resumeInfo.resumeId}','${user.roleCode }','通过综合面试')" class="btn btn-default" 
		        		style="background-color:#5baffa;border:none;color:white;font-family:'微软雅黑'">
		        		<span style="font-size:17px;"class="glyphicon glyphicon-ok" aria-hidden="true"></span>
		        	</button>
	        	
		        	<button onclick="deny('${resumeInfo.resumeId}')" class="btn btn-default" 
		        		style="position:relative;left:30px;font-family:'微软雅黑'">
		        		<span style="font-size:17px;"class="glyphicon glyphicon-remove" aria-hidden="true"></span>
		        	</button>	
	        	</c:if>	      	
	         </div>
          </c:if> 
          <c:if test="${user.roleCode=='interviewer'}">
       		<c:if test="${resumeInfo.status=='通过简历筛选'}">
          	<div style="position:relative;top:20px;" class="col-md-offset-3 col-sm-offset-3 col-xs-offset-3">
	       	 	<span style="font:bold 15px '微软雅黑'">是否通过专业面试：</span>
	         	<button onclick="pass('${resumeInfo.resumeId}','${user.roleCode }')" class="btn btn-default" 
	        		style="background-color:#5baffa;border:none;color:white;font-family:'微软雅黑'">
	        		<span style="font-size:17px;"class="glyphicon glyphicon-ok" aria-hidden="true"></span>
	        	</button>
	        	<button onclick="deny('${resumeInfo.resumeId}')" class="btn btn-default" 
	        		style="position:relative;left:30px;font-family:'微软雅黑'">
	        		<span style="font-size:17px;"class="glyphicon glyphicon-remove" aria-hidden="true"></span>
	        	</button>
	        </div>	
	        </c:if>
          </c:if>         	            
       </div>
    </div>        
</div>
	
  <jsp:include page="common/common_bottom.jsp"></jsp:include>
</body>
<script type="text/javascript" src="${webroot}/resource/js/fileControl.js"></script>
<script type="text/javascript" src="${webroot}/resource/js/preview.js"></script>
</html>