package jungsuk_ex;

class WordScrambleEx1 { 
    public static void main(String[] args) { 
          String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW","GRAPE"}; 

//          [문제1] 다음의 예제를 완성하시오.
//          getScrambledWord(String str)는 주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 
//          새로운 문자열로 반환한다.(Math.random()사용)
//        	getAnswer(String[] strArr)는 배열strArr의 요소중의 하나를 임의로 골라서 반환한다.(Math.random()사용)
          
          String answer = getAnswer(strArr); 
          String question = getScrambledWord(answer); 

          System.out.println("Question:"+question); 
          System.out.println("Answer:"+answer); 
    } // main 

    public static String getScrambledWord(String str) { 
    	// 내용을 완성하세요.
    	int k = str.length() ;
    	char[] ck = new char[k];
    	String result = "" ;
    	
    	for (int i = 0; i < ck.length; i++) {
    		ck[i] = str.charAt(i) ;
		}
    	for (int i = 0; i < ck.length-1; i++) {
    		char tmp = ck[0] ;
    		ck[0] = ck[i+1] ; 
    		ck[i+1] = tmp ;
		}
    	for (int i = 0; i < ck.length; i++) {
		 result += ck[i];	
		}

    	return result ;
    	
    } // scramble(String str) 

    public static String getAnswer(String[] strArr) { 
         // 내용을 완성하세요.

    	String result = null;
    	int k = (int)(Math.random()*strArr.length)+1; 
    	for (int i = 0; i < k; i++) {
			result = strArr[i] ; 
		}
    	return result ;
    } 
    
}
