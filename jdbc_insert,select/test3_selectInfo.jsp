<%@page import="jsp9_jdbc.Test8_1DTO"%>
<%@page import="jsp9_jdbc.Test8_1DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 파라미터로 전달받은 이름(name) 가져오기
String name = request.getParameter("name");

// Test8_1DAO 객체의 selectInfo() 메서드 호출하여 상세 정보 조회
// => 파라미터 : 이름(name), 리턴타입 : Test8_1DTO(dto)
Test8_1DAO dao = new Test8_1DAO();
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
	<%-- 조회된 회원 상세 정보 출력(Test8_1DTO 객체의 getXXX() 메서드 활용) --%>
	<h3>이름 : <%=dto.getName() %></h3>
	<h3>나이 : <%=dto.getAge() %></h3>
	<h3>성별 : <%=dto.getGender() %></h3>
	<h3>취미 : <%=dto.getHobby() %></h3>
</body>
</html>













