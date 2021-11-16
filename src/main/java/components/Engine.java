
package components;

import behaviours.IParts;

public class Engine implements IParts {

    private double size;
    private int horsepower;
    private String type;

    public Engine(double size, int horsepower, String type){
        this.size = size;
        this.horsepower = horsepower;
        this.type = type;
    }
}
