package battleship;
import java.util.ArrayList;
import java.util.List;

public class Column {
    public List<Square> squares = new ArrayList<Square>();

    public Column(int gridHeight) {
        for (int squareY=0; squareY<gridHeight; squareY++) {
            squares.add(new Square());
            }
    }

}
