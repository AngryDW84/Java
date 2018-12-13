//문제 설명
//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
//단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

//재한사항
//s는 길이가 1 이상, 100이하인 스트링입니다.


public class PickCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution() ;
		//		String a = "abcdddddd" ; 
		//		System.out.println(a.length());
//				s.solution("abcd") ;
		String t = "" ; 
				t = s.solution("qwer") ;
//		String t = s.solution("abcde") ;
		System.out.println(t);
	}

}


class Solution {
	public String solution(String s) {
		String answer = "";  // 초기화
		int x = s.length() / 2;
			
		if (s.length() % 2 == 1 ) {
			answer  = ""+s.charAt(x) ; 
		} else {
			answer  = ""+s.charAt(x-1)+s.charAt(x) ; 
		}

		return answer;
	}
}