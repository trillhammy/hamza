/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author muhah5588
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kitchener = new City();
        //create a robot
        Robot hammy = new Robot(kitchener, 1, 1, Direction.EAST, 20);
        //create a move counting variable
        //stop when he has 0 things in his backpack
        while (hammy.countThingsInBackpack() > 0) {
            //loop for counter to put 5 things
            for(int count = 0; count < 5; count = count +1){
                hammy.putThing();
                hammy.move();
            }
            //
            if(hammy.getDirection()== Direction.EAST){
                hammy.turnLeft();
                hammy.turnLeft();
                hammy.turnLeft();
            }
            if(hammy.getDirection()== Direction.SOUTH){
                hammy.move();
                hammy.turnLeft();
                hammy.turnLeft();
                hammy.turnLeft();
                hammy.move();
            }else{
                if(hammy.getDirection()== Direction.WEST){
                    hammy.turnLeft();
                    hammy.move();
                    hammy.turnLeft();
                    hammy.move();
                }
            }
        }
    }
}
