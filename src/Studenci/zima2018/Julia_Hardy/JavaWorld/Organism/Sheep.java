package Organism;
import Position.Position;
import World.World;

public class Sheep extends Animal{

    public Sheep(Integer posx, Integer posy, World world){
        this.setPosition(new Position(posx, posy));
        this.setWorld(world);
    }

    public Sheep(){}

    @Override
    public Sheep clone(){
        Sheep sheep = new Sheep();
        return sheep;
    }

    public void initParams(){
        this.setPower(3);
        this.setInitiative(3);
        this.setLiveLength(30);
        this.setPowerToReproduce(6);
        this.setFoodChain(2);
        this.setSign("\uD83D\uDC11");
    }

}
