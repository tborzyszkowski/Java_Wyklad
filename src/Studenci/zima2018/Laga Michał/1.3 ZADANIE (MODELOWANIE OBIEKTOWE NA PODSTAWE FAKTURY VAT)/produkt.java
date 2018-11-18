
public class produkt {
	private String nazwa;
	private double cenanettojednostki;
	private double cenanettopozycji;
	private int ilosc;
	private int VAT;
	private double cenabrutto;
	
	public void printproduct() {
		System.out.println("nazwa "+nazwa);
		System.out.println("iloœæ "+ilosc);
		System.out.println("cena netto jednostki "+cenanettojednostki+"z³");
		System.out.println("cena netto pozycji "+cenanettopozycji+"z³");
		System.out.println("VAT "+VAT+"%");
		System.out.println("cena brutto" +cenabrutto+"z³");
		System.out.println("-----------------");
		}
		produkt(String nazwa,int ilosc, double cenanettojednostki, int VAT){
			this.nazwa = nazwa;
			this.ilosc = ilosc;
			this.cenanettojednostki = cenanettojednostki;
			this.VAT = VAT;
			this.cenanettopozycji = cenanettojednostki * ilosc;
			this.cenabrutto = cenanettopozycji*(100+VAT)/100;
			
		}
		public double brutto() {
			return cenabrutto;
		}
}
