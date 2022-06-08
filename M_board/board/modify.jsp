<%@page import="jsp10_board.BoardDTO"%>
<%@page import="jsp10_board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int idx = Integer.parseInt(request.getParameter("idx"));

String sId = (String)session.getAttribute("sId");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글수정</title>
<style type="text/css">
	#modifyForm {
		width: 500px;
		height: 450;
		border: 3px solid #ccdbe2;
		margin: auto;
	}
	
	h1 {
		text-align: center;
	}
	
	table {
		width: 450px;
		margin: auto;
	}
	
	.td_left {
		width: 150px;
		text-align: center;
		background: #ecd4d4;
	}
	
	.td_right {
		width: 300px;
		background: #c9cbe0;
	}
	
	#commandCell {
		text-align: center;
	} 
</style>
</head>
<body>

	<%
	if(sId == null) {
	%>
		<script type="text/javascript">
		alert("로그인 필수!");
		location.href = "../member/login_form.jsp";
		</script>
	<%
	}
	%>

	<%
	BoardDAO daoB = new BoardDAO();
	BoardDTO dtoB = daoB.selectDetail(idx);
	
	if(dtoB == null) {
	%>
		<script type="text/javascript">
		alert("잘못된 요청");
		history.back();
		</script>
	<%	
	}
	%>

	<section id="modifyForm">
		
		<h1 align="center">글수정</h1>
	
		<form action="modify_pro.jsp" method="post">
		
<!-- 		입력없이 글번호 전송 -->
		<input type="hidden" name="idx" value="<%=idx %>">
		
			<table>
				<tr>
					<td class="td_left"><label for="name">작성자</label></td>
					<td class="td_right"><input type="text" value="<%=dtoB.getName() %>" name="name" readonly="readonly"></td>
				</tr>
				<tr>
					<td class="td_left"><label for="passwd">비밀번호</label></td>
					<td class="td_right"><input type="password" name="passwd" required="required"></td>
				</tr>
				<tr>
					<td class="td_left"><label for="subject">제목</label></td>
					<td class="td_right">
						<input type="text" name="subject" required="required" value="<%=dtoB.getSubject() %>">
					</td>
				</tr>
				<tr>
					<td class="td_left"><label for="center">내용</label></td>
					<td class="td_right">
						<textarea rows="15" cols="40" required="required" name="content">
							<%=dtoB.getContent() %>
						</textarea>
					</td>
				</tr>
			</table>
			<section id="commandCell">
				<input type="submit" value="수정">
				<input type="reset" value="초기화">
				<input type="button" value="돌아가기" onclick="history.back()">
			</section>
		</form>
	</section>
	
</body>
</html>
