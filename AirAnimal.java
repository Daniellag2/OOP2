package animals;

import Olympics.Medal;
import mobility.Point;

public abstract class AirAnimal extends Animal{
    private double wingspan;

    public AirAnimal(Point location,double totalDistance, String name,int gender ,double weight, double speed, Medal[] medals, Point[] position,double wingspan){
        super(new Point(0, 20),totalDistance,name,gender,weight,speed,medals,position);
        this.wingspan=wingspan;
    }

    public AirAnimal(){
        super();
        wingspan=1.0;
    }

    public abstract void makeSound();

}
