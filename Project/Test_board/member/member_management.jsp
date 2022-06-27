<<<<<<< HEAD
<%@page import="java.util.ArrayList"%>
<%@page import="jsp10_board.MemberDAO"%>
<%@page import="jsp10_board.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
MemberDAO daoM = new MemberDAO();

ArrayList list = daoM.memberList();
%>
<!DOCTYPE html>
<html>
<style>
	#memberListForm {
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
	
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<section id="memberListForm">
		
		<h1>회원 목록</h1>
		
		<table>
			<tr id="tr_top">
				<td>이름</td>
				<td>ID</td>
				<td>비밀번호</td>
				<td>주민번호</td>
				<td>E-mail</td>
				<td>직업</td>
				<td>성별</td>
				<td>가입동기</td>
			</tr>
			<%
				if(list == null || list.size() == 0) {
				%>
					<h3>회원이 없습니다.</h3>
				<%	
				} else {
					
					for(int i=0; i<list.size(); i++) {
						MemberDTO dtoM = (MemberDTO)list.get(i);
					%>
					<tr>
						<td><%=dtoM.getName() %></td>
						<td><%=dtoM.getId() %></td>
						<td><%=dtoM.getPasswd() %></td>
						<td><%=dtoM.getJumin() %></td>
						<td><%=dtoM.getEmail() %></td>
						<td><%=dtoM.getJob() %></td>
						<td><%=dtoM.getGender() %></td>
						<td><%=dtoM.getContent() %></td>
					</tr>
					<%
					}
				}
				%>
		</table>
		
	</section>
	
</body>
</html>
=======
<%@page import="java.util.ArrayList"%>
<%@page import="jsp10_board.MemberDAO"%>
<%@page import="jsp10_board.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
MemberDAO daoM = new MemberDAO();

ArrayList list = daoM.memberList();
%>
<!DOCTYPE html>
<html>
<style>
	#memberListForm {
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
	
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<section id="memberListForm">
		
		<h1>회원 목록</h1>
		
		<table>
			<tr id="tr_top">
				<td>이름</td>
				<td>ID</td>
				<td>비밀번호</td>
				<td>주민번호</td>
				<td>E-mail</td>
				<td>직업</td>
				<td>성별</td>
				<td>가입동기</td>
			</tr>
			<%
				if(list == null || list.size() == 0) {
				%>
					<h3>회원이 없습니다.</h3>
				<%	
				} else {
					
					for(int i=0; i<list.size(); i++) {
						MemberDTO dtoM = (MemberDTO)list.get(i);
					%>
					<tr>
						<td><%=dtoM.getName() %></td>
						<td><%=dtoM.getId() %></td>
						<td><%=dtoM.getPasswd() %></td>
						<td><%=dtoM.getJumin() %></td>
						<td><%=dtoM.getEmail() %></td>
						<td><%=dtoM.getJob() %></td>
						<td><%=dtoM.getGender() %></td>
						<td><%=dtoM.getContent() %></td>
					</tr>
					<%
					}
				}
				%>
		</table>
		
	</section>
	
</body>
</html>
>>>>>>> 2e779ec8b031d986791e4219c0909ce2dc765d41
