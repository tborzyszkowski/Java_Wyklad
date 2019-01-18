
public class Klient {
	private String name;
	private String address;
	private String nip;

	public Klient(String name, String address, String nip) {
		super();
		this.name = name;
		this.address = address;
		this.nip = nip;
	}	
	public String printClient() {
		return "Klient: \n" + name + ", adres: " + address + ", NIP: " + nip;
	}
}