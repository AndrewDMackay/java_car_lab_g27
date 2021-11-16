package components;

import behaviours.IParts;

public class Door implements IParts {

    private String doorType;

    public Door(String doorType){
        this.doorType = doorType;
    }
}
