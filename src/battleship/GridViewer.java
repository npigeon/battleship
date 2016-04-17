package battleship;

public class GridViewer {
    public Grid grid;

    public void displayGrid(Grid targetGrid) {
        grid = targetGrid;
        String boardContents = "";
        
        int width = grid.getWidth();
        int height = grid.getHeight();
        for (int y=0; y<height; y++) {
            String rowContents = "";
            for (int x=0; x<width; x++) {
                rowContents += " ";
                Square thisSquare = grid.getSquare(x,y);
                rowContents += thisSquare.getDisplayCharacter();
                rowContents += "  ";
            }
            boardContents += rowContents;
            boardContents += "\n\n";
        }
        System.out.println(boardContents);
    }
}