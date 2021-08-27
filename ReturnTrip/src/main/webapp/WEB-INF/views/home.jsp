<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../include/header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
	section {
		margin-top : 10%;
		font-size: 30px;
		display : flex;
		justify-content: center;
	}
	
	
	.text {
		border : none; 	
		width: 100%;
	  	font-size:20px;
	  	height:30px;
	  	display : inline-block;
	  	margin-top : 20px;
	}
	
</style>
</head>	
<body>
	<form action = "journey" method = "GET"> <!-- default가 get -->
		<section>
			<div id = "center">
			어디로 <span class = "sb">떠나고</span> 싶으신가요?<br>
			<input class = "text" type = "text" id = "place" name = "place" onkeyup="searchFunction()" placeholder = "지역,장소를 입력해주세요"/>
			</div>
			<div  id ="search"></div>
		</section>
			
		<p id= "test">
		</p>
	</form>
	
</body>
<script>
 
let request = new XMLHttpRequest();
function searchFunction() {
	if(document.getElementById("place").value.length > 0.5){
	request.open("GET", "./search?category=" + encodeURIComponent(document.getElementById("place").value),true);
	request.onreadystatechange = searchProcess;
	request.send(null);	
	}
}

function searchProcess() {
	let table = document.getElementById("search");
	table.innerHTML ="";
	if(request.readyState == 4 && request.status == 200){
		let a =JSON.parse(request.responseText);
		table.innerHTML = a.result;
	}
}
 
</script>

</html>