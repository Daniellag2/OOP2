package animals;

import Olympics.Medal;
import mobility.Point;

public class Eagle extends AirAnimal {
    private double altitudeOfFlight;
    final static double MAX_ALTITUDE = 1000;

    public Eagle(Point location, double totalDistance, String name,int gender ,double weight, double speed, Medal[] medals, Point[] position, double wingspan, double altitudeOfFlight) {
        super(location, totalDistance, name,gender ,weight, speed, medals, position, wingspan);
        this.altitudeOfFlight = altitudeOfFlight;
    }

    public Eagle() {
        super();
        this.altitudeOfFlight = 0;
    }

    @Override
    public void makeSound() {
        System.out.println("Animal: Eagle, said: Clack-wack-chack");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        super.toString();
        return "Eagle{" +
                "altitudeOfFlight=" + altitudeOfFlight +
                '}';
    }

}



