package obiektowka.projekt.factories;

import obiektowka.projekt.enums.AnimalEnum;
import obiektowka.projekt.enums.PlantEnum;
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
    public Plant getPlant(PlantEnum plant, Position position, World world) {
        return null;
    }
}
