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
public class A7Q2 {

    public void examGrade(String examMark){
        
        System.out.println("Your letter grade for the exam is " + examMark);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create an objext to run  my method
        A7Q2 test = new A7Q2();
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask the user for their mark
        System.out.println("Please enter your exam mark");
        //store the mark
        int examStudMark = input.nextInt();
        //create variables for each letter grade
        String letterF = ("F");
        String letterA = ("A");
        String letterB = ("B");
        String letterC = ("C");
        String letterD = ("D");
        //check if grade is less than 50
        if (examStudMark < 50){
            //use method to output letter F
            test.examGrade(letterF);
            
        }
        //check if grade is between 50 and 59
        if(examStudMark >= 50 && examStudMark <= 59){
            //use method to output letterD
            test.examGrade(letterD);
        }
        //check if grade is between 60 and 69
        if(examStudMark >= 60 && examStudMark <= 69){
            //use method to output letterC
            test.examGrade(letterC);
        }
        //check if grade is between 60 and 69
        if(examStudMark >= 70 && examStudMark <= 79){
            //use method to output letterB
            test.examGrade(letterB);
        }
        //check if mark is 80 or above
        if(examStudMark >= 80){
            //use method to output letterA
            test.examGrade(letterA);
            
        }
    }
}
