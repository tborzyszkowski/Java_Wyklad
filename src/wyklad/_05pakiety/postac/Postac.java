package wyklad._05pakiety.postac;

public class Postac implements Zolnierz, Pilkarz{
	@Override
	public void strzelaj() {
		if(this instanceof Pilkarz)
			System.out.println("Pilkarz" + Zolnierz.STALA);
		else if (this instanceof Zolnierz)
			System.out.println("Zolnierz");
		else System.out.println("Postac"+ Pilkarz.STALA);
	}
}
