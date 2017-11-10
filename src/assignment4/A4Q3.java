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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Create a Scanner for input
        Scanner input = new Scanner(System.in);
        // tell the user to add in 4 numbers on seperate lines
        System.out.println("please enter 4 numbers on seperate lines");
        
        
        //create a variable for the 4 different numbers on seperate lines
        String n = input.nextLine();
        String a = input.nextLine();
        String s = input.nextLine();
        String d = input.nextLine();
        
        
        //output the 4 different variables on the same line
        System.out.println("your numbers are "+n+", " +a+ ", "+ s +", "+ d);
        
        
        
        
    }
}
