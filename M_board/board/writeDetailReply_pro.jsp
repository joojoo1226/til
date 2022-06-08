<%@page import="jsp10_board.BoardReplyDTO"%>
<%@page import="jsp10_board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String id = request.getParameter("id");
String content = request.getParameter("replyContent");
int idx = Integer.parseInt(request.getParameter("idx"));

BoardReplyDTO dtoBr = new BoardReplyDTO();

dtoBr.setId(id);
dtoBr.setContent(content);

BoardDAO daoB = new BoardDAO();

int insertCount = daoB.insertReply(dtoBr, idx);

if(insertCount == 0) {
%>
	<script>
	alert("댓글쓰기 실패!");
	history.back();
	</script>
<%
} else {
	response.sendRedirect("detail.jsp?idx=" + idx);
}
%>