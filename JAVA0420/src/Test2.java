
public class Test2 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		
		for (i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
			
			for (j = 1; j <= 5; j++) {
				System.out.println("---> j = " + j);
			}
		}
		
		System.out.println("==================");
		
		int h = 0, m = 0, s = 0;
		
		for (m = 0; m <= 59; m++) {
			for (s = 0; s <= 59; s++) {
				System.out.println(m + "분 " + s + "초");
			}
		}
		
		System.out.println("==================");
		
		i = 0;
		j = 0;
		
		for (i = 2; i <= 9; i++) {
			System.out.println("< " + i + "단 >");
			for (j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
		System.out.println("==================");
		
		int dice1 = 0;
		int dice2 = 0;
		
		for (dice1 = 1; dice1 <= 6; dice1++) {
			
			for(dice2 = 1; dice2 <= 6; dice2++) {
				
				if((dice1 + dice2) == 6 ) {
//					System.out.println(dice1 + " + " + dice2 + " = " + (dice1 + dice2));
					System.out.printf("%d + %d = 6\n", dice1, dice2);
				}
			}
		}
		
		System.out.println("==========================");
		
		int x = 0;
		int y = 0;
		
		for (x = 0; x <= 10; x++) {
			
			for (y = 0; y <= 10; y++) {
				if ((4*x + 5*y) ==60) {
					System.out.println(x + " "+ y);
				}
			}
		}
	}

}

/*
 * 내 앞에 있는 안내 근무자의 안내를 받아
 * 한자리에 두 분씩
 * 한 보트에 열분이서
 * 머리 젖습니다
 * 옷도 젖습니다
 * 신발 젖습니다
 * 양말까지 젖습니다
 * 옷 머리 신발 양말 다 다 젖습니다
 * 물에 젖고 물만 맞는
 * 여기는~ 아마존!
 * 아! 마! 존조로존조로존~
 * 물에 젖고 물만 맞는
 * 여기는~ 아마존입니다!
 * 한자리에 두 분
 * 한 보트에 열 분
 * 돌아가는 십인승에 보트를 타고
 * 한자리에 두 분
 * 한 보트에 열 분 까지 다~ 젖습니다
 * 머리x3 옷x3 신발이~ 양말이~
 * 다 다 다 다 젖습니다!
 * 머리부터 머리 머리부터 옷 머리부터 신발 머리부터 양말
 * 옷 머리 신발 양말 신발 양말 머리 싹 다
 * 젖습니다~ 젖는겁니다 젖습니다~ 젖는겁니다 젖습니다
 * 안 젖을 수 없는 여기는 아마아마 존~ 
 */

/*
 * 위로~ 아래로~ 위로~ 아래로~
 * 웰컴투 아마존 익스프레스~
 */
