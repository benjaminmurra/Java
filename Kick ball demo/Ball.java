public class Ball {
    private double bx;    // x-coordinate
    private double by;    // y-coordinate
    //constructor
    public Ball(double bx, double by) {
        this.bx = bx;
        this.by = by;
    }
    //setter for bx
    public void setBx(double bx) {
        this.bx = bx;
    }
    //setter for bx
    public void setBy(double by) {
        this.by = by;
    }
    //getter for bx
    public double getBx() {
        return bx;
    }
    //getter for by
    public double getBy() {
        return by;
    }
    //toString() method
    public String toString() {
        return "Ball: [" +"bx=" + bx + ", by=" + by + ']';
    }
}

