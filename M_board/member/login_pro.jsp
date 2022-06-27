<%@page import="jsp10_board.MemberDAO"%>
<%@page import="jsp10_board.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String passwd = request.getParameter("passwd");

out.println(id + passwd);

MemberDTO dtoM = new MemberDTO();

dtoM.setId(id);
dtoM.setPasswd(passwd);

MemberDAO daoM = new MemberDAO();

boolean isLoginSuccess = daoM.checkUser(dtoM);

if(!isLoginSuccess) {
%>
	<script>
	alert("로그인 실패!");
	history.back();
	</script>
<%
} else {
	session.setAttribute("sId", dtoM.getId());
	
	response.sendRedirect("../main.jsp");
}
%>
