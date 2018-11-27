
package jungsuk3_ex;

class Exercise7_18 {
	/* 메서드를 작성하시오 (1) action . */

	private static void action(Robot r) {
		
		if (r instanceof DanceRobot) {
			DanceRobot ee = (DanceRobot) r;
			ee.dance();
		}
		if (r instanceof SingRobot) {
			SingRobot ee = (SingRobot) r;
			ee.sing();
		}
		if (r instanceof DrawRobot) {
			DrawRobot ee = (DrawRobot) r;
			ee.draw();
		}
		
	}
	
	public static void main(String[] args) { 
		Robot[] arr  = { new DanceRobot(), new SingRobot(), new DrawRobot() };

		for(int i=0; i< arr.length;i++) { 
			action(arr[i]);
		}
	} // main }
}




class Robot { }

class DanceRobot extends Robot {
	void dance() {
		System.out.println(" 춤을 춥니다."); 
	} 
} 

class SingRobot extends Robot {
	void sing() {
		System.out.println(" 노래를 합니다."); 
	} 
}

class DrawRobot extends Robot { 
	void draw() {
		System.out.println(" 그림을 그립니다."); 
	} 
}

