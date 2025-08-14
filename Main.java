import kareltherobot.*;

public class Main implements Directions {

    public static void main(String[] args) {
        World.setVisible(true);

        Robot r = new Robot(2, 6, West, 16);
        turnRight(r);         // r.turnLeft() 3x

        // Place beepers according to original logic
        // First row
        r.putBeeper();
        
        
        r.move();             // move to next position

        // Second Row         
        r.turnLeft();
        moveSteps(r, 1);  
        r.putBeeper();      //left most beeper 

        turnAround(r);     
        moveSteps(r, 2);      //moves 2 steps to make right most beeper
        r.putBeeper();

        turnAround(r);      
        moveSteps(r, 1);          //moves back to center

        turnRight(r);       
        moveSteps(r, 1);

        // Third row
        r.turnLeft();
        moveSteps(r, 2);        //puts left most beeper in 3rd row
        r.putBeeper();

        turnAround(r);
        moveSteps(r, 4);        //takes 4 steps and puts right most beeper 3rd row
        r.putBeeper();

        turnAround(r);
        moveSteps(r, 2);        //recenters 
        
        turnRight(r);           //faces straight up and moves
        moveSteps(r, 1);

        // Fourth row
        r.turnLeft();        //left most beeper
        moveSteps(r, 1);
        r.putBeeper();

        turnAround(r);
        moveSteps(r, 2);    //right most beeper row 4
        r.putBeeper();

        turnAround(r);
        moveSteps(r, 1);        //recenters

        // Fifth Row
        turnRight(r);       
        moveSteps(r, 1);
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
