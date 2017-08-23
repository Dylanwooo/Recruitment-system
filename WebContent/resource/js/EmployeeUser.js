/**
 *  应聘者增删改查
 */

function updateEmployee() {
	
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "updateEmployee",
		data : {
			username : $("#updateusername").val(),
			password : $("#updatepassword").val(),
			realname : $("#updaterealname").val(),
			phone:$("#updatephone").val(),
			email:$("#updateemail").val(),		
			id: temp
		},		
		success : function(data,status) {
			alert("修改成功");
			window.location.reload();
		}
	})	
}
var temp;

$('#updateUserModal').on('show.bs.modal', function (event) {
	
	var button = $(event.relatedTarget) 
	var id = button.data('id') 
	var username = button.data('username') 
	var password = button.data('password')
	var realname = button.data('realname') 
	var sex=button.data('sex')
	var phone=button.data('phone')
	var idcardnumber=button.data('idcardnumber')
	var address=button.data('address')
	var email=button.data('email')
	var modal = $(this)
	modal.find('.modal-body #updateusername').val(username)
	modal.find('.modal-body #updatepassword').val(password)
	modal.find('.modal-body #updaterealname').val(realname)
	modal.find('.modal-body #updatephone').val(phone)
	modal.find('.modal-body #updateemail').val(email)
	temp = id;
	})
	


		
