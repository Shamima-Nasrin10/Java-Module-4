/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primelistforloop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PrimeListForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=s.nextInt();
        System.out.println("Enter limit");
        int limit=s.nextInt();
        
        for(int j=number; j<=limit; j++){
            int count=0;
            for(int i=2;i<j;i++){
            if(j%i==0){
               count+=1; 
            }
        }
            if(count==0){
            System.out.println(j);
        }
           
        }
        
    }
    
}
