/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author muhah5588
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        //create a city
        City kitchener = new City();
        //create a robot
        Robot hammy = new Robot(kitchener, 1, 1, Direction.EAST);
        //create new things
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 4);
        new Thing(kitchener, 1, 5);
        new Thing(kitchener, 1, 6);
        new Thing(kitchener, 1, 7);
        new Thing(kitchener, 1, 8);
        new Thing(kitchener, 1, 9);
        new Thing(kitchener, 1, 10);
        new Thing(kitchener, 1, 11);
        //until robot hits wall
        while (hammy.frontIsClear()) {
            if (hammy.countThingsInBackpack() < 7) {
                //if can pick thing
                if (hammy.canPickThing()) {
                    //pick up thing
                    hammy.pickThing();
                }
            }
            //get hammy to move while less than avenue 12
            if(hammy.getAvenue()< 12){
                //get hammy to move
                hammy.move();
                if(hammy.getAvenue()== 12){
                    //get hammy to wait at avenue 12
                    hammy.wait();
                }
            }
        }
    }
}
