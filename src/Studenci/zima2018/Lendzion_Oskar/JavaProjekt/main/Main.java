package main;

import Organisms.*;


import java.io.IOException;

public class Main {
    public static void main(String [] args){
        World world1 = new World(10, 10);

        Sheep sheep1 = new Sheep(1, 3, world1);
        sheep1.initParams();
        world1.addOrganism(sheep1);
        Sheep sheep2 = new Sheep(3, 4, world1);
        sheep2.initParams();
        world1.addOrganism(sheep2);

        Grass grass = new Grass(2,9,world1);
        grass.initParams();
        world1.addOrganism(grass);

        Grass grass2 = new Grass(8,2,world1);
        grass2.initParams();
        world1.addOrganism(grass2);

        Grass grass3 = new Grass(4,7,world1);
        grass3.initParams();
        world1.addOrganism(grass3);

        Wolf wolf1 = new Wolf(0, 2, world1);
        wolf1.initParams();
        world1.addOrganism(wolf1);

        Wolf wolf2 = new Wolf(6, 8, world1);
        wolf2.initParams();
        world1.addOrganism(wolf2);

        System.out.println(world1);

        for(int i=0; i<20; i++){
        	/*int inChar;
            System.out.println("Press Enter for next turn");
            try {
                inChar = System.in.read();
            }
            catch (IOException e){
                System.out.println("Error reading from user");
            }
            */
            
        	world1.makeTurn();
        	System.out.println(world1);
        	for(Organism o: world1.getOrganisms()){
              System.out.println(o.getClass().getSimpleName() + " power: " + o.getPower()
              );
          }
        }

    }
}
