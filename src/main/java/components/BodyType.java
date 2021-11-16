
package components;

import behaviours.IParts;

public enum BodyType {

    MOTORBIKE(0, 2),
    TWODOOR(2, 4),
    FOURDOOR(4, 4);


    private final int doors;
    private final int tyres;

    BodyType(int doors, int tyres){
        this.doors = doors;
        this.tyres = tyres;
    }
}
