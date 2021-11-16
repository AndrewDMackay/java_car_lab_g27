package vehicles;

import components.BodyType;
import components.Engine;

public class ElectricCar extends Vehicle {

    private Engine engine;
    private BodyType bodyType;

    public ElectricCar(BodyType bodyType, String colour, double price) {
        super(colour, price);
        engine = new Engine(1.5, 250, "hyrbid");
    }
}
