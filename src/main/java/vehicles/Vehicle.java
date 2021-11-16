
package vehicles;

import components.BodyType;
import components.Door;
import components.Engine;
import components.Tyre;

import java.util.ArrayList;

public abstract class Vehicle {

    private Engine engine;
    private ArrayList<Tyre> tyres;
    private ArrayList<Door> doors;
    private BodyType bodyType;
    private String colour;
    private double price;

    public Vehicle(String colour, double price){
        this.colour = colour;
        this.price = price;
        this.tyres = new ArrayList<>();
        this.addTyresAndDoors();
    }

    public void addTyre(Tyre tyre) {
        this.tyres.add(tyre);
    }

    public void addDoor(Door door) {
        this.doors.add(door);
    }

    public void addTyresAndDoors() {
        int tyreNumber = this.bodyType.getTyres();
        int doorNumber = this.bodyType.getDoors();
        for(int i = 0; i <= tyreNumber; i++ ) {
            Tyre tyre = new Tyre("Firestone", this.bodyType.toString());
            this.addTyre(tyre);
        }
        for(int i = 0; i <= doorNumber; i++ ) {
            Door door = new Door("Door");
            this.addDoor(door);
        }
    }

}
