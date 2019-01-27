package GameOfLife.Games.NoopGame;

import GameOfLife.Core.NullRule;
import GameOfLife.Core.Rule;

import java.util.ArrayList;
import java.util.List;

public class Game extends GameOfLife.Core.Game<NoopEnvironment>
{
    @Override
    protected NoopEnvironment buildEnvironment()
    {
        return new NoopEnvironment();
    }

    @Override
    protected List<Rule<NoopEnvironment>> setRules()
    {
        List<Rule<NoopEnvironment>> rules = new ArrayList<>();
        rules.add(new NullRule<>());

        return rules;
    }

    @Override
    protected void render()
    {
        System.out.println("Noop");
    }
}
