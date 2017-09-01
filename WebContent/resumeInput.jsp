<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<jsp:include page="common/common_header.jsp"></jsp:include>
    <link rel="stylesheet" href="${webroot }/resource/css/resumeInput.css">
	<link rel="stylesheet" href="${webroot }/resource/css/jquery-ui-1.10.0.custom.css"> 
	<link rel="stylesheet" href="${webroot }/resource/css/bootstrap-datetimepicker.min.css"> 
	<link rel="stylesheet" href="${webroot }/resource/css/layui.css"> 
<title>简历填写</title>
</head>
<body>
  <jsp:include page="common/common_body.jsp"></jsp:include>
  <div class="container-fluid" id="mainContainer" >
	  
      <div class="row">	       	 	 		   		  	  
		<div class="col-md-12 col-sm-11 col-xs-10" >
			  <div style="position:absolute;top:-50px; float:left; margin: 0 auto;">	  	     
				 <span class="glyphicon glyphicon-bookmark" aria-hidden="true" 
				     style="font-size:3rem; color:black;" id="temper">  
				 </span>   
				 <span style="font:bold 2.8rem '微软雅黑'">${jobInfo.name}</span>  	         	    
			  </div>
	         <div class="panel-group"  id="accordion" >			   
			   <div class="panel panel-default">
			 	  <div class="panel-heading" role="tab" id="headingOne" style="background-color:#f5f7fa">
				     <h4 class="panel-title">
				       <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
				                  个人信息
				       </a>
				     </h4>
				  </div>
				   <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
				     <div class="panel-body" style="height:auto;">
				     	<div class="col-md-6" style="float:left; display:inline;position:relative;padding-top:15px;left:15px;">				     		
				     		<div style="float:left;">
				     			<span><span style="color:red">*</span><strong>姓名：</strong></span>
				     		</div>
				     		<div style="float:left">
				                <span id="name">${user.realName }</span>
				         	</div>	
				     	</div>
				     	<div class="col-md-6 col-sm-6 col-xs-6" style="float:left; display:inline; position:relative; padding-top:15px;left:15px;">
					        <div style="float:left">
					        	<span><span style="color:red">*</span><strong>年龄：</strong></span>
					        </div>
					        <div style="float:left">
					        	<input type="text" class="form-control" placeholder="请输入年龄" style="width:200px;" id="age" ">
					        </div>		         
				        </div>
				        <div class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative;padding-top:15px;left:15px;">
					        <div style="float:left; ">
					        	<span><span style="color:red">*</span><strong>性别：</strong></span>
					        </div>
					        <div style="float:left">
					        	<!-- <input type="text" class="form-control" placeholder="请输入性别" style="width:200px;" id="sex" > -->					        	
					        	<label>男 <input type="radio" value="男" name='sex's></label>					       
					        </div> 
					        <div style="float:left;position:relative; left:5px;">					        	
					        	<label>女 <input type="radio" value="女" name='sex'></label>
					        </div>		         
				        </div>  
				        <div class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative; padding-top:2rem;left:-13px;">
					        <div style="float:left; ">
					        	<span><span style="color:red">*</span><strong>出生日期：</strong></span>
					        </div>
					        <div style="float:left" class="layui-inline">		   
						       	<input id="birthDate" placeholder="选择日期" class="layui-input" 
						       	onclick="layui.laydate({elem:this, istime:true, format: 'YYYY-MM-DD'})"
						       >
					        </div> 		         
				        </div> 
				        <div class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative; padding-top:2rem;left:20px;">
					        <div style="float:left; ">
					        	<span><strong>电话：</strong></span>
					        </div>
					        <div style="float:left">
					       	    <span id="phoneNumber">${user.phoneNumber } </span>
					        </div> 		         
				        </div>
				        <div class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative; padding-top:2rem; left:20px;">
					        <div style="float:left; ">
					        	<span><strong>邮箱：</strong></span>
					        </div>
					        <div style="float:left">
					       		<span id=:email>${user.email }</span>
					        </div> 		         
				        </div>
				        <div class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative; padding-top:2rem; left:2px;">
					        <div style="float:left; ">
					        	<span><span style="color:red">*</span><strong>身份证：</strong></span>
					        </div>
					        <div style="float:left">
					        	<input type="text" class="form-control" placeholder="请输入身份证" style="width:200px;" id="idCard" >
					        </div> 		         
				        </div>
				        <div class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative; padding-top:2rem; left:15px;">
					        <div style="float:left; ">
					       		<span><span style="color:red">*</span><strong>籍贯：</strong></span>
					        </div>
					        <div style="float:left">	          
					            <select onchange="getHomeCity(this.value,'homeCity')" id="homePro">
					            	<option value="请选择">请选择</option>
					            <c:forEach items="${provinceList }" var="provinceList">
					           		<option value="${provinceList.provinceid }">${provinceList.province }</option>
					            </c:forEach> 
					            </select>
				            </div> 		         	                
				            <div style="float:left;">
					            <select id="homeCity" onchange="getHomeArea(this.value,'homeArea')">				          
					            </select>
				            </div>  
				            <div style="float:left;">
					            <select id="homeArea" >             
					            </select>
				            </div>  			                
				        </div>
				        <div class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative; padding-top:2rem; left:-8px;">
					        <div style="float:left; ">
					        	<span><strong>通讯地址：</strong></span>
					        </div>
					        <div style="float:left">
					        	<input type="text" class="form-control" placeholder="输入地址" style="width:200px;" id="address">
					        </div> 
				        </div>
				        <div class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative; padding-top:2rem; left:-8px;">
					        <div style="float:left; ">
					        	<span><strong>奖励荣誉：</strong></span>
					        </div>
					        <div style="float:left">	           
					        	<textarea style="width:350px;height:130px;border:1 solid #888888;resize:none;" id="awards" ></textarea>
					        </div> 
				        </div>
				     </div>
				   </div>
			 </div>
			 <div class="panel panel-default">
			     <div class="panel-heading" role="tab" id="headingTwo" style="background-color:#f5f7fa">
			        <h4 class="panel-title">
			          <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
			                            教育背景
			          </a>
			          <button class="btn btn-default"type="button" style="position:relative;left:500px;" id="addEduButton1" >
			             <span class="glyphicon glyphicon-plus">添加教育背景</span>
			          </button>
			        </h4>
			     </div>
			     <div id="collapseTwo" class="panel-collapse collapse in">
			     	<div class="panel-body" style="height:auto">
			     		<div id="place1" class="col-md-12 col-sm-12 col-xs-12" style="float:left;display:inline; position:relative; left:15px;">
			     			<div style="float:left; ">
			     				<span><span style="color:red">*</span><strong>地区：</strong></span>
			     			</div>
			     			<div class="pro1" style="float:left; ">
			     				 <select onchange="getCity(this.value)" >
			     				 	<option value="请选择">请选择</option>
						            <c:forEach items="${provinceList }" var="provinceList">
						            	<option value="${provinceList.provinceid }">${provinceList.province }</option>
						            </c:forEach> 
			     				 </select>
			     			</div>
			     			<div class="city1" style="float:left;">
			           			<select >           
			           			</select>
			         		</div> 
			         
			     		</div>
			     		<div id="inputTime1" class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative; padding-top:2rem;left:-13px;">
				            <div style="float:left; ">
				            	<span><span style="color:red">*</span><strong>入学时间：</strong></span>
				            </div>
				            <div class="input1" style="float:left">
				            	<input placeholder="选择日期" class="layui-input" onclick="layui.laydate({elem:this, istime:true, format: 'YYYY-MM-DD'})">		          
				            </div>				         
				            <div style="float:left; ">
				            	<span><span style="color:red">*</span><strong>毕业时间：</strong></span>
				            </div>
				            <div class="input2" style="float:left">
				            	<input placeholder="选择日期" class="layui-input" onclick="layui.laydate({elem:this, istime:true, format: 'YYYY-MM-DD'})">		          		           		           
				            </div>
			            </div>
			            <div id="inputDegree" class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative; padding-top:2rem; left:15px;">
				            <div style="float:left; ">
				            	<span><span style="color:red">*</span><strong>学历：</strong></span>
				            </div>
				            <div style="float:left">
					            <select>
						            <option>本科</option>
						            <option>硕士</option>
						            <option>博士</option>
					            </select>
				            </div> 		         
			            </div>
			            <div id="schoolInput" class="col-md-12 col-sm-12 col-xs-12" style="float:left; display:inline; position:relative; padding-top:2rem; left:15px;">
				            <div style="float:left; ">
				            	<span><span style="color:red">*</span><strong>学校：</strong></span>
				            </div>
				            <div style="float:left">
				            	<input type="text" class="form-control" style="width:200px;">
				            </div> 		         
			            </div>
			            <div id="majorInput" class="col-md-12 col-sm-12 col-xs-12"style="float:left; display:inline; position:relative; padding-top:2rem; left:15px;">
				            <div style="float:left; ">
				            	<span><span style="color:red">*</span><strong>专业：</strong></span>
				            </div>
				            <div style="float:left">
				            	<input type="text" class="form-control" style="width:200px;">
				            </div> 		         
			            </div>
			            <div id="rankInput" class="col-md-12 col-sm-12 col-xs-12"style="float:left; display:inline; position:relative; padding-top:2rem; left:20px;">
				            <div style="float:left; ">
				            	<span><strong>排名：</strong></span>
				            </div>
				            <div style="float:left">
					            <select>
						            <option>前10%</option>
						            <option>前20%</option>
						            <option>前50%</option>
					            </select>
				            </div> 				         
			            </div>
			            <div id="languageInput" class="col-md-6 col-sm-6 col-xs-6"style="float:left; display:inline; position:relative; padding-top:2rem;left:-8px;">
				            <div style="float:left">
				            	<span><strong>语言类别：</strong></span>
				            </div>
				            <div style="float:left">
				            	<input type="text" class="form-control" placeholder="请输入语言" style="width:200px;" id="languageType">
				            </div>		         
			            </div>
			            <div id="profiInput" class="col-md-6 col-sm-6 col-xs-6"style="float:left; display:inline; position:relative;padding-top:2rem;">
				            <div style="float:left">
				            	<span><strong>熟悉程度：</strong></span>
				            </div>
				            <div style="float:left">
					            <select>
						             <option>一般</option>
						             <option>熟练</option>
						             <option>精通</option>
					            </select>
				            </div>		         
			            </div>
			            <div class="col-md-12 col-sm-12 col-xs-12"style="float:left; display:inline; position:relative; padding-top:2rem;">
			            	  <button style="border-radius:0;"id="delEdu" type="button" class="btn btn-default" onclick="delEdu()">删除教育背景</button>  	            	  
			            </div> 
			     	</div>					          			   	 
			     </div>
			 </div>
			 
			 <div class="panel panel-default">
			   <div class="panel-heading" role="tab" id="headingFive" style="background-color:#f5f7fa">
			     <h4 class="panel-title">
			       <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseFive" aria-expanded="false" aria-controls="collapseThree">
			                   校内活动
			       </a>
			     </h4>
			   </div>
			   <div id="collapseFive" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingFive">
			     <div class="panel-body" style="position: relative">
			     	<div class="col-md-12 col-sm-12 col-xs-12"style="float:left; display:inline; position:relative; left:-8px;">
			            <div style="float:left; ">
			            	<span><strong>活动经历：</strong></span>
			            </div>
			            <div style="float:left">		           
			            	<textarea style="width:350px;height:130px;border:1 solid #888888;resize:none;" id="experienceDescription"></textarea>
			            </div> 
			        </div>
			     </div>
			   </div>
			 </div>
			 <div class="panel panel-default">
				 <div class="panel-heading" role="tab" id="headingThree" style="background-color:#f5f7fa">
					 <h4 class="panel-title">
					 	<a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
					   	 项目经历
						 </a>
						 <button class="btn btn-default"style="position:relative;left:500px;"type="button" id="addProButton1" >
			          	 		<span class="glyphicon glyphicon-plus">添加项目经历</span>
			          	 </button>
					 </h4>
				 </div>
				 <div id="collapseThree" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingThree">
					 <div class="panel-body" style="position: relative">
						 <div id="proName" class="col-md-12 col-sm-12 col-xs-12"style="float:left; display:inline; position:relative; left:20px;">
					         <div style="float:left; ">
					         	<span><strong>项目名称：</strong></span>
					         </div>
					         <div style="float:left">
					         	<input type="text" class="form-control" placeholder="项目名称"  style="width:200px;">
					         </div>		        
				         </div>
				         <div id="period" class="col-md-12 col-sm-12 col-xs-12"style="float:left; display:inline; position:relative;padding-top:2rem; left:20px;">
				             <div style="float:left; ">
				             	<span><strong>持续时段：</strong></span>
				             </div>
				             <div style="float:left">
				             	<input type="text" class="form-control" placeholder="选择日期"  style="width:200px;">		            
				             </div>	       
			             </div>	
			             <div id="roleInput" class="col-md-12 col-sm-12 col-xs-12"style="float:left; display:inline; position:relative; padding-top:2rem; left:20px;">
				             <div style="float:left; ">
				             	<span><strong>担任角色：</strong></span>
				             </div>
				             <div style="float:left">
				             	<input type="text" class="form-control" style="width:200px;" >		            
				             </div>	       
			             </div>
			             <div id="descInput" class="col-md-12 col-sm-12 col-xs-12"style="float:left; display:inline; position:relative; padding-top:2rem; left:20px;">
				             <div style="float:left; ">
				             	<span><strong>项目描述：</strong></span>
				             </div>
				             <div style="float:left">			           	            
				             	<textarea style="width:350px;height:130px;border:1 solid #888888;resize:none;"></textarea>
				             </div>	       
			             </div>
			             <div class="col-md-12 col-sm-12 col-xs-12"style="float:left; display:inline; position:relative; padding-top:2rem; ">
			          	 	<button id="delPro" type="button" style="border-radius:0px;" class="btn btn-default" onclick="delPro()" >
			            		删除项目经历
			            	</button>      
			             </div>      
					 </div>
				 </div>
			 </div>
			 <div class="panel panel-default">
			    <div class="panel-heading" role="tab" id="headingFour" style="background-color:#f5f7fa">
			     <h4 class="panel-title">
			       <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
			                 附件上传
			       </a>
			     </h4>
			   </div>			   
			   <div id="collapseFour" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingFour">
			   		<div class="panel-body" style="position: relative">
			     	  <div class="col-md-12 col-sm-12 col-xs-12"style="float:left; display:inline; position:relative; left:20px;">			     	
				        <form action="fileUpload" method="post" enctype="multipart/form-data" id="upload">
				     		<input type="file" name = "file" onchange="fileControl(this)">
						
						    <input type="hidden" name="username" value="${user.userName }">
					    </form>
				  	  </div>
				  	  <div style="position:absolute; right:50px;">
				          <button type="button" class="btn btn-primary" style="border-radius:0;border:none;color:white;background-color:#eca614;width:120px;"
				          onclick="inputResume('${user.email }','${user.phoneNumber }', 
				          '${jobInfo.name }','${jobInfo.type}','${jobInfo.majorName }')" style="font:bold 18px '幼圆';">提交</button>		         
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
    <script type="text/javascript" src="${webroot}/resource/lay/dest/layui.all.js"></script>
	<script type="text/javascript" src="${webroot}/resource/lay/modules/laydate.js"></script>
	<script type="text/javascript" src="${webroot}/resource/js/resumeInput.js"></script>
	<script type="text/javascript" src="${webroot}/resource/js/fileControl.js"></script>
</html>