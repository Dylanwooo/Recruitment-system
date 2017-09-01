

function searchSchool(sex,department,major,type,degree,start,end,job,status){
  var searchschool=$("#searchSchool").val();
  var url="resumeCenter?start="+start+"&end="+end+"&search="+searchschool+"&degree="+degree+"&type="+type+"&major="+major+"&department="+department+"&sex="+sex+"&job="+job+"&status="+status;
  window.location=url;
  searchschool=url=null;
}
function searchJob(sex,department,major,type,degree,start,end,school,status){		
	  var searchjob=$("#searchJob").val();
	  var url="resumeCenter?start="+start+"&end="+end+"&search="+school+"&degree="+degree+"&type="+type+"&major="+major+"&department="+department+"&sex="+sex+"&job="+searchjob+"&status="+status;
	  window.location=url;
	  searchjob=url=null;
	}
function select(sex,department,major,type,degree,search,start,end,job,status){	 	  
	  var url="resumeCenter?start="+start+"&end="+end+"&search="+search+"&degree="+degree+"&type="+type+"&major="+major+"&department="+department+"&sex="+sex+"&job="+job+"&status="+status;
	  window.location=url;
	  url=null;
	}
function searchtime(sex,department,major,type,degree,search,job,status){
	
	  var start=$("#startDate").val();
	  var end=$("#endDate").val();
	  var url="resumeCenter?start="+start+"&end="+end+"&search="+search+"&degree="+degree+"&type="+type+"&major="+major+"&department="+department+"&sex="+sex+"&job="+job+"&status="+status;
	  window.location=url;
	  start=end=url=null;
	}
//初始化表格
var $table = $('#resumeTable');
$table.bootstrapTable({	
	pagination: true,
	pageSize: 10,
	striped: true,
	width:1000,
	height:430,
	pageList: [10,25,50,100],
	singleSelect: false,
	search: false,
	clickToSelect: true,
  	onLoadSuccess: function(){
  		console.log("成功");
  	},
    onLoadError: function(){
    	console.log("失败");
    }		
});

	  
//复选框全选
$('#selectAll').click(function(){
	if(this.checked){
		$('.selectItem').prop("checked",true);
	}else{
		$('.selectItem').prop("checked",false);
	}
		
})
//删除简历
function delResume(id,ele){
		
    if(confirm('确认删除该记录？')){
    	$.ajax({
            type: "POST",
            dataType: "json",
            url: "deleteResume?id=" + id,
        })
    	window.location.reload();
    }
}



