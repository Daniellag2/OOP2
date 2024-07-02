package animals;

import Olympics.Medal;
import mobility.Point;

public abstract class WaterAnimal extends Animal {
    static final double Max_Dive = -800 ;
    private double diveDept;

    public WaterAnimal(Point location, double totalDistance, String name,int gender ,double weight, double speed, Medal[] medals, Point[] position, double diveDept) {
        super(location,totalDistance,name,gender,weight,speed,medals,position);
        this.diveDept = diveDept;
    }

    public WaterAnimal(){
        super();
        diveDept = 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        super.toString();
        return "WaterAnimal{" +
                "diveDept=" + diveDept +
                '}';
    }

    public abstract void makeSound();


}
