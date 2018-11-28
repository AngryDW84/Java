package jungsuk3_ex;

class Exercise7_19 {

	public static void main(String args[]) {
		
		Buyer b = new Buyer(); 
		b.buy(new Tv19());
		b.buy(new Computer());
		b.buy(new Tv19());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
//		b.buy(new Computer());
		b.summary();
		
	}
} 

class Buyer { 
	int money = 1000;
	Product19[] cart = new Product19[3]; //구입한 제품을 저장하기 위한 배열 //
	int i = 0; //배열 에 사용될 // //Product cart index
	void buy(Product19 p) {   
		
		if (money < p.price) {
			System.out.println("물건 못사요 돈없음");
			System.exit(0); }
		money = money - p.price ; 
//		System.out.println(money);
		add(p) ;
		
		/* 아래의 로직에 맞게 코드를 작성하시오 (1) . 
		 * 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다
		 * 1.1 . 가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고 
		 * 1.2 , 장바구니에 구입한 물건을 담는다 메서드 호출 
		 * 1.3 .(add )	*/
	} 
	void add(Product19 p) {
		if (i >= cart.length) {	
			  Product19[] tmp = new Product19[(cart.length+1)] ;
			  System.arraycopy(cart, 0, tmp, 0, cart.length);
			  cart = tmp ;
		}
		cart[i] = p; 
		i++;
		
		/* 아래의 로직에 맞게 코드를 작성하시오 (2) . 
		 * i의 값이 장바구니의 크기보다 같거나 크면
		 * 1.1  기존의 장바구니보다 배 큰 새로운 배열을 생성한다 
		 * 1.1.1 2 . 기존의 장바구니의 내용을 새로운 배열에 복사한다 
		 * 1.1.2 . 새로운 장바구니와 기존의 장바구니를 바꾼다
		 * 1.1.3 . 물건을 장바구니 에 저장한다 그리고 의 값을 증가시킨다 
		 * 1.2 (cart) . i 1 . */ 
	} // add(Product p) 
	
	
	void summary() { 
		for (int i = 0; i < cart.length; i++) {
			System.out.print(cart[i]+ " ");
		}
		System.out.println("");
//		System.out.println(i);
		System.out.println("물건 산 값 "+ (1000 - money));
		System.out.println("물건 사고 남은 돈 "+ money);
		/* 아래의 로직에 맞게 코드를 작성하시오 (3) 
		 * 1.1. 장바구니에 담긴 물건들의 목록을 만들어 출력한다 
		 * 1.2 . 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다 
		 * 1.3 . 물건을 사고 남은 금액 (money)를 출력한다 
 		 */ 
	} // summary()
} 


class Product19 { 
	int price; //제품의 가격 // 
	Product19(int price) { 
		this.price = price; 
	} 
} 

class Tv19 extends Product19 {
	Tv19() { super(100); } 
	public String toString() { return "Tv"; } 
} 

class Computer extends Product19 { 
	Computer() { super(200); } 
	public String toString() { return "Computer";} 
} 

class Audio extends Product19 { 
	Audio() { super(50); } 
	public String toString() { return "Audio"; } 
}



//	[결과]
//	잔액이 부족하여 Computer을 를 살수 없습니다  / .
//	구입한 물건:Tv,Computer,Tv,Audio,Computer,Computer, 
//	사용한 금액:850 
//	남은 금액:150