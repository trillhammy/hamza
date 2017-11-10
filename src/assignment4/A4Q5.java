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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scaner for input
        Scanner input = new Scanner(System.in);
        //ask user to enter name
        System.out.println("Please enter your name:");
        //use scanner to input the firstname
        String firstName = input.nextLine();   
        
        //ask user what the first test was out of
        System.out.println("what was the first test out of?");
        //get the number of what the first test was out of
        int firstTest = input.nextInt();     
        //ask user what mark they got for the first test
        System.out.println("what mark did you get?");
        //get the users mark on the first test
        int firstMark = input.nextInt();     
        
        //ask user what the second test was out of
        System.out.println("what was the second test out of?");   
        //get the number of what the second test was out of
        int secondTest = input.nextInt();       
        //ask user what mark they got for the second test
        System.out.println("what mark did you get");    
        //get the users mark on the second test
        int secondMark = input.nextInt(); 
        
        //ask user what the third test was out of
        System.out.println("what was the third test out of?");   
        //get the number of what the third test was out of
        int thirdTest = input.nextInt();       
         //ask user what mark they got for the third test
        System.out.println("what mark did you get");    
        //get the users mark on the third test
        int thirdMark = input.nextInt();
        
         //ask user what the fourth test was out of
        System.out.println("what was the fourth test out of?");
        //get the number of what the fourth test was out of
        int fourthTest = input.nextInt();       
         //ask user what mark they got for the fourth test
        System.out.println("what mark did you get");   
        //get the users mark on the fourth test
        int fourthMark = input.nextInt();
        
         //ask user what the fifth test was out of
        System.out.println("what was the fifth test out of?");    
        //get the number of what the fifth test was out of
        int fifthTest = input.nextInt();       
         //ask user what mark they got for the fifth test
        System.out.println("what mark did you get");    
        //get the users mark on the fifth test
        int fifthMark = input.nextInt();
        
        //output the test scores for user
        System.out.println("Test scores for " + firstName);
        //calculate the first test score
        double firstTestScore = firstMark / 50.0 * 100 ;
        //output the first test score for user
        System.out.println("Test 1: " + firstTestScore + "%");
        //calculate the second test score
        double secondTestScore = secondMark / 80.0 * 100 ;
        //output the second test score for user
        System.out.println("Test 2: " + secondTestScore + "%");
        //calculate the third test score
        double thirdTestScore = thirdMark / 85.0 * 100 ;
        //output the third test score for user
        System.out.println("Test 3: " + thirdTestScore + "%");
        //calculate the fourth test score
        double fourthTestScore = fourthMark / 80.0 * 100 ;
        //output the fourth test score for user
        System.out.println("Test 4: " + fourthTestScore + "%");
        //calculate the fifth test score
        double fifthTestScore = fifthMark / 45.0 * 100 ;
        //output the fifth test score for user
        System.out.println("Test 5: " + fifthTestScore + "%");
        // calculate the total average for all 5 test scores
        double average = (firstTestScore + secondTestScore + thirdTestScore
                + fourthTestScore + fifthTestScore) / 5;
        
        //output the total average test marks 
        System.out.println("Average: " + average + "%");
      
    }
}
