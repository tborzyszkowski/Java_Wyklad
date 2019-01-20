public class java_world {
    public static void main(String[] args) {
        WorldBoard worldBoard = new WorldBoard(50, 50);
        boolean autoplay = true;

        worldBoard.newGame();

        if (autoplay) {
            do {
                worldBoard.myFrame.actionNextTurn();

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (true);
        }
    }
}
