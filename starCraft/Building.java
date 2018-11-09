package starCraft;

public abstract class Building {

	int MAX_HP ;
	
	public Building() {
		// TODO Auto-generated constructor stub
	}
	
	void move() {
		System.out.println("이동합니다.");
	}
	
	void makeUnit() {
		System.out.println("유닛을 만듭니다.");
	}
}
