/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaterandomchar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GenerateRandomChar {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Password Length: ");
        int passLength=s.nextInt();

        Random random = new Random();

        String ranPass = "";

        for (int i = 0; i < passLength; i++) {
            int range = random.nextInt(3) + 1;
            if (i==passLength/2) {
                ranPass += "-";
            }

            switch (range) {
                case 1:
                    ranPass += (char) (random.nextInt(26) + 65);
                    break;
                case 2:
                    ranPass += (char) (random.nextInt(26) + 97);
                    break;
                case 3:
                    ranPass += (char) (random.nextInt(10) + 48);
                    break;
                default:
                    throw new AssertionError();
            }
        }
        System.out.println(ranPass);
    }

}
