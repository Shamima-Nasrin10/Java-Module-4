/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teststring59;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestString59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your email adrress ");
        String userEmail=s.next();
        String message=String.format("Welcome %s to google", userEmail);
        
        if(userEmail.equalsIgnoreCase("Java")){
            System.out.println("Enter password"); 
            String password=s.next();
            if(password.equals("Java1234")){
                System.out.println(message);
            }
            else{
                System.out.println("Invalid Password");
            }
        }
        else{
            System.out.println("Couldn't find your Google Account");
        }
        
    }
    
}
