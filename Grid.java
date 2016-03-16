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
}
