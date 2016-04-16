package battleship;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;



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
    	String saveDir="TBD";
    	File fileHandler = new File(saveDir);
    	FileWriter output = new FileWriter(fileHandler);
    	BufferedWriter outputWrapper = new BufferedWriter(output);
    	int gameWidth=this.getWidth();
    	int gameHeight=this.getHeight();
    	for(int squareX=0;squareX<gameWidth;squareX++){
    		for(int squareY=0;squareY<gameHeight;squareY++){
                    int pass = 1;
    		}
    	}
    	return false;
    }
    public boolean saveGame(String saveName){
        return false;
    }
}
