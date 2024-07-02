package animals;

import Olympics.Medal;
import mobility.Point;

public class Pigeon extends AirAnimal {
    private String family;

    public Pigeon(Point location, double totalDistance, String name,int gender ,double weight, double speed, Medal[] medals, Point[] position, double wingspan, String family) {
        super(location, totalDistance, name,gender ,weight, speed, medals, position, wingspan);
        this.family = family;
    }

    public Pigeon(){
        super();
        family = "zvulun";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "family='" + family + '\'' +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Animal: Pigeon, said: Arr-rar-rar-rar-raah");

    }
}
