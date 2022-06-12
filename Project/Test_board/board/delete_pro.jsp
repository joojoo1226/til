<%@page import="jsp10_board.BoardDAO"%>
<%@page import="jsp10_board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int idx = Integer.parseInt(request.getParameter("idx"));
String passwd = request.getParameter("passwd");

BoardDTO dtoB = new BoardDTO();

dtoB.setIdx(idx);
dtoB.setPasswd(passwd);

BoardDAO daoB = new BoardDAO();

int deleteCount = daoB.delete(dtoB);

if(deleteCount == 0) {
%>
	<script type="text/javascript">
	alert("패스워드 틀림!");
	history.back();
	</script>
<%	
} else {
	response.sendRedirect("list.jsp");
}
%>
