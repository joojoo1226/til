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
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>insertPro.jsp</h1>

	<h3>이름 : <%=name %> </h3>
	<h3>나이 : <%=age %> </h3>
	<h3>성별 : <%=gender %> </h3>
	<h3>취미 : <%=hobbies %> </h3>	
	

	<%
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/study_jsp2";
	String user = "root";
	String pwd = "1234";
	
	Class.forName(driver);
	
	Connection con = DriverManager.getConnection(url, user, pwd);
	
	String sql = "INSERT INTO test8_1 VALUES (?, ?, ?, ?)";
	
	PreparedStatement pstmt = con.prepareStatement(sql);
	
	pstmt.setString(1, name);
	pstmt.setInt(2, age);
	pstmt.setString(3, gender);
	pstmt.setString(4, hobby);

	pstmt.executeUpdate();

	%>

</body>
</html>