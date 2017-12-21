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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create scanner for input
        Scanner input = new Scanner (System.in);
        //ask user to enter amount of students
        System.out.println("enter the amount of students marks: ");
        //create variable for amount
        int integers = input.nextInt();
        //ask user to enter each mark
        System.out.println("enter the marks");
        //create array for the marks
        int[] testMarks = new int[integers];
        //go through all the marks
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
        //output in order
        System.out.println("in order: ");
        //go through integers
        for(int i = 0; i < testMarks.length;i++){
            //output the integers in order
            System.out.println(testMarks[i]);     
        }
        //create variable for test median
        int testMed = integers;
        //calculate median
        testMed = testMed / 2;
        //output the median
        System.out.println("test median is: " + testMarks[testMed]);
        
    }
}