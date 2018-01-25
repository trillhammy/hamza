/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 * @author muhah5588
 */
public class A7Q3 {
    
    public void factors(String fac){
        
        System.out.println("The factors of your integer are " + fac);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an object to run my method
        A7Q3 test = new A7Q3();
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask user to enter an integer
        System.out.println("Enter an integer");
        //store the integer that the user entered
        int number = input.nextInt();
            
        int[] numberS = new int[number];
        
        for (int i = 0; number < numberS.length; i++) {
            
            
        }
    }
}
