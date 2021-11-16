
package vehicles;

import components.BodyType;
import components.Engine;

public class PetrolCar extends Vehicle {

    private Engine engine;
    private BodyType bodytype;

    public PetrolCar(BodyType bodyType, String colour, double price) {
        super(colour, price);
        engine = new Engine(2.0, 250, "petrol");
        this.bodytype = bodyType;
    }
}
