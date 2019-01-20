import javax.swing.JPanel;
import java.awt.GridLayout;

@SuppressWarnings("WeakerAccess")
public class Board extends JPanel {
    private final BoardArea[][] boardArray;
    private final int x;
    private final int y;

    public Board(int x, int y, WorldBoard worldBoard) {
        this.x = x;
        this.y = y;
        setLayout(new GridLayout(x, y, 0, 0));
        this.boardArray = new BoardArea[x][y];

        // implement board area for every area
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                boardArray[i][j] = new BoardArea(i, j, worldBoard);
                add(boardArray[i][j]);
            }
        }
    }

    public void setLabelOnArea(String label, int x, int y) {
        try {
            if ((x >= 0 && x < this.x) && (y >= 0 && y < this.y))
                boardArray[x][y].setLabel(label);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }

    public void clearArea() {
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                this.boardArray[i][j].clearField();
            }
        }
    }
}
