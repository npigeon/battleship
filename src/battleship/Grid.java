package battleship;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;



//<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class Grid {
    public List<Column> columns = new ArrayList<Column>();
    private int width;
    private int height;
    
    public Grid(int gridWidth, int gridHeight) {
        width = gridWidth;
        height = gridHeight;
        for(int squareX=0; squareX<gridWidth; squareX++) {
            columns.add(new Column(gridHeight));
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
=======
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
        String saveFileName="TBD";
        BufferedWriter outputWrapper = null;
        try {
            FileWriter writeHandler = new FileWriter(saveFileName);
            outputWrapper = new BufferedWriter(writeHandler);
            int gameWidth=this.getWidth();
            int gameHeight=this.getHeight();
            for(int squareX=0;squareX<gameWidth;squareX++){
                    for(int squareY=0;squareY<gameHeight;squareY++){
                        int pass = 1;
                    }
            }
        }
        catch (IOException ex){
            System.out.println (ex.toString());
            System.out.println("Could not find file " + saveFileName);
        } finally {
             try {
                outputWrapper.close();
            } catch (Exception ex) {
                System.out.println (ex.toString());
                System.out.println("Could not close file " + saveFileName);
            }
        }
    	return false;
    }
    
    public boolean saveGame(String saveName){
        return false;
    }
}
>>>>>>> origin/eclipseFriendly
