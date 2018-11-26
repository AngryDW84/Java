package jungsuk3_ex;


class Student {

	String name ;
	int ban ;
	int no ; 
	int kor ;
	int eng ; 
	int math ; 

	int result;
	
	public Student() {
	}
	

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}


	int getTotal(){
		result = this.kor + this.eng + this.math ;
		return result ;

	}

	float getAverage() {
		float Aresult = this.result/3f ;
		Aresult = Aresult*10 ;
		int tmp = (int)Aresult*1 ;
		Aresult = tmp /10.0f ;
		return Aresult; 
	}
	
	String info() {
		return this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math ;
	}

}
