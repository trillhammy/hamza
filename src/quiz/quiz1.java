/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author muhah5588
 */
public class quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kitchener = new City();
        //count things in one spot
        kitchener.showThingCounts(true);
        //create a robot
        Robot hammy = new Robot(kitchener, 1, 1, Direction.EAST);
        //create walls behind hammy and around the mines
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 3, Direction.SOUTH);
        new Wall(kitchener, 1, 4, Direction.NORTH);
        new Wall(kitchener, 1, 4, Direction.SOUTH);
        new Wall(kitchener, 1, 5, Direction.NORTH);
        new Wall(kitchener, 1, 5, Direction.SOUTH);
        new Wall(kitchener, 1, 6, Direction.NORTH);
        new Wall(kitchener, 1, 6, Direction.SOUTH);
        new Wall(kitchener, 1, 7, Direction.NORTH);
        new Wall(kitchener, 1, 7, Direction.SOUTH);
        new Wall(kitchener, 1, 7, Direction.EAST);
        //create mines(things) in a line inside the walls
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 4);
        new Thing(kitchener, 1, 5);
        new Thing(kitchener, 1, 6);
        new Thing(kitchener, 1, 7);
        //move while front is clear
        while (hammy.frontIsClear()) {
            hammy.move();
            //if front is not clear than turn aroudn and put thing
            if (!hammy.frontIsClear()) {
                hammy.turnLeft();
                hammy.turnLeft();
                hammy.putThing();
                hammy.move();
            }

            //make hammy move and pick thing and drop it from start
            while (hammy.canPickThing()) {
                hammy.pickThing();
                hammy.turnLeft();
                hammy.turnLeft();
            }
        }
    }
}
