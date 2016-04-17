public class SaveInterpreter{
	public int gridWidth;
	public int gridHeight;
	
	public SaveInterpreter(Grid gameGrid){
		gridWidth=gameGrid.getWidth();
		gridHeight=gameGrid.getHeight();
		
	}
	
	public boolean enumerateSquare(Integer xPos, Integer yPos){
    	//converts x & y coodinates to unique enumeration and returns that integer
		//enumerates starting from  the top left, left to right, down to the next row after finishing the previous row
		//NOTE: top left square is enumerated 1, not 0
				
		
    	return gameWidth*yPos+xPos+1;  //add 1 because the indexing needs to start from 1 rather then 0 
    	                               //since formatSave will denote a miss/hit/unguessed square by
    	                               //multiplying the enumeration of the square by -1/1/0 ;so a 0 result
    	                               //needs to be necessarily an unguessed square.  Better to start indexing 
    	                               //from 1 then have cumbersome conversions
    	                               
    }
    public boolean enumerateSquare(int enumeration){
    	//converts enumeration back to x & y coorrdinates and returns an arraylist of those coodinates
    	//reverse operation of the first definition of this method
    	ArrayList<integer> coordinates= new ArrayList<integer>();
    	
    	
    	xPos=(enumeration-1)%gameWidth;
    	yPos=(enumeration-1)/gameWidth;  //integer division rounds down, so dividing by width will give correct row
    	//node the -1 is to compensate for the indexing is starting from 1 rather then 0
    	
    	coordinates.add(xPos);
    	coordinates.add(yPos);
    	return coordinates;
    }
    
	public formatSave(Grid gameGrid){
		//formats gamestate into a list of 4 strings
		ArrayList<String> outputRows = new ArrayList<String>();
		
		//*******
		//first string: board size, formated as width dimenion, followed by a comma, followed by height dimension
		outputRows.add(Integer.toString(gridWidth)+","+Integer.toString(gridHeight));
		
		//*******
    	//second string: lists all previous guesses by player, each guess as the enumeration of the square,
    	//positive if a hit, negative if a miss, each guess seperated from the next by a comma
		
		String guesses = "";
		
		Integer currSquareEnum = this.enumerateSquare(0,0); //top left square handled outside loop so no extra  leading comma
		Integer currSquareStatus=gameGrid.getSquare(0,0).getDisplayCharacter();
		// <<code for connverting result of getDisplay character to -1 for miss, 0 for unguessed, 1 for hit goes here>>
		
		Integer codedEnum=currSquareStatus*currSquareEnum;
		if  (codedEnum!=0){  
			guesses=(Integer.toString(codedEnum))
		}
			
		
		for(Integer squareY=0;squareY<gridHeight;squareY++){
    		for(Integer squareX=1;squareX<gridWidth;squareX++){ 
    			// iterates over all remaining squares, performing same operation as was performed on top left square
    			
    			Integer currSquareEnum = this.enumerateSquare(squareX,squareY);
    			Integer currSquareStatus=gameGrid.getSquare(squareX,squareY).getDisplayCharacter();
    			// <<code for connverting result of getDisplay character to -1 for miss, 0 for unguessed, 1 for hit goes here>>
    			
    			Integer codedEnum=currSquareStatus*currSquareEnum;
    			if  (codedEnum!=0){
    				guesses+=(","+Integer.toString(codedEnum))
    			}
    	
    	
    	
    	
    		}
    	}
		outputRows.add(guesses);
    	

    	//*******
    	//third string: lists the enumeration of each square occupied by the player's ships
		
	}
	
	
}