/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatormakingobject;

import java.math.BigInteger;
import java.util.Scanner;
import mathoperation.BigIntegerFactorial;
import mathoperation.Calculator;

public class CalculatorMakingObject {

    public static void main(String[] args) {
//      
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        double value1=s.nextDouble();
//        System.out.println("Enter second number: ");
//        double value2=s.nextDouble();
//        System.out.println("Press 1 for addition/ Press 2 for subtraction/ Press 3 for multiplication/ Press 4 for division");
//        int operator=s.nextInt();
//         Calculator calculator=new Calculator(value1,value2,operator);
//         System.out.println(calculator.getResult());

        BigIntegerFactorial bigintegerfact = new BigIntegerFactorial(2);
        
        BigInteger factorial=bigintegerfact.getFactorial();
        
        String result=bigintegerfact.checkPrime(factorial);
        
        System.out.println(result);
        
       

    }

}
