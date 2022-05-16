<%@page import="java.sql.ResultSet"%>
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

	<h1>jdbc_test6_select.jsp</h1>
	
	<%
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/study_jsp2";
	String username = "root";
	String password = "1234";
	
	Class.forName(driver);
	
	Connection con = DriverManager.getConnection(url, username, password);
	
	String sql = "SELECT * FROM test3;";
	
	PreparedStatement pstmt = con.prepareStatement(sql);
	
// 	SQL 구문 실행 및 결과 처리
	ResultSet rs = pstmt.executeQuery();
	%>
	
	<table border="1">
		<tr>
			<th>idx</th>
			<th>name</th>
		</tr>
	
		<%
		while(rs.next()) {
			int idx = rs.getInt(1);
			String name = rs.getString(2);
			
// 			out.println("<h3>번호 : " + idx  + ", 이름 : " + name + "</h3>");
// 			out.println("<tr>");
// 			out.println("<td>" + idx + "</td><td>" + name + "</td>");
// 			out.println("</tr>");
		%>
		
		<tr>
			<td><%=idx %></td>
			<td><%=name %></td>		
		</tr>
		
		<%
		}
	
		rs.close();
		pstmt.close();
		con.close();
		
		%>
	
	</table>
</body>
</html>