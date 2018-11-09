package starCraft;

public class FireBet extends Unit {

	public FireBet() {
		MAX_HP = 60 ;
		System.out.println("파이어벳 1명 생성");
	}
	@Override
	void attack() {
		System.out.println("화염방사기로 공격합니다.");
	}
	
	@Override
	void move(int i) {
		System.out.println(i+ "만큼 걸어서 이동합니다.");
	}
}
