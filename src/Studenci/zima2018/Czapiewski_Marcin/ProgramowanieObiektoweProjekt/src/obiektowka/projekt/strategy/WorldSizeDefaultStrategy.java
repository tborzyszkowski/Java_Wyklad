package obiektowka.projekt.strategy;

import java.util.Map;

public class WorldSizeDefaultStrategy implements WorldSizeStrategy {
    @Override
    public Map.Entry<Integer, Integer> getWorldSize() {
        return Map.entry(10, 10);
    }
}
