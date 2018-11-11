package starCraft;

import java.util.Scanner;

public abstract class Building {

	int MAX_HP ;
	
	public Building() {
		// TODO Auto-generated constructor stub
	}
	
	void function() {
		System.out.println("Barrack 1:유닛생산, 2:이동 ");
		System.out.println("지시를 내려주세요");
		Scanner sc = new Scanner(System.in) ;
		int kb = Integer.parseInt(sc.nextLine());
		
		switch (kb) {
		case 1:
			Unit unit = null;
			makeUnit(unit) ; 
			break;
		case 2:
			move();
			break;

		default:
			break;
		}
	}
	
	void move() {
		System.out.println("이동합니다.");
	}
	
	void makeUnit() {
		System.out.println("유닛을 만듭니다.");
	}

	void makeUnit(Unit unit) {
		// TODO Auto-generated method stub
		
	}

}
