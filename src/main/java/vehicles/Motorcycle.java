
package vehicles;

import components.BodyType;
import components.Engine;

public class Motorcycle extends Vehicle {

    public Motorcycle(Engine engine, BodyType bodyType, String colour, double price) {
        super(engine, bodyType, colour, price);
    }
}
