package obiektowka.projekt;

import obiektowka.projekt.Enums.AnimalEnum;
import obiektowka.projekt.Enums.FactoryEnum;
import obiektowka.projekt.Enums.PlantEnum;
import obiektowka.projekt.Factories.FactoryProducer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var javaWorld = new World(8, 8);

        var animalFactory = FactoryProducer.getFactory(FactoryEnum.ANIMAL_FACTORY);
        var plantFactory = FactoryProducer.getFactory(FactoryEnum.PLANT_FACTORY);

        var grass = plantFactory.getPlant(PlantEnum.GRASS,new Position(4, 0), javaWorld);
        javaWorld.addOrganism(grass);

        var sheep = animalFactory.getAnimal(AnimalEnum.SHEEP, new Position(0, 0), javaWorld);
        javaWorld.addOrganism(sheep);

        var dandelion = plantFactory.getPlant(PlantEnum.DANDELION, new Position(0, 4), javaWorld);
        javaWorld.addOrganism(dandelion);

        var wolf = animalFactory.getAnimal(AnimalEnum.WOLF, new Position(7, 7), javaWorld);
        javaWorld.addOrganism(wolf);

        var toadstool = plantFactory.getPlant(PlantEnum.TOADSTOOL, new Position(4, 4), javaWorld);
        javaWorld.addOrganism(toadstool);

        System.out.println(javaWorld.toString());

        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 100; i++) {
            scan.nextLine();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            javaWorld.makeTurn();
            System.out.println(javaWorld);
        }
    }
}
