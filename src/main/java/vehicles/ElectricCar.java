package vehicles;

import components.BodyType;
import components.Engine;

public class ElectricCar extends Vehicle {
    public ElectricCar(Engine engine, BodyType bodyType, String colour, double price) {
        super(engine, bodyType, colour, price);
    }
}
