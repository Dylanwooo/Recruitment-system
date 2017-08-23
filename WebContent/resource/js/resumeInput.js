var addEdu = 1;
var addPro = 1;

//扩展的阈值为3
var Threshold = 3;
var i = 1;
var j = 1;
var len = 1;

function delEdu(){
	$('#delEdu').parent().parent().remove();
	i--;
}
function delPro(){
	$('#delPro').parent().parent().remove();
	j--;
}

//输入框自动聚焦
setTimeout(function(){
	try{
		document.getElementById('age').focus();	
	}catch(e){}
},200);

$(document).ready = $(function(){
	var parentDom = $('#collapseTwo'),
	    oriDom = parentDom.children(":first");
	var parentDom2 = $('#collapseThree'),
	    oriDom2 = parentDom2.children(":first");
	oriDom.children("#inputTime1").find(".input1").find("input").attr('id','startDate'+0);
	oriDom.children("#inputTime1").find(".input2").find("input").attr('id','graduateDate'+0);
	oriDom.children("#place1").find(".pro1").find("select").attr('id','schoolPro'+0);
	oriDom.children("#place1").find(".city1").find("select").attr('id','schoolCity'+0);
	oriDom.children("#inputDegree").find("select").attr('id','degree'+0);
	oriDom.children("#schoolInput").find("input").attr('id','school'+0);
	oriDom.children("#majorInput").find("input").attr('id','major'+0);
	oriDom.children("#rankInput").find("select").attr('id','rank'+0);
	oriDom.children("#languageInput").find("input").attr('id','languageType'+0);
	oriDom.children("#profiInput").find("select").attr('id','proficiency'+0);
	
	oriDom2.children('#proName').find('input').attr('id','projectName'+0);
	oriDom2.children('#period').find('input').attr('id','time'+0);
	oriDom2.children('#roleInput').find('input').attr('id','role'+0);
	oriDom2.children('#descInput').find('textarea').attr('id','projectDescription'+0);
	
	$('.addEduButton1').click(function(){
		var length = parentDom.children().length;
		addEdu++
		if(Threshold>length&&i<=length){															
			var nowDom = oriDom.clone();
			//设置新创建元素的id
			nowDom.children("#inputTime1").find(".input1").find("input").attr('id','startDate'+i);
			nowDom.children("#inputTime1").find(".input2").find("input").attr('id','graduateDate'+i);
			nowDom.children("#place1").find(".pro1").find("select").attr('id','schoolPro'+i);
			nowDom.children("#place1").find(".city1").find("select").attr('id','schoolCity'+i);
			nowDom.children("#inputDegree").find("select").attr('id','degree'+i);
			nowDom.children("#schoolInput").find("input").attr('id','school'+i);
			nowDom.children("#majorInput").find("input").attr('id','major'+i);
			nowDom.children("#rankInput").find("select").attr('id','rank'+i);
			nowDom.children("#languageInput").find("input").attr('id','languageType'+i);
			nowDom.children("#profiInput").find("select").attr('id','proficiency'+i);
			//将复制的元素内容清空
			nowDom.find("input").each(function(i){
				$(this).val("");
			});
			nowDom.find("select").each(function(i){
				$(this).val("");
			});
			parentDom.append(nowDom);
			i++;
		}
		else{
			alert("最多添加三个教育经历！");
			return false
		}		
	})
	
	$('.addProButton1').click(function(){
		var length2 = parentDom2.children().length;
		addPro++
		if(Threshold>length2&&j<=length2){	
			var nowDom2 = oriDom2.clone();
			nowDom2.children('#proName').find('input').attr('id','projectName'+j);
			nowDom2.children('#period').find('input').attr('id','time'+j);
			nowDom2.children('#roleInput').find('input').attr('id','role'+j);
			nowDom2.children('#descInput').find('textarea').attr('id','projectDescription'+j);
			//将复制的元素内容清空
			nowDom2.find("input").each(function(i){
				$(this).val("");
			});
			nowDom2.find("textarea").each(function(i){
				$(this).val("");
			})
			parentDom2.append(nowDom2);
			j++;
		}
		else{
			alert("最多添加三个项目经历！");
			return false
		}
		
	})
})

