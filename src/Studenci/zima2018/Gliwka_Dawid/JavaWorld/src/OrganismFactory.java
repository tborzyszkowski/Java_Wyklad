package JavaWorld;

import java.util.Random;

public class OrganismFactory {
    public Organism getOrganism() {
        Random random = new Random();
        Organism organism;
        double rd = random.nextDouble();

        if (rd < 0.10)
            organism = new Wolf();
        else if (rd < 0.3)
            organism = new Sheep();
        else if (rd < 0.5)
            organism = new Grass();
        else
            organism = null;
        return organism;
    }
}
