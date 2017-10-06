/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author muhah5588
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kitchener = new City();
        //create a robot
        Robot hammy = new Robot(kitchener, 0, 3, Direction.WEST);
        //create a square wall formation
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.EAST);
        //counted to loop,2 times around the square, 8 turns
        for (int count = 0; count < 8; count = count + 1) {
            hammy.move();
            hammy.move();
            hammy.move();
            hammy.turnLeft();
        }
    }
}
