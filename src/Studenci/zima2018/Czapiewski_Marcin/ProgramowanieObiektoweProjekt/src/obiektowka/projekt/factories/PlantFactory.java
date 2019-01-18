package obiektowka.projekt.factories;

import obiektowka.projekt.enums.AnimalEnum;
import obiektowka.projekt.enums.PlantEnum;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;
import obiektowka.projekt.organisms.*;

public class PlantFactory extends AbstractFactory{
    @Override
    public Plant getPlant(PlantEnum plant, Position position, World world) {
        if (plant == PlantEnum.DANDELION) {
            return new Dandelion(position, world);
        }

        if (plant == PlantEnum.GRASS) {
            return new Grass(position, world);
        }

        if (plant == PlantEnum.MUSHROOM) {
            return new Mushroom(position, world);
        }

        return null;
    }

    @Override
    public Animal getAnimal(AnimalEnum animal, Position position, World world) {
        return null;
    }
}
