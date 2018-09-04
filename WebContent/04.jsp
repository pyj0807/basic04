<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Filter</title>
</head>
<body>
	<h2>Filter</h2>
	<p>
		구현시킬 웹앱에 필터라는걸 설정해서 사용할수 있다.
		ServletRequestListener 랑 작동시점은 비슷한데, 다른점이 있다면....
		적용시킬 경로를 설정할수 있다는점과, 요청이 들어가는걸 차단할수 있다는 점이 리스너와의 차이다. 
	</p>
	<p>
		필터사용의 대표적인 예가, 미인증시 서비스 차단 구현기능이다.
	</p>
</body>
</html>