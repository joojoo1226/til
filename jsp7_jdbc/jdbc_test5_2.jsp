<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateCount</title>
</head>
<body>

	<h1>jdbc_test5_2.jsp</h1>
	
	<%
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/study_jsp2";
	String user = "root";
	String pwd = "1234";
	
	Class.forName(driver);
	System.out.println("드라이버 로드 성공!");
	
	Connection con = DriverManager.getConnection(url, user, pwd);
	System.out.println("DB 연결 성공!");
	
	int oldIdx = 99, idx = 100;
	
	String sql = "UPDATE test SET idx = ? WHERE idx = ?;";
	
	PreparedStatement pstmt = con.prepareStatement(sql);
	
	pstmt.setInt(1, idx);
	pstmt.setInt(2, oldIdx);
	
	int updateCount = pstmt.executeUpdate();
	
	out.println("<h3>" + updateCount + "개 레코드 수정 성공!</h3>");
	%>
		
</body>
</html> 