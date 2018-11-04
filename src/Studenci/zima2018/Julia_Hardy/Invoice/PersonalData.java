package Invoice;

public class PersonalData {
    private String c_name;
    private String c_adress;
    private String c_NIP;
    private String account;

    public PersonalData(String c_name, String c_adress, String c_NIP, String account) {
        this.c_name = c_name;
        this.c_adress = c_adress;
        this.c_NIP = c_NIP;
        this.account = account;
    }

    public String getC_name() {
        return c_name;
    }

    public String getC_adress() {
        return c_adress;
    }

    public String getC_NIP() {
        return c_NIP;
    }

    public String getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "c_name='" + c_name + '\'' +
                ", c_adress='" + c_adress + '\'' +
                ", c_NIP='" + c_NIP + '\'' +
                ", account=" + account +
                '}';
    }
}
