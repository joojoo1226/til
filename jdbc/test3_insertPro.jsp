<%@page import="jsp9_jdbc.Test8_1DAO"%>
<%@page import="jsp9_jdbc.Test8_1DTO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.mysql.cj.xdevapi.PreparableStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	String gender = request.getParameter("gender");
	String[] hobbies = request.getParameterValues("hobby");
	
	String hobby = "";
	
	for(String item : hobbies) {
		hobby += item + " ";
	}
	
	Test8_1DTO dto = new Test8_1DTO();
	
	dto.setName(name);
	dto.setAge(age);
	dto.setGender(gender);
	dto.setHobby(hobby);
	
	Test8_1DAO dao = new Test8_1DAO();
	
	int insertCount = dao.insert(dto);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>insertPro.jsp</h1>
	
	<%if(insertCount > 0) {%>
		<h3>회원 추가 성공!</h3>
	<%} else{ %>
		<h3>회원 추가 실패!</h3>
	<%} %>

	<button onclick="location.href='test3_selectInfo.jsp?name=<%=dto.getName()%>'">추가된 회원 정보 확인</button>
</body>
</html>