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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for the input
        Scanner input = new Scanner(System.in);
        //ask the user to input the cost of the food, dj, hall, dec, staff, and misc for prom
        System.out.println("How much does the food for prom cost?");
        //add a variable for each cost to add the total cost all together
        int food = input.nextInt();
        System.out.println("How much does the DJ cost?");
        int dj = input.nextInt();
        System.out.println("How much does the hall cost?");
        int hall = input.nextInt();
        System.out.println("How much does decorations cost?");
        int dec = input.nextInt();
        System.out.println("How much does the staff cost?");
        int staff = input.nextInt();
        System.out.println("How much for miscellaneous cost?");
        int misc = input.nextInt();
        //add the costs to have a total cost
        int totalCost = food + dj + hall + dec + staff + misc;
        
        //output the total cost
        System.out.println("Total cost is " + totalCost);
        // divide total cost by 35 (cost of ticket) to get break even
        int tickets = (int)Math.ceil(totalCost/35);
        //output the amount of tickets needed break even
        System.out.println("You will need to sell " + tickets + " to break even");
        
        
    }
}
