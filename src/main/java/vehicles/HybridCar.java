package vehicles;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;
import components.BodyType;
import components.Engine;

public class HybridCar extends Vehicle {

    private Engine engine;
    private BodyType bodyType;

    public HybridCar(BodyType bodyType, String colour, double price) {
        super(colour, price);
        engine = new Engine(1.5, 250, "hyrbid");
    }
}
