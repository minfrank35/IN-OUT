<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${journey.journeyName}</title>
</head>
<body>
	journey 이름 : ${journey.journeyName}<br>
	journey 미세먼지 :${journey.weatherDO.fine_dust}<br>
	journey 초미세먼지 :${journey.weatherDO.ultra_fine_dust}<br>
	journey 자외선 :${journey.weatherDO.ultraviolet_ray}<br>
	journey 일출 : ${journey.weatherDO.sunset_time}<br>
</body>
</html>