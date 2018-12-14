//문제 설명
//길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수,
//solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

//제한 조건
//n은 길이 10,000이하인 자연수입니다.



class Solution {
	public String solution(int n) {
		String answer = "";
		
		String str = "수박" ;
		
		for(int j=0 ; j < n/2 ;j++) {
			answer+=str ; 
		}
		if (n % 2 == 0 ) {
			return answer ;
		} else {
			answer += "수" ;
		}
		
		return answer;
	}
}


public class SuBakSuBak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution() ; 
		//	int t = s.solution(12) ;
		String t = s.solution(12) ;
		System.out.println(t);

	}

}
