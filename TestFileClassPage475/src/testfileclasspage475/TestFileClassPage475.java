package testfileclasspage475;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

public class TestFileClassPage475 {

    public static void main(String[] args) throws FileNotFoundException {
        
//        System.out.println(file.exists());
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.isDirectory());
//        System.out.println(new Date(file.lastModified()));
java.io.File file = new File("C:\\Users\\Admin\\Desktop\\javatest.txt");
        if (file.exists()) {
            System.out.println("File already exists. ");
            
        }
        java.io.PrintWriter output = new PrintWriter(file);
        output.print("Dhaka");
        output.print("Chittagong");
        output.print("Looser");

        output.close();
    }

}
