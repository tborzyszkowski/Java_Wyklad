package faktura;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import faktura.*;

public class Invoice {
	
	private ArrayList<Product> products = new ArrayList<>();
	private Company company;
	private double grossPrize;
	private int invoiceNumber;
	
	private Date dateOfIssue;
    private Date dateOfSale;
    private Date dateOfPayment;
    
    
	public Invoice(ArrayList<Product> products, Company company, String dateOfIssue,
			String dateOfSale, String dateOfPayment) throws ParseException {
		super();
		this.products = products;
		this.company = company;
		this.grossPrize = calculateGrossPrize();
		this.invoiceNumber = hashCode();
		this.dateOfIssue = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfIssue);
        this.dateOfSale = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfSale);
        this.dateOfPayment = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfPayment);
	}
    
    
	private double calculateGrossPrize() {
        double gross = 0;
        for (Product product : products) gross += product.getNetPrize() + product.getTax();
        return Math.round(gross * 100.0) / 100.0;
    }


	public void info() {
		System.out.println("List of products: ");
		for(Product product : products) {
			
			double cena = product.calcTotalGross() / product.getQuantity();
			
			
			System.out.println("name: " + product.getName() + ", gross prize of product: " + cena);
		}
		System.out.println("Company name: " + company.getCompanyName() + ", grossPrize: " + grossPrize + ", invoice number: " + invoiceNumber + ", date of issue: " + dateOfIssue + ", dateOfSale: " + dateOfSale
				+ ", dateOfPayment: " + dateOfPayment);

	}
	


	
    
	
}
