
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class testFileStream171 {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("C:\\Users\\HP\\OneDrive\\Desktop\\Prova\\javaio.txt");
        PrintWriter write= new PrintWriter(file);
        write.print("blah");
        write.close();
    }
}
