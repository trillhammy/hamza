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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kitchener = new City();
        //create a robot
        Robot hammy = new Robot(kitchener, 3, 3, Direction.SOUTH);
        //create walls mimicing a 4 block street
        new Wall (kitchener,1,1, Direction.NORTH);
        new Wall (kitchener,1,1, Direction.WEST);
        new Wall (kitchener,2,1, Direction.WEST);  
        new Wall (kitchener,2,1, Direction.SOUTH);
        new Wall (kitchener,2,2, Direction.SOUTH);
        new Wall (kitchener,2,2, Direction.EAST);
        new Wall (kitchener,1,2, Direction.NORTH);
        new Wall (kitchener,1,2, Direction.EAST);
        new Wall (kitchener,1,5, Direction.NORTH);
        new Wall (kitchener,1,5, Direction.EAST);
        new Wall (kitchener,2,4, Direction.WEST);  
        new Wall (kitchener,2,4, Direction.SOUTH);
        new Wall (kitchener,2,5, Direction.SOUTH);
        new Wall (kitchener,2,5, Direction.EAST);
        new Wall (kitchener,1,4, Direction.NORTH);
        new Wall (kitchener,1,4, Direction.WEST);
        new Wall (kitchener,4,1, Direction.WEST);
        new Wall (kitchener,5,1, Direction.WEST);
        new Wall (kitchener,4,1, Direction.NORTH);  
        new Wall (kitchener,4,2, Direction.NORTH);
        new Wall (kitchener,4,2, Direction.EAST);
        new Wall (kitchener,5,1, Direction.SOUTH);
        new Wall (kitchener,5,2, Direction.EAST);
        new Wall (kitchener,5,2, Direction.SOUTH);
        new Wall (kitchener,4,4, Direction.NORTH);
        new Wall (kitchener,4,4, Direction.WEST);
        new Wall (kitchener,4,5, Direction.EAST);  
        new Wall (kitchener,4,5, Direction.NORTH);
        new Wall (kitchener,5,4, Direction.SOUTH);
        new Wall (kitchener,5,4, Direction.WEST);
        new Wall (kitchener,5,5, Direction.EAST);
        new Wall (kitchener,5,5, Direction.SOUTH);
        
    }
}
