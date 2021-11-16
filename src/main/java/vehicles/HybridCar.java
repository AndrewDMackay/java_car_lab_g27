package vehicles;

import components.BodyType;
import components.Engine;

public class HybridCar extends Vehicle {
    public HybridCar(Engine engine, BodyType bodyType, String colour, double price) {
        super(engine, bodyType, colour, price);
    }
}
