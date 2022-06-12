<%@page import="jsp10_board.BoardDAO"%>
<%@page import="jsp10_board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String name = request.getParameter("name");
String passwd = request.getParameter("passwd");
String subject = request.getParameter("subject");
String content = request.getParameter("content");

BoardDTO dtoB = new BoardDTO();

dtoB.setName(name);
dtoB.setPasswd(passwd);
dtoB.setSubject(subject);
dtoB.setContent(content);

BoardDAO daoB = new BoardDAO();

int insertCount = daoB.insert(dtoB);

if(insertCount == 0) {
%>
	<script>
	alert("글쓰기 실패!");
	history.back();
	</script>
<%	
} else {
%>
	<script>
	location.href="list.jsp";
	</script>
<%	
}
%>