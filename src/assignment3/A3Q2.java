/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author muhah5588
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kitchener = new City();
        //create a robot
        Robot hammy = new Robot(kitchener, 1, 1, Direction.EAST);
        //make city show amount of things
        kitchener.showThingCounts(true);
        //create new things
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        //counted for loop, until greater than 10
        for (int count = 0; count < 10; count = count + 1) {
            hammy.pickThing();
            hammy.move();
            hammy.putThing();
            hammy.turnLeft();
            hammy.turnLeft();
            hammy.move();
            hammy.turnLeft();
            hammy.turnLeft();
        }
        //make hammy move
        hammy.move();
    }
}
