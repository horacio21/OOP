package clases;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luis Ureña
 */
public class UserDAO {
    public static User login( String email, String password ){
        DBConection db = new DBConection();
        try {
            PreparedStatement query = (PreparedStatement) db.getConnection().
                    prepareStatement("SELECT * FROM user WHERE email = ?"
                            + "AND password = ?");
            query.setString(1, email);
            query.setString(2, password);
            ResultSet result = query.executeQuery();
            
            if(!result.next()){
                return null;
            }
            
            User user = new User(result.getString("email"), 
                    result.getString("LastName"), 
                    result.getString("FirstName"), 
                    result.getString("password"), 
                    result.getInt("RoleId"));
            
            return user;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static Response crearUsuario( User user ){
        DBConection db = new DBConection();
        try {
            String sql = "INSERT INTO user (email, LastName, FirstName, "
                    + "Password, RoleId) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement query = (PreparedStatement) db.getConnection().prepareStatement(sql);
            query.setString(1, user.getEmail());
            query.setString(2, user.getLastName());
            query.setString(3, user.getFirstName());
            query.setString(4, user.getPassword());
            query.setInt(5, user.getRoleId());
            
            query.executeUpdate();
            db.closeConnection();
            
            return new Response(true);
            
        } catch (Exception e) {
            db.closeConnection();
            if(e.getMessage().contains("PRIMARY")){
                return new Response("Este Email Ya Existe");
            }
            return new Response(e.getMessage());
        }
    }
    
        public static Response actualizarUsuario( User user ){
        DBConection db = new DBConection();
        try {
            String sql = "UPDATE user SET LastName = ?, FirstName = ?,"
                    + "Password = ?, RoleId = ? WHERE email = ?";
            PreparedStatement query = (PreparedStatement) db.getConnection().prepareStatement(sql);
            query.setString(5, user.getEmail());
            query.setString(1, user.getLastName());
            query.setString(2, user.getFirstName());
            query.setString(3, user.getPassword());
            query.setInt(4, user.getRoleId());
            
            query.executeUpdate();
            db.closeConnection();
            
            return new Response(true);
            
        } catch (Exception e) {
            db.closeConnection();
            if(e.getMessage().contains("PRIMARY")){
                return new Response("Ya Existe Un Usuario Con Este Email");
            }
            return new Response(e.getMessage());
        }
    }
        
        public static Response eliminarUsuario( String email ){
        DBConection db = new DBConection();
        try {
            String sql = "DELETE FROM user WHERE email = ?";
            PreparedStatement query = (PreparedStatement) db.getConnection().prepareStatement(sql);
            query.setString(1, email);
            
            query.executeUpdate();
            db.closeConnection();
            
            return new Response(true);
            
        } catch (Exception e) {
            db.closeConnection();
            return new Response(e.getMessage());
        }
    }
        
    public static ArrayList<User> get(){
        DBConection db = new DBConection();
        ArrayList<User> users = new ArrayList<>();
        
        try {
            PreparedStatement query = (PreparedStatement) db.getConnection().
                    prepareStatement("SELECT * FROM user");
            ResultSet result = query.executeQuery();
            
            while(result.next()){
                User user = new User(result.getString("email"), 
                       result.getString("LastName"), 
                       result.getString("FirstName"), 
                       result.getString("password"), 
                       result.getInt("RoleId"));
                users.add(user);
            }
            
            db.closeConnection();
            return users;
            
        } catch (SQLException ex) {
            db.closeConnection();
            return null;
        }
    }
}
