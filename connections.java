package finalproject;
import java.sql.*;
/**
 *
 * @author annab
 */
public class connections {
    public static Connection con;
    public static String user = "root";
    public static String password = "";
    
    
    public static String dbUrl = "jdbc:mysql://localhost:3306/java";
    public static Connection getConnection()
    {
        try{
            con = DriverManager.getConnection(dbUrl, user, password);
            System.out.println("Connected Successfully");
        }catch(Exception e) {
            System.out.println("Not connected");
        }
        return con;
    }
}
