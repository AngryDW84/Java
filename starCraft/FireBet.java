package starCraft;

public class FireBet extends Unit {

	int firebet_cnt  ;
	final int MAX_HP = 60 ; 	
	
	public FireBet(int i) {
		firebet_cnt += i ; ;
		System.out.println(i+" 명 파이어벳 생성, 총 : "+firebet_cnt+ " 명"  );
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
