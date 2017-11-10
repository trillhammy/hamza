-
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muhah5588
 */
public class variableExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot steve = new Robot (kw,1,1, Direction.EAST);
        
        //create a move counting variable
        int moveCounter = 0;
        // continue when counter is less than 10
        while(moveCounter < 10){
            // move forward
            steve.move();
            // add 1 to move counter
            moveCounter = moveCounter + 1;
        }
        steve.turnLeft();
        steve.turnLeft();
        
        
        // counted for loop
        for(int count = 0; count < 10; count = count +1){
            steve.move();
    }
    }
}