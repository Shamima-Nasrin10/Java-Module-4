/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twodarrays;

import java.util.Arrays;
import java.util.Random;

public class TwoDArrays {

    public static void main(String[] args) {
        int[][] numbers = new int[4][5];
        Random random = new Random();
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[0].length; col++) {
                int randomNumbers = random.nextInt(10);
                numbers[row][col] = randomNumbers;
            }
        }
        System.out.println(Arrays.deepToString(numbers));
        int sum=getSumOfArray(numbers);
        System.out.println("Sum of values of Array is: "+sum);
    }
    
    public static int getSumOfArray(int[][] newArray){
        int sum=0;
        for(int row=0; row<newArray.length; row++){
            for(int col=0; col<newArray[0].length; col++){
               sum+=newArray[row][col]; 
            }
        }
        return sum;
    }

}
