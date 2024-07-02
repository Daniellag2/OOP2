package mobility;

import java.awt.*;

public abstract class Mobile implements ILocatable{

    private Point location;
    private double totalDistance;

    //ממומש מהממשק
    @Override
    public Point getLocation() {
        return location;
    }

    @Override
    public Boolean setLocation(Point location) {
        this.location = location;
        return true;
    }


    public Mobile(Point location, double totalDistance) {
        this.location = location;
        this.totalDistance = totalDistance;
    }

    public Mobile(){
        this.location = new Point(0, 0);
        this.totalDistance = 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Location: " + location + ", Total Distance: " + totalDistance;
    }

    public void addTotalDistance(double distance) {
        totalDistance += distance;
    }

    public double calcDistance(Point loc) {
        return Math.sqrt(Math.pow(loc.getX() - location.getX(), 2) + Math.pow(loc.getY() - location.getY(), 2));
    }

    //לבדוק
    public double move(Point dis){
        return totalDistance += calcDistance(dis);
    }



}
