<<<<<<< HEAD
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
<style type="text/css">
	#deleteForm {
		width: 300px;
		margin:auto;
		border: 1px solid #ccdbe2;
	}
	
	h1 {
		text-align: center;
	}
	
	table {
		width: 300px;
		margin:auto;
		text-align: center;
	}
</style>
<title>글 삭제</title>
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
	
	<h1>글 삭제</h1>
	
	<section id="deleteForm">
		<form action="delete_pro.jsp" method="post">
			<input type="hidden" name="idx" value="<%=idx %>">
			<table>
				<tr>
					<td><label>비밀번호</label></td>
					<td>
						<input type="password" name="passwd" required="required">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="삭제">
						<input type="button" value="돌아가기" onclick="history.back()">
					</td>
				</tr>
			</table>
		</form>
	</section>

</body>
=======
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
<style type="text/css">
	#deleteForm {
		width: 300px;
		margin:auto;
		border: 1px solid #ccdbe2;
	}
	
	h1 {
		text-align: center;
	}
	
	table {
		width: 300px;
		margin:auto;
		text-align: center;
	}
</style>
<title>글 삭제</title>
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
	
	<h1>글 삭제</h1>
	
	<section id="deleteForm">
		<form action="delete_pro.jsp" method="post">
			<input type="hidden" name="idx" value="<%=idx %>">
			<table>
				<tr>
					<td><label>비밀번호</label></td>
					<td>
						<input type="password" name="passwd" required="required">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="삭제">
						<input type="button" value="돌아가기" onclick="history.back()">
					</td>
				</tr>
			</table>
		</form>
	</section>

</body>
>>>>>>> 2e779ec8b031d986791e4219c0909ce2dc765d41
</html>