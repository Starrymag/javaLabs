public class Point {
    private double x;
    private double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(double xC, double yC){
        this.x = xC;
        this.y = yC;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString( ){
        String s = "X: " + getX() + " Y: " + getY();
        return s;
    }
}
