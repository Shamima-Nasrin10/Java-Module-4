/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakcontinueapril28;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BreakContinueApril28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Enter Value ");
            int userInput=s.nextInt();
            sum+=userInput;
            
            if(sum>=200){
                
            }
            else if(sum>=100){ 
                continue;
            }
             System.out.println("Sum is "+sum); 
        }
    }
    
}
