/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primemethodtest2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PrimeMethodTest2 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int number=s.nextInt();
        
        if(isPrime(number)){
            System.out.println(number+" is prime");
        }
        else{
            System.out.println(number+" is not prime");
        }
    }
    
    public static boolean isPrime(int number) {
        int count=0;
        for(int i=1; i<=number;i++){
            if(number%i==0){
               count++; 
            }
        }
        return count==2;
        //if (count == 2) {
         //   return true;
       // } else {
        //    return false;
       // }
    }
    
}
