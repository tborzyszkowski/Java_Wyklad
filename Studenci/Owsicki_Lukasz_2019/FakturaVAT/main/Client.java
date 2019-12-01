package main;

public class Client {
	public static final String BANKACC = "1234 5678 9876 5453";
	private String clientName;
	private String adress;
	private int nip;
	
	
	public Client(String clientName,String adress, int nip) {
		this.clientName = clientName;
		this.adress = adress;
		this.nip = nip;
	}
	
	public String getClientName() {
		return clientName;
	}



	public void setClientName(String clientName) {
		this.clientName = clientName;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	public int getNip() {
		return nip;
	}



	public void setNip(int nip) {
		this.nip = nip;
	}

	@Override
	public String toString() {
		return "Client [clientName=" + clientName + ", adress=" + adress + ", nip=" + nip + "]";
	}



	



	

}

    

	


  
	
	

