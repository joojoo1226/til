<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>jdbc_connect_test3_2.jsp</h1>
	
	<%
	String driv = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/study_jsp2";
	String id = "root";
	String passwd = "1234";
	
	Class.forName(driv);
	
	Connection con = DriverManager.getConnection(url, id, passwd);
	
// 	String sql = "INSERT INTO test VALUES (1);";
	String sql = "INSERT INTO test VALUES (2);";
// 	String sql = "UPDATE test SET idx=30 WHERE idx=3";
	
	PreparedStatement pstmt = con.prepareStatement(sql);
	
	pstmt.executeUpdate();
	%>
	
</body>
</html>