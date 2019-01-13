package Organism;
import Position.Position;
import World.World;

public class Grass extends Plant{

    public Grass(Integer posx, Integer posy, World world){
        this.setPosition(new Position(posx, posy));
        this.setWorld(world);
    }
    public Grass(){}

    @Override
    public Grass clone(){
        Grass grass = new Grass();
        return grass;
    }

    public void initParams(){
        this.setPower(0);
        this.setInitiative(0);
        this.setLiveLength(100);
        this.setPowerToReproduce(2);
        this.setFoodChain(1);
        this.setSign("\uD83C\uDF3F");
    }
}
