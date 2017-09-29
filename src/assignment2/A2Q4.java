/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author muhah5588
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kitchener = new City();
        //create a robot
        Robot hammy = new Robot (kitchener,0,0, Direction.EAST);
        //create walls
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        new Wall(kitchener, 3, 2, Direction.SOUTH);
        new Wall(kitchener, 3, 2, Direction.WEST);
        new Wall(kitchener, 2, 2, Direction.WEST);
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 2, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.EAST);
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 4, Direction.EAST);
        new Wall(kitchener, 1, 4, Direction.SOUTH);
        new Wall(kitchener, 1, 4, Direction.WEST);
        new Wall(kitchener, 1, 4, Direction.NORTH);
        new Wall(kitchener, 1, 4, Direction.EAST);
        new Wall(kitchener, 4, 1, Direction.EAST);
        new Wall(kitchener, 4, 1, Direction.WEST);
        new Wall(kitchener, 4, 1, Direction.NORTH);
        new Wall(kitchener, 4, 1, Direction.SOUTH);
        new Wall(kitchener, 4, 4, Direction.EAST);
        new Wall(kitchener, 4, 4, Direction.SOUTH);
        new Wall(kitchener, 4, 4, Direction.NORTH);
        new Wall(kitchener, 4, 4, Direction.WEST);
        //get hammy to move
        while(!hammy.canPickThing()){
            while(hammy.getAvenue()!= 2){
            hammy.move();
        }
        while(hammy.getDirection()!= Direction.SOUTH){
            hammy.turnLeft();
        }
        hammy.move();
        if(hammy.frontIsClear()){
            hammy.move();
        }else{
            hammy.turnLeft();
            hammy.move();
        }
        if(hammy.frontIsClear()){
            hammy.move();
        }else{
            hammy.turnLeft();
            hammy.move();
        }
        while(hammy.getDirection()!= Direction.EAST){
            hammy.turnLeft();
        }
        while(hammy.getAvenue()!= 5){
            hammy.move();
        }
        while(hammy.getDirection()!= Direction.SOUTH){
            hammy.turnLeft();
        }
        while(hammy.getStreet()!= 2){
            hammy.move();
        }
        while(hammy.getDirection()!= Direction.WEST){
            hammy.turnLeft();
        }
        hammy.move();
        if(hammy.frontIsClear()){
            hammy.move();
        }else{
            hammy.turnLeft();
            hammy.move();
        }
        if(hammy.frontIsClear()){
            hammy.move();
        }else{
            hammy.turnLeft();
            hammy.move();
        }
        while(hammy.getDirection()!= Direction.SOUTH){
            hammy.turnLeft();
        }
        while(hammy.getStreet()!= 5){
            hammy.move();
        }
        while(hammy.getDirection()!= Direction.SOUTH){
            hammy.turnLeft();
        }
        while(hammy.getDirection()!= Direction.WEST){
            hammy.turnLeft();
        }
         while(hammy.getAvenue()!= 3){
            hammy.move();
        }
        while(hammy.getDirection()!= Direction.NORTH){
            hammy.turnLeft();
        }
        hammy.move();
        if(hammy.frontIsClear()){
            hammy.move();
        }else{
            hammy.turnLeft();
            hammy.move();
        }
        if(hammy.frontIsClear()){
            hammy.move();
        }else{
            hammy.turnLeft();
            hammy.move();
        }
        while(hammy.getDirection()!= Direction.WEST){
            hammy.turnLeft();
        }
        while(hammy.getAvenue()!= 0){
            hammy.move();
        }
        while(hammy.getDirection()!= Direction.NORTH){
            hammy.turnLeft();
        }
        while(hammy.getStreet()!= 3){
            hammy.move();
        }
        while(hammy.getDirection()!= Direction.EAST){
            hammy.turnLeft();
        }
        hammy.move();
        if(hammy.frontIsClear()){
            hammy.move();
        }else{
            hammy.turnLeft();
            hammy.move();
        }
        if(hammy.frontIsClear()){
            hammy.move();
        }else{
            hammy.turnLeft();
            hammy.move();
        }
        while(hammy.getDirection()!= Direction.NORTH){
            hammy.turnLeft();
        }
        while(hammy.getStreet()!= 0){
            hammy.move();
        }
        while(hammy.getDirection()!= Direction.EAST){
            hammy.turnLeft();
        }
        }
    }
}