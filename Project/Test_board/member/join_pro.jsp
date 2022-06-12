<%@page import="jsp10_board.MemberDAO"%>
<%@page import="jsp10_board.MemberDTO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String jumin = request.getParameter("jumin1") + "-" + request.getParameter("jumin2");
	String email = request.getParameter("email1") + "@" + request.getParameter("email2");
	String job = request.getParameter("job");
	String gender = request.getParameter("gender");
	String content = request.getParameter("content");
	
	MemberDTO dtoM = new MemberDTO();
	
	dtoM.setName(name);
	dtoM.setId(id);
	dtoM.setPasswd(passwd);
	dtoM.setJumin(jumin);
	dtoM.setEmail(email);
	dtoM.setJob(job);
	dtoM.setGender(gender);
	dtoM.setContent(content);
	
	MemberDAO daoM = new MemberDAO();
	
	int insertCount = daoM.insertMember(dtoM);
	
	if(insertCount == 0) {
%>
		<script>
		alert("회원 추가 실패!");
		history.back();
		</script>
<%
	} else {
%>
		<script>
			alert("회원 추가 성공!");
		</script>
<%
		response.sendRedirect("../main.jsp");
	}
	
%>
