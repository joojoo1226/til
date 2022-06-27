<%@page import="jsp10_board.BoardDAO"%>
<%@page import="jsp10_board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

int idx = Integer.parseInt(request.getParameter("idx"));

BoardDTO dtoB = new BoardDTO();

dtoB.setIdx(idx);
dtoB.setName(request.getParameter("name"));
dtoB.setPasswd(request.getParameter("passwd"));
dtoB.setSubject(request.getParameter("subject"));
dtoB.setContent(request.getParameter("content"));

BoardDAO daoB = new BoardDAO();

int updateCount = daoB.update(dtoB);

if(updateCount == 0) {
%>
	<script>
	alert("패스워드 틀림!");
	history.back();
	</script>
<%	
} else {
	response.sendRedirect("detail.jsp?idx=" + idx);	
}
%>
