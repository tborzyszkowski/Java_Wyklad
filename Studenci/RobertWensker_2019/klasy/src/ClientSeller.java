import java.math.BigInteger;

 class ClientSeller {
    private String name;
    private String adress;
    private String NIP;
    private String bankAccount;
     ClientSeller(){}
     ClientSeller(String name, String adress,String NIP){
        this.name = name;
        this.adress = adress;
        this.NIP = NIP;
    }
     ClientSeller(String name, String adress,String NIP,String bankAccount){
        this.name = name;
        this.adress = adress;
        this.NIP = NIP;
        this.bankAccount = bankAccount;
    }

     String getName() {
        return name;
    }

     String getAdress() {
        return adress;
    }

     String getBankAccount() {
        return bankAccount;
    }

     String getNIP() {
        return NIP;
    }

     void setName(String name) {
        this.name = name;
    }

     void setAdress(String adress) {
        this.adress = adress;
    }

     void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

     void setNIP(String NIP) {
        this.NIP = NIP;
    }

}
