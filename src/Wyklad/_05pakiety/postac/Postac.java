package wyklad._05pakiety.postac;

public class Postac implements Zolnierz, Pilkarz{
	@Override
	public void strzelaj() {
		if(this instanceof Pilkarz)
			System.out.println("Pilkarz: " + Pilkarz.STALA);
		if (this instanceof Zolnierz)
			System.out.println("Zolnierz: " + Zolnierz.STALA);
		System.out.println("Postac");
	}
}
