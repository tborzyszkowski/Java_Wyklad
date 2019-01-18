package obiektowka.projekt.factories;

import obiektowka.projekt.enums.AnimalEnum;
import obiektowka.projekt.enums.PlantEnum;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;
import obiektowka.projekt.organisms.Animal;
import obiektowka.projekt.organisms.Plant;

public abstract class AbstractFactory {
    public abstract Animal getAnimal(AnimalEnum animal, Position position, World world);
    public abstract Plant getPlant(PlantEnum plant, Position position, World world);
}
