package GameOfLife.Games.CounterGame;

import GameOfLife.Core.Rule;

public class IncrementCounterRule extends Rule<CounterEnvironment>
{
    @Override
    public CounterEnvironment apply(CounterEnvironment state)
    {
        state.setI(state.getI() + 1);
        return state;
    }
}
