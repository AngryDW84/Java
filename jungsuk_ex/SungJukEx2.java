package jungsuk_ex;
import java.util.*; 

public class SungJukEx2 {

//	[문제2] Student클래스가 Comparable인터페이스를 구현해서, list를 총점(total) 내림차순으로 정렬되도록 하는 예제입니다.
//	아래의 코드를 완성하세요.
//	[예제SungJukEx2.java]

	public static void main(String[] args) { 
		
		ArrayList<Student1 > list = new ArrayList<Student1 >(); 

		//                     이름, 반, 번호, 국어, 수학, 영어 
		list.add(new Student1 ("남궁성", 3,2,100,100,100)); 
		list.add(new Student1 ("왕자바", 3,1,90,100,80)); 
		list.add(new Student1 ("자바왕", 3,3,70,100,100)); 
		list.add(new Student1 ("킹왕짱", 1,2,100,60,90)); 
		list.add(new Student1 ("자바짱", 1,1,100,100,100)); 
		list.add(new Student1 ("최고수", 1,3,100,80,60)); 
		list.add(new Student1 ("홍길동", 2,1,50,80,100)); 
		list.add(new Student1 ("일지매", 2,3,70,80,100)); 
		list.add(new Student1 ("변강쇠", 2,4,80,80,85)); 
		list.add(new Student1 ("이원구", 2,2,90,90,90));

		Collections.sort(list);
		printList(list); 
	} 

	public static void printList(List<Student1 > list) { 
		System.out.println("이름\t반\t번호\t국어\t수학\t영어\t총점 "); 
		System.out.println("===================================================="); 

		for(Student1  s : list) { 
			System.out.println(s); 
		} 

		System.out.println("===================================================="); 
	} 

} 

class Student1 implements Comparable<Student1>{

	private String name;
	private int classNo;
	private int studentNo;
	private int korean;
	private int math;
	private int english;
	private int total ; 

	public Student1 () {
		// TODO Auto-generated constructor stub
	}

	public Student1 (String name, int classNo, int studentNo, int korean, int math, int english) {
		// TODO Auto-generated constructor stub
		this.name = name ;
		this.classNo = classNo ;
		this.studentNo = studentNo ;
		this.korean = korean ;
		this.math = math ;
		this.english = english ;
		this.total = korean + math + english ; 
	}

	@Override
	public String toString() {
		return name +"\t"
				+  classNo +"\t"
				+  studentNo +"\t"
				+  korean +"\t"
				+  math +"\t"
				+  english +"\t"
				+  total ;
	}

	@Override
	public int compareTo(Student1 obj) {
//		System.out.println(obj.total + " " + total + " " + (obj.total- total));
		return obj.total- total;   // 내림차순
//		return total- obj.total;   // 오름차순
	}

	
}

//[실행결과] - 이전 결과와는 달리, 총점이 높은순서에서 낮은 순서로 내림차순 정렬되어있음을 확인하세요.
//
//이름    반     번호    국어    수학    영어    총점
//====================================================
//남궁성  3       2       100     100     100     300
//자바짱  1       1       100     100     100     300
//왕자바  3       1       90      100     80      270
//자바왕  3       3       70      100     100     270
//이원구  2       2       90      90      90      270
//킹왕짱  1       2       100     60      90      250
//일지매  2       3       70      80      100     250
//변강쇠  2       4       80      80      85      245
//최고수  1       3       100     80      60      240
//홍길동  2       1       50      80      100     230
//====================================================






