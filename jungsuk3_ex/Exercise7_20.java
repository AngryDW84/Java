package jungsuk3_ex;

class Exercise7_20 {

	public static void main(String[] args) {
		Parent20 p = new Child20(); 
		Child20 c = new Child20(); 
		System.out.println("p.x = " + p.x); // 100 
		p.method();   // parent   -> child    // 오버라이딩
		System.out.println("c.x = " + c.x);   // 200
		c.method();   // child
	}
}


class Parent20 { 
	int x = 100; 
	void method() { 
		System.out.println("Parent Method"); 
	} 
}

class Child20 extends Parent20 {
	int x = 200;
	void method() {
		System.out.println("Child Method"); 
	}
}
