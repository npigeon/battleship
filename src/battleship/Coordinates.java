package battleship;

public class Coordinates {
	//simple class for storing coordinates.  I could just use lists, but this way I
	//have a standardized structure for coordinates so I don't have to keep checking back to
	//make sure I continue to create lists the same way
	
	Integer xVal;
	Integer yVal;
	public Coordinates(int x, int y){
		xVal=x;
		yVal=y;
	}
	public int getX(){
		return xVal
	}
	public int getY(){
		return yVal;
	}
	public int getCoordAsList(){
		ArrayList<Integer> outputList=new Arraylist<Integer>();
		outputList.add(xVal);
		outputList.add(yVal);
		return outputList
	}
	public String getCoordsAsString(){
		String outputString="("+Integer.ToString(xVal)+","+Integer.ToString(yVal)+")";
		return outputString
	}

}
