/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distinctnumberspage436;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbersPage436 {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0): ");
        int value;
        
        do{
            value=input.nextInt();
            if(!list.contains(value)&& value!=0){
                list.add(value);
            }
        }
        while(value!=0);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)+" ");
        }
    }
    
}
