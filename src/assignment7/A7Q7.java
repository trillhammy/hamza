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
public class A7Q7 {
    
   public int firstDigit (int numbOne){
        
       
       
        //calculate to get the first digit
        int answer = numbOne /10 % 10;
        
        
        
        
        
        
        //output the answer
        System.out.println(answer);
        //return answer
        return answer;
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create test to run my method
        A7Q7 test = new A7Q7();
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask user to enter an integer
        System.out.println("Please enter an integer");
        //create variable and store the integer
        int firstDig = input.nextInt();
        //run method to get the last digit
        test.firstDigit(firstDig);
        
    }
}