public class Item {
    private String item_name;
    private int quantity;
    private int price;
    private double vat;
    private int netto;
    private double brutto;
    public Item(String item_name, int quantity, int price, double vat) {
        this.item_name = item_name;
        this.quantity = quantity;
        this.price = price;
        this.vat = vat;
        this.netto = price*quantity;
        this.brutto = this.netto*vat;
    }
    public Item(String item_name, int quantity, int price, double vat, Client client) {
        this.item_name = item_name;
        this.quantity = quantity;
        this.price = price;
        this.vat = vat;
        this.netto = price*quantity;
        if (!client.getClient_category().equals("premium"))
        this.brutto = this.netto*vat;
        else this.brutto = this.netto*vat*0.90;
    }
    public void wypiszItem(){
            System.out.printf("Nazwa:");
            System.out.println(item_name);
            System.out.printf("Ilosc: ");
            System.out.println(quantity);
            System.out.printf("Cena: ");
            System.out.println(price);
            System.out.printf("Cena jednostkowa netto: ");
            System.out.println(netto);
            System.out.printf("Cena brutto ");
            System.out.println(brutto);
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public double getvat() {
        return vat;
    }

    public void setvat(int vat) {
        this.vat = vat;
    }

    public int getNetto() {
        return netto;
    }


    public double getBrutto() {
        return brutto;
    }


}


