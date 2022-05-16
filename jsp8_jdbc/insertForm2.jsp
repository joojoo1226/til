<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinForm</title>
<script type="text/javascript">
	
	function checkIdLength() {
		let idLength = document.fr.id.value.length;
		
		if((idLength < 4) || (idLength > 8)) {
			alert("아이디는 4~8자리 필수!");
			document.fr.id.focus();
		}
		
	}
	
	function checkPasswdLength() {
		let passLength = document.fr.passwd.value.length;
		
		if((passLength < 8) || (passLength > 16)) {
			alert("패스워드는 8~16자리 필수!");
			document.fr.passwd.focus();
		}
	}
	
	function checkPasswd() {
		let passElement = document.getElementById("passwd");
		let passwd2Element = document.getElementById("passwd2");
		let confirmPasswdResult = document.getElementById("confirmPasswdResult");

		let passwd = passElement.value;
		let passwd2 = passwd2Element.value;
		
		if (passwd == passwd2) {
			confirmPasswdResult.innerHTML = "비밀번호 일치";
			confirmPasswdResult.style.color = "lightgreen";
		} else {
			confirmPasswdResult.innerHTML = "비밀번호 불일치";
			confirmPasswdResult.style.color = "red";
		}
	}
	
	function jumin1Focus() {
		if(document.fr.jumin1.value.length == 6) {
			document.fr.jumin2.focus();
		}
	}
	
	function jumin2Focus() {
		if(document.fr.jumin2.value.length == 7) {
			document.fr.email1.focus();
		}
	}
	
	function mailCheck() {
		i = document.fr.emailDomain.selectedIndex;
		let mail = document.fr.emailDomain.options[i].value;
		
		document.fr.email2.value = mail;
	}
	
	function checkAll() {
		if(document.fr.check_all.checked) {
			for(let item of document.fr.hobby) {
				item.checked = true;
			}
			document.getElementById("checkAll").innerHTML = "전체해제";
		} else {
			for(let item of document.fr.hobby) {
				item.checked = false;
			}
			document.getElementById("checkAll").innerHTML = "전체선택";
		}
	}
	
	function checkForm() {
		if(document.fr.name.value == "") {
			alert("이름 입력!");
			document.fr.name.focus();
		} else if(document.fr.id.value == "") {
			alert("아이디 입력!");
			document.fr.id.focus();
		} else if(document.fr.passwd.value == "") {
			alert("비밀번호 입력!");
			document.fr.passwd.focus();
		} else if(document.fr.passwd2.value == "") {
			alert("비밀번호 확인 입력!");
			document.fr.passwd2.focus();
		} else if(document.fr.jumin1.value == "") {
			alert("주민번호 앞자리 입력!");
			document.fr.jumin1.focus();
		} else if(document.fr.jumin2.value == "") {
			alert("주민번호 뒷자리 입력!");
			document.fr.jumin2.focus();
		} else if(document.fr.email1.value == "") {
			alert("이메일 입력!");
			document.fr.email1.focus();
		} else if(document.fr.email2.value == "") {
			alert("이메일 입력!");
			document.fr.email2.focus();
		} else if(document.fr.job.value == "") {
			alert("직업 선택 입력!");
			document.fr.job.focus();
		} else {
			return true;
		}
	} 
	
</script>
</head>
<body>
	<h1>회원가입</h1>
	<br>
	<form action="insertPro2.jsp"  method="post" name="fr">
		<table border="1">
			<tr>
				<td>이름</td>
				<td>
					<input id="name" name="name" type="text">
				</td>
			</tr>
			<tr>
				<td>ID</td>
				<td>
					<input type="text" placeholder="4~8글자 사이 입력" id="id" name="id" onchange="checkIdLength()">
					<input type="button" value="ID 중복확인"
						onclick="window.open('check_id.jsp', 'width=300', height='200')">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input id="passwd" name="passwd" type="password" placeholder="8~16글자 사이 입력" onchange="checkPasswdLength()">
				</td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td>
					<input id="passwd2" name="passwd2" type="password" onkeyup="checkPasswd()"> 
<!-- 					onkeyup : 음절별로 체크 -->
					<span id="confirmPasswdResult"></span>
				</td>
			</tr>
			<tr>
				<td>주민번호</td>
				<td>
					<input type="text" maxlength="6" name="jumin1" id="jumin1" onkeyup="jumin1Focus()">
					-
					<input type="password" maxlength="7" name="jumin2" id="jumin2" onkeyup="jumin2Focus()">
				</td>
			</tr>
			<tr>
				<td>E-Mail</td>
				<td>
					<input type="text" name="email1">
					@
					<input type="text" name="email2" id="email2">
					<select name="emailDomain" id="emailDomain" onchange="mailCheck()">
						<option value="">직접입력</option>
						<option value="naver.com">naver.com</option>
						<option value="daum.net">daum.net</option>
						<option value="google.com">google.com</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>직업</td>
				<td>
					<select name="job">
						<option>항목을 선택하세요</option>
						<option>건물주</option>
						<option>구직자</option>
						<option>강사님❤️</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					<input id="gender" type="radio" name="gender" checked="checked" value="남"> 남성
					<input id="gender" type="radio" name="gender" value="여"> 여성
				</td>
			</tr>
			<tr>
				<td>취미</td>
				<td>
					<input type="checkbox" name="hobby" value="여행"> 여행
					<input type="checkbox" name="hobby" value="독서"> 독서
					<input type="checkbox" name="hobby" value="게임"> 게임
					<input type="checkbox" name="check_all" value="전체선택" onclick="checkAll()">
					<span id="checkAll">전체선택</span>
				</td>
			</tr>
			<tr>
				<td>가입동기</td>
				<td>
					<textarea rows="10" cols="35" name="content"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="가입" >
					<input type="button" value="초기화" onclick="location.reload()">
					<input type="button" value="돌아가기" onclick="window.back()">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>