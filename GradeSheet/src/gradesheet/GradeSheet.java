/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradesheet;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GradeSheet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Grade Sheet
        
        Scanner scanner=new Scanner(System.in);
         System.out.println("Pls enter marks to get grade: ");
        int marks=scanner.nextInt();
       
        String grade;
         
        if(marks>=80){
           grade="A+" ;
        }
        else if(marks>=70){
            grade="A";
        }
        else if(marks>=60){
            grade="A-";
        }
        else if(marks>=50){
            grade="B";
        }
        else if(marks>=40){
            grade="C";
        }
        else if(marks>=33){
            grade="D";
        }
        else{
            grade="F";
        }
        System.out.println("Your grade is: "+grade);
    }
    
}
