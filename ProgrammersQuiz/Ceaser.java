//문제 설명
//어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
//예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. 
//z는 1만큼 밀면 a가 됩니다. 
//문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, 
//solution을 완성해 보세요.


//class Solution {
//	public String solution(String s, int n) {
//		String answer = "";
//
//		//----------------------------------------
//
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println((int)(s.charAt(i)));
//			if ( ((int)(s.charAt(i)) >= 65) && ((int)(s.charAt(i)) <= 122) )  {
//				if ((int)(s.charAt(i)+n) > 122 ) {
//					answer += (char)(s.charAt(i)+n - 26) ;
//				} else if ( (int)(s.charAt(i)) >= 97 && (int)(s.charAt(i)+n) < 123 ) {
//					answer += (char)(s.charAt(i)+n) ;
//				} else if ( (int)(s.charAt(i)) >= 90 && (int)(s.charAt(i)+n) < 122 ) {
//					answer += (char)(s.charAt(i)+n - 26) ;
//				} else if ( (int)(s.charAt(i)) >= 65 && (int)(s.charAt(i)+n) > 90 ) {
//					answer += (char)(s.charAt(i)+n - 26) ;
//				} else if ( (int)(s.charAt(i)) >= 65 && (int)(s.charAt(i)+n) < 91 ) {
//					answer += (char)(s.charAt(i)+n ) ;
//				} else {
//					answer += (char)(s.charAt(i)+n);
//				}
//				
//			} else if( s.charAt(i) ==' '){
//				answer += s.charAt(i);
//			} else {
//				answer += " " ; 
//			}
//		}
//		
//		//----------------------------------------
//		return answer;
//	}
//}
//
//
//public class Ceaser {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz y!" ;
////		String str = "y" ;
//		int n = 1 ;
//		
//		Solution s = new Solution() ; 
//		String t = s.solution(str, n) ; 
//		System.out.println(t+"+");
//	}
//
//}



//for (int i = 0; i < s.length(); i++) {
//	System.out.println((int)(s.charAt(i)));
//	if ( ((int)(s.charAt(i)) >= 65) && ((int)(s.charAt(i)) <= 122) )  {
//		if ((int)(s.charAt(i)+n) > 122 ) {
//			answer += (char)(s.charAt(i)+n - 26) ;
//			System.out.println("1"+(int)(s.charAt(i)));
//		} else if ( (int)(s.charAt(i)) >= 97 && (int)(s.charAt(i)+n) < 123 ) {
//			answer += (char)(s.charAt(i)+n) ;
//			System.out.println("2"+(int)(s.charAt(i)));
//		} else if ( (int)(s.charAt(i)) >= 90 && (int)(s.charAt(i)+n) < 122 ) {
//			answer += (char)(s.charAt(i)+n - 26) ;
//			System.out.println("3"+(int)(s.charAt(i)));
//		} else if ( (int)(s.charAt(i)) >= 65 && (int)(s.charAt(i)+n) > 90 ) {
//			answer += (char)(s.charAt(i)+n - 26) ;
//			System.out.println("4"+(int)(s.charAt(i)));
//		} else if ( (int)(s.charAt(i)) >= 65 && (int)(s.charAt(i)+n) < 91 ) {
//			answer += (char)(s.charAt(i)+n ) ;
//			System.out.println("5"+(int)(s.charAt(i)));
//		} else {
//			answer += (char)(s.charAt(i)+n);
//			System.out.println("6"+(int)(s.charAt(i)));
//		}
//		
//	} else if( s.charAt(i) ==' '){
//		answer += s.charAt(i);
//	} else {
//		answer += " " ; 
//	}
//}
