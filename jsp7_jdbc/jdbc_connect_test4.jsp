<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.cj.jdbc.Driver"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>jdbc_connect_test3.jsp</h1>
	
	<%
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/study_jsp2";
	String username = "root";
	String password = "1234";
	
	Class.forName(driver);
	out.println("<h3> 드라이버 로드 성공</h3>");
	
	Connection con = DriverManager.getConnection(url, username, password);
	out.println("<h3>DB 연결 성공</h3>");
	
	int num = 100;
	String name = "hong";
	
	String sql = "INSERT INTO test VALUES ( " + num + " );";
// 	String sql = "INSERT INTO test2 VALUES ('" + name + "');";
	
	PreparedStatement pstmt = con.prepareStatement(sql);
	
	pstmt.executeUpdate();
	%>
	
</body>
</html>