package starCraft;

public class Factory extends Building {

	public Factory() {
		Unit unit = new Tank() ;
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
