package jungsuk3_ex;

public class SutdaDeck {

	
	final int CARD_NUM = 20; 
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() { /* 배열 를 적절히 초기화 하시오 (1) SutdaCard . */
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new SutdaCard((i+1),false) ; 
		}
	}
	
	void shuffle(){
		SutdaCard tmp = null;
		for (int i = 0; i < cards.length; i++) {
			int t = (int)(Math.random()*20) ;  
			tmp = cards[0] ;
			cards[0] = cards[t] ; 
			cards[t] = tmp  ;	
		}
		
	}
	
	SutdaCard pick() {
		int i = (int)(Math.random()*20) ; 
		return cards[i];
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}

}
