<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 request.setCharacterEncoding("UTF-8");

 	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>select2.jsp</h1>
	
	<%
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/study_jsp2";
	String user = "root";
	String pwd = "1234";
	
	Class.forName(driver);
	
	Connection con = DriverManager.getConnection(url, user, pwd);
	
	String sql = "SELECT * FROM test8_2 ";
// 	String sql = "";
	
	PreparedStatement pstmt = con.prepareStatement(sql);
	
	ResultSet rs = pstmt.executeQuery();
	
	
	%>
	
	<table border="1">
		<tr>
			<th>name</th>
			<th>id</th>
			<th>passwd</th>
			<th>jumin</th>
			<th>email</th>
			<th>job</th>
			<th>gender</th>
			<th>hobby</th>
			<th>content</th>
		</tr>
		<%
		while(rs.next()) {
			String name = rs.getString(1);
			String id = rs.getString(2);
			String passwd = rs.getString(3);
			String jumin =  rs.getString(4);
			String email =  rs.getString(5);
			String job =  rs.getString(6);
			String gender =  rs.getString(7);
			String hobby =  rs.getString(8);
			String content =  rs.getString(9);
		%>
		<tr>
			<td><%=name %></td>
			<td><%=id %></td>
			<td><%=passwd %></td>
			<td><%=jumin %></td>
			<td><%=email %></td>
			<td><%=job %></td>
			<td><%=gender %></td>
			<td><%=hobby %></td>
			<td><%=content %></td>
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