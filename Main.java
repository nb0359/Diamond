import kareltherobot.*;

public class Main implements Directions{
public static void main(String[] args) {
World.setVisible(true);// allows us to see the run

// The line below creates a Robot that we will refer to as r.  
// Find out what the numbers and direction do!
Robot r = new Robot(2,6,West,5);


	
// examples of commands you can invoke on a Robot
r.move();
r.putBeeper();// move one step in the direction it is facing
r.turnLeft();
r.turnLeft();
r.turnLeft();
r.move();
r.turnLeft();
r.move();
r.putBeeper();

r.turnLeft();
r.turnLeft();
r.turnLeft();
r.move(); //2nd beeper// move one step in the direction it is facing
r.turnLeft();
r.move();
r.putBeeper();

r.turnLeft();
r.turnLeft();
r.turnLeft();
r.move(); //2nd beeper// move one step in the direction it is facing
r.turnLeft();
r.move();
r.putBeeper();

r.turnLeft();
r.turnLeft();
r.turnLeft();
r.move(); //2nd beeper// move one step in the direction it is facing
r.turnLeft();
r.move();
r.putBeeper(); //1st side complete **********

// r.turnLeft();
// r.turnLeft();
// r.turnLeft()

// for (int i=0;i<5;i++){
// r.putBeeper();// move one step in the direction it is facing
r.turnLeft();
r.move();
r.turnLeft();r.turnLeft();r.turnLeft();
r.putBeeper();
}

}
}

