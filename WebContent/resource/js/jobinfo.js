var $table = $('#jobInfoTable');
$table.bootstrapTable({	
	pagination: true,
	pageSize: 10,
	striped: true,
	width:800,
	height:400,
	pageList: [10,25,50,100],
	singleSelect: false,
	search: false,
	clickToSelect: true,		
});
$('#addMajor').bind('keypress',function(e){
	if(e.keyCode==13){
		addMajor();
	}
})

$('#searchJob').bind('keypress',function(e){
	if(e.keyCode==13){
		searchjob(type);
	}
})

function selectmajor(major,type)
{
		 $.ajax({
				type : "POST",
				dataType : "json",
				url : "jobinfoselect",
				data : {
					major:major,
					type:type
				},		
				success : function(data,status) {			
					console.log(data);		
						    
				},
				error: function(){
					alert("查询失败")
				}
			})
			
}


function searchjob(type){	
  var search=document.getElementById("searchJob").value;
  var url="jobinfo?search="+search+"&type="+type;
  window.location=url;
  search=url=null;
}


function updatejobinfo() {	
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "updatejobinfo",
		data : {
			id:tempid,
			jobdesc : $("#updatejobdesc").val(),
			jobrequire : $("#updatejobrequire").val(),
			degree : $("#updatedegreerequire").val(),
			number: $("#number").val(),
			endtime:$("#time").val(),	
			hot:$("#heat").val(),
			majorName:$("#updateMajorName").val()
		},		
		success : function(data,status) {
			alert("修改成功");
			window.location.reload();
		}
	})	
}

var tempid

$('#modifyModal').on('show.bs.modal', function (event) {
	var button = $(event.relatedTarget) 
	var jobDesc = button.data('jobdesc') 
	var jobRequire = button.data('jobrequire')
	var num=button.data('num')
	var time=button.data('time')
	var heat=button.data('hot')
	var id=button.data('id')
	var major=button.data('major')
	var modal = $(this)
	modal.find('.modal-body #updatejobdesc').val(jobDesc)
	modal.find('.modal-body #updatejobrequire').val(jobRequire)
	modal.find('.modal-body #number').val(num)
	modal.find('.modal-body #time').val(time)
	modal.find('.modal-body #heat').val(heat)
	modal.find('.modal-body #updateMajorName').val(major)
	tempid=id	
	//解除引用
	button=jobDesc=jobRequire=num=time=id=null;
})

function publishJob(type){
	$.ajax({
		type : "POST",
		dateType : "json",
		url : "publishJob",
		data : {
			jobName : $("#jobName").val(),
			major : $("#major").val(),
			publishTime : $("#publishTime").val(),
			jobDesc : $("#jobDesc").val(),
			jobRequire : $("#jobRequire").val(),
			degreeRequire : $("#degreeRequire").val(),
			endTime : $("#endTime").val(),
			recuitNum : $("#recuitNum").val(),
			departmentid:$("#departmentSelect").val(),
			hot:$("#pubhot").val(),
			type : type
		},
		success : function(data,status){
			alert("发布成功");
			window.location.reload();
		},
		error : function(jqXHR,data,status){
			alert(jqXHR.responseText);
		}	
	})
}
function tempJob(type){
	$.ajax({
		type : "POST",
		dateType : "json",
		url : "tempJob",
		data : {
			jobName : $("#jobName").val(),
			major : $("#major").val(),
			publishTime : $("#publishTime").val(),
			jobDesc : $("#jobDesc").val(),
			jobRequire : $("#jobRequire").val(),
			degreeRequire : $("#degreeRequire").val(),
			endTime : $("#endTime").val(),
			departmentid:$("#departmentSelect").val(),
			recuitNum : $("#recuitNum").val(),
			hot:$("#pubhot").val(),
			type : type
		},
		success : function(data,status){
			alert("暂存成功");
			window.location.reload();
		}	
	})	
}

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
/*彻底删除岗位*/
function deletehrJob(id,ele){	
	var msg = "确定要彻底删除岗位吗？"
		if(confirm(msg)==true){
	$.ajax({
		
		type: "GET",
		dataType:"json",
		url:"deletehrJob?id="+ id,
	})
	 $(ele).parentsUntil("tbody").remove();
		}
}

//添加专业信息
function addMajor(){
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "addMajor",
		data : {
			majorName : $("#addMajor").val(),
		},
		success : function(){		
				alert("添加成功!");
				window.location.reload();						
		},
		error: function(jqXHR,data,status){
			alert(jqXHR.responseText);
		}
	})
}
//删除专业信息
function deleteMajor(){
var msg = "确定要删除此专业吗？同时删除的还有此专业下的岗位信息"
	if(confirm(msg)==true){
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "deleteMajor",
		data : {
			majorId : $("#deleteMajor").val(),
		},
		success : function(data,status){
			alert("删除成功!");
			window.location.reload();
		}
	})
	}
}





	

