/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lcm35continueloop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LCM35ContinueLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Start Point");
        int startPoint = s.nextInt();
        System.out.println("Enter End Point");
        int endPoint = s.nextInt();

        while (startPoint <= endPoint) {
            if (startPoint % 3 == 0 && startPoint % 5 == 0) {
                startPoint++;
                continue;
            }
            System.out.println(startPoint);
        }
    }

}
