import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static Connection connection = null;
    static String CONNECTION_URL  = "jdbc:mysql://localhost:3306/creation_test?useSSL=false&serverTimezone=UTC";
    static String CONNECTION_USERNAME = "root";
    static String CONNECTION_PASSWORD = "Galakris95$";

    public static Connection getConnection(){
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
            } catch (SQLException e) {
                System.out.println("Unable to connect to database.");
                e.printStackTrace();
                return null;
            }
            return connection;
        } else {
            return connection;
        }
    }
}
