
package jungsuk3_ex;

class Exercise8_6 {

	public static void main(String[] args) {

		try {
			method1(); 
		} catch(Exception e) {
			System.out.println(5); 
		} 
	} 

	static void method1() {
		try { 
			method2();        // 결과 예측   널포인트에러 던져,  2 3 4 5   //  3 5    
			System.out.println(1);      
//		} catch(NullPointerException e1) {
//			System.out.println("NullPointer");
		} catch(ArithmeticException e) {
			System.out.println(2); 
		} finally {
			System.out.println(3); 
		} 
		System.out.println(4);  // 실행 안될 수 있음.  
	} // method1()

	static void method2() {
		throw new NullPointerException(); 
	} 
}
