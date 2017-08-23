/**
 * 删除岗位信息存到已删除 */

function deleteJob(id,ele){
	
	var msg = "确定要删除岗位吗？你可以在已过期岗位中查询被删除的岗位"
		if(confirm(msg)==true){
			$.ajax({
				
				type: "GET",
				dataType:"json",
				url:"deleteJob?id="+ id,
			})
			 $(ele).parentsUntil("tbody").remove();
		}
	
	
}