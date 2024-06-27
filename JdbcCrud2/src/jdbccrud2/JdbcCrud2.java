
package jdbccrud2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class JdbcCrud2 {

    static DbUtil db=new DbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql="";
    
    public static void main(String[] args) {
//        saveStudent("Sabiha", "sabiha@gmail.com", "USA", "4356789");
//        saveStudent("Munira", "munira@gmail.com", "Bangladesh", "4356789");
//        saveStudent("Mitu", "mitu@gmail.com", "Uk", "4356789");
        showStudent();
        deleteStudent(3);
        System.out.println("\nAfter Delete\n");
        showStudent();
        updateStudent("Razia", "sultana@gmail.com", "KSA", "9965432", 1);
        System.out.println("\nAfter Update\n");
        showStudent();
        
        
        
    }
    
    public static void saveStudent(String name, String email, String address, String cellno){
        
        sql="insert into student(name, email, address, cellno) values(?,?,?,?)";
        
        try {
            ps=db.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cellno);
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void showStudent(){
        sql="select * from student";
        
        try {
            ps=db.getCon().prepareStatement(sql);
            
            rs=ps.executeQuery();
            
            while(rs.next()){
                String name=rs.getString("name");
                String email=rs.getString("email");
                String address=rs.getString("address");
                String cellno=rs.getString("cellno");
                String stuid=rs.getString("stuid");
                
                System.out.printf("Student Id: %s \n Name: %s\nEmail: %s\nAddress: %s\nCell No: %s\n\n",stuid,name,email,address,cellno);
            }
            ps.close();
            rs.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  static void deleteStudent(int stuid){
        
        sql="delete from student where stuid=?";
        
        try {
            ps=db.getCon().prepareStatement(sql);
            
            ps.setInt(1, stuid);
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public  static void updateStudent(String name, String email, String address, String cellno, int stuid){
        
        sql="update student set name=?, email=?, address=?, cellno=? where stuid=?";
        
        try {
            ps=db.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cellno);
            ps.setInt(5, stuid);
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
