package jungsuk_ex;
import java.io.File;
import java.util.*; 

public class SungJukEx7 {

	public static void main(String[] args) {
		
		ArrayList<Student7> list = new ArrayList<Student7>();

		Scanner sc = null;

		try {
			sc = new Scanner(new File(args[0])); 		
		} catch(Exception e) {
			System.out.println(args[0] + " - �����Ͻ� ������ ã�� �� �����ϴ�.");
			System.exit(0);
		}

		while (sc.hasNextLine()) {
			
			  String line = sc.nextLine(); 
			  Scanner sc2 = new Scanner(line).useDelimiter(","); 

			  String name   = sc2.next();
			  int classNo   = sc2.nextInt();
			  int studentNo = sc2.nextInt();
			  int korean    = sc2.nextInt();
			  int math      = sc2.nextInt();
			  int english   = sc2.nextInt();
			  
			  list.add(new Student7(name,classNo,studentNo,korean,math,english)); 
		} 		

		calculateSchoolRank(list); // ��������� ����Ѵ�.
		calculateClassRank(list);  // �ݵ���� ����Ѵ�.
		printList(list);
	} 

	public static void printList(List<Student7> list) {
		System.out.println("이름       반     번호    국어     수학      영어          총점        전교등수        반등수");
		System.out.println("=============================================================");

		for(Student7 s : list)  {
			System.out.println(s);
		}

		System.out.println("=============================================================");

	}

	public static void calculateSchoolRank(List<Student7> list) {
		Collections.sort(list);

		int prevRank  = -1;
		int prevTotal = -1;
		int length    = list.size();

		for(int i=0;i < length; i++) {
			Student7 s = list.get(i);

			if(s.total==prevTotal) {
				s.schoolRank = prevRank;
			} else {
				s.schoolRank = i + 1;
			}

			prevRank  = s.schoolRank;
			prevTotal = s.total;
		}
	} // public static void calculateSchoolRank(List<Student> list) {

	public static void calculateClassRank(List<Student7> list) {
		Collections.sort(list, new ClassTotalComparator7());

		int prevClassNo = -1;
		int prevRank    = -1;
		int prevTotal   = -1;
		int length = list.size();

		for(int i=0, n=0; i < length; i++, n++) {
			Student7 s = list.get(i);

			if(s.classNo!=prevClassNo) {
				prevRank  = -1;
				prevTotal = -1;
				n = 0;
			}

			if(s.total==prevTotal) {
				s.classRank = prevRank;
			} else {
				s.classRank = n + 1;
			}

			prevClassNo = s.classNo;
			prevRank    = s.classRank;
			prevTotal   = s.total;
		}
	} // public static void calculateClassRank(List<Student> list) {
} 

class Student7 implements Comparable<Student7> {
	final static int LEFT   = 0;
	final static int CENTER = 1;
	final static int RIGHT  = 2;
	
	String name   = "";
	int classNo   = 0;
	int studentNo = 0;
	int korean    = 0;
	int math      = 0;
	int english   = 0;

	int total = 0;

	int schoolRank = 0; // �������
	int classRank  = 0; // �ݵ��

	Student7(String name, int classNo, int studentNo, int korean, int math, int english) {
		this.name      = name;
		this.classNo   = classNo;
		this.studentNo = studentNo;
		this.korean    = korean;
		this.math      = math;
		this.english   = english;

		total = korean + math + english;
	}

	public String toString() {
		return format(name,          5, LEFT)
		     + format(""+classNo,    4, RIGHT)
		     + format(""+studentNo,  4, RIGHT)
		     + format(""+korean,     6, RIGHT)
		     + format(""+math,       6, RIGHT)
		     + format(""+english,    6, RIGHT)
		     + format(""+total,      8, RIGHT)
		     + format(""+schoolRank, 8, RIGHT)
		     + format(""+classRank,  8, RIGHT);
	}

	public int compareTo(Student7 obj) {
		return obj.total - this.total;
//		return this.name.compareTo(obj.name);  // �̸��������� �������� ����
	}

/*  ���׸���(Generics) ������� ���� ����
	public int compareTo(Object obj) {
		int result = -1;

		if(obj instanceof Student) {
			Student tmp = (Student)obj;

			result = tmp.total - this.total;
		}

		return result;
	}
*/

	public static String format(String str, int length, int alignment) { 
		if(str==null) str = "";

		int diff = length - str.length(); 
		if(diff < 0) return str.substring(0, length); 

		char[] source = str.toCharArray(); 
		char[] result = new char[length]; 

		// �迭 result�� �������� ä���. 
		for(int i=0; i < result.length; i++) 
			result[i] = ' '; 

		switch(alignment) { 
			case CENTER : 
				System.arraycopy(source, 0, result, diff/2, source.length); 
				break; 
			case RIGHT : 
				System.arraycopy(source, 0, result, diff, source.length); 
				break; 
			case LEFT : 
			default : 
				System.arraycopy(source, 0, result, 0, source.length); 
		} 

		return new String(result); 
	} // public static String format(String str, int length, int alignment) { 

} // end of class Student

class ClassTotalComparator7 implements Comparator<Student7> {
	public int compare(Student7 s1, Student7 s2) {
		int result = s1.classNo - s2.classNo;

		if(result==0)
			result = s2.total - s1.total;

		return result;
	}
}

class ClassStudentNoComparator7 implements Comparator<Student7> {
	public int compare(Student7 s1, Student7 s2) {
		int result = s1.classNo - s2.classNo;

		if(result==0)
			result = s1.studentNo - s2.studentNo;

		return result;
	}
}

/*
>java SungjukEx7 scoredata.txt
scoredata.txt - �����Ͻ� ������ ã�� �� �����ϴ�.

>java SungjukEx7 score_data.txt

�̸�     ��  ��ȣ  ����  ����  ����   ����  �������  �ݵ��
============================================================
�ڹ�¯     1   1   100   100   100     300       1       1
ŷ��¯     1   2   100    60    90     250       6       2
�ְ��     1   3   100    80    60     240       9       3
�̿���     2   2    90    90    90     270       3       1
������     2   3    70    80   100     250       6       2
������     2   4    80    80    85     245       8       3
ȫ�浿     2   1    50    80   100     230      10       4
���ü�     3   2   100   100   100     300       1       1
���ڹ�     3   1    90   100    80     270       3       2
�ڹٿ�     3   3    70   100   100     270       3       2
============================================================
*/
