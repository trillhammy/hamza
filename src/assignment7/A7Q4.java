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
public class A7Q4 {
    
    //create function type, variables for amount, interest rate and amount of years
    public double compoundInterest(double amount, double interest, double years){
        
        //equation for compound interest
        double answer = amount * (Math.pow(1 + interest, years));
        //output the answer
        System.out.println("The new Balance is " + answer);
        //return the answer
        return answer;
        
}    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A7Q4 test = new A7Q4();
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask user to enter the amount, interest rate and the number of years
        System.out.println("Please enter the initial amount, the interest"
                + " rate, and the number of years in this order");
        //create variable for each
        double amount = input.nextDouble();
        double interest = input.nextDouble();
        //make interest into a percentage
        interest = interest / 100;
        double years = input.nextDouble();
        //run method
        double balance = test.compoundInterest(amount, interest, years);
        
        
        
        
    }
}
