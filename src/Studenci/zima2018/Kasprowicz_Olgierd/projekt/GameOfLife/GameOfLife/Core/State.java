package GameOfLife.Core;

import java.util.List;

public abstract class State
{
    public List<Player> getPlayers()
    {
        return players;
    }

    private List<Player> players;

    protected State()
    {
        this.players = addPlayers();
    }

    protected abstract List<Player> addPlayers();
}
