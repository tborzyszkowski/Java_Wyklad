package _05_Pakiety.InterfejsyEx;

interface Zolnierz{
	void Strzelaj();
}

interface Pilkarz{
	void Strzelaj();
}
public class Obywatel implements Zolnierz, Pilkarz{

	public void Strzelaj() {
		// ?????????????????????
	}
	
	public static void main(String[] args) {
		Obywatel z = new Obywatel();
		
		Obywatel s;
		Pilkarz p;
		
		s = z;
		s.Strzelaj();
		
		p = z;
		p.Strzelaj();

	}

}
