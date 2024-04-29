/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaterandomchar;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GenerateRandomChar {

    public static void main(String[] args) {

        int number = (int) (Math.random() * 10);
        char c = (char) (number + 'a');
        System.out.println(c);

        int number2 = (int) (Math.random() * 10);
        char C = (char) (number2 + 'A');
        System.out.println(C);
        System.out.println(number);
        String pass=" ";
        
        
        
    }

}
