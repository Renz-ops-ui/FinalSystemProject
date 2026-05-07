
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*Connects the system to sql database
DB_URL -> name of database in sql
DB_USER -> MySQL username
DB_PASSWORD -> MySQL password

 */
public class DatabaseConnection {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/login_system";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "admin1234";

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DatabaseConnection.class.getName());

    private static Connection connect = null;

    private DatabaseConnection() {
    }

    public static Connection getConnection() {
        try {
            if (connect == null || connect.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                logger.info("Database connected successfully.");

            }
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found!");
        } catch (SQLException e) {
            logger.severe("Database connection failed: " + e.getMessage());
        }
        return connect;
    }

    public static void closeConnection() {
        if (connect != null) {
            try {
                connect.close();
                logger.info("Database connection closed.");
            } catch (SQLException e) {
                logger.warning("Error closing connection: " + e.getMessage());
            }
        }
    }

}
