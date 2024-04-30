/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromeword;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PalindromeWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word=s.nextLine();
        
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse);
        if(word.equalsIgnoreCase(reverse)){
            System.out.println(word+" is a palindrome word");
        }
        else{
            System.out.println(word+" is not a palindrome word");
        }
    }
    
}
