/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumberlist;

import java.util.Arrays;
public class PrimeNumberList {

    public static void main(String[] args) {
       int[] myArray=new int[150];
       for(int i=0; i<myArray.length; i++){
           myArray[i]=i+1;
       }
        System.out.println(Arrays.toString(getPrimeList(myArray)));
    }
    
    public static int[] getPrimeList(int[] newArray){
        int[] primeArray=new int[50];
        int index=0;
        for(int item:newArray){
            int count=0;
            for(int i=1; i<=item;i++){
                if(item%i==0){
                    count++;
                }
            }
            if(count==2){
               primeArray[index]=item;
               index++;
            }
        }
        return primeArray;
    }
}
