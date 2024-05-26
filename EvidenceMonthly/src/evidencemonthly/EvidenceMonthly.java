package evidencemonthly;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import student.Student;

public class EvidenceMonthly {

    public static final String FILE_NAME = "students.dat";

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Shams", 20));
        students.add(new Student("Shams", 20));
        students.add(new Student("Shams", 20));

        writeStudentsToFile(students);
        List<Student> readStudents = readStudentsFromFile();
        for(Student student:readStudents){
            System.out.println(student);
        }

    }

    public static void writeStudentsToFile(List<Student> students) {
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static List<Student> readStudentsFromFile() {
        List<Student> students = new ArrayList<>();
        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading to file: " + e.getMessage());
        }
        return students;
    }

}
