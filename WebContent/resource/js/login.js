/**
 *  by Dylanwoo 2017.8.21
 */

(function(){		
	if(window.localStorage.getItem("username")!=null){
		document.getElementById('username').value=window.localStorage.getItem("username");
	}
	
	setTimeout(function(){
		try{
			document.getElementById('password').focus();
		}catch(e){}
	},200); 
})()


function setLocalStorage(){
	var username = document.getElementById('username').value;
	window.localStorage.key="username";
	window.localStorage.setItem("username",username);
}
