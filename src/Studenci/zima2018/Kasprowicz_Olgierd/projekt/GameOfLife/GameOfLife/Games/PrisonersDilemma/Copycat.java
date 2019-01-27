package GameOfLife.Games.PrisonersDilemma;

import GameOfLife.Utils.PayoffMatrix;

import java.util.HashMap;
import java.util.Map;

public class Copycat extends Prisoner
{
    Map<String, Choice> lastOpponentsChoice = new HashMap<>();

    Copycat(String name)
    {
        super(name, null);
    }

    @Override
    void submitScore(int score, Choice opponentsChoice, String opponentsName)
    {
        super.submitScore(score, opponentsChoice, opponentsName);
        this.lastOpponentsChoice.put(opponentsName, opponentsChoice);
    }

    @Override
    Choice ask(PayoffMatrix<Choice> matrix, String opponentName)
    {
        Choice whatOtherDid = this.lastOpponentsChoice.get(opponentName);

        return whatOtherDid != null
            ? whatOtherDid
            : Choice.Cooperate;
    }
}
