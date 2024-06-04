
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileReadWrite {
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("C:\\Users\\Admin\\Desktop\\shamima.txt");
        
        PrintWriter writer= new PrintWriter(file);
        
        writer.print("Student: ");
        writer.append("Shamima Nasrin");
        writer.close();
        
        Scanner scanner= new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        
    }
    
    }

