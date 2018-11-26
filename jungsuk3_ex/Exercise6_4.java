package jungsuk3_ex;

public class Exercise6_4 {

	public static void main(String[] args) {
		
		Student student = new Student() ; 
		student.name = "홍길동";
		student.ban = 1; 
		student.no =1;
		student.kor = 100 ;
		student.eng = 60 ; 
		student.math = 76 ; 
		
		System.out.println(student.name);
		System.out.println(student.getTotal());
		System.out.println(student.getAverage());

	}
}




