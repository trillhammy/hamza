/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author muhah5588
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        //create a scanner for the input
        Scanner input = new Scanner(System.in);
        //get the system to output the text to the user
        System.out.println("please input a measurement in inches");
        //get measurement
        int inches = input.nextInt();
        //calculate the centimeters from inches 
        double centimeters = inches * 2.54;
        //output the length
        System.out.println( inches + " is the same as " + centimeters);
        
        
        
        
        }
    }