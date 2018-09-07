<%--
	/sub/11-1.jsp
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie c = new Cookie("fast", "notuse");
	c.setMaxAge(60*60);
	// 혹시 만들어지는 경로가 WebContent 바로 아래가 아니라,
	// 하위 경로에서 만드러지는 거라면, 그 경로쪽에서만 작동하는 쿠키가 되버린다.
	
	// 이렇게 사용하게 되면, 쿠키를 활용하기 힘들기 때문에 
	c.setPath(application.getContextPath());	
	// 쿠키를 사용해야될때 쿠키path를 어플리케이션 패스로 다 설정해두고
	
	response.addCookie(c);
%>
쿠키 받으세요.......