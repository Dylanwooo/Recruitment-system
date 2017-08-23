
setTimeout(function(){
	try{
		document.getElementById('username').focus();
	}catch(e){}
},200);

function addUser() {
	//获取下拉列表的值
 	var obj = document.getElementById("select");
 	var code = obj[obj.value].text;
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "addUser",
		data : {
			username : $("#username").val(),
			password : $("#password").val(),
			realname : $("#realname").val(),
			roleCode : code
		},
		success : function(status) {
			alert("添加成功");
			window.location.reload();
		}
		
	})
}

function registeUser() {	
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "registeUser",
		data : {
			username : $("#username").val(),
			password : $("#password").val(),
			password2 : $("#password2").val(),
			realname : $("#realname").val(),
			phonenumber : $("#phonenumber").val(),
			email : $("#email").val()
		},
		success : function(data, status) {
			alert("注册成功");		
			self.location="index.jsp";
		},
		error : function(jqXHR,data,status){
			alert(jqXHR.responseText);
		}
	})
	//正则验证邮箱
	var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$");
	var obj = document.getElementById("email");
	if(obj.value===""){
		alert("邮箱不能为空");
		return false;
	}
	else if(!reg.test(obj.value)){
		alert("请输入正确格式邮箱!");
		return false;
	}
	else{
		return true;
	}	
	//正则验证手机号,以1开头
	var regNum = /^1\d{10}$/;
	var num = document.getElementById("phonenumber");
	if(regNum.test(num.value)){
		return true;
	}
	else
		alert("手机号格式错误!");
}

function misRegisteUser() {	
	window.location.href="index.jsp";
}



function updateUser() {

	var obj = document.getElementById("select2");
	var updateroleCode = obj[obj.value].text;
	alert(updateroleCode);
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "updateUser",
		data : {
			username : $("#updateusername").val(),
			password : $("#updatepassword").val(),
			realname : $("#updaterealname").val(),
			roleCode : updateroleCode,
			id: temp
		},		
		success : function(data, status) {
			alert("修改成功");
			window.location.reload();
		}
	})
	
}

function deleteUser( id, ele){
    $.ajax({
        type: "GET",
        dataType: "json",
        url: "deleteUser?id=" + id,
    })
    $(ele).parentsUntil("tbody").remove();
}
var temp;
$('#updateUserModal').on('show.bs.modal', function (event) {
	var button = $(event.relatedTarget) 
	var id = button.data('id') 
	var username = button.data('username') 
	var password = button.data('password')
	var realname = button.data('realname') 
	var rolecode = button.data('rolecode')
	var modal = $(this)
	modal.find('.modal-body #updateusername').val(username)
	modal.find('.modal-body #updatepassword').val(password)
	modal.find('.modal-body #updaterealname').val(realname)
	modal.find('.modal-body #updateroleCode').val(rolecode)
	temp = id;	
	})