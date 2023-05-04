<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
	<h1>디스코드 봇을 통하지 않더라도 사용자 정보를 추가할 수 있는 창 입니다!</h1>
	
	<hr>
	
	<form method="post">
		<table>
			<tr>
				<td>id</td>
				<td>이름</td>
			</tr>
			<tr>
				<td><input type="number" name="uid"></td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td><input type="submit" value="정보 삽입!"></td>
				<td></td>
			</tr>
		</table>
	</form>
	
	<hr>
	
	<h2>${reason}</h2>
	
	<a href="${pageContext.request.contextPath}/login" align="center">다시 로그인 패이지로</a>
	
</body>
</html>