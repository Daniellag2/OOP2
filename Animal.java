package animals;

import Olympics.Medal;
import mobility.Mobile;
import mobility.Point;

public abstract class Animal extends Mobile {
    private String name;
    private int gender;

    public enum gender {Male, Female, Hermaphrodite};

    private double weight;
    private double speed;
    private Medal[] medals;
    private Point[] position;

    public Animal(Point location, double totalDistance, String name,int gender ,double weight, double speed, Medal[] medals, Point[] position) {
        super(location, totalDistance);
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.speed = speed;
        this.medals = medals;
        this.position = position;
    }

    public Animal() {
        super();
        this.name = "Default Animal";
        this.gender = 2;
        this.weight = 1.0;
        this.speed = 0.0;
        this.medals = new Medal[0];
        this.position = new Point[0];
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "name" + name + "weight" + weight + "speed" + speed + "medals" + medals + "position" + position;
    }

}


