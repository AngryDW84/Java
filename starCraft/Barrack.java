package starCraft;

public class Barrack extends Building {

	public Barrack(int i) {
		// TODO Auto-generated constructor stub
		switch (i) {
		case 1:
			Unit unit = new Marine() ;	
			break;
		case 2:
			Unit unit1 = new FireBet() ;	
			break;
			
		default:
			break;
		}
		
	}
	
	@Override
	void move() {
		// TODO Auto-generated method stub
		super.move();
	}
	
	@Override
	void makeUnit() {
		// TODO Auto-generated method stub
		super.makeUnit();
	}
	
}
