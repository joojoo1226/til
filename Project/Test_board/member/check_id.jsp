<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>check_id</title>
<script type="text/javascript">
	
	function checkID() {
		let idElement = document.getElementById("id");
		
		let id = idElement.value;
		
		let checkIdResult = document.getElementById("checkIdResult");
		
// 		if (id == "admin") {
// 			checkIdResult.innerHTML = "이미 사용중인 아이디";
// 			checkIdResult.style.color = "RED";
// 		} else {
// 			checkIdResult.innerHTML = "사용 가능한 아이디<br>" + 
// 										"<input type='button' value='아이디 사용' onclick='useId()'>";
// 			checkIdResult.style.color = "lightgreen";
// 		}
	
		checkIdResult.innerHTML = "사용 가능한 아이디<br>" + 
			"<input type='button' value='아이디 사용' onclick='useId()'>";
		checkIdResult.style.color = "lightgreen";
	}
	
	function useId() {
		window.opener.document.fr.id.value = document.fr.id.value;
		window.close();
	}
	
	
</script>
</head>
<body>
	<h1>ID 중복 체크</h1>
	<form action="" name="fr">
		<input type="text" name="id" id="id">
		<input type="button" value="중복확인" onclick="checkID()">
		<br>
		<div id="checkIdResult"></div>
	</form>
</body>
</html>