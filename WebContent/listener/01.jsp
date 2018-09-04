<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	System.out.println(session.getMaxInactiveInterval());	//초
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Web APP</title>
</head>
<body>
	<h2>Web Application</h2>
	<form action="encode.jsp" method="post">
		SEARCH <input type="text" name="search"/>
	</form>
	<p>
		웹 어플리케이션을 만들어내는데 있어서 사용되는 내장 객체들에 대해서 알아보았다.<br/>
		JSP에는 총 8개(+1)의 내장객체를 사용할수 있지만,
		핵심객체는 [ request, response, session, application ] 이렇게 4개로 꼽을수 있다
		위 4개의 객체를 잘 다루어야 한다.
	</p>
	<p>
		위 4개 객체에서 일어나는 일들에 한해서, 이벤트처리를 할수 있게 해두었다
		예를 들어, 요청이 발생할때 마다 할일, application이 종료될때해야될일 이 있다면,
		이벤트리스너를 통해서 설정이 가능하다.
	</p>
	<p>
		총 8개(application 2/ session 4/ request 2)의 이벤트리스너가 만들어져있짐나, 
		활용 가능한 리스너는 6개(application 2/ session 2/ request 2)이다
		(나머지 2개는 현재 버전대에서는 작도을 하지 않음)
	</p>
</body>
</html>