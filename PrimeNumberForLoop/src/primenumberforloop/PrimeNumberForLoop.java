/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumberforloop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PrimeNumberForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number to check if it is prime or not: ");
        int number=s.nextInt();
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
               count+=1; 
            }
        }
        if(count==2){
            System.out.println("The Number is Prime."); 
        }
        else{
            System.out.println("The number is not Prime.");
        }
           
    }
    
}
