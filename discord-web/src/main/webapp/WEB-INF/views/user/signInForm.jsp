<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
	<h1>���ڵ� ���� ������ �ʴ��� ����� ������ �߰��� �� �ִ� â �Դϴ�!</h1>
	
	<hr>
	
	<form method="post">
		<table>
			<tr>
				<td>id</td>
				<td>�̸�</td>
			</tr>
			<tr>
				<td><input type="number" name="uid"></td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td><input type="submit" value="���� ����!"></td>
				<td></td>
			</tr>
		</table>
	</form>
	
	<hr>
	
	<h2>${reason}</h2>
	
	<a href="${pageContext.request.contextPath}/login" align="center">�ٽ� �α��� ��������</a>
	
</body>
</html>