package obiektowka.projekt.factories;

import obiektowka.projekt.enums.AnimalEnum;
import obiektowka.projekt.enums.PlantEnum;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;
import obiektowka.projekt.organisms.*;

public class AnimalFactory extends AbstractFactory{
    @Override
    public Animal getAnimal(AnimalEnum animal, Position position, World world) {

        if (animal == AnimalEnum.SHEEP) {
            return new Sheep(position, world);
        }

        if (animal == AnimalEnum.WOLF) {
            return new Wolf(position, world);
        }

        if (animal == AnimalEnum.BOAR) {
            return new Boar(position, world);
        }

        if (animal == AnimalEnum.BEAR) {
            return new Bear(position, world);
        }

        if (animal == AnimalEnum.HIVE) {
            return new Hive(position, world);
        }

        return null;
    }

    @Override
    public Plant getPlant(PlantEnum plant, Position position, World world) {
        return null;
    }
}
