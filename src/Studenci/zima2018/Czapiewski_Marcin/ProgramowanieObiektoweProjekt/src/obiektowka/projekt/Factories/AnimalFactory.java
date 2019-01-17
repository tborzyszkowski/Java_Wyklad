package obiektowka.projekt.Factories;

import obiektowka.projekt.Enums.AnimalEnum;
import obiektowka.projekt.Enums.PlantEnum;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;
import obiektowka.projekt.organisms.Animal;
import obiektowka.projekt.organisms.Plant;
import obiektowka.projekt.organisms.Sheep;
import obiektowka.projekt.organisms.Wolf;

public class AnimalFactory extends AbstractFactory{
    @Override
    public Animal getAnimal(AnimalEnum animal, Position position, World world) {

        if (animal == AnimalEnum.SHEEP) {
            return new Sheep(position, world);
        }

        if (animal == AnimalEnum.WOLF) {
            return new Wolf(position, world);
        }

        return null;
    }

    @Override
    public Animal getAnimal(Animal animal) {
        return (Animal)animal.clone();
    }

    @Override
    public Plant getPlant(PlantEnum plant, Position position, World world) {
        return null;
    }

    @Override
    public Plant getPlant(Plant plant) {
        return null;
    }

}
