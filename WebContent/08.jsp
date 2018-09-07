<%--
	basic04  -  WebContent/08.jsp 
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//사용자에게 쿠키 보내기
	Cookie c = new Cookie("visit", "on");	// 쿠키이름, 해당쿠키에 설정할 밸류(데이터) : 둘다 String으로...
	// 만들었다고 해서 사용자에게 전달되는건 아니고
	response.addCookie(c);	// 응답객체에 add를 시켜두면, 나중에 응답이 날라갈때 같이 전달이 됨
	//response.reset();
	// 브라우저에서 관리가 되고있는 쿠키들은, 
	// 사용자의 의해 서버측으로 요청을 보낼때, 유효시간, 목적지에 부합되는 쿠키들을 같이 전송을 하게 된다
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>session.isNew()? <%=session.isNew() %></h1>
	<h2>쿠키</h2>
	<P>
		쿠키? 어떻게 작동하는거며, 어떤식으로 활용되는지에 대해 알아보자.
	</P>
	<p>
		쿠키는 문자열로 된 정보를 가진 파일이고 웹브라우저에 의해 관리되며, 
		보통 서버측에서 필요한 정보를 설정해서 브라우저에게 저장을 시키게 된다
	</p>
	<p>
		쿠키는 브라우저를 종료유무와 상관없이 유효기간 설정이 가능하다.<br/>
		클라이언트가 브라우저를 이용해서 최초 접속을 했을때 처리해야될 정보가 있다며
		쿠키라는 걸 이용해서 처리를 하게 된다
		
	</p>
</body>
</html>