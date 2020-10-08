package wyklad._05pakiety.postac;

public class MainApp {
	public static void main(String args[]) {
		Postac postac = new Postac();

		postac.strzelaj();

		Zolnierz zolnierz = postac;
		zolnierz.strzelaj();

		Pilkarz pilkarz = postac;
		pilkarz.strzelaj();

		((Pilkarz)postac).strzelaj();
	}
}
