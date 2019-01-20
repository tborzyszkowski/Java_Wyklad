import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RightClickMouse extends MouseAdapter {
    private final int x;
    private final int y;
    private final WorldBoard worldBoard;

    public RightClickMouse(int x, int y, WorldBoard worldBoard) {
        this.x = x;
        this.y = y;
        this.worldBoard = worldBoard;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (MouseEvent.BUTTON3 == e.getButton()) {
            System.out.println("BUTTON3: x=" + e.getX() + " y=" + e.getY());
            System.out.println("RightClickMouse: x=" + x + " y=" + y);
            ContextMenu contextMenu = new ContextMenu(x, y, worldBoard);
            contextMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }
}
