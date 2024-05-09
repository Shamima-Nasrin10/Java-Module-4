/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumbermethodtest;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PrimeNumberMethodTest {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int number=s.nextInt();
        
        doPrime(number);
    }
    public static void doPrime(int number) {
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is prime.");
        }
        else{
            System.out.println("Number is not prime.");
        }
    }
    
}
