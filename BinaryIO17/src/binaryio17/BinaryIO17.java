
package binaryio17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryIO17 {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (FileOutputStream output = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Prova\\javaio.dat")) {
            for(int i=1; i<=10; i++){
                output.write(i);
            }
        }
    }
    
}
