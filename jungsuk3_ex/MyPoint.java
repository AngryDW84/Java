package jungsuk3_ex;

public class MyPoint {

	int x = 0 ;
	int y = 0 ; 

	public MyPoint() {
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double getDistance(int x, int y) {

		double distance = Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y)) ;

		return distance;

	}
}

