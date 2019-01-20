package World;

import Action.*;
import Animal.*;
import Position.*;
import de.gurkenlabs.litiengine.graphics.RenderEngine;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class World
{
    private Integer worldX;
    private Integer worldY;
    private Integer turn = 0;
    private List<Organism> organisms = new ArrayList<>();
    private List<Organism> newOrganisms = new ArrayList<>();

    public World(Integer worldX, Integer worldY)
    {
        this.worldX = worldX;
        this.worldY = worldY;
    }

    private Integer getWorldX()
    {
        return worldX;
    }

    private Integer getWorldY()
    {
        return worldY;
    }

    private Integer getTurn()
    {
        return turn;
    }

    private void setTurn(Integer turn)
    {
        this.turn = turn;
    }

    private List<Organism> getOrganisms()
    {
        return organisms;
    }

    private void setOrganisms(List<Organism> organisms)
    {
        this.organisms = organisms;
    }

    private List<Organism> getNewOrganisms()
    {
        return newOrganisms;
    }

    private void setNewOrganisms(List<Organism> newOrganisms)
    {
        this.newOrganisms = newOrganisms;
    }

    private String getSeparator()
    {
        return "   ";
    }

    public void makeTurn()
    {
        List<Action> actions;

        for (Organism org : this.organisms)
        {
            if (this.positionOnBoard(org.getPosition()))
            {
                actions = org.move();
                for (Action a : actions)
                    this.makeMove(a);
                actions.clear();

                if (this.positionOnBoard(org.getPosition()))
                {
                    actions = org.action();
                    for (Action a : actions)
                        this.makeMove(a);
                    actions.clear();
                }
            }
        }

        this.setOrganisms(this.getOrganisms().stream().filter(org -> this.positionOnBoard(org.getPosition())).collect(Collectors.toList()));
        for (Organism org : this.organisms)
        {
            org.setLiveLength(org.getLiveLength() - 1);
            org.setPower(org.getPower() + 1);
        }

        this.setOrganisms(this.getOrganisms().stream().filter(org -> org.getLiveLength() > 0).collect(Collectors.toList()));
        this.setNewOrganisms(this.getNewOrganisms().stream().filter(org -> positionOnBoard(org.getPosition())).collect(Collectors.toList()));
        this.organisms.addAll(newOrganisms);
        this.organisms.sort(Comparator.comparing(Organism::getInitiative).reversed());
        this.newOrganisms = new ArrayList<>();
        this.setTurn(this.getTurn() + 1);
    }

    private void makeMove(Action action)
    {
        System.out.println(action);
        if (action.getAction() == ActionEnum.getAction(ActionEnum.A_ADD))
            this.newOrganisms.add(action.getOrganism());
        else if (action.getAction() == ActionEnum.getAction(ActionEnum.A_INCREASE))
            action.getOrganism().setPower(action.getOrganism().getPower() + action.getValue());
        else if (action.getAction() == ActionEnum.getAction(ActionEnum.A_MOVE))
            action.getOrganism().setPosition(action.getPosition());
        else if (action.getAction() == ActionEnum.getAction(ActionEnum.A_REMOVE))
            action.getOrganism().setPosition(new Position(-1, -1));
    }


    public void addOrganism(Organism newOrganism)
    {
        Position newOrganismPosition = newOrganism.getPosition();

        if (this.positionOnBoard(newOrganismPosition))
        {
            this.organisms.add(newOrganism);
            this.organisms.sort(Comparator.comparing(Organism::getInitiative).reversed());
        }
    }

    private Boolean positionOnBoard(Position position)
    {
        return position.getX() >= 0 && position.getY() >= 0 && position.getX() < this.worldX && position.getY() < this.worldY;
    }

    public Organism getOrganismFromPosition(Position position)
    {
        Organism pomOrganism = null;

        for (Organism org : this.organisms)
        {
            if (org.getPosition().equals(position))
            {
                pomOrganism = org;
                break;
            }
        }
        if (pomOrganism == null)
        {
            for (Organism org : this.newOrganisms)
            {
                if (org.getPosition().equals(position))
                {
                    pomOrganism = org;
                    break;
                }
            }
        }
        return pomOrganism;
    }

    public List<Position> getNeighboringPositions(Position position)
    {
        List<Position> results = new ArrayList<Position>();
        Position pomPosition;

        for (int y = -10; y <= 20; y+=10)
        {
            for (int x = -10; x <= 20; x+=10)
            {
                pomPosition = new Position((position.getX() + x), (position.getY() + y));
                if (this.positionOnBoard(pomPosition) && !(y == 0 && x == 0))
                    results.add(pomPosition);
            }
        }
        return results;
    }

    public List<Position> filterFreePositions(List<Position> fields)
    {
        List<Position> results = new ArrayList<Position>();

        for (Position position : fields)
            if (this.getOrganismFromPosition(position) == null)
                results.add(position);
        return results;
    }

    public List<Position> filterPositionsWithoutAnimals(List<Position> fields)
    {
        List<Position> results = new ArrayList<>();
        Organism pomOrg;

        for (Position position : fields)
        {
            pomOrg = this.getOrganismFromPosition(position);
            if (pomOrg == null || pomOrg instanceof Plant)
                results.add(position);
        }
        return results;
    }

    public List<Position> filterPositionsWithOtherSpecies(List<Position> fields)
    {
        List<Position> results = new ArrayList<>();

        for (Position f : fields)
        {
            Organism pomOrg = this.getOrganismFromPosition(f);
            if(!(pomOrg instanceof Wolf))
                results.add(f);
        }
        return results;
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder("\nturn: " + turn + "\n");
        for (int y = 0; y <= this.getWorldY(); y++)
        {
            for (int x = 0; x <= this.getWorldX(); x++)
            {
                Organism org = this.getOrganismFromPosition(new Position(x, y));
                if (!(org == null))
                {
                    result.append(org.getSign());
                } else
                {
                    result.append(this.getSeparator());
                }
            }
            result.append("\n");
        }
        return result.toString();
    }

    public void render(Graphics2D graphics2D)
    {
        RenderEngine renderEngine = new RenderEngine();
        renderEngine.renderText(graphics2D, "\nturn: " + turn + "\n", 0, 0);
        for (int y = 0; y <= this.getWorldY(); y++)
        {
            for (int x = 0; x <= this.getWorldX(); x++)
            {
                Organism org = this.getOrganismFromPosition(new Position(x, y));
                if (!(org == null))
                {
                    if(org instanceof Grass)
                        graphics2D.setColor(Color.GREEN);
                    else if(org instanceof Wolf)
                        graphics2D.setColor(Color.RED);
                    else if(org instanceof Sheep)
                        graphics2D.setColor(Color.WHITE);

                    renderEngine.renderText(graphics2D, org.getSign(), x, y);
                }
                else
                    renderEngine.renderText(graphics2D, this.getSeparator(), x, y);
            }
        }
    }
}
