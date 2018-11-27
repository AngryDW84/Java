
package jungsuk3_ex;

class Exercise7_1 { 
	public static void main(String args[]) {
		
		SutdaDeck deck = new SutdaDeck(); 
		for(int i=0; i < deck.cards.length;i++) {
			if (i<deck.cards.length-1) {
				System.out.print(deck.cards[i]+","); 
			} else {
				System.out.print(deck.cards[i]);
			}
		}
	} 
}
