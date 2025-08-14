import kareltherobot.*;

public class Main implements Directions {

    // Constants for Robot setup
    private static final int START_STREET = 2;
    private static final int START_AVENUE = 6;
    private static final int START_BEEPERS = 16;
    private static final Direction START_DIRECTION = West;

    // Movement constants
    private static final int TURN_LEFT_TIMES_FOR_RIGHT = 3;
    private static final int TURN_LEFT_TIMES_FOR_AROUND = 2;

    // Step counts for specific movements
    private static final int MOVE_TWO = 2;
    private static final int MOVE_FOUR = 4;

    public static void main(String[] args) {
        World.setVisible(true);

        // Create Robot at specified start position
        Robot r = new Robot(START_STREET, START_AVENUE, START_DIRECTION, START_BEEPERS);

        // First Row
        turnRight(r);
        r.putBeeper();
        r.move();

        // Second Row
        r.turnLeft();
        r.move();
        r.putBeeper(); // Leftmost beeper

        turnAround(r);
        moveSteps(r, MOVE_TWO);
        r.putBeeper(); // Rightmost beeper

        turnAround(r);
        r.move(); // Recenters

        // Third Row
        turnRight(r);
        r.move();

        r.turnLeft();
        moveSteps(r, MOVE_TWO);
        r.putBeeper(); // Leftmost beeper in row 3

        turnAround(r);
        moveSteps(r, MOVE_FOUR);
        r.putBeeper(); // Rightmost beeper in row 3

        turnAround(r);
        moveSteps(r, MOVE_TWO); // Recenters

        // Fourth Row
        turnRight(r);
        r.move();

        r.turnLeft();
        r.move();
        r.putBeeper(); // Leftmost beeper row 4

        turnAround(r);
        moveSteps(r, MOVE_TWO);
        r.putBeeper(); // Rightmost beeper row 4

        turnAround(r);
        r.move(); // Recenters

        // Fifth Row
        turnRight(r);
        r.move();
        r.putBeeper(); // Center beeper row 5
    }

    // Helper method: Turn right (3 left turns)
    public static void turnRight(Robot r) {
        for (int i = 0; i < TURN_LEFT_TIMES_FOR_RIGHT; i++) {
            r.turnLeft();
        }
    }

    // Helper method: Turn around (2 left turns)
    public static void turnAround(Robot r) {
        for (int i = 0; i < TURN_LEFT_TIMES_FOR_AROUND; i++) {
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
