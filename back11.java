import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class back11 {
    public static void main(String[] args) throws Exception{
        class.forName("com.mysql.cj.jdbc.Driver"); 
        String database,user,password;
        Connection con;
        Statement stmt;
        con=DriverManager.getConnection("jdbc:mysql://localhost/shahid?useSSL=false", "root", "sh@hiD7986245456");
        System.out.println("connection done");
        stmt = con.createStatement();
        stmt.execute("insert into shahid.person values(000,'awsedr',45000,09876)");
        System.out.println("data saved");
    }
}
