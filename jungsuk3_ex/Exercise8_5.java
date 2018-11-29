
package jungsuk3_ex;


class Exercise8_5 {
	
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) throw new ArithmeticException();
			System.out.println(2); 
		} catch(RuntimeException r) {
			System.out.println(3);
			return; 
		} catch(Exception e) {
			System.out.println(4);
			return; 
		} finally {
			System.out.println(5); 
		} 
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true);  // 결과 예측  1 Arithmetic 5 6 
		method(false);  // 결과 예측 1 2 5 6 

	} // main }
}