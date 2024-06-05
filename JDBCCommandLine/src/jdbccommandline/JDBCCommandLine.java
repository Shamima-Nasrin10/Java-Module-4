package jdbccommandline;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class JDBCCommandLine {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

        DbUtil dbUtil = new DbUtil();
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
                        id,name,email,address,cell);

            }
            ps.close();
            rs.close();
            dbUtil.getCon().close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCCommandLine.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
