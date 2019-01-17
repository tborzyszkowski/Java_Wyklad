package obiektowka.projekt.factories;

import obiektowka.projekt.enums.FactoryEnum;

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
