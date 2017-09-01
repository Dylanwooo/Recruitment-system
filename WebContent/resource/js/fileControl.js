/**
 * 文件格式控制
 * 
 * 上传控制
 */
function fileControl(target){
	var name = target.value;
	var filename = name.substring(name.lastIndexOf(".")+1).toLowerCase();
	if(filename != "pdf"&&filename != "doc"&&filename != "docx"){
		alert("仅支持pdf,doc,docx文件。");
		target.value="";
		return ;
	}
	
	name=filename=null;
}

/**
 * 保存网页到本地
 * @param obj
 */
function fake_click(obj){
	var ev = document.createEvent("MouseEvents");
	ev.initMouseEvent(
			"click",true,false,window,0,0,0,0,0
			,false,false,false,false,0,null
			);
	obj.dispatchEvent(ev);
	
	ev=null;
}
function export_raw(name,data){
	var urlObject = window.URL||window.webkitURL||window;
	var export_blob = new Blob([data]);
	
	var save_link = document.createElementNS("http://www.w3.org/1999/xhtml","a");
	save_link.href = urlObject.createObjectURL(export_blob);
	save_link.download = name;
	fake_click(save_link);
	
	urlObject=export_blob=null;
}

var test = document.getElementsByTagName('html')[0].outerHTML;

$("#downLoad").click(function(){
	var name = document.getElementById("name").value;
	var filename = name + "简历表.html";
	export_raw(filename,test)
	name=filename=null;
})
