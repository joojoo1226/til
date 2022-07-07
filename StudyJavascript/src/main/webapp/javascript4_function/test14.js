/**
 * 
 */
	
function checkNumGame2(num) {
	
	let correctNum = 10; // 저장된 숫자(정답)
	
	// 저장된 숫자(correctNum)와 입력받은 숫자(num) 비교
	if(correctNum > num) {
		alert("입력받은 숫자보다 큽니다!");
	} else if(correctNum < num) {
		alert("입력받은 숫자보다 작습니다!");
	} else { // else if(correctNum == num) 와 동일
		alert("정답입니다!");
	}
}

function checkPassword(pass) {
	
	
	if(pass != "1234") {
		alert("ㅍㅐ스워드 불일치!");
	} else {
		alert("패스워드 일치!");
	}
	
}


// test14.js 파일의 login() 함수를 호출하여 전달인자로 아이디(id)와 패스워드(passwd) 전달
// ex) 아이디 : 'admin', 패스워드 : '1234'
// => 그 다음 아이디와 패스워드 판별하여 결과 출력하기
//    ex) 아이디가 "admin" 이고 패스워드가 "1234" 일 경우 "로그인 성공!" 출력하고
//         아이디가 "admin" 이 아니면 "존재하지 않는 아이디!" 출력하고
//        아이디가 "admin" 이 맞으나 패스워드가 "1234" 가 아닐 경우 "패스워드 틀림!" 출력하기

//function login(id, pass) {
//	
//	alert("입력하신 아이디는 " + id + "이고, 패스워드는 " + pass + "입니다.");
//	
//	if ((id == "admin") && (pass == "1234")) {
//		alert("로그인 성공!");
//	} else if (id != "admin") {
//		alert("존재하지 않는 아이디!");
//	} else if ((id == "admin") && (pass != "1234")) {
//		alert("패스워드 틀림!");
//	}
//	
//}

function login(id, pass) {
	
	alert("입력하신 아이디는 " + id + "이고, 패스워드는 " + pass + "입니다.");
	
	if(id == "admin") {
		if(pass == "1234") {
			alert("로그인 성공!");
		} else {
			alert("패스워드 틀림!");
		}
	} else {
		alert("존재하지 않는 아이디!");
	}
	
}

