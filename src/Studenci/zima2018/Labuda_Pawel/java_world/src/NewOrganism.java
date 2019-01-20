import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("WeakerAccess")
public class NewOrganism implements ActionListener {
    private final String name;
    private final int x;
    private final int y;
    private WorldBoard worldBoard;

    public NewOrganism(String name, int x, int y, WorldBoard worldBoard) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.worldBoard = worldBoard;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        worldBoard.addToQueueOrganism(name, new Coordinates(x, y));
        worldBoard.drawWorld();
        System.out.println("Create " + this);
    }

    @Override
    public String toString() {
        return "NewOrganism{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
