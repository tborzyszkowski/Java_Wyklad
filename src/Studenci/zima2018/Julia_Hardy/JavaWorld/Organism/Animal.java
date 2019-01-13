package Organism;
import Action.*;
import Organism.Organism;
import Position.Position;
import World.World;
import java.util.Random;

import java.util.ArrayList;
import java.util.List;

abstract class Animal extends Organism{
    private Position lastPosition;

    public Position getLastPosition() {
        return lastPosition;
    }

    public void setLastPosition(Position lastPosition) {
        this.lastPosition = lastPosition;
    }



    public List<Action> move(){
        List<Action> results = new ArrayList<Action>();
        List<Position> pomPositions = this.getNeighboringPosition();
//        System.out.print(pomPositions);
        Position newPosition;

        try{
            if(!(pomPositions.isEmpty())){
                Random randomPosition = new Random();
                int index = randomPosition.nextInt(pomPositions.size());
                newPosition = pomPositions.get(index);
                results.add(new Action(ActionEnum.getAction(ActionEnum.A_MOVE), newPosition, 0, this));
                this.setLastPosition(this.getPosition());
                Organism metOrganism = this.getWorld().getOrganismFromPosition(newPosition);
                if(metOrganism != null){
                    results.addAll(metOrganism.consequences(this));
                }
            }
            return results;
        }
            catch(NullPointerException e){
                return null;
        }

    }

    public List<Action> action(){
        List<Action> results = new ArrayList<Action>();
        Organism newAnimal;
        List<Position> birthPositions = this.getNeighboringBirthPosition();

        if(this.ifReproduce() && !birthPositions.isEmpty()){
            Random randomPosition = new Random();
            int index = randomPosition.nextInt(birthPositions.size());
            Position newAnimalPosition = birthPositions.get(index);
            newAnimal = this.clone();
            newAnimal.initParams();
            newAnimal.setPosition(newAnimalPosition);
            this.setPower(this.getPower()/2);
            results.add(new Action(ActionEnum.getAction(ActionEnum.A_ADD), newAnimalPosition, 0, newAnimal));
        }
        return results;
    }


    public List<Position> getNeighboringPosition(){
        try{
            return this.getWorld().getNeighboringPositions(this.getPosition());
        }
        catch(NullPointerException e){
            return null;
        }
    }

    public List<Position> getNeighboringBirthPosition(){
        try {
            return this.getWorld().filterFreePositions(this.getWorld().getNeighboringPositions(this.getPosition()));
        }
        catch(NullPointerException e){
            return null;
        }
    }


}
