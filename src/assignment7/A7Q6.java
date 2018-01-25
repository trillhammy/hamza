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
public class A7Q6 {
    
    public int lastDigit (int numbOne){
        
        
        //calculate to get the last digit
        int answer = numbOne % 10;
        //if integer is a negative number
        if (answer < 0){
            //get the last digit to a positive number
            int answr = (numbOne % 10) - answer - answer ;
            //output the last digit
            System.out.println("The last digit of the integer is " + answr);
        }else{
            //output the last digit
        System.out.println("The last digit of the integer is " + answer);
        }
        //return the answer
        return answer;
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create test to run my method
        A7Q6 test = new A7Q6();
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask user to enter an integer
        System.out.println("Please enter an integer");
        //create variable and store the integer
        int lastDig = input.nextInt();
        //run method to get the last digit
        test.lastDigit(lastDig);
        
    }
}
