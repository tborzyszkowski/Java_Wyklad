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

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {
        var worldStrategy = getWorldSizeStrategy(args);
        var worldSize = worldStrategy.getWorldSize();
        var javaWorld = World.getInstance().init(worldSize.getKey(), worldSize.getValue());

        var animalFactory = FactoryProducer.getFactory(FactoryEnum.ANIMAL_FACTORY);
        var plantFactory = FactoryProducer.getFactory(FactoryEnum.PLANT_FACTORY);

        FillWorld(javaWorld, animalFactory, plantFactory);

        System.out.println(javaWorld.toString());
        var scanner = new Scanner(System.in);
        while(true) {
            javaWorld.makeTurn();
            System.out.println(javaWorld);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //scanner.nextLine();
        }
    }

    private static void FillWorld(World javaWorld, AbstractFactory animalFactory, AbstractFactory plantFactory) {
        var freePositions = javaWorld.getFreePositions();
        var rnd = new Random();
        for (var pos : freePositions) {
            var nextInt = rnd.nextInt();
            var chance = 25;

            if (nextInt % chance == 0) {
                javaWorld.addOrganism(animalFactory.getAnimal(AnimalEnum.WOLF, pos, javaWorld));
            }
            else if (nextInt % chance == 1 || nextInt % chance == 5) {
                javaWorld.addOrganism(animalFactory.getAnimal(AnimalEnum.SHEEP, pos, javaWorld));
            }
            else if (nextInt % chance == 8 || nextInt % chance == 9) {
                javaWorld.addOrganism(animalFactory.getAnimal(AnimalEnum.BOAR, pos, javaWorld));
            }
            else if (nextInt % chance == 10 || nextInt % chance == 11) {
                javaWorld.addOrganism(animalFactory.getAnimal(AnimalEnum.BEAR, pos, javaWorld));
            }
            else if (nextInt % chance == 12 || nextInt % chance == 13) {
                javaWorld.addOrganism(animalFactory.getAnimal(AnimalEnum.HIVE, pos, javaWorld));
            }
            else if (nextInt % chance == 2) {
                javaWorld.addOrganism(plantFactory.getPlant(PlantEnum.GRASS, pos, javaWorld));
            }
            else if (nextInt % chance == 3 || nextInt % chance == 6) {
                javaWorld.addOrganism(plantFactory.getPlant(PlantEnum.DANDELION, pos, javaWorld));
            }
            else if (nextInt % chance == 4 || nextInt % chance == 7) {
                javaWorld.addOrganism(plantFactory.getPlant(PlantEnum.MUSHROOM, pos, javaWorld));
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
