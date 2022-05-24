<%@page import="jsp9_jdbc.Test8_1DTO"%>
<%@page import="jsp9_jdbc.Test8_1DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Test8_1DAO dao = new Test8_1DAO();

Test8_1DTO[] arrDto = dao.selectList();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>test4_selectList.jsp</h1>

	<h3><%=arrDto.length %>개 레코드</h3>
	
	<% 
	for(int i=0; i<arrDto.length; i++) {
	%>
		<%
		Test8_1DTO dto = arrDto[i];
		
		out.println(dto.getName() + " " + dto.getAge() + " " + 
		dto.getGender() + " " + dto.getHobby() + "<br>");
		%>
	<%	
	}
	%>

</body>
</html>