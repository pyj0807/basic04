<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>    
<%
	String[] ar = "봄,여름,가을,겨울".split(",");
	String pick = ar[(int)(Math.random()*4)];
	
	// 한글밸류가 설정이 안되는 버전대 라면,
	String v = URLEncoder.encode(pick, "UTF-8");	// 한글 을 숫자형태로 
	System.out.println(v);
	Cookie t = new Cookie("season", pick);
	// 쿠키의 기본 유효시간은, 브라우저 종료와 맞물려 있다
	// 만약, 유효시간 변경없이 사용하는 상황이라면, 굳이 쿠키가 아닌 세션으로 처리하는게
	// 더 좋을수도 있다
	
	// 쿠키를 꼭 써야 되는 상황은, 사용자가 브라우저를 종료하더라고 남기게 하려고 사용하는 것이다
	t.setMaxAge(60*60*24*7);	//현재 기준으로, 초를 설정함. 60*60*24*7 설정시 7일간 유효함
	response.addCookie(t);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키</title>
</head>
<body>
	<h2>Application</h2>
	<p>
		안녕하세요..! 반갑습니다.~<br/>
		<small>몰래 쿠키 보내놨으니까 지우지 마삼..!</small>
	</p>
</body>
</html>