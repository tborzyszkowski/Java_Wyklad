import java.util.ArrayList;
import java.util.List;

public class MapField {

    private List<Organism> list = new ArrayList<>();

    public void addOrganism(Organism organism) {
        list.add(organism);
    }

    public void removeOrganism(Organism organism) {
        list.remove(organism);
    }

    @Override
    public String toString() {
        if (list.isEmpty()) {
            return "__";
        }
        String result = "";
        for (Organism organism : list) {
            result += organism.getSign();
        }
        return result;
    }

    public List<Organism> getOrganisms() {
        return list;
    }
}
