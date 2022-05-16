<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>jdbc_connect_test1.jsp</h1>
	
	<%
	Class.forName("com.mysql.cj.jdbc.Driver");
	out.println("<h3>드라이버 로드 성공!<h3>");
	%>
	
</body>
</html>