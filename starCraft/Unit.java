package starCraft;

public abstract class Unit {

	int MAX_HP ;
	
	void attack() {
		System.out.println("공격합니다.");
	}
	
	void move(int i) {
		System.out.println(i +"만큼 이동합니다");
	}

	public int Marine(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
