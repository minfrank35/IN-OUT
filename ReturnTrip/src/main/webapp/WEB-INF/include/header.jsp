<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	body {
	margin : 0;
	background-color : white;
	}
	
	
	header {
	display : flex;
	font-size: 20px;
	font-family : sans-serif;
	background-color : white;
	padding : 10px;
	}
	
	#logo {
	margin : 0 3% 0 0;
	align-self : center;
	text-decoration : none;
	color : gray;
	font-size : 40px;
	font-weight : bold;
	padding : 10px;
	margin-left : 20px;
	}
	
	.sb {
		color : #1E90FF;
	}
	
	
	nav {
	flex-grow : 5;
	display : flex;
	justify-content : flex-start;
	align-self: center;
	}
	
	nav a, #user a{
		text-decoration : none;
		color : black;
		padding : 0 30px 0 30px;
		font-weight : bold;
		
		
	}
	nav a:hover, #user a:hover{
	color : #1E90FF;
	
	}
	
	#user{
		display : flex;
		align-self : center;
		flex-grow : 0.2;
		
	}
	section{
	text-align: center;
	
	}

</style>
<title>Insert title here</title>
</head>
<body>
	<header>
		<a href = "${pageContext.request.contextPath}/home" id="logo"><span class = "sb">Return</span> trip;</a>
		<nav>
			<a href="${pageContext.request.contextPath}/notice" >공지사항</a>
			<a href="${pageContext.request.contextPath}/journey" >진행중인 축제</a>
		</nav>
		<div id = "user">
			<a href = "${pageContext.request.contextPath}/login">로그인</a>
			<a href ="${pageContext.request.contextPath}/join">회원가입</a>
			
		</div>
	</header>
</body>
</html>