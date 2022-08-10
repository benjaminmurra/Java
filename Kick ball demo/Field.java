public class Field {
    private double xpos;
    private double ypos;
    private double width;
    private double height;

    //constructor
    public Field(double xpos, double ypos, double width, double height) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.width = width;
        this.height = height;
    }

    //setters and getters
    public void setX(double xpos) {
        this.xpos = xpos;
    }

    public void setY(double ypos) {
        this.ypos = ypos;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getX() {
        return xpos;
    }

    public double getY() {
        return ypos;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    //toString method
    public String toString() {
        return "[xpos= " + xpos + "," + "ypos= " + ypos + "] width: " +
                width + ",height: " + height;
    }
}
