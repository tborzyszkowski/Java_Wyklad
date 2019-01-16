package Organism;
import Position.Position;
import World.World;
import Action.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Organism{
    private Position position;
    private World world;
    private Integer power;
    private Integer initiative;
    private Integer liveLength;
    private Integer powerToReproduce;
    private String sign;
    private Integer foodChain;


    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getInitiative() {
        return initiative;
    }

    public void setInitiative(Integer initiative) {
        this.initiative = initiative;
    }

    public Integer getLiveLength() {
        return liveLength;
    }

    public void setLiveLength(Integer liveLength) {
        this.liveLength = liveLength;
    }

    public Integer getPowerToReproduce() {
        return powerToReproduce;
    }

    public void setPowerToReproduce(Integer powerToReproduce) {
        this.powerToReproduce = powerToReproduce;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Integer getFoodChain() {
        return foodChain;
    }

    public void setFoodChain(Integer foodChain) {
        this.foodChain = foodChain;
    }

//    public List<Action> consequences(Organism atackingOrganism){
//        List<Action> results = new ArrayList<Action>();
//        if(this.getPower() > atackingOrganism.getPower()){
//           results.add(new Action(ActionEnum.getAction(ActionEnum.A_REMOVE), new Position(-1, -1), 0, atackingOrganism));
//        }
//        else{
//            results.add(new Action(ActionEnum.getAction(ActionEnum.A_REMOVE), new Position(-1, -1), 0, this));
//        }
//        return results;
//    }

    public List<Action> consequences(Organism atackingOrganism){
        List<Action> results = new ArrayList<Action>();
        if(this.getFoodChain() > atackingOrganism.getFoodChain()){
            results.add(new Action(ActionEnum.getAction(ActionEnum.A_REMOVE), new Position(-1, -1), 0, atackingOrganism));
            if ((this.getFoodChain() - atackingOrganism.getFoodChain()) == 1){this.setPower(this.getPower() + 2);}
            else{
                this.setPower(this.getPower() - 1);
                System.out.print(this.getClass().getSimpleName() + " get sick by eating " + atackingOrganism.getClass().getSimpleName() + "  ");
            }
        }
        else if (this.getFoodChain() < atackingOrganism.getFoodChain()){
            results.add(new Action(ActionEnum.getAction(ActionEnum.A_REMOVE), new Position(-1, -1), 0, this));
            if ((atackingOrganism.getFoodChain() - this.getFoodChain()) == 1){atackingOrganism.setPower(atackingOrganism.getPower() + 2);}
            else{
                atackingOrganism.setPower(atackingOrganism.getPower() - 1);
                System.out.print(atackingOrganism.getClass().getSimpleName() + " get sick by eating " + this.getClass().getSimpleName() + "  ");
            }
        }

        else{
            atackingOrganism.move();
        }
        return results;
    }

    public boolean ifReproduce(){
        boolean result = false;

        if(this.getPower() >= this.getPowerToReproduce()){
            result = true;
        }
        return result;
    }

    public abstract Organism clone();
    public abstract List<Action> move();
    public abstract List<Action> action();
    public abstract void initParams();


    @Override
    public String toString() {
        return "Organism{" +
                "position=" + position +
                ", world=" + world +
                ", power=" + power +
                ", initiative=" + initiative +
                ", liveLength=" + liveLength +
                ", powerToReproduce=" + powerToReproduce +
                ", sign='" + sign + '\'' +
                '}';
    }
}
