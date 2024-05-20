package generic;

import java.util.ArrayList;

public class GenericArray {

    public static void main(String[] args) {
//        ArrayList<String> student = new ArrayList<>();
//        student.add("Shams");
//        student.add("Adiba");
//        student.add("Afifa");
//        student.add("Toma");
//        System.out.println(student);
//
//        ArrayList<Integer> sturoll = new ArrayList<>();
//        sturoll.add(12);
//        sturoll.add(13);
//        sturoll.add(14);
//        sturoll.add(15);
//        System.out.println(sturoll);

        ArrayList<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Reza", "ss@gmail.com", "Mirpur", 1234, 40000));
        teacherList.add(new Teacher("Reza", "ss@gmail.com", "Mirpur", 1234, 40000));
        teacherList.add(new Teacher("Reza", "ss@gmail.com", "Mirpur", 1234, 40000));

        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
//        System.out.println(teacherList);
        for (int i = 0; i < 10; i++) {

        }
        for (int teacher = 0; teacher < teacherList.size(); teacher++) {
            System.out.println(teacherList.get(teacher));
        }

    }
}
