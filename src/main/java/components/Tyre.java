
package components;

import behaviours.IParts;

public class Tyre implements IParts {

    private String make;
    private String type;

    public Tyre(String make, String type){
        this.make = make;
        this.type = type;
    }
}
