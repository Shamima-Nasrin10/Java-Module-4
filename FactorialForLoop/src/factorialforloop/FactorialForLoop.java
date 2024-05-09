/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialforloop;

/**
 *
 * @author Admin
 */
public class FactorialForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int facValue=5;
       int factorial=1;
       for(int i=1; i<=facValue;i++){
           factorial*=i;
       }
        System.out.println(factorial);
    }
    
}
