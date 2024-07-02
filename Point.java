package mobility;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        if (x < 0 || y < 0)
            throw new IllegalArgumentException();
        this.x = x;
        this.y = y;
    }

    public Point(){
        this(0, 0);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    protected int getX(){
        return x;
    }

    protected int getY(){
        return y;
    }

}
