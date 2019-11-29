public class Owner {
    private String name;
    private String surname;
    private String PESEL;

    public Owner(String name, String surname, String PESEL) {
        this.name = name;
        this.surname = surname;
        this.PESEL = PESEL;
        if (!PESEL.matches("\\d{11}"))
        {
            throw new IllegalArgumentException("wrong PESEL");
        }
    }

    //hashcode i to string i equals
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

}


