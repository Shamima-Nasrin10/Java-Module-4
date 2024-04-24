/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dayname;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DayName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Day Name
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pls enter day number: ");
        int numberOfDay=scanner.nextInt();
        String dayName="";
        switch (numberOfDay) {
            case 1:
                dayName="Saturday";
                break;
            case 2:
                dayName="Sunday";
                break;
            case 3:
                dayName="Monday";
                break;
            case 4:
                dayName="Tuesday";
                break;
            case 5:
                dayName="Wednesday";
                break;
            case 6:
                dayName="Thursday";
                break;
            case 7:
                dayName="Friday";
                break;
            default:
                dayName="Invalid day number";
        }
        System.out.println("Your desired day is: "+dayName);
    }
    
}
