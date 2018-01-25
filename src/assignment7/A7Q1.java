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
public class A7Q1 {
    
    
    //double for the area, needs double for the answer
    public double areaOfCirc (double radius){
        //calculate area of a circle using radius
        double answer = Math.PI * Math.pow(radius,2);
        //send back the answer
        return answer;
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create test to run the code
        A7Q1 test = new A7Q1();
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask user to input the radius
        System.out.println("Please enter the radius");
        //store the radius
        double rad = input.nextDouble();
        //run the method of the area of a circle
        double area = test.areaOfCirc(rad);
        //out the answer to the user
        System.out.println("The area of your circle is: " + area );
        
        
        
    }
}
