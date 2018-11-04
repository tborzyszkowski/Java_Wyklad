public class GenderValidate {
    private String gender;
    private boolean isCorrect;

    @SuppressWarnings("WeakerAccess")
    public GenderValidate(String gender, String pesel) {
        this.gender = gender;
        this.isCorrect = Validate(pesel);
    }

    private boolean Validate(String pesel) {
        return (pesel.length() == 11) && checkGender(pesel);
    }

    private int getGenderFromPesel(String pesel) {
        return Integer.parseInt(pesel.substring(9, 10));
    }

    private boolean checkGender(String pesel) {
        String genderArray[] = {"female", "male"};
        return genderArray[getGenderFromPesel(pesel) % 2].equals(gender);
    }

    @Override
    public String toString() {
        return "GenderValidate{" +
                "gender='" + gender + '\'' +
                ", isCorrect='" + isCorrect + '\'' +
                '}';
    }
}
