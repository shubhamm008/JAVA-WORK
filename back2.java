import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class back2 {
    public static void main(String[] args) throws Exception{
        String database,user,password;
        Scanner s;
        Connection con;
        Statement stmt;
        System.out.println("Enter your username:");
        s=new Scanner(System.in);
        String p=s.nextLine();
        System.out.println("Enter your ");
        System.out.println("enter ");
        con=DriverManager.getConnection("jdbc:mysql://localhost/shahid?useSSL=false", "root", "sh@hiD7986245456");
        System.out.println("connection done");
        stmt = con.createStatement();
        stmt.execute("insert into shahid.person values(000,'awsedr',45000,09876)");
        System.out.println("data saved");
    }
}
