/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Scanner;

/**
 *
 * @author muhah5588
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask user for the class size
        System.out.println("enter the class size: ");
        //create variable for the size
        int integers = input.nextInt();
        //ask user for each mark
        System.out.println("enter the marks");
        //create array for the marks
        int[] testMarks = new int[integers];
        //go through the test marks
        for (int i = 0; i < testMarks.length; i++) {
            //store the marks
            testMarks[i] = input.nextInt();
        }
          //go through the integers and end as x
        for(int x = 0; x < testMarks.length;x++){
            //go through the integers start at x+1 and end in y
            for(int y = x+1; y < testMarks.length;y++){
                //check if x is greater than y
                if(testMarks[x] > testMarks[y]){
                    //math for swapping (algebraic)
                    testMarks[x] = testMarks[y] ^ testMarks[x];
                    testMarks[y] = testMarks[y] ^ testMarks[x];
                    testMarks[x] = testMarks[y] ^ testMarks[x];
                    
                }
            }
        }
        //create variable for total
        double total = 0;
        //go through all the marks
        for (int i = 0; i < testMarks.length; i++) {
            //add the testmarks to get the total
            total = total + testMarks[i];
        }
        //calculate the average
        double average = total / integers;
        
        int highestTest = testMarks[0];
        for (int i = 0; i < testMarks.length; i++) {
            if(testMarks[i] > highestTest){
                highestTest = testMarks[i];
            }
        }
        

        //output all the results
        System.out.println("The average of the class is " + average +
                "%, The lowest mark is " + testMarks[0]
                + ", and the highest mark is " + highestTest);
        
        
    }
}