<%@page import="jsp9_jdbc.Test8_1DAO"%>
<%@page import="jsp9_jdbc.Test8_1DTO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// POST 방식일 때 request 객체에 대한 한글 인코딩 처리
request.setCharacterEncoding("UTF-8");

// insertForm.jsp 페이지로부터 전달받은 폼파라미터(이름, 나이, 성별, 취미) 변수에 저장 및 출력
String name = request.getParameter("name");
int age = Integer.parseInt(request.getParameter("age")); // String -> int 로 변환 필수!
String gender = request.getParameter("gender");

String hobby = ""; // 취미는 모두 문자열 결합(/ 또는 공백으로 구분)
String[] hobbies = request.getParameterValues("hobby");
for(String item : hobbies) { // hobbies 배열 내의 각 항목을 차례대로 좌변의 item 변수에 저장 반복
	hobby += item + "/";
}

// 1명의 회원정보를 저장할 Test8_1DTO 클래스 인스턴스 생성
Test8_1DTO dto = new Test8_1DTO();
// DTO 객체에 1명의 회원정보를 모두 저장
dto.setName(name);
dto.setAge(age);
dto.setGender(gender);
dto.setHobby(hobby);

// Test8_1DAO 클래스 인스턴스 생성
Test8_1DAO dao = new Test8_1DAO();

// 회원 정보를 저장할 insert() 메서드 호출
// => 파라미터 : Test8_1DTO 객체(dto)    리턴타입 : int
int insertCount = dao.insert(dto);

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test3_insertPro.jsp</h1>
	<h3>이름 : <%=dto.getName() %></h3>
	<h3>나이 : <%=dto.getAge() %></h3>
	<h3>성별 : <%=dto.getGender() %></h3>
	<h3>취미 : <%=dto.getHobby() %></h3>
	
	<%if(insertCount > 0) { %>
		<h3>회원 추가 성공!</h3>
	<%} else { %>
		<h3>회원 추가 실패!</h3>
	<%} %>
	
	<%-- 버튼 클릭 시 test3_selectInfo.jsp 페이지로 이동(파라미터로 이름 전달) --%>
	<button onclick="location.href='test3_selectInfo.jsp?name=<%=dto.getName() %>'">추가된 회원 정보 확인</button>
</body>
</html>
























