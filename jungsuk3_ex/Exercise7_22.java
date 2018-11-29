package jungsuk3_ex;

class Exercise7_22 {

	/* 메서드를 작성하시오 (1) sumArea . */
	private static String sumArea(Shape[] arr) {
		
		double sum = 0 ;
		for (Shape shape : arr) {
			double t = shape.calcArea() ;
			 sum += t; 
		}
		return new String(sum+"");
	}

	public static void main(String[] args) { 
		Shape[] arr = { new Circle(5.0) , new Rectangle(3,4) , new Circle(1) };
		//		
		System.out.println( " 면적의 합  :" + sumArea(arr) ); 
	}


}


abstract class Shape {

	Point p; 
	Shape() { this( new Point(0,0) ); } 
	Shape(Point p) { this.p = p; } 
	abstract double calcArea(); //도형의 면적을 계산해서 반환하는 메서드 

	Point getPosition() {	return p;	} 
	void setPosition(Point p) {	this.p = p;	}

}

class Point {

	int x; 
	int y; 
	Point() { this(0,0); } 
	Point(int x, int y) { this.x=x; this.y=y;} 

	public String toString() { return "["+x+","+y+"]"; }

}

class Circle extends Shape {
	double r ; //반지름 

	public Circle(double r) {
		this.r= r ; 
	}
	
	@Override
	double calcArea() {
		double PI =Math.PI;
		return this.r * this.r * PI  ;
	}

}

class Rectangle extends Shape {

	double width ; // 폭
	double height ; // 높이

	public Rectangle(double width,double height) {
		this.width = width ;
		this.height = height ;
	}
	
	@Override
	double calcArea() {
		return this.width * this.height ;
	}

	boolean isSquare() {
		if (width == height) {
			return true; 
		}
		return false;

	}

	

}