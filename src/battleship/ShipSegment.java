package battleship;

public class ShipSegment extends Coordinates{
	public boolean hasBeenHit=false;
	
	public ShipSegment(int x, int y) {
		super(x, y);
	}
	public void hit(){
		hasBeenHit=true;
	}
	
	public boolean getHitStat(){
		return hasBeenHit;
	}
}

