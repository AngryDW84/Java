package jungsuk3_ex;

public class Exercise6_2 {

	public static void main(String[] args) {

		SutdaCard card2 = new SutdaCard(); 
		SutdaCard card1 = new SutdaCard(3, false);

		System.out.println(card1.info());  // 결과 3 
		System.out.println(card2.info());  // 결과 1k 

	}

	
	
}

class SutdaCard {

		int num ;   // 1~ 10 사이 정수  
		boolean isKwang = true; // 광 true . 노광 false

		public SutdaCard() {
			this.num = 1 ; 
			info();
		}

		public SutdaCard(int num, boolean isKwang) {
			this.num = num ;
			this.isKwang = isKwang ; 
		}

		public Object info() {
			if (isKwang != false) {
				return num + "K" ;
			} else {
				return num ;
			}
		}
	}




