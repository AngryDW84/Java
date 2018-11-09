package starCraft;

public class Tank extends Unit {

	public Tank() {
		MAX_HP = 120 ; 
		System.out.println("탱크 1대 생성");
	}
	
	@Override
	void attack() {
		System.out.println("대포로 공격합니다.");
	}
	
	@Override
	void move(int i) {
		System.out.println(i+"만큼 탱크로 이동합니다");
	}
}
