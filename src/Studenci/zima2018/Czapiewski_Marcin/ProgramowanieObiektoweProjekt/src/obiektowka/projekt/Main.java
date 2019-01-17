package obiektowka.projekt;

import obiektowka.projekt.enums.AnimalEnum;
import obiektowka.projekt.enums.FactoryEnum;
import obiektowka.projekt.enums.PlantEnum;
import obiektowka.projekt.factories.AbstractFactory;
import obiektowka.projekt.factories.FactoryProducer;
import obiektowka.projekt.strategies.CommandLineWorldSizeStrategy;
import obiektowka.projekt.strategies.WorldSizeDefaultStrategy;
import obiektowka.projekt.strategies.WorldSizeStrategy;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var worldStrategy = getWorldSizeStrategy(args);
        var worldSize = worldStrategy.getWorldSize();
        var javaWorld = new World(worldSize.getKey(), worldSize.getValue());

        var animalFactory = FactoryProducer.getFactory(FactoryEnum.ANIMAL_FACTORY);
        var plantFactory = FactoryProducer.getFactory(FactoryEnum.PLANT_FACTORY);

        FillWorld(javaWorld, animalFactory, plantFactory);

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

    private static void FillWorld(World javaWorld, AbstractFactory animalFactory, AbstractFactory plantFactory) {
        var freePositions = javaWorld.getFreePositions();
        var rnd = new Random();
        for (var pos : freePositions) {
            var nextInt = rnd.nextInt();
            if (nextInt % 10 == 0) {
                javaWorld.addOrganism(animalFactory.getAnimal(AnimalEnum.WOLF, pos, javaWorld));
            }
            else if (nextInt % 10 == 1 || nextInt % 10 == 5) {
                javaWorld.addOrganism(animalFactory.getAnimal(AnimalEnum.SHEEP, pos, javaWorld));
            }
            else if (nextInt % 10 == 2) {
                javaWorld.addOrganism(plantFactory.getPlant(PlantEnum.GRASS, pos, javaWorld));
            }
            else if (nextInt % 10 == 3 || nextInt % 10 == 6) {
                javaWorld.addOrganism(plantFactory.getPlant(PlantEnum.DANDELION, pos, javaWorld));
            }
            else if (nextInt % 10 == 4 || nextInt % 10 == 7) {
                javaWorld.addOrganism(plantFactory.getPlant(PlantEnum.TOADSTOOL, pos, javaWorld));
            }
        }
    }

    private static WorldSizeStrategy getWorldSizeStrategy(String[] args) {

        if (args.length > 0) {
            return new CommandLineWorldSizeStrategy(args);
        }

        return new WorldSizeDefaultStrategy();
    }
}
