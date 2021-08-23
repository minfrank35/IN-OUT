<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${journey.journeyName}</title>
</head>
<body>
	<c:if test="${list != null}">
		<c:forEach var="l" items="${list}">
		journey 이름 : ${list.journeyName}<br>
		journey 주최자 : ${list.organizerName}<br>
		journey 주차장 : ${list.parking}<br>
		journey 도로명주소 : ${list.road_base_addr}<br>
		journey 지명 : ${list.nomination}<br>
		journey 전화 : ${list.phone}<br>
		journey 기간 : ${list.term}<br>
		journey 방문수 : ${list.visit}<br>
		journey 조회수 : ${list.hit}<br>
		journey 요금 : ${list.fee}<br>
		journey 홈페이지 : ${list.homepage}<br>
		journey 해쉬태그 : ${list.hashtag}<br>
		journey 이미지 : ${list.img}<br>
		journey 날씨 : ${list.weatherDO.weather}<br>
		journey 미세먼지 :${list.weatherDO.fine_dust}<br>
		journey 초미세먼지 :${list.weatherDO.ultra_fine_dust}<br>
		</c:forEach>
	</c:if>
</body>
</html>