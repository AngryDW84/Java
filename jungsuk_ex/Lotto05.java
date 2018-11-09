package javaStart;

import java.util.ArrayList;

public class Lotto05 {

	public static void main(String[] args) {

		//로또번호

		int		cnt		=	0	;
		int		count	=	7777;  // shuffle
		int		iMax	=	45	;
		int		tmp		= 	0   ;
		int		game1	=	1_000_000;	// 시도
		int		num		=	0	;
		int		iN		=   0  	;
		String 	result	=  "";

		int[]	Lotto	=	new int[iMax] ;
		ArrayList<String> arr = new ArrayList<String>() ;

		for (int i = 0; i < game1; i++) {


			//번호 45 개 나열
			for (int i1 = 0; i1 < Lotto.length; i1++) {
				Lotto[i1] = i1+1 ;
			}
			//			System.out.println(Arrays.toString(Lotto));	

			//셔플
			for (int i1 = 0; i1 < count; i1++) {
				cnt =	(int)(Math.random()*(iMax)+1) ;   
				tmp = Lotto[cnt-1] ;
				Lotto[cnt-1] = Lotto[0] ;
				Lotto[0] = tmp ; 
			}

			//		System.out.println(t+" "+Arrays.toString(Lotto));

			//번호 6개 추출
			int[]	Choose	=	new	int[6]	;
			for (int i1 = 0; i1 < 6; i1++) {
				Choose[i1] = Lotto[i1] ;  
			}
			num++ ;



			//오름차순
			for (int m = 0; m < Choose.length; m++) {
				for (int l = 0; l < Choose.length-1; l++) {
					if (Choose[l] > Choose[l+1]) {
						tmp = Choose[l] ;
						Choose[l]  = Choose[l+1]  ; 
						Choose[l+1] = tmp ; 
					}
				}
			}

			int b1 = Choose[0] ;
			int b2 = Choose[1] ;
			int b3 = Choose[2] ;
			int b4 = Choose[3] ;
			int b5 = Choose[4] ;
			int b6 = Choose[5] ;
			int sum = b1 +b2 +b3 +b4 +b5 +b6 ;

			//조건1
			if (!(sum >= 88 && sum <= 170)) {
				//				System.out.println("조건1");
				continue ;
			}

			//조건2-1
			if (b1 > 17) {
				//				System.out.println("조건2-1");
				continue ; 
			}

			//조건2-2 
			if(b2  >27 || b2 == 26) {
				//				System.out.println("조건2-2");
				continue ;
			}

			//조건2-3 
			if(b3 >34 || b3 < 8 || b3 ==32 ) {
				//				System.out.println("조건2-3");
				continue ;
			}

			//조건2-4
			if(b4  >38 || b4  < 14 ) {
				//				System.out.println("조건2-4");
				continue ;
			}

			//조건2-5
			if(b5  >43 || b5  < 20 || b5  == 22) {
				//				System.out.println("조건2-5");
				continue ;
			}

			//조건2-6
			if(b6  <32 ) {
				//				System.out.println("조건2-6");
				continue ;
			}

			//조건5-1
			if( b2  - b1  > 20 ) { // 16
				//				System.out.println("조건5-1");
				continue ;
			}

			//조건5-2
			if( b3  - b2  > 21 ) { // 17
				//				System.out.println("조건5-2");
				continue ;
			}

			//조건5-3
			if( b4  - b3  > 19 ) { // 15
				//				System.out.println("조건5-3");
				continue ;
			}

			//조건5-4
			if( b5  - b4  > 19 ) {  // 15 
				//				System.out.println("조건5-4");
				continue ;
			}

			//조건5-5
			if( b6  - b5  > 20 ) { //16
				//				System.out.println("조건5-5");
				continue ;
			}

			//조건6-1
			if( b3  - b1  > 23 || b3  - b1  < 2 ) {
				//				System.out.println("조건6-1");
				continue ;
			}

			//조건6-2
			if( b4  - b1  > 33 || b4  - b1  < 6 ) {
				//				System.out.println("조건6-2");
				continue ;
			}

			//조건6-3
			if( b5  - b1  > 39 || b5  - b1  < 13 ) {
				//				System.out.println("조건6-3");
				continue ;
			}

			//조건6-4
			if( b6  - b1  > 44 || b6  - b1  < 22 ) {
				//				System.out.println("조건6-4");
				continue ;
			}

			//조건7-1
			if( b4  - b2  > 26 || b4  - b2  < 2 ) {
				//				System.out.println("조건7-1");
				continue ;
			}

			//조건7-2
			if( b5  - b2  > 32 || b5  - b2  < 8 ) {
				//				System.out.println("조건7-2");
				continue ;
			}

			//조건7-3
			if( b6  - b2  > 40 || b6  - b2  < 13 ) {
				//				System.out.println("조건7-3");
				continue ;
			}

			//조건8-1
			if( b5  - b3  > 26 || b5  - b3  < 2 ) {
				//				System.out.println("조건8-1");
				continue ;
			}

			//조건8-2
			if( b6  - b3  > 34 || b6  - b3  < 7 ) {
				//				System.out.println("조건8-2");
				continue ;
			}

			//조건9--
			if( b6  - b4  > 28 || b6  - b4  < 2 ) {
				//				System.out.println("조건9--");
				continue ;
			}

			//조건10-1
			if( b1  + b2  > 42 || b1  + b2  < 3 ) {
				//				System.out.println("조건10-1");
				continue ;
			}

			//조건10-2
			if( b1  + b3  > 44 || b1  + b3  < 9 ) {
				//				System.out.println("조건10-2");
				continue ;
			}

			//조건10-3
			if( b1  + b4  > 49 || b1  + b4  < 16 ) {
				//				System.out.println("조건10-3");
				continue ;
			}

			//조건10-4
			if( b1  + b5  > 54 || b1  + b5  < 24 ) {
				//				System.out.println("조건10-4");
				continue ;
			}

			//조건10-5
			if( b1  + b6  > 61 || b1  + b6  < 35 ) {
				//				System.out.println("조건10-5");
				continue ;
			}

			//조건12-1
			if( b2  + b3  > 49 || b2  + b3  < 14 ) {
				//				System.out.println("조건12-1");
				continue ;
			}

			//조건12-2
			if( b3  + b4  > 65 || b3  + b4  < 22 ) {
				//				System.out.println("조건12-2");
				continue ;
			}

			//조건12-3
			if( b4  + b5  > 80 || b4  + b5  < 44 ) {
				//				System.out.println("조건12-3");
				continue ;
			}

			//조건12-4
			if( b5  + b6  > 88 || b5  + b6  < 58 ) {
				//				System.out.println("조건12-4");
				continue ;
			}

			//조건13-1
			if( b1  + b2 + b3 > 58 || b1  + b2 + b3  < 6 ) {
				//				System.out.println("조건13-1");
				continue ;
			}

			//조건13-2
			if( b1  + b2 + b3 + b4 > 98 || b1  + b2 + b3 + b4 < 14 ) {
				//				System.out.println("조건13-2");
				continue ;
			}

			//조건13-3
			if( b1  + b2 + b3 + b4 + b5> 135 || b1  + b2 + b3 + b4 + b5 < 25 ) {
				//				System.out.println("조건13-3");
				continue ;
			}






			// char 로 변환
			char[] Cb = {'a','a','a','a','a','a'} ; 
			int[] Ib = { 0, 0, 0 ,0 ,0 ,0} ; 
			for (int s = 0; s < Choose.length; s++) {
				Ib[s] = (int) Choose[s] + 64	; 
				Cb[s] = (char) Ib[s] ; 
			}

			// 
			String str = ""  ;
			for (int j = 0; j < Cb.length; j++) {
				str  += Cb[j];
			}
			//			System.out.println(str);
			arr.add(str) ; 
		}

//		System.out.println(arr.size());


		for (int i = 0; i < arr.size(); i++) {
			iN = 0 ;
			for (int j = 0; j < arr.size(); j++) {
				if (arr.get(i).equals(arr.get(j))) {
					iN++ ; 
					if (iN>2) {
						result = arr.get(i) ; 
//						System.out.println(iN + " " + arr.get(i) + " : " + arr.get(j));	
					}
				}
			}

		}
		

		// char -> 숫자 변환 
//		1 LOS\eh : LOS\eh
		
		char[] Cb = {'a','a','a','a','a','a'} ; 
		int[] Ib = { 0, 0, 0 ,0 ,0 ,0} ; 		
		for (int i = 0; i < Cb.length; i++) {
			Cb[i] = result.charAt(i) ; 
			Ib[i] = (int) Cb[i] - 64 ; 
		}
		result = "" ;
		for (int i = 0; i < Ib.length; i++) {
			result = result + Ib[i] + " :" ;
		}
		System.out.println("당첨번호는 ? " + result);
		
		
	}  // end of main

} // end of class
