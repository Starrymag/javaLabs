public class Circle {
    private double radius;
    private Point center;
    private String color;

    public Circle() {
        this.radius = 10.0;
        this.color = "black";
        this.center = new Point();
    }

    public Circle(double r) {
        this.radius = r;
        this.color = "black";
        this.center = new Point();
    }

    public Circle(double r, String c, double xC, double yC) {
        this.radius = r;
        this.color = c;
        this.center = new Point(xC, yC);
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public Point getCenter() {
        return this.center;
    }

    @Override
    public String toString( ){
        String s = "radius: " + getRadius() + "\ncenter: " + getCenter() + "\ncolor: " + getColor();
        return s;
    }
}