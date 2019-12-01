package main;

import java.time.LocalDate;
import java.util.ArrayList;

public class Faktura {
	private static int numer = 0;
	private int fakturaNR;
	public ArrayList<Product> faktura;
	private Client client;
	private double sumTotalGross = 0;
	private LocalDate payDay;
	private LocalDate sellDay;
	private LocalDate docDay;
	
	public Faktura(String clientName,String adress, int nip) {
		this.fakturaNR = ++numer;
		this.faktura = new ArrayList<>();
		this.client = new Client(clientName, adress, nip);
	}
	
		
	public int getFakturaNR() {
		return fakturaNR;
	}



	public void setFakturaNR(int fakturaNR) {
		this.fakturaNR = fakturaNR;
	}



	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getSumTotalGross() {
		return sumTotalGross;
	}
	
	public void setSumTotalGross() {
		for(int i = 0; i < faktura.size(); i++)
			this.sumTotalGross += faktura.get(i).getSumGross();
	}

	public LocalDate getPayDay() {
		return payDay;
	}

	public void setPayDay() {
		this.payDay = LocalDate.now();
	}

	public LocalDate getSellDay() {
		return sellDay;
	}

	public void setSellDay() {
		this.sellDay = LocalDate.now();
	}

	public LocalDate getDocDay() {
		return docDay;
	}

	public void setDocDay() {
		this.docDay = LocalDate.now();
	}
	
	
}
