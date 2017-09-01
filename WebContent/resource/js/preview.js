/**
 * 简历预览 */

function pass(id,role,status){
	
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "pass",
		data : {
			id :id,	
			role:role,
			status:status
		},
		success : function(info,status) {
			alert(info);		
		}
	})
	
}
function deny(id){
	
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "deny",
		data : {
			id :id	
		},
		success : function(info,status) {
			alert(info);		
		}
	})
	
}