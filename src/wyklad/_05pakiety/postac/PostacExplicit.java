package wyklad._05pakiety.postac;

import java.util.logging.Logger;

public class PostacExplicit {
	private static final Logger LOGGER = Logger.getLogger(Postac.class.getName());

	private final Pilkarz explicitPilkarz = new Pilkarz() {
		@Override
		public void strzelaj() {
			LOGGER.info("Pilkarz: " + this.STALA);
		}
	};
	private final Zolnierz explicitZolnierz = new Zolnierz() {
		@Override
		public void strzelaj() {
			LOGGER.info("Zolnierz: " + this.STALA);
		}
	};

	public final Pilkarz asPilkarz() {
		return explicitPilkarz;
	}

	public final Zolnierz asZolnierz() {
		return explicitZolnierz;
	}
}
