<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String passwd = request.getParameter("passwd");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test2_result.jsp</h1>
	<h3>아이디 : <%=id %></h3>
	<h3>패스워드 : <%=passwd %></h3>

</body>
</html>