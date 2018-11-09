package starCraft;

public class Marine extends Unit {

	public Marine() {
		MAX_HP = 40 ; 
		System.out.println("마린 1명 생성");
	}
	
	@Override
	void attack() {
		System.out.println("총으로 공격합니다.");
	}
	@Override
	void move(int i ) {
		System.out.println(i+"만큼 걸어서 이동합니다.");
//		super.move();
	}
	
}
