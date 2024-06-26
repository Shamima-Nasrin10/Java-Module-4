package jdbccommandline;

import entity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class JDBCCommandLine {

    static PreparedStatement ps;
    static ResultSet rs;
    static DbUtil dbUtil = new DbUtil();

    public static void main(String[] args) {
        Student student = new Student();
        List<Student> studentList = getById(1);

        student.setName(studentList.get(0).getName());
        student.setEmail(studentList.get(0).getEmail());
        student.setAddress(studentList.get(0).getAddress());
        student.setCell("01521499594");
        student.setId(studentList.get(0).getId());

        editData(student);
        showData();
        
        Student student1=new Student();
        student1.setId(2);
        deleteData(student1);
        
    }

    public static void saveData() {
        String insertSql = "insert into student(name, email, address, cell) "
                + "values(?,?,?,?)";

        try {
            ps = dbUtil.getCon().prepareStatement(insertSql);
            ps.setString(1, "Shamima");
            ps.setString(2, "nasrin05shamima@gmail.com");
            ps.setString(3, "Kollyanpur");
            ps.setString(4, "01838020680");

            ps.executeUpdate();
            ps.close();
            dbUtil.getCon().close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(JDBCCommandLine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showData() {

        String selectSql = "select * from student";

        try {
            ps = dbUtil.getCon().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cell = rs.getString("cell");

//                System.out.println("Id     : " + id + "\n" + "Name   : " + name + "\n" + "Email  : " + email + "\n" + "Address: "
//                        + address + "\n" + "Cell No: " + cell+"\n");
                System.out.printf("Id     :%d\nName   :%s\nEmail  :%s\nAddress:%s\nCell No:%s\n\n",
                        id, name, email, address, cell);

            }
            ps.close();
            rs.close();
            dbUtil.getCon().close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCCommandLine.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void editData(Student s) {
        String sql = "update student set name=?, email=?, address=?, cell=? where id=?";

        try {
            ps = dbUtil.getCon().prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getAddress());
            ps.setString(4, s.getCell());
            ps.setInt(5, s.getId());

            ps.executeUpdate();
            ps.close();
            dbUtil.getCon().close();

            System.out.println("Edit successful");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCCommandLine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void deleteData(Student s) {
        String sql = "delete from student where id=?";

        try {
            ps = dbUtil.getCon().prepareStatement(sql);
            ps.setInt(1, s.getId());

            ps.executeUpdate();
            ps.close();
            dbUtil.getCon().close();

            System.out.println("Delete successful");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCCommandLine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    public void delData(int id){
//        String sql = "delete from student where id=?";
//        
//        try {
//            ps = dbUtil.getCon().prepareStatement(sql);
//            ps.setInt(1, id);
//            
//            ps.executeUpdate();
//            ps.close();
//            dbUtil.getCon().close();
//            
//            System.out.println("Data deleted.");
//            
//        } catch (ClassNotFoundException |  SQLException ex) {
//            Logger.getLogger(JDBCCommandLine.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }

    public static List<Student> getById(int id) {
        List<Student> studentList = new ArrayList<>();
        String sql = "select * from student where id=?";

        try {
            ps = dbUtil.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("cell")
                );

                studentList.add(s);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCCommandLine.class.getName()).log(Level.SEVERE, null, ex);
        }
        return studentList;
    }

}
