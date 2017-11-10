/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;

/**
 *
 * @author muhah5588
 */
public class A5UbbiDubbi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a word to be translated");
        
        String word = input.nextLine();
        
        String translate = word;   
        
        if(word.equals("EXIT")){
            System.out.println ("QUIT");
        }
        boolean foundVowel = false;
        
        for(int i = 0; i < word.length(); i++){
            if(foundVowel = false){
                    String ub = "ub" + translate;
                    String ending = word.substring(i);
                    String translated = ub + ending;
                    foundVowel = true;
                }else{
                    if(foundVowel = true){
                        String ending = word.substring(i);
                        String translated1 = ending + translate;
                    }else{
                        
                        foundVowel = false;
                
                    }
                }
            }
        }
    }
