<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<jsp:include page="common/common_header.jsp"></jsp:include>
	<link rel="stylesheet" href="${webroot }/resource/css/jobDescribtion.css">
<title>${jobinfo.name}</title>
</head>
<body>
  <jsp:include page="common/common_body.jsp"></jsp:include>
  <div id="outsideContent">
  <div class="container" id="mainContainer">
    <div class="row">
	    <div class="col-md-12 col-sm-10 col-xs-8" id="headTitle">
		     <div style="position:absolute;">
		        <span class="glyphicon glyphicon-bookmark" aria-hidden="true" style="font-size:30px; color:black;"></span>  
		        <span style="font:bold 28px '微软雅黑'"><strong>${jobinfo.name}</strong></span>  
		     </div>
		     <div style="position:absolute; left:320px;">
		        <span style="font-size:30px; color:#008B8B;"><strong>${jobinfo.address}</strong></span>
		     </div> 
		     <div style="position:absolute; top:20px;right:60px;">
		        <span>截止时间：</span>
		        <span>${jobinfo.endtime }</span>
		     </div>		      	    
		</div>	
		<h5 class="page-header"></h5>        
	    <div class="col-md-12" id="descibtionBody" style="position:relative">
	        <div style="position:absolute; left:50px;">
	           <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> 
	           <span style="font-size:20px;"><strong>岗位描述</strong></span>
	        </div>
	        <div id=label1 style="position:absolute; left:100px; top:30px; height:auto; right:250px;">         
	           <textarea id="content1" style="outline:none;border:0px; resize:none;" readonly  rows="5" cols="70">${jobinfo.jobDesc }</textarea>
	        </div>
	        <div id="label2" style="position:absolute; left:50px; ">
	           <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:20px;"><strong>岗位要求</strong></span>
	        </div>
	        <div id="label3" style="position:absolute; left:100px; height:auto; right:250px;">         
	            <textarea id="content2"  style="outline:none;border:0px; resize:none;" readonly  rows="5" cols="70">${jobinfo.jobRequire }</textarea>
	        </div>
	        <div  id="label4" style="position:absolute; left:50px;">
	           <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:20px;"><strong>学历要求：</strong></span>
	           <c:if test="${jobinfo.degree==1 }">
	             <span>本科及以上</span>
	           </c:if>
	           <c:if test="${jobinfo.degree==2 }">
	             <span>研究生及以上</span>
	           </c:if>
	           <c:if test="${jobinfo.degree==3 }">
	             <span>博士及以上</span>
	           </c:if>         
	        </div>
	        <div  id="label5" style="position:absolute; left:50px;">
	           <span class="glyphicon glyphicon-play" aria-hidden="true" style="color:black; font-size:20px;"></span> <span style="font-size:20px;"><strong>招聘人数：</strong></span>
	           <span>${jobinfo.num }</span>
	        </div>
	     </div>
       </div>
    </div>
	    <c:if test="${user.roleCode==null}">
	      <div class="col-md-offset-5 col-md-9 col-sm-offset-4 col-sm-6 col-xs-offset-3 col-xs-5" style="position:absolute; bottom:20px; ">       
	         <a style="">
	           <button style=" height:40px;width:250px; color:white;background-color:#eca614;
	              border:none; border-radius:0px;font:bold 18px '黑体'" type="button" class="btn btn-default"
	              onclick="isExist('${user.phoneNumber}','${jobinfo.id }','${jobinfo.type }')">申请岗位
	           </button>
	         </a>               
	      </div>
	    </c:if>
	 
  </div>
  <jsp:include page="common/common_bottom.jsp"></jsp:include> 
</body>
<script src="${webroot }/resource/js/jobDescribtion.js"></script>
</html>