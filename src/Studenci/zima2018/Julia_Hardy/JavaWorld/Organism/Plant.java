package Organism;

import Action.*;
import Position.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Plant extends Organism {
    public List<Action> move(){
        List<Action> results = new ArrayList<Action>();
        return results;
    }

    public List<Action> action(){
        List<Action> results = new ArrayList<Action>();
        Organism newPlant;
        Organism newPlant2;

        if(this.ifReproduce()){
            List<Position> pomPositions = this.getFreeNeighboringPosition(this.getPosition());
            if (!(pomPositions.isEmpty())){
                Random randomPosition = new Random();
                int index = randomPosition.nextInt(pomPositions.size());
                Position newPosition = pomPositions.get(index);

                newPlant = this.clone();
                newPlant.initParams();
                newPlant.setPosition(newPosition);

                pomPositions.remove(newPosition);
                if (!(pomPositions.isEmpty())){
                    Random randomPosition2 = new Random();
                    int index2 = randomPosition2.nextInt(pomPositions.size());
                    Position newPosition2 = pomPositions.get(index2);

                    newPlant2 = this.clone();
                    newPlant2.initParams();
                    newPlant2.setPosition(newPosition2);
                    results.add(new Action(ActionEnum.getAction(ActionEnum.A_ADD), newPosition2, 0, newPlant2));
                }

                this.setPower(this.getPower()-2);
                results.add(new Action(ActionEnum.getAction(ActionEnum.A_ADD), newPosition, 0, newPlant));
            }

        }
        return results;
    }

    public List<Position> getFreeNeighboringPosition(Position position){
        try {
            return this.getWorld().filterFreePositions(this.getWorld().getNeighboringPositions(position));
        }
        catch(NullPointerException e){
            return null;
        }
    }
}
