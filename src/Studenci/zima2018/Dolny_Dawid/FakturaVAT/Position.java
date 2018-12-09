public class Position {
    private String productName;
    private int amount;
    private double nettoPrice;
    double nettoWithAmount;
    double vatTax;
    double bruttoPrice;

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    public double getNettoPrice() {
        return nettoPrice;
    }

    public double getNettoWithAmount() {
        return nettoWithAmount;
    }

    public double getVatTax() {
        return vatTax;
    }

    public double getBruttoPrice() {
        return bruttoPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setNettoPrice(double nettoPrice) {
        this.nettoPrice = nettoPrice;
    }

    public Position(){}

    public Position(String name, int amo, double netPrice){
        productName=name;
        amount=amo;
        nettoPrice=netPrice;
        nettoWithAmount=calcNetWAmo();
        vatTax=calcVatTax()*amo;
        bruttoPrice=calcBruPrice();

    }
    double calcNetWAmo(){
        return amount*nettoPrice;
    }
    double calcBruPrice(){
        return nettoPrice*1.23;
    }
    double calcVatTax(){
        return calcBruPrice()-nettoPrice;
    }
    void printInfo(){
        System.out.println(getProductName()+", Ilość: "+getAmount()+", Cena brutto: "+getBruttoPrice()+
                ", Cena netto: "+getNettoPrice()+
                ", Suma netto: "+getNettoWithAmount()+", Podatek: "+getVatTax());
    }

}
