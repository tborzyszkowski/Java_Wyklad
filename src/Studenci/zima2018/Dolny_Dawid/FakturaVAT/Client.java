public class Client {
    private String name;
    private String adress;
    private String nip;
    private String bankAcc;

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getNip() {
        return nip;
    }

    public String getBankAcc() {
        return bankAcc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc;
    }

    public Client(){}

    public Client(String nameC, String adressC, String nipC, String bankAccC){
        name=nameC;
        adress=adressC;
        nip=nipC;
        bankAcc=bankAccC;
    }
    void printInfo(){
        System.out.println(getName()+", Adres: "+getAdress()+", NIP: "+getNip()+", NR konta: "+getBankAcc());
    }
}
