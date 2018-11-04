@SuppressWarnings("WeakerAccess")
public class PeselValidate {
    private String pesel;
    private boolean isCorrect;

    public PeselValidate(String pesel) {
        this.pesel = pesel;
        this.isCorrect = Validate();
    }

    private boolean Validate() {
        return (toArray().length == 11) && (checkSum());
    }

    private int[] toArray() {
        int array[] = new int[11];
        for (int i = 0; i < pesel.length(); i++) array[i] = Character.getNumericValue(pesel.charAt(i));
        return array;
    }

    private boolean checkSum() {
        int peselArray[] = toArray();
        int sum = 9 * peselArray[0] + 7 * peselArray[1] + 3 * peselArray[2] + peselArray[3] +
                9 * peselArray[4] + 7 * peselArray[5] + 3 * peselArray[6] + peselArray[7] +
                9 * peselArray[8] + 7 * peselArray[9];

        sum %= 10;
        return (sum == peselArray[10]);
    }

    @Override
    public String toString() {
        return "PeselValidate{" +
                "pesel='" + pesel + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
