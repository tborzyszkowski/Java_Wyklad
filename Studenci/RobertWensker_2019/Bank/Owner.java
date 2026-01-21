import java.util.Date;

public class Owner {
    private String name;
    private String surname;
    private Date data;
    Owner(String name, String surname, Date date){
        this.name =name;
        this.surname = surname;
        this.data = date;
    }
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
