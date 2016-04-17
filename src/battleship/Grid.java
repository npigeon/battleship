package battleship;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    public List<Column> columns = new ArrayList<Column>();
    private int width;
    private int height;
    
    public Grid(int gridSize) {
        width = gridSize;
        height = gridSize;
        for(int squareX=0; squareX<gridSize; squareX++) {
            columns.add(new Column(gridSize));
        }
    }
    public Square getSquare(int x, int y){
        return columns.get(x).squares.get(y);
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    
    
    public boolean loadGame(String saveName){
    	saveDir="TBD";
    	FileWriter output = new FileWriter(saveDir);
    	BufferedWriter outputWrapper = new BufferedWriter(output);
    	gameWidth=this.getWidth();
    	gameHeight=this.getHeight();
    	for(int squareX=0;squareX<gameWidth;squareX++){
    		for(nt squareY=0;squareY<gameHeight;squareY++){
    			
    		}
    	}
    }
    public boolean saveGame(String saveName){
    	
    }
    
}