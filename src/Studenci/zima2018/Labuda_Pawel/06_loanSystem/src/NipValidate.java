@SuppressWarnings("WeakerAccess")
public class NipValidate {
    private String nip;
    private boolean isCorrect;

    public NipValidate(String nip) {
        this.nip = nip;
        this.isCorrect = Validate();
    }

    private boolean Validate() {
        return (toArray().length == 10) && (checkSum());
    }

    private int[] toArray() {
        int array[] = new int[11];
        String onlyDigits = nip.replaceAll("\\D+","");
        for (int i = 0; i < onlyDigits.length(); i++) array[i] = Character.getNumericValue(onlyDigits.charAt(i));
        return array;
    }

    private boolean checkSum() {
        int nipArray[] = toArray();
        int sum = 6 * nipArray[0] + 5 * nipArray[1] + 7 * nipArray[2] + 2 * nipArray[3] + 3 * nipArray[4] +
                4 * nipArray[5] + 5 * nipArray[6] + 6 * nipArray[7] + 7 * nipArray[8];

        sum %= 11;
        return (sum == nipArray[9]);
    }

    @Override
    public String toString() {
        return "NipValidate{" +
                "nip='" + nip + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
