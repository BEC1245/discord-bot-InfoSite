<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
	<h1>ȯ���մϴ� ${userInfo.uname}�̽ÿ�!!</h1>
	<h3>���ڵ� Ȱ�� ����� �Ʒ��� �ֽ��ϴ�!!</h3>

	<hr>
	
	<h3>���ݱ��� ������ ��ư�� ���� �Դϴ�!</h3>
	<h4>${userInfo.click_count}</h4>
		
	<hr>
	
	<h3>���ݱ��� �Է��ߴ� ä���� �� ���� �Դϴ�!</h3>
	<h4>${userInfo.chat_count}</h4>
	
	<hr>
	
	<a href="${pageContext.request.contextPath}/data/wisperList">�� ���ึ�� �α� ����!</a> <br>
	<a href="${pageContext.request.contextPath}/data/buttonLeaderBord">�� ��ư ������ �������� ����!</a> <br>
	<a href="${pageContext.request.contextPath}/login">�α׾ƿ�</a> <br>

</body>

</html>