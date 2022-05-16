<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insertCount</title>
</head>
<body>

	<h1>jdbc_test5.jsp</h1>
	
	<%
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/study_jsp2";
	String user = "root";
	String pwd = "1234";
	
	Class.forName(driver);
	System.out.println("드라이버 로드 성공!");
	
	Connection con = DriverManager.getConnection(url, user, pwd);
	System.out.println("DB 연결 성공!");
	
	int idx = 1;
	String name = "홍길동";
	
// 	String sql = "INSERT INTO test VALUES (?);";
	
// 	PreparedStatement pstmt = con.prepareStatement(sql);
	
// 	pstmt.setInt(1, idx);

	String sql = "INSERT INTO test3 VALUES (?, ?);";
	
	PreparedStatement pstmt = con.prepareStatement(sql);
	
	pstmt.setInt(1, idx);
	pstmt.setString(2, name);
	
	int insertCount = pstmt.executeUpdate();
	
	out.println("<h3>" + insertCount + "개 레코드 추가 성공!</h3>");
	%>
		
</body>
</html> 