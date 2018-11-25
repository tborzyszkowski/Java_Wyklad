
public class klient {
	private String nazwafirmy;
	private String NIP;
	private String konto;
	public klient(String nazwafirmy, String NIP, String konto) {
		// TODO Auto-generated constructor stub
		this.nazwafirmy = nazwafirmy;
		this.NIP = NIP;
		this.konto = konto;
	}
	public void printklient() {
		System.out.println("nazwa firmy: "+nazwafirmy);
		System.out.println("NIP: "+NIP);
		System.out.println("nr konta: "+konto);
		System.out.println("-----------------");
		}
	
}
