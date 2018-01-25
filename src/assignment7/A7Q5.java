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
public class A7Q5 {
    
    
    //procedure type, create int for amount of lines asked
    public void chaotic (int amountLines){
        //equation to output random
        int randomNumber = (int)(Math.random()*(5 - 1 + 1)) + 1;
        //go through the amount of lines
        for (int y = 0; y < amountLines; y++) {
            //go through the randomNumber pattern
            for (int x = 0; x < randomNumber; x++) {
                //output the "*" in the patterns 
                System.out.print("*");
                //
                randomNumber = (int)(Math.random()*(5 - 1 + 1)) + 1;
            }
            //create spacing
            System.out.println(" ");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create test to run the code
        A7Q5 test = new A7Q5();
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask user to enter the amount of lines
        System.out.println("How many lines of the random pattern do you want?");
        // create variable for the random pattern
        int randomPattern = input.nextInt();
        //tell user what is being outputed
        System.out.println("Your random pattern of astroids is :");
        //run my method
        test.chaotic(randomPattern);
                
        
        
        
        
    }
}
