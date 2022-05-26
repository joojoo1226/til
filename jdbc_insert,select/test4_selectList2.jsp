<%@page import="java.util.ArrayList"%>
<%@page import="jsp9_jdbc.Test8_1DTO"%>
<%@page import="jsp9_jdbc.Test8_1DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// Test8_1DAO 객체 생성
Test8_1DAO dao = new Test8_1DAO();
// selectList2() 메서드 호출
// => 파라미터 : 없음, 리턴타입 : java.util.ArrayList(list)
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
	<%-- ArrayList 객체의 크기는 배열과 달리 객체명.size() 메서드로 알아낼 수 있다! --%>
	<h3><%=list.size() %> 개 레코드</h3>
	<hr>
	<%
	for(int i = 0; i < list.size(); i++) {
		// ArrayList 객체(list)의 get() 메서드를 호출하여 객체에 저장된 Test8_1DTO 객체 꺼내기
		// => 이 때, get() 메서드의 파라미터로 인덱스 번호 전달
		//    단, get() 메서드 리턴타입이 Object 타입이므로, Test8_1DTO 타입으로 형변환 필요
		Test8_1DTO dto = (Test8_1DTO)list.get(i); // 1개 레코드가 저장되어 있는 Test8_1DTO 객체 꺼내기
		
		// Test8_1DTO 객체의 getXXX() 메서드를 호출하여 1명의 정보 출력
		out.println(dto.getName() + " " + dto.getAge() + " " + 
						dto.getGender() + " " + dto.getHobby() + "<br>");
	}
	%>
</body>
</html>





















