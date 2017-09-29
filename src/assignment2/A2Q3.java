
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
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kitchener = new City();
        //create a robot
        Robot hammy = new Robot (kitchener,5,5, Direction.EAST);
        //get hammy to move
        while(hammy.getDirection()!= Direction.WEST){
            hammy.turnLeft();
        }
        while(hammy.getAvenue()!= 0){
            hammy.move();
        }
        while(hammy.getDirection() != Direction.NORTH){
            hammy.turnLeft();
        }
        while(hammy.getStreet()!= 0){
            hammy.move();
        }
    }
}
