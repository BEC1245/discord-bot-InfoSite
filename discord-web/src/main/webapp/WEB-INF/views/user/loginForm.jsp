<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
	<h1>login page</h1>
	
	<hr>
	
	<h5>디스코드 id를 입력해주세요</h5>
	<form method="post">
		<input type="text" name="uid" value="0">
		<input type="submit" value="id 입력">
	</form>
	
	<hr>
	
	<a href="${pageContext.request.contextPath}/sign-in" align="center">유저 추가하기</a>
	
</body>

</html>