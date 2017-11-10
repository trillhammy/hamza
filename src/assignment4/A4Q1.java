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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //ask the user to enter their name
        System.out.println("Please enter your name:");
        //use the scanner to input first name
        String firstName = input.nextLine();
        //output the firstname to the screen and greet the person
        System.out.println("Hi " + firstName + ", Whats good fam");
    }
}
