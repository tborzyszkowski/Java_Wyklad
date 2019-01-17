package obiektowka.projekt.strategies;

import java.util.Map;

public class WorldSizeDefaultStrategy implements WorldSizeStrategy {
    @Override
    public Map.Entry<Integer, Integer> getWorldSize() {
        return Map.entry(50, 10);
    }
}
