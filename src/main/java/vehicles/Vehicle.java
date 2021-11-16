
package vehicles;

import components.BodyType;
import components.Engine;
import components.Tyre;

import java.util.ArrayList;

public abstract class Vehicle {

    private Engine engine;
    private ArrayList<Tyre> tyres;
    private BodyType bodyType;
    private String colour;
    private double price;

    public Vehicle(Engine engine, BodyType bodyType, String colour, double price){
        this.engine = engine;
        this.bodyType = bodyType;
        this.colour = colour;
        this.price = price;
        this.tyres = new ArrayList<>();
    }

}
