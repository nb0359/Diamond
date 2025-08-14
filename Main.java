import kareltherobot.*;

public class Main implements Directions {

    // Constants
    private static final int START_STREET = 2;
    private static final int START_AVENUE = 6;
    private static final int START_BEEPERS = 16;
    private static final Direction START_DIRECTION = West;

    public static void main(String[] args) {
        World.setVisible(true);

        Robot r = new Robot(START_STREET, START_AVENUE, START_DIRECTION, START_BEEPERS);

        // Turn North first
        turnRight(r);

        // 1st row - center beeper
        placeSingleBeeper(r);
        moveUpOneRow(r);

        // 2nd row - 2 beepers (1 space left/right from center)
        placeRow(r, 1);
        moveUpOneRow(r);

        // 3rd row - widest row (2 spaces left/right from center)
        placeRow(r, 2);
        moveUpOneRow(r);

        // 4th row - same as 2nd
        placeRow(r, 1);
        moveUpOneRow(r);

        // 5th row - center beeper
        placeSingleBeeper(r);
    }

    // === PATTERN METHODS ===

    // Center beeper only
    public static void placeSingleBeeper(Robot r) {
        r.putBeeper();
    }

    // Places symmetric beepers given distance from center to each side
    public static void placeRow(Robot r, int distanceFromCenter) {
        // Left beeper
        r.turnLeft();
        moveSteps(r, distanceFromCenter);
        r.putBeeper();

        // Right beeper
        turnAround(r);
        moveSteps(r, distanceFromCenter * 2);
        r.putBeeper();

        // Back to center
        turnAround(r);
        moveSteps(r, distanceFromCenter);
        turnRight(r); // Face forward again
    }

    // === MOVEMENT HELPERS ===

    // Move to next row above
    public static void moveUpOneRow(Robot r) {
        moveSteps(r, 1); // since robot is already facing North
    }

    public static void turnRight(Robot r) {
        for (int i = 0; i < 3; i++) {
            r.turnLeft();
        }
    }

    public static void turnAround(Robot r) {
        for (int i = 0; i < 2; i++) {
            r.turnLeft();
        }
    }

    public static void moveSteps(Robot r, int steps) {
        for (int i = 0; i < steps; i++) {
            r.move();
        }
    }
}
