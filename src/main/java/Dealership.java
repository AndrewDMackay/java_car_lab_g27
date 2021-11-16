import components.Tyre;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private int stock;
    private ArrayList<Vehicle> vehicles;

    public Dealership(double till){
        this.till = till;
        this.stock = 0;
        this.vehicles = new ArrayList<>();
    }
}
