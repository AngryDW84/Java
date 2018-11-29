
package jungsuk3_ex;

import java.util.*; 
class Exercise8_8 {
	public static void main(String[] args) {
		// 1~100 answer 사이의 임의의 값을 얻어서 에 저장한다 .  

		int answer = (int)(Math.random() * 100) + 1; 
		//		사용자입력을 저장할 공간
		int input = 0; // 시도횟수를 세기 위한 변수
		int count = 0; // 
		do { count++; 

		System.out.print("1과 100사이의 값을 입력하세요 100 :");
		try {
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();	

			if (input < 1 || input > 100) {
				System.out.println("1과 100 사이 값을 입력하세요 :");
				continue ;
			}
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요 ."); 
			} else if(answer < input) {
				System.out.println("더 작은 수를 입력하세요 ."); 
			} else { 
				System.out.println("맞췄습니다  .");
				System.out.println("시도횟수는  "+count+" 번입니다.");
				break; //문을 벗어난다  
			} // do-while }
	
		} catch (Exception e) {
			System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요 .");
			continue;
		}
	} while(true); // 무한반복문


	} // end of main 
} // end of class HighLow
