/**
 * by Dylanwoo 2017/8/25
 */
var $table2 = $('#scheduleTable');
$table2.bootstrapTable({	
	pagination: true,
	pageSize: 8,
	striped: true,
	width:600,
	height:400,
	pageList:[8,16],
	singleSelect: false,
	search: false,
	clickToSelect: true,	
	formatNoMatches: function(){
		
	}
});
//添加行程
function addSchedule(){
		
	var parentDom = $('#downContent');
	var tabBody = document.getElementById('tbContent');
	var tbody = document.getElementById("tbContent");
	var row = document.createElement('tr');
	
	var dateCell = document.createElement('td');
	dateCell.innerHTML = $('#dateCell').val();
	if(dateCell.innerHTML!='')
		row.appendChild(dateCell);
	else{
		alert("请输入日期");
		return false
	}
				
	var timeCell = document.createElement('td');
	timeCell.innerHTML = $('#timeCell').val();
	if(timeCell.innerHTML!='')
		row.appendChild(timeCell);
	else{
		alert("请输入时间");
		return false
	}
			
	var schoolCell = document.createElement('td');
	schoolCell.innerHTML = $('#schoolCell').val();
	if(schoolCell.innerHTML!='')
		row.appendChild(schoolCell);
	else{
		alert("请输入学校");
		return false
	}
				
	var placeCell = document.createElement('td');
	placeCell.innerHTML = $('#placeCell').val();
	if(placeCell.innerHTML!='')
		row.appendChild(placeCell);
	else{
		alert("请输入地点");
		return false
	}
	
	tabBody.appendChild(row);	
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "addSchedule",
		data : {
			date : $("#dateCell").val(),
			time : $("#timeCell").val(),
			school : $("#schoolCell").val(),
			place : $("#placeCell").val(),	
		},
		success : function(data,status){
			window.location.reload();
		}
	})
	
}

//删除行程
function delSchedule(id,ele){
	$.ajax({
        type: "GET",
        dataType: "json",
        url: "delSchedule?id=" + id,
    })
	if(confirm('确认删除该记录？')){
		$(ele).parentsUntil("tbody").remove();
	}
}
//修改行程
function updateProcess() {
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "updateProcess",
		data : {
			time : $("#updatetime").val(),
			date : $("#updatedate").val(),
			place : $("#updateplace").val(),
			school : $("#updateschool").val(),
			id: temp
		},		
		success : function(data, status) {
			alert("修改成功");
			window.location.reload();
		}
	})	
}
var temp;
$('#modifyModal').on('show.bs.modal', function (event) {
	var button = $(event.relatedTarget) 
	var id = button.data('id') 
	var date = button.data('date') 
	var time= button.data('time')
	var school = button.data('school') 
	var place = button.data('place')
	var modal = $(this)
	modal.find('.modal-body #updatedate').val(date)
	modal.find('.modal-body #updatetime').val(time)
	modal.find('.modal-body #updateschool').val(school)
	modal.find('.modal-body #updateplace').val(place)
	temp = id;	
	})
