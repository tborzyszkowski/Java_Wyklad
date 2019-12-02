public class Item {
    private String name;
    private int quantity;
    private double individualNetPrice;
    private double vat;

    public Item(String name, int quantity, double individualNetPrice, double vat) {
        this.name = name;
        this.quantity = quantity;
        this.individualNetPrice = individualNetPrice;
        this.vat = vat;
    }

    public static String stringLabel()
    {
        return "======================================================================================================\n" +
                "||PRODUCT NAME                                              |COUNT  |INDI.NETPRI|GROSS PRICE        ||\n";
    }

    @Override
    public String toString()
    {
        String temp="||"+name.toString();
        if(name.length()>60)
            temp=name.substring(0,60);
        for(int i=temp.length();i<60;i++)
        {
            temp+=" ";
        }
        temp=temp+"|"+quantity+"x";
        for(int i=temp.length();i<68;i++)
        {
            temp+=" ";
        }
        temp=temp+"|"+individualNetPrice;
        for(int i=temp.length();i<80;i++)
        {
            temp+=" ";
        }
        temp=temp+"|"+getGrossPrice();
        for(int i=temp.length();i<100;i++)
        {
            temp+=" ";
        }
        temp+="||";
        return temp;
    }

    String getName() {
        return name;
    }

    int getQuantity() {
        return quantity;
    }

    double getIndividualNetPrice() {
        return individualNetPrice;
    }

    double getNetPrice()
    {
        return quantity*individualNetPrice;
    }

    double getVat() {
        return vat;
    }

    double getGrossPrice()
    {
        return getNetPrice()*(1+vat);
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void setIndividualNetPrice(double individualNetPrice) {
        this.individualNetPrice = individualNetPrice;
    }
}
