public class BattleShip {
    public static Grid gameBoard = new Grid(12);
    public static GridViewer viewManager = new GridViewer();

    public static void main(String args[] ) {
        viewManager.displayGrid(gameBoard);
        
    }
}
