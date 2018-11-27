package jungsuk3_ex;

public class SutdaCard {
	int num; 
	boolean isKwang; 
	SutdaCard() { this(1, true); } 
	SutdaCard(int num, boolean isKwang) { 
		if (num == 1 || num == 3 ||num == 8 ) { isKwang = true ;}
		if (num>10) { num = num-10  ;}
		this.num = num; this.isKwang = isKwang; }
	//	info() Object .대신 클래스의 toString() 을 오버라이딩했다 
	public String toString() { return num + ( isKwang ? "K":""); }
}
