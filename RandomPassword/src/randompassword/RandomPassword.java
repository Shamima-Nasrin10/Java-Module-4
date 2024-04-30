/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randompassword;

/**
 *
 * @author HP
 */
public class RandomPassword {

    public static void main(String[] args) {
       
         String randomPassword = "";

        for (int i = 0; i < 9; i++) {
            if (i == 4) {
                randomPassword += "-";
                continue;
            }
            randomPassword += getRandomCharOrNumber();
        }

        System.out.println(randomPassword);
    }
     public static char getRandomCharOrNumber() {
        double numberOrChar = Math.random();

        if (numberOrChar < 0.3) {
            int asciiValueNumber = (int) (Math.random() * (10)) + 48;
            return (char) asciiValueNumber;
        }
        if (numberOrChar > 0.4 && numberOrChar < 0.7) {
            int asciiValueUppercaseChar = (int) (Math.random() * (26)) + 65;
            return (char) asciiValueUppercaseChar;
        }
        int asciiValueLowercaseChar = (int) (Math.random() * (26)) + 97;
        return (char) asciiValueLowercaseChar;
    }
    
}
