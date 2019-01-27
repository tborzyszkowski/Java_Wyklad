package GameOfLife.Utils;

import java.util.HashMap;
import java.util.Map;

public class PayoffMatrix<T extends Enum<T>>
{
    Map<T, Map<T, Integer>> matrix;

    public PayoffMatrix()
    {
        this.matrix = new HashMap<>();
    }

    public PayoffMatrix<T> addPayoff(T myChoice, T otherChoice, int payoff)
    {
        this.matrix.putIfAbsent(myChoice, new HashMap<>());
        Map<T, Integer> insertionPoint = this.matrix.get(myChoice);

        insertionPoint.put(otherChoice, payoff);

        return this;
    }

    public int getPayoff(T myChoice, T otherChoice)
    {
        return matrix.get(myChoice).get(otherChoice);
    }
}
