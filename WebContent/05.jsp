<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>multipart?</title>
</head>
<body>
	<h2>multipart request</h2>
	<p>
		form을 통한 요청 발생시에만 가능한 작업으로, enctype을 multipart/form-data로 설정해야 될때가 있다.<br/>
		미 설정시는 application/x-www-urlencoded 로 설정이 되게 되있다
		이 enctype은 get으로 보내야될 쿼리스트링 형태를 출력스트림 이용해서 전송하는 form 형식이다
	</p>
	<p>
		이 form 전송방식은 언제 사용되냐면, 사용자로부터 파일데이터를 전달반아야될때 설정하는 form 방식이다
	</p>
	<form action="/basic04/05handle.jsp" method="post" enctype="multipart/form-data">
		text : <input type="text" name="param">
		file : <input type="file" name="attach">
		<button type="button">전송</button>
		
	</form>
</body>
</html>