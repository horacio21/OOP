package clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Ureña
 */
public class DBConection {
    private final String db = "sales";
    private final String login = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost/" + db;
    private Connection connection = null;

    public DBConection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = (Connection) DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnection(){
        return this.connection;
    }
    
    public void closeConnection(){
        this.connection = null;
    }
}
