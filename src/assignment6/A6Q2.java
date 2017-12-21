








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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //ask how many students to read
        System.out.println("How much students heights you wish to read?");
        //create variable for number of students
        int hites = input.nextInt();
        //create array for hite
        double[] hiteTotal = new double[hites];
        //ask user to enter the heights of each student
        System.out.println("Enter the heights of the students");
        //go through each height using counter
        for (int i = 0; i < hiteTotal.length; i++) {

            //store the heights
            hiteTotal[i] = input.nextDouble();

        }
        //height start at 
        double height = 0;
        //go through all the heights and add them together
        for (int i = 0; i < hiteTotal.length; i++) {
            //get the sum of all the heights
            height = height + hiteTotal[i];


        }
        //get the average by dividing total height to amount of students
        double heightAverage = height / hites;
        //output the average to ensure that the code is right
        System.out.println("average heights is: " + heightAverage);


        //go through all the heights again
        for (int i = 0; i < hiteTotal.length; i++) {
            //if the heights are above average then output them
            if (hiteTotal[i] > heightAverage) {
                //output the heights above average
                System.out.println(hiteTotal[i] + " is a height that is above average");
            }
        }
    }
}
