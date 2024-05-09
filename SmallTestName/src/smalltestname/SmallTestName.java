/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smalltestname;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SmallTestName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word=s.next().toUpperCase();
        
        
        if(word.startsWith("A")|| word.startsWith("E")|| word.startsWith("I")||word.startsWith("O")||word.startsWith("U")){
            System.out.println("This word starts with vowel."); 
        }
        else{
            System.out.println("This word starts with consonant.");
        }
    }
    
}
