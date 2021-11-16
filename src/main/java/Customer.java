import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private double wallet;
    private ArrayList<Vehicle> vehicles;

    public Customer(double wallet) {
        this.wallet = wallet;
        vehicles = new ArrayList<>();
    }
}
