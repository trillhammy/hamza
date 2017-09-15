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
public class A1Q2 {
    private static City kitchener;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener = new City();
        
        Robot hammy = new Robot(kitchener,4,5, Direction.WEST);
        //create a wall
        new Wall (kitchener,4,4, Direction.NORTH);
        new Wall (kitchener,4,5, Direction.NORTH);
        new Wall (kitchener,4,4, Direction.WEST);
        new Wall (kitchener,5,4, Direction.WEST);
        new Wall (kitchener,5,4, Direction.SOUTH);
        new Wall (kitchener,4,5, Direction.EAST);
        new Wall (kitchener,4,5, Direction.SOUTH);
        //create a thing
        new Thing(kitchener,5,5);
        
        //get hammy to move
        hammy.move();
        hammy.turnLeft();
        hammy.move();
        hammy.turnLeft();
        hammy.move();
        
        //get hammy to pick up thing
        hammy.pickThing();
        //get hammy to move
        hammy.turnLeft();
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
        hammy.turnLeft();
        
        
    }
}
