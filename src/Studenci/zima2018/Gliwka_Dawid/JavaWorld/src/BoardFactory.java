package JavaWorld;
public class BoardFactory {

    public BoardFactory() {
    }

    public Board getBoard(int x, int y, int z) {
        return new Board3D(x, y, z);
    }

    public Board getBoard(int x, int y){

        return new Board2D(x, y);
    }
}
