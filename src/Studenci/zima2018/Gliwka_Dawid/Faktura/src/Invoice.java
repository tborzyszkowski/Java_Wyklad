import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.List;

public class Invoice {
    private int number;
    private Calendar dateIssued;
    private Calendar dateSold;
    private Calendar datePayment;
    private Seller seller;
    private ArrayList<InvoiceElement> elements = new ArrayList<InvoiceElement>();

    public Invoice(int number, Calendar dateIssued, Calendar dateSold, Calendar datePayment, Seller seller) {
        this.number = number;
        this.dateIssued = dateIssued;
        this.dateSold = dateSold;
        this.datePayment = datePayment;
        this.seller = seller;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Calendar getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Calendar dateIssued) {
        this.dateIssued = dateIssued;
    }

    public Calendar getDateSold() {
        return dateSold;
    }

    public void setDateSold(Calendar dateSold) {
        this.dateSold = dateSold;
    }

    public Calendar getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(Calendar datePayment) {
        this.datePayment = datePayment;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public List<InvoiceElement> getElements() {
        return elements;
    }

    public void setElements(ArrayList<InvoiceElement> elements) {
        this.elements = elements;
    }

    public Invoice addElement(InvoiceElement element){
        this.elements.add(element);
        return this;
    }

    public Invoice removeElement(InvoiceElement element){
        if (this.elements.contains(element)){
            this.elements.remove(element);
        }
        return this;
    }


    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Faktura numer " + number + "\n" +
                "Data wystawienia:\t" + sdf.format(dateIssued.getTime()) + "\n" +
                "Data sprzedaży: \t" + sdf.format(dateSold.getTime()) + "\n" +
                "Data płatności: \t" + sdf.format(datePayment.getTime()) + "\n" +
                "Sprzedawca: " + seller + "\n" +
                "Elementy faktury:\n" + elements;
    }
    public void printInvoice(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Faktura numer " + number + "\n" +
                "Data wystawienia:\t" + sdf.format(dateIssued.getTime()) + "\n" +
                "Data sprzedaży: \t" + sdf.format(dateSold.getTime()) + "\n" +
                "Data płatności: \t" + sdf.format(datePayment.getTime()) + "\n" +
                "Sprzedawca: " + seller + "\n" +
                "Elementy faktury:\n");
        for (InvoiceElement element : elements){
            System.out.println(element);
        }

    }
}
