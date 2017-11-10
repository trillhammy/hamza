
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muhah5588
 */
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // using arrays to solve A4Q4
        //create scanner for input
        Scanner input = new Scanner (System.in);
        
        //create array to store expenses
        // ned 6 spots
        double[] expenses = new double[6];
        // create array to store name of expenses
        String[] expenseNames = new String[6];
        // out names in array
        expenseNames[0] = "food";
        expenseNames[1] = "dj";
        expenseNames[2] = "hall rental";
        expenseNames[3] = "decorations";
        expenseNames[5] = "misellaneous";
        
        // use a loop to get all the info
        for(int i = 0; i < expenses.length;i++){
            //asking for an expense
            System.out.println("How much does the " + expenseNames[i] + " cost?");
            //storing the expense
            expenses[i] = input.nextDouble();
            
            
        }
             // got all the expenses, add them up
        // start at 0
        double total = 0;
        // go through each expense
        for(int i = 0; i < expenses.length; i++){
            // add expense to total
            total = total + expenses[i];
        }
        // loop does the same thing as this...
        // total = expenses[0] + expenses[1] + expenses[2] + expenses[3] + expenses[4] + expenses[5];
        
        // calculate number of tickets to sell
        int tickets = (int)Math.ceil(total/35);
        // tell the user
        System.out.println("Prom will cost " + total);
        System.out.println("Need to sell " + tickets + " tickets");
        
    }
}
