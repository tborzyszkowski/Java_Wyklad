package GameOfLife;

import java.util.concurrent.TimeUnit;

public class Main
{
    public static void main(String[] args)
    {
        int chosenGame = new Integer(args[0]);

        GameOfLife.Core.Game game;
        switch (chosenGame)
        {
            case 1:
                game = new GameOfLife.Games.CounterGame.Game();
                break;
            case 2:
                game = new GameOfLife.Games.PrisonersDilemma.Game();
                break;
            default:
                game = new GameOfLife.Games.NoopGame.Game();
                break;
        }

        //noinspection InfiniteLoopStatement
        while(true)
        {
            game.next();
            try
            {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException e)
            {
                System.out.println("Interrupted!");
            }
        }
    }
}
