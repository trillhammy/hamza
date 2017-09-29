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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kitchener = new City();
        //create 2 robots
        Robot hammy = new Robot (kitchener,0,1, Direction.WEST);
        Robot tina = new Robot (kitchener,3,3, Direction.EAST);
        //create a wall
        new Wall (kitchener,3,3, Direction.EAST);
        new Wall (kitchener,3,3, Direction.SOUTH);
        new Wall (kitchener,2,3, Direction.EAST);
        new Wall (kitchener,2,3, Direction.NORTH);
        new Wall (kitchener,2,3, Direction.WEST);
        //create a thing
        new Thing(kitchener,0,0);
        new Thing(kitchener,1,0);
        new Thing(kitchener,1,1);
        new Thing(kitchener,1,2);
        new Thing(kitchener,2,2);
        //get hammy and tina to move and pick thing
        hammy.move();
        hammy.pickThing();
        tina.turnLeft();
        tina.turnLeft();
        tina.move();
        tina.turnLeft();
        tina.turnLeft();
        tina.turnLeft();
        tina.move();
        hammy.turnLeft();
        hammy.move();
        tina.pickThing();
        hammy.pickThing();
        tina.move();
        tina.pickThing();
        tina.turnLeft();
        hammy.canPickThing();
        hammy.turnLeft();
        hammy.move();
        hammy.pickThing();
        
        
    }
}
