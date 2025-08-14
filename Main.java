import kareltherobot.*;

public class Main implements Directions {

    public static void main(String[] args) {
        World.setVisible(true);

        Robot r = new Robot(2, 6, West, 16);

        // Place beepers according to original logic
        // First row
        turnRight(r);         // r.turnLeft() 3x
        r.putBeeper();
        r.move();             // move to next position

        // Second Row         
        r.turnLeft();
        r.move();
        r.putBeeper();      //left most beeper 

        turnAround(r);     
        moveSteps(r, 2);      //moves 2 steps to make right most beeper
        r.putBeeper();

        turnAround(r);      
        r.move();         //moves back to center

        // Third row
        turnRight(r);       
        r.move();

        r.turnLeft();
        moveSteps(r, 2);        //
        r.putBeeper();

        turnAround(r);
        moveSteps(r, 4);
        r.putBeeper();

        turnAround(r);
        moveSteps(r, 2);

        // Fourth row
        turnRight(r);
        r.move();

        r.turnLeft();
        r.move();
        r.putBeeper();

        turnAround(r);
        moveSteps(r, 2);
        r.putBeeper();

        turnAround(r);
        r.move();

        // Fifth Row
        turnRight(r);
        r.move();
        r.putBeeper();
    }

    // Helper method: Turn right (3 left turns)
    public static void turnRight(Robot r) {
        for (int i = 0; i < 3; i++) {
            r.turnLeft();
        }
    }

    // Helper method: Turn around (2 left turns)
    public static void turnAround(Robot r) {
        for (int i = 0; i < 2; i++) {
            r.turnLeft();
        }
    }

    // Helper method: Move n steps forward
    public static void moveSteps(Robot r, int steps) {
        for (int i = 0; i < steps; i++) {
            r.move();
        }
    }
}
