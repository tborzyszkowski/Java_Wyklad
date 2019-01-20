import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("WeakerAccess")
public class MyFrame extends JFrame implements ActionListener {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 600;
    private static final int WIDTHBOARD = 500;
    private static final int HEIGHTBOARD = 500;
    private final WorldBoard worldBoard;
    private final Board worldArea;

    int turnCounter = 0;

    private JButton newGame;
    private JButton nextTurn;

    private JLabel turnLabel;

    public MyFrame(int x, int y, WorldBoard worldBoard) {
        super("Java World");
        this.worldBoard = worldBoard;

        // frame settings
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocation(200, 200);
        this.setSize(WIDTH, HEIGHT);
        this.setLayout(new FlowLayout());

        worldArea = new Board(x, y, worldBoard);
        worldArea.setBackground(Color.white);
        worldArea.setLocation(0, 100);
        worldArea.setPreferredSize(new Dimension(WIDTHBOARD, HEIGHTBOARD));
        this.getContentPane().add(worldArea);

        // buttons
        newGame = new JButton("New Game");
        newGame.addActionListener(this);
        this.getContentPane().add(newGame, FlowLayout.LEFT);

        nextTurn = new JButton("Next Turn");
        nextTurn.addActionListener(this);
        this.getContentPane().add(nextTurn, FlowLayout.CENTER);

        turnLabel = new JLabel("Day: " + turnCounter);
        this.getContentPane().add(turnLabel, FlowLayout.RIGHT);

        JLabel credentials = new JLabel("Created by Pawel Labuda", JLabel.CENTER);
        this.getContentPane().add(credentials, FlowLayout.TRAILING);
    }

    public void setLabelOnArea(String label, int x, int y) {
        worldArea.setLabelOnArea(label, x, y);
    }

    public void clearSpecifiedField() {
        worldArea.clearArea();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGame) {
            turnCounter = 0;
            turnLabel.setText("Day: " + turnCounter);
            worldBoard.newGame();
        } else if (e.getSource() == nextTurn) {
            actionNextTurn();
        }
    }

    public void actionNextTurn() {
        turnCounter++;
        turnLabel.setText("Day: " + turnCounter);
        worldBoard.nextTurn();
    }
}
