
package jungsuk3_ex;

class Exercise8_10 {

	public static void main(String[] args) {
		try { 
			method1(); 
			System.out.println(6); 
		} catch(Exception e) {
			System.out.println(7); 
		} 
	}

	static void method1() throws Exception {
		try {
			method2();							// 결과 예측 1 2 3 4  6 7  // 답 2 4 7   
			System.out.println(1); 
		} catch(NullPointerException e) {
			System.out.println(2);
			throw e;                        // 이게 관건. 
		} catch(Exception e) {
			System.out.println(3); 
		} finally {
			System.out.println(4); 
		} 
		System.out.println(5); 
	} // method1() 

	static void method2() {
		throw new NullPointerException(); 
	}

}


