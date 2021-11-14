package wyklad._05pakiety.postac;

import java.util.logging.Logger;

public class Postac implements Zolnierz, Pilkarz{
	private static final Logger LOGGER = Logger.getLogger( Postac.class.getName() );
	@Override
	public void strzelaj() {
		if(this instanceof Pilkarz)
			LOGGER.info("Pilkarz: " + Pilkarz.STALA);
		if (this instanceof Zolnierz)
			LOGGER.info("Zolnierz: " + Zolnierz.STALA);
		LOGGER.info("Postac");
	}
}
