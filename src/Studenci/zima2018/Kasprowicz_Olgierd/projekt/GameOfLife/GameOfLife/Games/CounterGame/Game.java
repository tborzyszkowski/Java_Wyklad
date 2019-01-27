package GameOfLife.Games.CounterGame;

import GameOfLife.Core.Rule;

import java.util.ArrayList;
import java.util.List;

public class Game extends GameOfLife.Core.Game<CounterEnvironment>
{
    @Override
    protected CounterEnvironment buildEnvironment()
    {
        return new CounterEnvironment();
    }

    @Override
    protected List<Rule<CounterEnvironment>> setRules()
    {
        List<Rule<CounterEnvironment>> rules = new ArrayList<>();
        rules.add(new IncrementCounterRule());

        return rules;
    }

    @Override
    protected void render()
    {
        System.out.println("i: " + this.environment.getI());
    }
}
