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
	out.println("<h3>드라이버 로드 성공!<h3>");
	
	Connection con = DriverManager.getConnection(url, username, password);
	out.println("<h3>DB 연결 성공!<h3>");
	
// 	String sql = "CREATE TABLE test (idx INT);";
	String sql = "CREATE TABLE test2 (name VARCHAR(10));";
// 	String sql = "DROP TABLE test;";

	PreparedStatement pstmt = con.prepareStatement(sql);
	out.println("<h3>SQL 구문 전달 성공!<h3>");
	
	pstmt.executeUpdate();
	out.println("<h3>SQL 구문 실행 성공!<h3>");
	%>
	
</body>
</html>