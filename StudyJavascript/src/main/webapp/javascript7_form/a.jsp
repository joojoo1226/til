<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>a.jsp</h1>
	
	<h3>이름 : <%=request.getParameter("name") %></h3>
	<h3>아이디 : <%=request.getParameter("id") %></h3>
</body>
</html>