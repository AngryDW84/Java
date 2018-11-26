package jungsuk3_ex;

public class Exercise6_6 {
	
//	두점사이의 거리를 계산하는 함수 만들기 getDistance
//	점1 (x , y) 점2(x1, y1)
	
	static double getDistance(int x, int y, int x1, int y1) {

		double distance = 0.0d ; 
		
		distance = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y)) ;  
		
		return distance;
	}

	public static void main(String[] args) {
		
		System.out.println(getDistance(1, 1, 2, 2));  
	}
}

