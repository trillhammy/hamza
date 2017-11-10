
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muhah5588
 */
public class ConditionExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kw = new City();
        //put a robot in the city
        Robot karel = new Robot(kw, 2, 1, Direction.EAST);
        //put a wall up
        new Wall(kw, 2, 5, Direction.EAST);
        new Thing(kw, 2, 4);
        if(karel.frontIsClear()){
                //move forward
                karel.move();
        }else{
            //if front is blocked, turn
            karel.turnLeft();
        }
        
        
        //until robot hits wall
        while(karel.frontIsClear()){
            //if there is something to pick up
            if(karel.canPickThing()){
                //pick it up
                karel.pickThing();
                
            }
            //move forward
            karel.move();
        }
        
        //turn the robot away from the wall
        karel.turnLeft();
        karel.move();
                
    }
}
