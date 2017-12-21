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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask user to enter the 10 students marks
        System.out.println("Enter the 10 students marks");
        //create array to store 10 test marks
        int[] testMarks = new int[10];
        // use a loop to get all the info
        for(int i = 0; i < testMarks.length;i++){
            //store the test marks
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
    }
}