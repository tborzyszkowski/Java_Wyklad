package HR;

public class Employee {
    private String surname;
    private String name;
    private int birthYear;
    private String position;

    void setPersonalData(String name, String surname, int birth , String position){
        this.name = name;
        this.surname = surname;
        this.birthYear = birth;
        this.position = position;
    }
    String getPersonalData() {
        return "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", birthYear=" + birthYear;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
