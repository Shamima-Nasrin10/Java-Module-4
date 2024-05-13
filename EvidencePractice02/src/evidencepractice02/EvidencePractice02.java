package evidencepractice02;

import java.util.Arrays;
import java.util.Scanner;
import number.Factorial;
import number.MaxMin;
import number.PrimeNumber;

public class EvidencePractice02 {

    public static void main(String[] args) {

       PrimeNumber primenumber = new PrimeNumber(6);
        System.out.println(primenumber.checkPrime());

       System.out.println("-----------*---------");

        MaxMin maxNumber = new MaxMin(50, 20, 60);
        System.out.println("Max Number is: " + maxNumber.getMaxNumber());

        System.out.println("-----------*---------");

        MaxMin minnumber = new MaxMin(50, 20, 60);
        System.out.println("Min Number is: " + minnumber.getMinNumber());

        System.out.println("-----------*---------");

        Factorial factorial = new Factorial(5);
        System.out.println("Factorial of given number is: " + factorial.getFactorial());
        
        System.out.println("-----------*---------");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of your array.");
        int arrayLength = 0;
        if (s.hasNextInt()) {
            arrayLength = s.nextInt();
        }
        int[] myArray = new int[arrayLength];
        System.out.println("Enter the elements of array.");
        for (int i = 0; i < arrayLength; i++) {
            myArray[i] = s.nextInt();
            
        }
        System.out.println("My Array: "+Arrays.toString(myArray));
      
    }

}
