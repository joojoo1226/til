<%@page import="java.util.ArrayList"%>
<%@page import="jsp9_jdbc.Test8_1DTO"%>
<%@page import="jsp9_jdbc.Test8_1DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Test8_1DAO dao = new Test8_1DAO();

ArrayList list = dao.selectList2();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>test4_selectList2.jsp</h1>

	<h3><%=list.size() %> 개 레코드</h3>
	
	<hr>
	
	<%
	for(int i=0; i<list.size(); i++) {

		Test8_1DTO dto = (Test8_1DTO)list.get(i);
		
		out.println(dto.getName() + " " + dto.getAge() + " " + 
				dto.getGender() + " " + dto.getHobby() + "<br>");
	}
	%>

</body>
</html>