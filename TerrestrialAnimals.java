package animals;

import Olympics.Medal;
import mobility.Point;

public abstract class TerrestrialAnimals extends Animal{

    private int noLegs;

    public TerrestrialAnimals(Point location, double totalDistance, String name,int gender ,double weight, double speed, Medal[] medals, Point[] position,int noLegs) {
        super(new Point(0,20), totalDistance, name,gender ,weight, speed, medals, position);
        this.noLegs = noLegs;
    }

    public TerrestrialAnimals(){
        super();
        noLegs = 2;
    }

}


