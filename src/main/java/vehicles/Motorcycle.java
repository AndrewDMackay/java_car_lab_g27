
package vehicles;

import components.BodyType;
import components.Engine;

public class Motorcycle extends Vehicle {

    private Engine engine;
    private BodyType bodyType;

    public Motorcycle(String colour, double price) {
        super(colour, price);
        engine = new Engine(1.2, 200, "motorcycle");
        bodyType = BodyType.MOTORCYCLE;
    }
}
