<<<<<<< HEAD
<%@page import="jsp10_board.BoardReplyDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jsp10_board.BoardDAO"%>
<%@page import="jsp10_board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int idx = Integer.parseInt(request.getParameter("idx"));

BoardDAO daoB = new BoardDAO();

daoB.updateReadcount(idx);

BoardDTO dtoB = daoB.selectDetail(idx);

String sId = (String)session.getAttribute("sId");

ArrayList list = daoB.selectReplyList(idx);
%>
<!DOCTYPE html>
<html>
<style type="text/css">
	#articleForm {
		width: 600px;
		height: 550px;
		border: 1px solid #ccdbe2;
		margin: auto;
	}
	
	h1 {
		text-align: center;
	}
	
	table {
	 	width: 600px;
	}
	
	tr {
		height: 35px;
	}
	
	th {
		background: #ecd4d4;
	}
	
	td {
		text-align: center;
	}
	
	#basicInfoArea {
		height: 55px;
		text-align: center;
	}
	
	#articleContentArea {
		background: #c9cbe0;
		margin-top: 20px;
		height: 350px;
		text-align: center;
		overflow: auto;
		white-space: pre-line;
	}
	
	#commandCell {
		margin: 10px auto;
		width: 500px;
		text-align: center;
	}
	
	a {
		text-decoration: none;
	}
	
	#replyArea {
		width: 600px;
		margin: auto;
	}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<section id="articleForm">
	
		<h1 align="center">글 상세내용</h1>
		
		<section id="basicInfoArea">
			<table>
				<tr>
					<th>제목</th>
					<td colspan="6"><%=dtoB.getSubject() %></td>
				</tr>
				<tr>
					<th width="70">작성자</th>
					<td><%=dtoB.getName() %></td>
					<th width="70">작성일</th>
					<td width="90"><%=dtoB.getDate() %></td>
					<th width="70">조회수</th>
					<td width="70"><%=dtoB.getReadcount() %></td>
				</tr>
			</table>
		</section>
		
		<section id="articleContentArea">
			<%=dtoB.getContent() %>
		</section>
		
		<section id="commandCell">
			<input type="button" value="수정" onclick="location.href='modify.jsp?idx=<%=idx%>'">
			<input type="button" value="삭제" onclick="location.href='delete.jsp?idx=<%=idx%>'">
			<input type="button" value="목록" onclick="location.href='list.jsp'">			
		</section>
	</section>
		
	<section id="replyArea">
		<%
		if(sId != null) {
		%>
			<section id="insertForm">
				<form action="writeDetailReply_pro.jsp">
					<input type="hidden" name="id" value="<%=sId %>">
					<input type="hidden" name="idx" value="<%=idx %>">
					<textarea rows="3" cols="82" name="replyContent"></textarea>
					<input type="submit" value="등록">
				</form>
			</section>
		<%
		} 
		%>
		
		<section id="replyViewArea">
			<%
			for(int i=0; i<list.size(); i++) {
				BoardReplyDTO dtoBr = (BoardReplyDTO)list.get(i);
			%>
				<table>
					<tr>
						<td><b><%=dtoBr.getId() %></b></td>
						<td><%=dtoBr.getContent() %></td>
						<td><%=dtoBr.getDate() %></td>
					</tr>
				</table>
			<%
			}
			%>
				
		</section>
	</section>

</body>
=======
<%@page import="jsp10_board.BoardReplyDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jsp10_board.BoardDAO"%>
<%@page import="jsp10_board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int idx = Integer.parseInt(request.getParameter("idx"));

BoardDAO daoB = new BoardDAO();

daoB.updateReadcount(idx);

BoardDTO dtoB = daoB.selectDetail(idx);

String sId = (String)session.getAttribute("sId");

ArrayList list = daoB.selectReplyList(idx);
%>
<!DOCTYPE html>
<html>
<style type="text/css">
	#articleForm {
		width: 600px;
		height: 550px;
		border: 1px solid #ccdbe2;
		margin: auto;
	}
	
	h1 {
		text-align: center;
	}
	
	table {
	 	width: 600px;
	}
	
	tr {
		height: 35px;
	}
	
	th {
		background: #ecd4d4;
	}
	
	td {
		text-align: center;
	}
	
	#basicInfoArea {
		height: 55px;
		text-align: center;
	}
	
	#articleContentArea {
		background: #c9cbe0;
		margin-top: 20px;
		height: 350px;
		text-align: center;
		overflow: auto;
		white-space: pre-line;
	}
	
	#commandCell {
		margin: 10px auto;
		width: 500px;
		text-align: center;
	}
	
	a {
		text-decoration: none;
	}
	
	#replyArea {
		width: 600px;
		margin: auto;
	}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<section id="articleForm">
	
		<h1 align="center">글 상세내용</h1>
		
		<section id="basicInfoArea">
			<table>
				<tr>
					<th>제목</th>
					<td colspan="6"><%=dtoB.getSubject() %></td>
				</tr>
				<tr>
					<th width="70">작성자</th>
					<td><%=dtoB.getName() %></td>
					<th width="70">작성일</th>
					<td width="90"><%=dtoB.getDate() %></td>
					<th width="70">조회수</th>
					<td width="70"><%=dtoB.getReadcount() %></td>
				</tr>
			</table>
		</section>
		
		<section id="articleContentArea">
			<%=dtoB.getContent() %>
		</section>
		
		<section id="commandCell">
			<input type="button" value="수정" onclick="location.href='modify.jsp?idx=<%=idx%>'">
			<input type="button" value="삭제" onclick="location.href='delete.jsp?idx=<%=idx%>'">
			<input type="button" value="목록" onclick="location.href='list.jsp'">			
		</section>
	</section>
		
	<section id="replyArea">
		<%
		if(sId != null) {
		%>
			<section id="insertForm">
				<form action="writeDetailReply_pro.jsp">
					<input type="hidden" name="id" value="<%=sId %>">
					<input type="hidden" name="idx" value="<%=idx %>">
					<textarea rows="3" cols="82" name="replyContent"></textarea>
					<input type="submit" value="등록">
				</form>
			</section>
		<%
		} 
		%>
		
		<section id="replyViewArea">
			<%
			for(int i=0; i<list.size(); i++) {
				BoardReplyDTO dtoBr = (BoardReplyDTO)list.get(i);
			%>
				<table>
					<tr>
						<td><b><%=dtoBr.getId() %></b></td>
						<td><%=dtoBr.getContent() %></td>
						<td><%=dtoBr.getDate() %></td>
					</tr>
				</table>
			<%
			}
			%>
				
		</section>
	</section>

</body>
>>>>>>> 2e779ec8b031d986791e4219c0909ce2dc765d41
</html>