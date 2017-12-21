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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask user to enter the amount of students in class
        System.out.println("How many students in the class?");
        //create variable int for number of students in class
        int numberStudents = input.nextInt();
        //create array for number of students
        double[] student = new double[numberStudents];
        //ask user to enter the marks for each student
        System.out.println("Enter your marks:");
        //use a loop for each student to get mark
        for (int i = 0; i < student.length; i++) {
            //storing each student mark
            student[i] = input.nextInt();
        }
        //add up all the student marks
        //average start at 0
        double totalAverage = 0;
        //go through each of the averages
        for (int i = 0; i < student.length; i++) {
            //add all the student marks to the sum
            totalAverage = totalAverage + student[i];
        }
        //calculate the average
        double average = totalAverage / numberStudents;
        //output the average marks for the class
        System.out.println("The class average is " + average + "%");
    }
}
