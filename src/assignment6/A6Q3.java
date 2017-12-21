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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask the user to enter 2 integers
        System.out.println("Please enter 2 integers");
        //create array for 2 assemblys
        int[] integers = new int[2];
        //create string array
        String[] twoIntegers = new String[2];
        //output names in array
        twoIntegers[0] = "first integer";
        twoIntegers[1] = "second integer";
        //use a loop to get integers
        for(int i = 0; i < integers.length;i++){
            //ask user to enter the integers 
            System.out.println("enter the " + twoIntegers[i]);
            //store integers
            integers[i] = input.nextInt();
            
        }
        //go through the integers entered
        for(int i = 0; i < integers.length;i++){
            //check if the integers are already in ascending order
            if(integers[0] > integers[1]){
                //output the same order as they were entered
                System.out.println("ascending order is: "  + integers[0] + " " + integers[1]);
                
            }else{
                // else check if the second integer is bigger than the first one
                if(integers[1] > integers[0]){
                    //output the integers in the proper order 
                    System.out.println("asceding order is: " + integers[1] + " " + integers[0]);
                }
            }
        }
    }
}