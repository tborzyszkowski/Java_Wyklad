package world;

import creatures.animals.Sheep;
import creatures.animals.Wolf;

public class Main {

	public static void main(String[] args) throws InterruptedException{
	
		WorldLayout universe = new WorldLayout("Alpha", 30, 10);
		
		Sheep s1 = new Sheep(new Position(25,5), universe, 10, 500, 1);
		Sheep s2 = new Sheep(new Position(5,8), universe, 10, 500, 1);
		Sheep s3 = new Sheep(new Position(14,2), universe, 10, 500, 1);
		Sheep s4 = new Sheep(new Position(27,3), universe, 10, 500, 1);
		Wolf w1 = new Wolf(new Position(30,0), universe, 10, 1000, 500);
		Wolf w2 = new Wolf(new Position(0,10), universe, 10, 1000, 500);

		universe.addOrganism(s1);
		universe.addOrganism(s2);
		universe.addOrganism(s3);
		universe.addOrganism(s4);
		universe.addOrganism(w1);
		universe.addOrganism(w2);
		
		for(int x=0; x < 1000; x++) {
			universe.makeTurn();
			System.out.print(universe);
			Thread.sleep(1000);
			System.out.print("\n\n");
			System.out.print("Owce: " + universe.getSheepCount());
			System.out.print("\nTrawa: " + universe.getGrassCount());
			System.out.print("\nWilki: " + universe.getWolfCount());
			System.out.print("\n\n");
		}
	}
}
