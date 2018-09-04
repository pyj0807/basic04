<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	boolean b = (Boolean)session.getAttribute("auth");

 %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WebApp</title>
</head>
<body>
	<h2>Session..!</h2>
	<p>
		your session's auth level = <%=b %>
	</p>
</body>
</html>