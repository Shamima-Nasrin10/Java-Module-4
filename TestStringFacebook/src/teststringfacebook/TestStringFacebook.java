/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teststringfacebook;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestStringFacebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your User Name ");
        String userName = s.next();
        System.out.println("Enter Password ");
        String password = s.next();
        String message = String.format("Welcome to Facebook, %s", userName);

        if (userName.length() > 3 && userName.length() <= 10) {
            if (userName.equalsIgnoreCase("Shamima") && password.equals("shamS1234")) {
                System.out.println(message);
            } else {
                System.out.println("Wrong Credentials\nInvalid User Name or Passwprd");
            }
        } else {
            System.out.println("Your username must be between 3 to 10 characters.");
        }

    }
}
