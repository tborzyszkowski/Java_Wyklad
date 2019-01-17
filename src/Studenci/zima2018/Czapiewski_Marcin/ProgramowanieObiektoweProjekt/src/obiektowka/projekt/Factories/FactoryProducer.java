package obiektowka.projekt.Factories;

import obiektowka.projekt.Enums.FactoryEnum;

public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryEnum factory) {
        if (factory == FactoryEnum.ANIMAL_FACTORY) {
            return new AnimalFactory();
        }

        if (factory == FactoryEnum.PLANT_FACTORY) {
            return new PlantFactory();
        }

        return null;
    }
}
