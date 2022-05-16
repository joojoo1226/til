<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
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

	<h1>select.jsp</h1>
	
	<%
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/study_jsp2";
	String username = "root";
	String password = "1234";
	
	Class.forName(driver);
	
	Connection con = DriverManager.getConnection(url, username, password);
	
	String sql = "SELECT * FROM test8_1";
	
	PreparedStatement pstmt = con.prepareStatement(sql);
	
	ResultSet rs = pstmt.executeQuery();
	
	%>
	
	<table border="1">
		<tr>
			<th>name</th>
			<th>age</th>
			<th>gender</th>
			<th>hobby</th>
		</tr>
		<%
		while(rs.next()) {
			String name = rs.getString(1);
			int age = rs.getInt(2);
			String gender = rs.getString(3);
			String hobby =  rs.getString(4);
		%>
		<tr>
			<td><%=name %></td>
			<td><%=age %></td>
			<td><%=gender %></td>
			<td><%=hobby %></td>
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