/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversearray;
  import java.util.Arrays;
public class ReverseArray {

 
    public static void main(String[] args) {
        int[] originalArray=new int[100];
        for(int i=0; i<originalArray.length; i++){
            originalArray[i]=i+1;
            System.out.println(originalArray[i]);
        }
        
        System.out.println(Arrays.toString(getReverseArray(originalArray)));
    }
    
    public static int[] getReverseArray(int[] myArray){
        int[] newArray=new int[100];
        int index=0;
        for(int i=myArray.length-1; i>=0;i--){
            newArray[index]=i+1;
            index++;
        }
        return newArray;
    }
    
}
