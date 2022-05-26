<%@page import="jsp9_jdbc.Test8_1DTO"%>
<%@page import="jsp9_jdbc.Test8_1DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// Test8_1DAO 객체 생성
Test8_1DAO dao = new Test8_1DAO();
//selectList() 메서드 호출
//=> 파라미터 : 없음, 리턴타입 : Test8_1DTO[](arrDto) 
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
	<h3><%=arrDto.length %> 개 레코드</h3>
	<hr>
	<%-- Test8_1DTO 배열 크기만큼 반복(for문) --%>
	<%
	for(int i = 0; i < arrDto.length; i++) {
		// 배열에 저장되어 있는 Test8_1DTO 객체를 하나씩 꺼내서 Test8_1DTO 타입 변수에 저장
		Test8_1DTO dto = arrDto[i]; // 1개 레코드가 저장되어 있는 Test8_1DTO 객체 꺼내기
		
		// Test8_1DTO 객체의 getXXX() 메서드를 호출하여 1명의 정보 출력
		out.println(dto.getName() + " " + dto.getAge() + " " + 
						dto.getGender() + " " + dto.getHobby() + "<br>");
	} 
	%>
</body>
</html>





















