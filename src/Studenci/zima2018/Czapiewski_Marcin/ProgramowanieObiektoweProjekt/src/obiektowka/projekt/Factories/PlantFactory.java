package obiektowka.projekt.Factories;

import obiektowka.projekt.Enums.AnimalEnum;
import obiektowka.projekt.Enums.PlantEnum;
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

        if (plant == PlantEnum.TOADSTOOL) {
            return new Toadstool(position, world);
        }

        return null;
    }

    @Override
    public Plant getPlant(Plant plant) {
        return (Plant)plant.clone();
    }

    @Override
    public Animal getAnimal(AnimalEnum animal, Position position, World world) {
        return null;
    }

    @Override
     public Animal getAnimal(Animal animal) {
        return null;
    }
}
