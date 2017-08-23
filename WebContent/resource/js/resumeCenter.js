function searchSchool(sex,department,major,type,degree,start,end){
	
 // var search=document.getElementById("searchSchool").value;
  var searchschool=$("#searchSchool").val();
 var url="resumeCenter?start="+start+"&end="+end+"&search="+searchschool+"&degree="+degree+"&type="+type+"&major="+major+"&department="+department+"&sex="+sex;
  window.location=url;
}
function select(sex,department,major,type,degree,search,start,end){	 
	  var url="resumeCenter?start="+start+"&end="+end+"&search="+search+"&degree="+degree+"&type="+type+"&major="+major+"&department="+department+"&sex="+sex;
	  window.location=url;
	}
function searchtime(sex,department,major,type,degree,search){
	  var start=$("#startDate").val();
	  var end=$("#endDate").val();
	  var url="resumeCenter?start="+start+"&end="+end+"&search="+search+"&degree="+degree+"&type="+type+"&major="+major+"&department="+department+"&sex="+sex;
	  window.location=url;
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
	  
 //复选框全选功能
 function checkAll(obj){
	 var collid = document.getElementById('all');
	 var coll = document.getElementsByName(obj)
	 if(collid.checked){
		 for(var i=0;i<coll.length;i++){
			 coll[i].checked = true;
		 }
	 }else{
		 for(var i=0;i<coll.length;i++){
			 coll[i].checked = false;
		 }
	 }
 }




