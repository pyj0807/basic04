<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int r = (Integer)application.getAttribute("r");	// no event
	
	boolean b = Math.random()>0.5;
	if(Math.random()>0.5){
		application.removeAttribute("r");	// remove event
		int val = (int)(Math.random()*10);
		application.setAttribute("r", val);	// add event
		
		application.setAttribute("lastest", request.getRemoteAddr());
		// 최초엔 add event 그다음부터는 replace event..!
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>ServletContext's AttributeLsitener</h2>
	<p>
		changed ? <%=b %>
	</p>
</body>
</html>