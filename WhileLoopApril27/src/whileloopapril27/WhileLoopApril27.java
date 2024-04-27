/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whileloopapril27;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class WhileLoopApril27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int n=1;
//        while(n<=100){
//            System.out.println(n+" Hello Java");
//            n++;
//   }

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Start Point Value:");
        int startPoint = s.nextInt();
        System.out.print("Enter end point value:");
        int endPoint = s.nextInt();

        while (startPoint <= endPoint) {
            if(startPoint%3!=0 || startPoint%5!=0){
            System.out.println(startPoint);
              
        }
            startPoint++;

    }

}
}