function getHomeCity(provinceId,selectId){
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "getCity",
		data : {
			id : provinceId,
		},
	success : function (response){
		var arr = null;
		var temp="";
		
		arr = eval(response);
		for(var i in arr){
			temp += "<option value='" + arr[i].city +"'>";
			temp += arr[i].city;
			temp += "</option>";
		}
		$("#"+selectId).html(temp);
	}
	})
}


function getCity(provinceId){
	var schoolId = "schoolCity" + (addEdu - 1)
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "getCity",
		data : {
			id : provinceId,
		},
	success : function (response){
		var arr = null;
		var temp="";
		
		arr = eval(response);
		for(var i in arr){
			temp += "<option value='" + arr[i].city +"'>";
			temp += arr[i].city;
			temp += "</option>";
		}
		$("#"+schoolId).html(temp);
	}
	})
}

function inputResume(userEmail,userPhoneNumber,jobName,jobType,majorname) {
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "resumeInputer",
		data : {
		//个人信息	
			name : $("#name").html(),
			age : $("#age").val(),
			sex : $("#sex").val(),
			birthDate : $("#birthDate").val(),
			phoneNumber : userPhoneNumber,
			email : userEmail,
			idCard : $("#idCard").val(),
			address : $("#address").val(),
			awards : $("#awards").val(),
			homePro : $("#homePro").val(),
			homeCity : $("#homeCity").val(),
		//教育经历表1	
			startDate : $("#startDate0").val(),
			graduateDate : $("#graduateDate0").val(),
			degree : $("#degree0").val(),
			school : $("#school0").val(),
			major : $("#major0").val(),
			rank : $("#rank0").val(),
			languageType : $("#languageType0").val(),
			proficiency : $("#proficiency0").val(),
			schoolPro : $("#schoolPro0").val(),
			schoolCity : $("#schoolCity0").val(),
			
			startDate1 : $("#startDate1").val(),
			graduateDate1 : $("#graduateDate1").val(),
			degree1 : $("#degree1").val(),
			school1 : $("#school1").val(),
			major1 : $("#major1").val(),
			rank1 : $("#rank1").val(),
			languageType1 : $("#languageType1").val(),
			proficiency1 : $("#proficiency1").val(),
			experienceDescription1 : $("#experienceDescription1").val(),
			schoolPro1 : $("#schoolPro1").val(),
			schoolCity1 : $("#schoolCity1").val(),
			
			startDate2 : $("#startDate2").val(),
			graduateDate2 : $("#graduateDate2").val(),
			degree2 : $("#degree2").val(),
			school2 : $("#school2").val(),
			major2 : $("#major2").val(),
			rank2 : $("#rank2").val(),
			languageType2 : $("#languageType2").val(),
			proficiency2 : $("#proficiency2").val(),
			experienceDescription2 : $("#experienceDescription2").val(),
			schoolPro2 : $("#schoolPro2").val(),
			schoolCity2 : $("#schoolCity2").val(),
			
		//项目经历表1		
			projectName : $("#projectName0").val(),
			time : $("#time0").val(),
			role : $("#role0").val(),
			projectDescription : $("#projectDescription0").val(),
		//项目经历表2	
			projectName2 : $("#projectName1").val(),
			time2 : $("#time1").val(),
			role2 : $("#role1").val(),
			projectDescription2 : $("#projectDescription1").val(),
		//项目经历表3		
			projectName3 : $("#projectName2").val(),
			time3 : $("#time2").val(),
			role3 : $("#role2").val(),
			projectDescription3 : $("#projectDescription2").val(),
		//岗位信息	
			experienceDescription : $("#experienceDescription").val(),
			jobName : jobName,
			type : jobType,
			majorName : majorname,
			
			proficiency0 : $("#proficiency2").val(),
			
			addEdu : addEdu,
			addPro : addPro
		},
		success : function(data, status) {
			document.getElementById("upload").submit();
			alert("提交成功");
		},
		error : function(jqXHR,data,status){
			alert(jqXHR.responseText);
		}
	})
}
