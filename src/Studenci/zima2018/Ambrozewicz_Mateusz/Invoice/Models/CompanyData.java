package Invoice.Models;

public class CompanyData {
    private String companyName;
    private String companyAdress;
    private String companyNIP;
    private String companyAcount;

    public CompanyData(String companyName, String companyAdress, String companyNIP, String companyAcount){
        this.companyName = companyName;
        this.companyAdress = companyAdress;
        this.companyNIP = companyNIP;
        this.companyAcount = companyAcount;
    }

    public CompanyData(String companyName, String companyAdress, String companyNIP){
        this.companyName = companyName;
        this.companyAdress = companyAdress;
        this.companyNIP = companyNIP;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress;
    }

    public String getCompanyNIP() {
        return companyNIP;
    }

    public void setCompanyNIP(String companyNIP) {
        this.companyNIP = companyNIP;
    }

    public String getCompanyAcount() {
        return companyAcount;
    }

    public void setCompanyAcount(String companyAcount) {
        this.companyAcount = companyAcount;
    }

    @Override
    public String toString() {
        return "Dane firmy: \n" +
                "Nazwa: " + companyName + '\n' +
                "Adres: " + companyAdress + '\n' +
                "NIP: " + companyNIP + '\n';
    }
}
