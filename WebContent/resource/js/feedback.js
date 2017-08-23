/**
 * created by Dylanwoo
 */

function onUpload(){	
	var feedbacktext = document.getElementById("inputContent").value;

	$.ajax({
		type : "POST",
		dataType : "json",
		url : "feedback",
		data : {
			text : feedbacktext
		},		
		success : function(data,status) {
			alert("提交成功");
			window.location.reload();
		},
		error : function(jqXHR,status){
			alert(jqXHR.responseText);
		}	
	})
	 
}


