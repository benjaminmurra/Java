public class Player {
    private String name;

    //contructor
    public Player(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name;
    }

    // set method to kick ball and update ball location
    public void kick(Field f, Ball b, double d, double r) {
        double nx;
        double ny;
        double r_radians = Math.toRadians(r);
        double sinValue = Math.sin(r_radians);
        double cosValue = Math.cos(r_radians);
        nx = b.getBx() + d * cosValue;
        ny = b.getBy() + d * sinValue;

        //if inbounds, set both x and y
        if (nx <= f.getWidth() + f.getX() && ny <= f.getHeight() + f.getY() && nx >= f.getX() && ny >= f.getY())  {
            b.setBx(nx);
            b.setBy(ny);
        }
        //set y only if x out of bounds
        else if (nx > f.getWidth() + f.getX() && ny <= f.getHeight() + f.getY() &&  ny >= f.getY() ){
            b.setBy(ny);
            System.out.println("Reflected" +"\n");

        } else if (nx < f.getX() && ny <= f.getHeight() + f.getY() && ny >= f.getY()){
            b.setBy(ny);
            System.out.println("Reflected" +"\n");

        }
        //set x only if y out of bound
        else if (ny > f.getHeight() + f.getY() && nx <= f.getWidth() + f.getX() && nx >= f.getX()) {
            b.setBx(nx);
            System.out.println("Reflected" +"\n");

        } else if (ny < f.getY() && nx <= f.getWidth() + f.getX() && nx >= f.getX()) {
            b.setBx(nx);
            System.out.println("Reflected" +"\n");

        }
        //if both x and y are out of bounds, do not change position
        else {
            System.out.println("Reflected" +"\n");
        }
    }
}

