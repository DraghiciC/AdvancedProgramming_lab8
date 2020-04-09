
import java.sql.*;
public class Database {

    private static Database instance;
    public Connection con;
    public String url = "jdbc:oracle:thin:@localhost:1521:xe";
    public String username = "student";
    public String password = "STUDENT1";
    public int i = 1;
    Database() {
        try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
            this.con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
           System.out.println("Database Connection Creation Failed 1: " + ex.getMessage());
        } catch (ClassNotFoundException e) {
        	System.out.println("Database Connection Creation Failed 2: " + e.getMessage());
		}
    }

    public Connection getConnection() {
        return con;
    }

    public static Database getInstance() {
    	try {
        if (instance == null) {
            instance = new Database();
        } else if (instance.getConnection().isClosed()) {
            instance = new Database();
        }
    	}
        catch (SQLException ex) {
            System.out.println("Database Connection Creation Failed 3: " + ex.getMessage());
         }
        return instance;
    }
}