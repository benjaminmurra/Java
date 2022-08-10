import java.util.Random;

public class Demo{
    public static void main(String[] args){
        Random rand = new Random();
        //instantiate objects
        Ball soccerBall;
        Field dalField;
        Player srini;
        Player ben;

        //create players and field, ball
        srini = new Player("Srini");
        ben= new Player ("Ben");
        dalField = new Field(0.0, 0.0, 600, 400);
        soccerBall = new Ball(100.0, 200.0);

        //create variables to set random distance and angles
        int upperboundDistance = 500;
        int upperboundAngle = 360;
        double distance;
        double angle;

        //call kick method 10 times for both players
        for(int i = 0; i<=10; i++) {
            distance = rand.nextInt(upperboundDistance);
            angle = rand.nextInt(upperboundAngle);

            srini.kick(dalField, soccerBall, distance, angle);
            System.out.println("Srini- " +soccerBall);

            ben.kick(dalField, soccerBall, distance, angle);
            System.out.println("Ben- " +soccerBall);
        }

        System.out.println("\n");
    }
}
