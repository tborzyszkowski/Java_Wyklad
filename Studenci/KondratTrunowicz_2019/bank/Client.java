import java.math.BigInteger;
import java.util.Objects;

public class Client {
    private String name;
    private String address;
    private int tel_number;

    public Client(String name, String address, int tel_number) {
        this.name = name;
        this.address = address;
        this.tel_number = tel_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTel_number() {
        return tel_number;
    }

    public void setTel_number(int tel_number) {
        this.tel_number = tel_number;
    }
}
