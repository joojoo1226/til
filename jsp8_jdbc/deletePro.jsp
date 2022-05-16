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
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>deletePro.jsp</h1>

<%-- 	<h3>이름 : <%=name %> </h3> --%>
<%-- 	<h3>나이 : <%=age %> </h3> --%>

	<%
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/study_jsp2";
	String user = "root";
	String pwd = "1234";
	
	Class.forName(driver);
	
	Connection con = DriverManager.getConnection(url, user, pwd);
	
// 	String sql = "INSERT INTO test8_1 VALUES (?, ?, ?, ?)";
	String sql = "DELETE FROM test8_1 WHERE name=? AND age=?";
	
	PreparedStatement pstmt = con.prepareStatement(sql);
	
	pstmt.setString(1, name);
	pstmt.setInt(2, age);

	pstmt.executeUpdate();

	%>

</body>
</html>