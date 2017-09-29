/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author muhah5588
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a new city
        City kitchener = new City();
        //create new robot
        Robot hammy = new Robot(kitchener, 3, 1, Direction.EAST);
        //create walls
        new Wall(kitchener, 3, 1, Direction.SOUTH);
        new Wall(kitchener, 3, 2, Direction.SOUTH);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        new Wall(kitchener, 3, 4, Direction.SOUTH);
        new Wall(kitchener, 3, 5, Direction.SOUTH);
        new Wall(kitchener, 3, 6, Direction.SOUTH);
        new Wall(kitchener, 3, 7, Direction.SOUTH);
        new Wall(kitchener, 3, 8, Direction.SOUTH);
        new Wall(kitchener, 3, 9, Direction.SOUTH);
        new Wall(kitchener, 3, 1, Direction.EAST);
        new Wall(kitchener, 3, 2, Direction.EAST);
        new Wall(kitchener, 3, 4, Direction.EAST);
        new Wall(kitchener, 3, 7, Direction.EAST);
        //create a thing
        new Thing(kitchener, 3, 9);
        //until robot hits a wall
        while (!hammy.canPickThing()) {
            if (hammy.frontIsClear()) {
                hammy.move();
            } else {
                hammy.turnLeft();
                hammy.move();
                hammy.turnLeft();
                hammy.turnLeft();
                hammy.turnLeft();
                hammy.move();
                hammy.turnLeft();
                hammy.turnLeft();
                hammy.turnLeft();
                hammy.move();
                hammy.turnLeft();
            }
        }
    }
}