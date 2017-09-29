/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author muhah5588
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener = new City();
        Robot hammy = new Robot (kitchener,0,0, Direction.SOUTH);
        Robot tina = new Robot (kitchener,0,1, Direction.SOUTH);
        //create a wall
        new Wall (kitchener,0,1, Direction.WEST);
        new Wall (kitchener,1,1, Direction.WEST);
        new Wall (kitchener,1,1, Direction.SOUTH);
        //get hammy to move
        hammy.move();
        tina.move();
        tina.turnLeft();
        hammy.move();
        tina.move();
        tina.turnLeft();
        tina.turnLeft();
        tina.turnLeft();
        tina.move();
        tina.turnLeft();
        tina.turnLeft();
        tina.turnLeft();
        hammy.turnLeft();
        tina.move();
        hammy.move();
        
    }
}
