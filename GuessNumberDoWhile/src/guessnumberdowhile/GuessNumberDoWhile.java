/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessnumberdowhile;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GuessNumberDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cNumber = (int)(Math.round(Math.random() * 100));
        int attemptCount = 0;
        int maxAttempt=5;
        do {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter your guess Number:");
            int gNumber = s.nextInt();

            if (gNumber == cNumber) {
                System.out.println("Correct Number");
                break;
            } else if (gNumber < cNumber) {
                System.out.println("Lower");
            } else if (gNumber > cNumber) {
                System.out.println("Higher");
            }
            attemptCount++;
        }
        while (attemptCount<maxAttempt);
        if (attemptCount == maxAttempt) {
            System.out.println("Sory Mate! You lost the game and the number is- " + cNumber);
        }

    }
    
}
