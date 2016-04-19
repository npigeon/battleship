package battleship;

public class Square {
    private boolean occupiedByOpponent;
    private boolean occupiedBySelf;
    private boolean playerHasFiredAt;
    private boolean enemyHasFiredAt;
    
    public void Square(){
    	occupiedByOpponent=false;
    	occupiedBySelf=false;
    	playerHasFiredAt=false;
    	enemyHasFiredAt=false;
    }
    public Integer getGuessMult(){
    	//simple function for grabbing data on whether guesses hit or missed
    	//for creating the save file
    	
    	if(occupiedByOpponent){
    		return 1;     //returns 1 if player has fired on this location and hit
    	}
    	else if(playerHasFiredAt)
    	{
    		return 0;    //returns 0 if player has not yet fired on this location 
    	}
    	else{
    		return -1;   //returns 1 if player has fired on this location and missed
    	}
    }
    public boolean checkForOwnShip(){
    	return occupiedBySelf;
    }
    public boolean checkForShot(){
    	return playerHasFiredAt;
    }
    public boolean checkForHit(){
    	return occupiedByOpponent;
    }
    public boolean checkForEnemyShot(){
    	return enemyHasFiredAt;
    }
    
    
}
    

