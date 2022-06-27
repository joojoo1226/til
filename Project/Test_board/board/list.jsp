<<<<<<< HEAD
<%@page import="jsp10_board.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jsp10_board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
BoardDAO daoB = new BoardDAO();

int listCount = daoB.selectListCount();

int pageNum = 1;
int listLimit = 10;
int pageLimit = 10;

if(request.getParameter("pageNum") != null) {
	pageNum = Integer.parseInt(request.getParameter("pageNum"));
}

// int maxPage = (int)((double)listCount / listLimit + 0.9);
int maxPage = (int)Math.ceil((double)listCount / listLimit);
int startPage = ((int)((double)pageNum / pageLimit + 0.9) - 1) * pageLimit + 1;
int endPage = startPage + pageLimit - 1;

if(endPage > maxPage) {
	endPage = maxPage;
}

// out.println("총 페이지 수 :" + maxPage);
// out.println("시작 페이지 번호 :" + startPage);
// out.println("끝 :" + endPage);

// ArrayList list =  daoB.selectList();
ArrayList list =  daoB.selectList(pageNum, listLimit);
%>
<!DOCTYPE html>
<style>
	#listForm {
		width: 1024px;
		max-height: 600px;
		margin: auto;
	}
	
	h1 {
		text-align: center;
	}
	
	table {
		width: 1024px;
		margin: auto;
	}
	
	#tr_top {
		text-align: center;
		background: #c9cbe0;
	}
	
	table td {
		text-align: center;
	}
	
	#subject {
		text-align: center;
		padding-left: 20px;
	}
	
	#buttonArea {
		width: 1024px;
		text-align: right;
		margin: auto;
	}
	
	#pageList {
		width: 1024px;
		text-align: center;
		margin: auto;
	}
	
	a {
		text-decoration: none;
	}
</style>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<section id="listForm">
	
		<h1 align="center">글 목록</h1>
	
		<table>
			<tr id="tr_top">
				<td width="100px">번호</td>
				<td>제목</td>
				<td width="150px">작성자</td>
				<td width="150px">날짜</td>
				<td width="100px">조회수</td>
			</tr>
			<%
			if(list == null || list.size() == 0) {
			%>
				<h3>게시물이 없습니다.</h3>
			<%	
			} else {
				
				for(int i=0; i<list.size(); i++) {
					BoardDTO dtoB = (BoardDTO)list.get(i);
				%>
				<tr>
					<td><%=dtoB.getIdx() %></td>
					<td id="subject">
						<a href="detail.jsp?idx=<%=dtoB.getIdx() %>"><%=dtoB.getSubject() %></a>
					</td>
					<td><%=dtoB.getName() %></td>
					<td><%=dtoB.getDate() %></td>
					<td><%=dtoB.getReadcount() %></td>
				</tr>
				<%
				}
			}
			%>
				
		</table>
	</section>
	<section id="buttonArea">
		<input type="button" value="글쓰기" onclick="location.href='write_form.jsp'">
	</section>
	<section id="pageList">
	
		<%
		if(pageNum > 1) {
		%>
			<input type="button" value="이전" onclick="location.href='list.jsp?pageNum=<%=pageNum - 1 %>'">
		<%
		} else {
		%>
			<input type="button" value="이전" disabled="disabled">
		<%
		}
		%>
		
		<%
		for(int i = startPage; i <= endPage; i++) {
			if(pageNum == i) {
				out.println(i);
			} else {
				out.println("<a href='list.jsp?pageNum=" + i + "'>" + i + "</a>");
			}
		}
		%>
			
		<%
		if(pageNum < endPage) {
		%>
			<input type="button" value="다음" onclick="location.href='list.jsp?pageNum=<%=pageNum + 1 %>'">
		<%
		} else {
		%>
			<input type="button" value="다음" disabled="disabled">
		<%
		}
		%>
		
	</section>
</body>
=======
<%@page import="jsp10_board.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jsp10_board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
BoardDAO daoB = new BoardDAO();

int listCount = daoB.selectListCount();

int pageNum = 1;
int listLimit = 10;
int pageLimit = 10;

if(request.getParameter("pageNum") != null) {
	pageNum = Integer.parseInt(request.getParameter("pageNum"));
}

// int maxPage = (int)((double)listCount / listLimit + 0.9);
int maxPage = (int)Math.ceil((double)listCount / listLimit);
int startPage = ((int)((double)pageNum / pageLimit + 0.9) - 1) * pageLimit + 1;
int endPage = startPage + pageLimit - 1;

if(endPage > maxPage) {
	endPage = maxPage;
}

// out.println("총 페이지 수 :" + maxPage);
// out.println("시작 페이지 번호 :" + startPage);
// out.println("끝 :" + endPage);

// ArrayList list =  daoB.selectList();
ArrayList list =  daoB.selectList(pageNum, listLimit);
%>
<!DOCTYPE html>
<style>
	#listForm {
		width: 1024px;
		max-height: 600px;
		margin: auto;
	}
	
	h1 {
		text-align: center;
	}
	
	table {
		width: 1024px;
		margin: auto;
	}
	
	#tr_top {
		text-align: center;
		background: #c9cbe0;
	}
	
	table td {
		text-align: center;
	}
	
	#subject {
		text-align: center;
		padding-left: 20px;
	}
	
	#buttonArea {
		width: 1024px;
		text-align: right;
		margin: auto;
	}
	
	#pageList {
		width: 1024px;
		text-align: center;
		margin: auto;
	}
	
	a {
		text-decoration: none;
	}
</style>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<section id="listForm">
	
		<h1 align="center">글 목록</h1>
	
		<table>
			<tr id="tr_top">
				<td width="100px">번호</td>
				<td>제목</td>
				<td width="150px">작성자</td>
				<td width="150px">날짜</td>
				<td width="100px">조회수</td>
			</tr>
			<%
			if(list == null || list.size() == 0) {
			%>
				<h3>게시물이 없습니다.</h3>
			<%	
			} else {
				
				for(int i=0; i<list.size(); i++) {
					BoardDTO dtoB = (BoardDTO)list.get(i);
				%>
				<tr>
					<td><%=dtoB.getIdx() %></td>
					<td id="subject">
						<a href="detail.jsp?idx=<%=dtoB.getIdx() %>"><%=dtoB.getSubject() %></a>
					</td>
					<td><%=dtoB.getName() %></td>
					<td><%=dtoB.getDate() %></td>
					<td><%=dtoB.getReadcount() %></td>
				</tr>
				<%
				}
			}
			%>
				
		</table>
	</section>
	<section id="buttonArea">
		<input type="button" value="글쓰기" onclick="location.href='write_form.jsp'">
	</section>
	<section id="pageList">
	
		<%
		if(pageNum > 1) {
		%>
			<input type="button" value="이전" onclick="location.href='list.jsp?pageNum=<%=pageNum - 1 %>'">
		<%
		} else {
		%>
			<input type="button" value="이전" disabled="disabled">
		<%
		}
		%>
		
		<%
		for(int i = startPage; i <= endPage; i++) {
			if(pageNum == i) {
				out.println(i);
			} else {
				out.println("<a href='list.jsp?pageNum=" + i + "'>" + i + "</a>");
			}
		}
		%>
			
		<%
		if(pageNum < endPage) {
		%>
			<input type="button" value="다음" onclick="location.href='list.jsp?pageNum=<%=pageNum + 1 %>'">
		<%
		} else {
		%>
			<input type="button" value="다음" disabled="disabled">
		<%
		}
		%>
		
	</section>
</body>
>>>>>>> 2e779ec8b031d986791e4219c0909ce2dc765d41
</html>