package number;

import java.util.Scanner;

public class MaxMinComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2");
        int number2 = scanner.nextInt();
        System.out.println("Enter number 3");
        int number3 = scanner.nextInt();

        int maxNumber = 0;
        int minNumber = 0;

        if (number1 > number2 && number1 > number3) {
            maxNumber = number1;
        } else if (number2 > number1 && number2 > number3) {
            maxNumber = number2;

        } else {
            maxNumber = number3;
        }
        System.out.println("Max number is: " + maxNumber);

        if (number1 < number2 && number1 < number3) {
            minNumber = number1;
        } else if (number2 < number1 && number2 < number3) {
            minNumber = number2;

        } else {
            minNumber = number3;
        }
        System.out.println("Max number is: " + minNumber);
    }
}
