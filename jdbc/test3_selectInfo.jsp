<%@page import="jsp9_jdbc.Test8_1DAO"%>
<%@page import="jsp9_jdbc.Test8_1DTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String name = request.getParameter("name"); 

Test8_1DAO dao = new Test8_1DAO();

//dao에 있는 selectInfo()를 호출
Test8_1DTO dto = dao.selectInfo(name);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>test3_selectInfo.jsp</h1>
	
	<h3>이름 : <%=dto.getName() %></h3>
	<h3>나이 : <%=dto.getAge() %></h3>
	<h3>성별 : <%=dto.getGender() %></h3>
	<h3>취미 : <%=dto.getHobby() %></h3>
	
</body>
</html>