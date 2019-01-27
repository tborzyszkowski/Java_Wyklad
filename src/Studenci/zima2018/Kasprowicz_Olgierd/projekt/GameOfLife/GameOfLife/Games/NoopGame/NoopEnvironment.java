package GameOfLife.Games.NoopGame;

import GameOfLife.Core.State;
import GameOfLife.Core.Player;

import java.util.ArrayList;
import java.util.List;

class NoopEnvironment extends State
{
    @Override
    protected List<Player> addPlayers()
    {
        return new ArrayList<>();
    }
}

