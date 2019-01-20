package Screens;

import Animal.Grass;
import Animal.Sheep;
import Animal.Wolf;
import Position.Position;
import World.World;
import de.gurkenlabs.litiengine.gui.screens.GameScreen;
import de.gurkenlabs.litiengine.input.Input;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainScreen extends GameScreen
{
    private boolean loaded = false;
    private boolean paused = false;
    private World world1;

    private List<Position> pomPositions = new ArrayList<>();

    public MainScreen()
    {
        super("MAIN");
        world1 = new World(500, 500);
        for (int x = 0; x < 500; x += 10)
            for (int y = 0; y < 500; y += 10)
                pomPositions.add(new Position(x, y));
    }

    private void prepWorld(Graphics2D g)
    {
        int index = getEmptyPosition();
        Sheep sheep1 = new Sheep( null, pomPositions.get(index), world1);
        sheep1.initParams();
        world1.addOrganism(sheep1);

        index = getEmptyPosition();
        Sheep sheep2 = new Sheep(null, pomPositions.get(index), world1);
        sheep2.initParams();
        world1.addOrganism(sheep2);

        index = getEmptyPosition();
        Wolf wolf1 = new Wolf(null, pomPositions.get(index), world1);
        wolf1.initParams();
        world1.addOrganism(wolf1);

        index = getEmptyPosition();
        Wolf wolf2 = new Wolf(null, pomPositions.get(index), world1);
        wolf2.initParams();
        world1.addOrganism(wolf2);

        index = getEmptyPosition();
        Grass grass = new Grass(null, pomPositions.get(index), world1);
        grass.initParams();
        world1.addOrganism(grass);

        index = getEmptyPosition();
        Grass grass2 = new Grass(null, pomPositions.get(index), world1);
        grass2.initParams();
        world1.addOrganism(grass2);

        index = getEmptyPosition();
        Grass grass3 = new Grass(null, pomPositions.get(index), world1);
        grass3.initParams();
        world1.addOrganism(grass3);

        index = getEmptyPosition();
        Grass grass4 = new Grass(null, pomPositions.get(index), world1);
        grass4.initParams();
        world1.addOrganism(grass4);

        index = getEmptyPosition();
        Grass grass5 = new Grass(null, pomPositions.get(index), world1);
        grass5.initParams();
        world1.addOrganism(grass5);

        world1.render(g);
        loaded = true;
    }

    private int getEmptyPosition()
    {
        Random randomPosition = new Random();
        int index = randomPosition.nextInt(pomPositions.size());

        while(world1.getOrganismFromPosition(pomPositions.get(index)) != null)
            index = randomPosition.nextInt(pomPositions.size());
        return index;
    }

    private void loadWorld(Graphics2D g)
    {
        world1.render(g);
        if(!paused)
            world1.makeTurn();
        Input.keyboard().onKeyTyped(KeyEvent.VK_SPACE, (key) -> paused = !paused);
    }

    @Override
    public void render(final Graphics2D g) {
        super.render(g);
        g.setBackground(new Color(83, 42, 17));

        if(!loaded)
            prepWorld(g);

        loadWorld(g);
    }
}
