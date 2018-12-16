
public class Sprzedawca {
	private String name;
	private String address;
	private String nip;
	private String account;

	public Sprzedawca(String name, String address, String nip, String account) {
		super();
		this.name = name;
		this.address = address;
		this.nip = nip;
		this.account = account;
	}

	public String printSeller() {
		return "Sprzedawca: \n" + name + ", adres: " + address + ", NIP: " + nip + ", nr.konta: " + account;
	}
}
