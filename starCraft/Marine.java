package starCraft;

public class Marine extends Unit {

	int marine_cnt  ;
	final int MAX_HP = 40 ; 

	public Marine() {
	}

	public Marine(int i) {
		marine_cnt += i ; ;
		System.out.println(i+" 명 마린 생성, 총 : "+marine_cnt+ " 명"  );
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
