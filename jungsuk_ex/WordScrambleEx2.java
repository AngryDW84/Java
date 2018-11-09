package jungsuk_ex;

//[문제2] 다음의 예제에서 while문의 내부를 주석의 내용을 참고해서 완성하세요.

import java.util.*; 

class WordScrambleEx2 { 
	
      public static void main(String[] args) { 
            String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

            String answer = getAnswer(strArr); 
            String question = getScrambledWord(answer); 

            while(true) { 
                  System.out.println("Question :" + question); 
                  System.out.print("Your answer is :"); 
                  

                  // 1. 화면을 통해 사용자의 입력을 받는다.(Scanner클래스 사용)
                  Scanner sc = new Scanner(System.in) ;
                  String str = sc.nextLine();
                  // 2. 사용자가 q 또는 Q를 입력하면 프로그램을 종료한다.
                  if (str.equals("q")|| str.equals("Q")) {
                	System.out.println("종료합니다.");
					break;
                  } else if(str.equals("")) {
                	System.out.println("입력해주세요");
                	continue;
                  } else if(str.equals(answer)){
                	  System.out.println("정답입니다.");
                	break;    
                  } else {
                	  System.out.println(str+ "은/는 정답이 아닙니다. 다시 시도해보세요.");
                	continue;
                  }
                  
                  // 3. 사용자가 정답을 맞출때까지 반복하다가

            } // while 

      } // main 

      public static String getAnswer(String[] strArr) { 
            int idx = (int)(Math.random()*strArr.length); 
            return strArr[idx]; 
      } 
      
      public static String getScrambledWord(String str) { 
            char[] chArr = str.toCharArray(); 

            for(int i=0;i<str.length();i++) {
                   int idx = (int)(Math.random()*str.length()); 
                  
                  char tmp = chArr[i]; 
                  chArr[i] = chArr[idx]; 
                  chArr[idx] = tmp; 
            } 

            return new String(chArr); 
      } // scramble(String str) 

}


//[실행결과]
//
//Question :HEOP
//Your answer is :phoe
//phoe은/는 정답이 아닙니다. 다시 시도해보세요.
//Question :HEOP
//Your answer is :hope
//정답입니다.

 

//[참고]Math.random()을 사용하기 때문에 위의 실행결과와 다를 수 있습니다.

//[출처] [Java1000제]Word Scramble 2 - 단어 맞추기(1번답 포함) (남궁성의 코드초보스터디(자바 java, c언어, javascript, python) |작성자 남궁성