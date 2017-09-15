/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author muhah5588
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener = new City();
        new Thing(kitchener,3,1);
        Robot hammy = new Robot(kitchener,3,0, Direction.EAST);
        //create a wall
        new Wall (kitchener,3,2, Direction.WEST);
        new Wall (kitchener,3,2, Direction.NORTH);
        new Wall (kitchener,2,3, Direction.WEST);
        new Wall (kitchener,1,3, Direction.WEST);
        new Wall (kitchener,1,3, Direction.NORTH);
        new Wall (kitchener,1,3, Direction.EAST);
        new Wall (kitchener,2,4, Direction.NORTH);
        new Wall (kitchener,2,4, Direction.EAST);
        new Wall (kitchener,3,4, Direction.EAST);
        //get hammy to move
        hammy.move();
        //get hammy to pick thing
        hammy.pickThing();
        //get hammy to move
        hammy.turnLeft();
        hammy.move();
        hammy.turnLeft();
        hammy.turnLeft();
        hammy.turnLeft();
        hammy.move();
        hammy.turnLeft();
        hammy.move();
        hammy.move();
        hammy.turnLeft();
        hammy.turnLeft();
        hammy.turnLeft();
        hammy.move();
        //put a thing
        hammy.putThing();
        //get hammy to move
        hammy.move();
        hammy.turnLeft();
        hammy.turnLeft();
        hammy.turnLeft();
        hammy.move();
        hammy.turnLeft();
        hammy.move();
        hammy.turnLeft();
        hammy.turnLeft();
        hammy.turnLeft();
        hammy.move();
        hammy.move();
        hammy.turnLeft();
    }
}
