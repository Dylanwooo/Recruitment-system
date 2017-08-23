 //控制各个标签间的间隔
 var height = document.getElementById("content1").offsetHeight;
 var height2 = document.getElementById("content2").offsetHeight; 
 var top1 = document.getElementById("label1").offsetTop;
 document.getElementById("label2").style.top = height+top1+20+'px'; 
 var top2 = document.getElementById("label2").offsetTop;
 document.getElementById("label3").style.top = top2+30+'px';
 document.getElementById("label4").style.top = document.getElementById("label2").offsetTop+height2+50+'px';
 document.getElementById("label5").style.top = document.getElementById("label4").offsetTop+40+'px';
 


 function isExist(userPhone,jobId,type){
	 var url="resumeInput?id="+jobId+"&type="+type;
	 $.ajax({
		 type : "POST",
		 dataType : "json",
		 url : "isExist",
		 data : {
			 phone : userPhone,
		 },
		success : function(data,status) {
			window.location = url;
		},
		error : function(jqXHR,data,status){
			alert(jqXHR.responseText);
		}
	 })
 }