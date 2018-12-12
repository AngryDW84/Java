
public class TakeArrayEx {
	

	public static void main(String[] args) {
		
		Solution solution = new Solution() ;
		System.out.println(solution.solution("a234")); ; 
		System.out.println(solution.solution("1234")); ; 
		System.out.println(solution.solution("CCCCCCCC")); ; 
		
	}
	
}


class Solution {
	
	  public boolean solution(String s) {
	      boolean answer = true;
	      if (s.length() >= 1 && s.length() <= 8) {
			
	    	  char[] t = s.toCharArray() ;
		      for (int i = 0; i < t.length; i++) {
				if ( (t[i] >= 'a' && t[i] <= 'z') ||(t[i] >= 'A' && t[i] <= 'Z') ) {
					answer = !answer ;
					break; 
				} else {
					return answer ;
				}
			}
		} 
	      
	      
	      return answer;
	  }
	}
