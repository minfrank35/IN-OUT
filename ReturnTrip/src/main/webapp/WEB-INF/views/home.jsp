<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../include/header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Return trip;</title>
<style>
	section {
		margin-top : 10%;
		font-size: 30px;
		display : flex;
		justify-content: center;
	}
	#center {
		width : 13em;
		border-bottom : 2px solid gray;
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
	<form action = "journeyResult" method = "GET"> <!-- default가 get -->
		<section>
			<div id = "center">
			어디로 <span class = "sb">떠나고</span> 싶으신가요?<br>
			<input class = "text" type = "text" name = "place" placeholder = "지역,장소를 입력해주세요"/>
			</div>
		</section>
	</form>
</body>
</html>