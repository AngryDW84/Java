package starCraft;

import java.util.Scanner;

public class Barrack extends Building {

	final int BARRACK_HP = 400 ; 
	
	public Barrack() {
		
	}
	
	@Override
	void function() {
		// TODO Auto-generated method stub
		super.function();
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		super.move();
	}

	@Override
	void makeUnit(Unit unit) {
		// TODO Auto-generated method stub
		super.makeUnit();
		System.out.println("Barrack Unit 1:마린, 2:파이어벳 ");
		System.out.println("생성하실 유닛을 선택하세요.");
		Scanner sc1 = new Scanner(System.in) ;
		int kb1 = Integer.parseInt(sc1.nextLine());
		
		System.out.println("몇명을 생산하실거가요.?");
		Scanner sc2 = new Scanner(System.in) ;
		int kb2 = Integer.parseInt(sc2.nextLine());
		
		switch (kb1) {
		case 1:
			unit = new Marine(kb2) ;
			break;
		case 2:
			unit = new FireBet(kb2) ;	
			break;

		default:
			break;

		}
		sc1.close();
		sc2.close();

	}
}
