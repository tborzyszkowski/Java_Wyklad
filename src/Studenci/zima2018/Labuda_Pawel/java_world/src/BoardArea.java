import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

@SuppressWarnings("WeakerAccess")
public class BoardArea extends JPanel {
    private JLabel label;

    public BoardArea(int x, int y, WorldBoard worldBoard) {
        RightClickMouse rightClickMouse = new RightClickMouse(x, y, worldBoard);
        addMouseListener(rightClickMouse);
        setBackground(Color.white);
        label = new JLabel();
        add(label);
    }

    public void setLabel(String str) {
        label.setText(str);

        switch (str) {
            case "g":
                setBackground(new Color(0,204,0)); break;

            case "s":
                setBackground(new Color(153,153,153)); break;

            case "w":
                setBackground(new Color(51,51,51)); break;

            case "m":
                setBackground(new Color(255,0,0)); break;

            case "b":
                setBackground(new Color(153,102,0)); break;
        }
    }

    public void clearField() {
        label.setText("");
        setBackground(Color.white);
    }
}
