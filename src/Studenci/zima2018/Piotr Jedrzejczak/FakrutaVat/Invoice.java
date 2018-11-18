package lab3.FakrutaVat;

import java.util.ArrayList;
import java.util.Date;

public class Invoice {
	
	private ArrayList<InvoiceItem> invoice_items = new ArrayList<InvoiceItem>();
	private Client recipient;
	private Vendor issuer;
	private Date date_of_invoice_issue;
	private Date sale_date;
	private Date invoice_payment_date;
	private double invoice_gross_value = 0;

	
	public Invoice(Client recipient, Vendor issuer) {

		this.recipient = recipient;
		this.issuer = issuer;
		setDateOfInvoiceIssue();
		setSaleDate();
		setInvoicePaymentDate();
		
	}

	public void addToProductsPurchased(InvoiceItem position) {
		invoice_items.add(position);
	}
	
	public double calculateGrossValue() {
		
		for (InvoiceItem i : invoice_items) {
			invoice_gross_value += i.getGrossValue();
		}
		return invoice_gross_value;
	}
	
	public Date setDateOfInvoiceIssue() {
		this.date_of_invoice_issue = new Date();
		return date_of_invoice_issue;
	}
		
	public Date setSaleDate() {
		this.sale_date = new Date();
		return sale_date;
	}
	
	public Date setInvoicePaymentDate() {
		this.invoice_payment_date = new Date();
		return invoice_payment_date;
	}

	public Client getRecipient() {
		return recipient;
	}

	public Vendor getIssuer() {
		return issuer;
	}
	
	@Override
	public String toString() {
		System.out.println("\\Nazwa\t\t\\Iloœæ\t\t\\Wartoœæ Netto\t \\Cena Netto\t  \\VAT\t\t\\Wartoœæ Brutto");
		invoice_items.forEach(System.out::println);
		System.out.printf("\r%35s\t%s\t%18s\t%s\t%10s\t%25s", "Imie/Nazwa Firmy", "Ulica", "Kod Pocztowy", "Miasto", "NIP", " Numer Konta Bankowego");
		return String.format("\r"
				+ "Klient : \t%s \n"
				+ "Sprzedawca :    %s\n\n"
				+ "Data Wystawienia: %Tc\n"
				+ "Data Sprzeda¿y: %Tc\n"
				+ "Data Sp³acenia faktury: %Tc\n", recipient, issuer, date_of_invoice_issue, sale_date, invoice_payment_date);
	}
	
	
}
