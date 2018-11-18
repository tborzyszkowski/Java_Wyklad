
public class adres {
	private String ulica;
	private String nrdomu;
	private String kodpocztowy;
	private String miejscowosc;
	public adres(String ulica, String nrdomu, String kodpocztowy, String miejscowosc) {
		// TODO Auto-generated constructor stub
		this.ulica = ulica;
		this.nrdomu = nrdomu;
		this.kodpocztowy = kodpocztowy;
		this.miejscowosc = miejscowosc;
	}
	public void printadres() {
		System.out.println("ulica: "+ulica+" "+nrdomu);
		System.out.println("kod pocztowy: "+kodpocztowy);
		System.out.println("miejscowosc: "+miejscowosc);
		System.out.println("-----------------");
		}

}
