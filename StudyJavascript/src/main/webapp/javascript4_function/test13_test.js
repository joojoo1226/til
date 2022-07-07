/**
 * 
 */
 function checkNumGame() {
	var num = prompt();
	var correctNum = 10;
	
	let total = 1;
	
	while(correctNum) {
		if(num > correctNum) {
			alert("입력받은 숫자보다 큽니다!");
			num = prompt("다시 입력");
			total +=1;
		} else if (num < correctNum) {
			alert("입력받은 숫자보다 작습니다!");
			num = prompt("다시 입력");
			total +=1;
		} else {
			alert(total + "번 만에 정답입니다!"); break;
			
		} 
	}

	
	
}

