import java.math.BigInteger;

public class Client {
    private String companyName;
    private String address;
    private long nip;
    private BigInteger bankAccount;

    public Client(String companyName, String address, long nip, BigInteger bankAccount) throws IllegalArgumentException{
        if(nip<999999999 || nip>9999999999L)
            throw new IllegalArgumentException("niepoprawny nip");
        if(bankAccount.toString().length()>26 || bankAccount.toString().length()<26)
            throw new IllegalArgumentException("niepoprawny numer bankowy");
        this.companyName = companyName;
        this.address = address;
        this.nip = nip;
        this.bankAccount = bankAccount;
    }

    public static String stringLabel()
    {
        return "======================================================================================================\n" +
               "||COMPANY NAME           |ADDRESS                           |NIP       |BANK ACCOUNT                ||\n";
    }

    @Override
    public String toString()
    {
        String temp="||"+companyName.toString();
        if(companyName.length()>30)
            temp=companyName.substring(0,25);
        for(int i=temp.length();i<25;i++)
        {
            temp+=" ";
        }
        temp=temp+"|"+address;
        for(int i=temp.length();i<60;i++)
        {
            temp+=" ";
        }
        temp=temp+"|"+nip;
        for(int i=temp.length();i<70;i++)
        {
            temp+=" ";
        }
        temp=temp+"|"+bankAccount;
        for(int i=temp.length();i<100;i++)
        {
            temp+=" ";
        }
        temp+="||\n";
        return temp;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public long getNip() {
        return nip;
    }

    public BigInteger getBankAccount() {
        return bankAccount;
    }
}