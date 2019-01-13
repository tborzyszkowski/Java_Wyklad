public class Map {

    MapField[][] tablica = new MapField[5][5];

    public void populateFilds() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablica[i][j] = new MapField();
            }
        }
    }

    public void printMap() {
        for (int row = 0; row < 5; row++) {
            System.out.println(" ");
            for (int col = 0; col < 5; col++) {
                System.out.print(tablica[row][col] + "  ");
            }
            System.out.println("");
        }
    }
}