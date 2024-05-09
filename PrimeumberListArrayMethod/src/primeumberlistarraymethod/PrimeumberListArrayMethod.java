/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeumberlistarraymethod;
import java.util.Arrays;

public class PrimeumberListArrayMethod {

    public static void main(String[] args) {
        int i;
        int[] myPrimeList = new int[100];
        for (i = 0; i < myPrimeList.length; i++) {
            myPrimeList[i] = i + 1;
//            System.out.println(myPrimeList[i]);
        }
        System.out.println(Arrays.toString(primeArray(myPrimeList)));

    }
    
    public static int[] primeArray(int [] myArray){
        int[] array= new int[myArray.length];
        int index=0;
        for(int number:myArray){
            int count=0;
            for(int i=1; i<=number; i++){
                if(number%i==0){
                    count++;
                }
                
            }
            if()
            }
        }
        return array;
    }

}
