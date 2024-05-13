package number;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter value " + (i + 1) + " :");
            int number = scanner.nextInt();
            myArray[i] = number;
        }
        System.out.println("My array: "+Arrays.toString(myArray));
    }

}
