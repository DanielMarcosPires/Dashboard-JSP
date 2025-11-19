package database;

import Classes.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.List;

public class DBConnection {
    private String url = "jdbc:postgresql://localhost:5432/loginAccess";
    private String user = "postgres";
    private String password = "1234";

    public List<User> getData() throws SQLException {
        System.out.println("Database info:\n");

        Connection connect = null;
        List<User> users = new ArrayList<>();

        try {
            Class.forName("org.postgresql.Driver");

            connect = DriverManager.getConnection(this.url, this.user, this.password);
            ResultSet rsClient = connect.createStatement().executeQuery("SELECT * FROM users");

            while (rsClient.next()) {
                User u = new User(
                        rsClient.getString("user_id"),
                        rsClient.getString("user_name"),
                        rsClient.getString("user_email"),
                        rsClient.getString("user_password")
                );
                users.add(u);
            }
        } catch (ClassNotFoundException ex) {
            System.getLogger(DBConnection.class.getName())
                    .log(System.Logger.Level.ERROR, (String) null, ex);

        } finally {
            if (connect != null) {
                connect.close();
            }
        }

        return users;
    }

    public void setData(String name, String email, String password) throws SQLException {
        Connection connect = null;
        PreparedStatement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection(this.url, this.user, this.password);

            String query = "INSERT INTO users(user_name,user_email,user_password) VALUES(?,?,?)";
            stmt = connect.prepareStatement(query);

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, password);

            stmt.executeUpdate();
            System.out.println("Usuário inserido com sucesso!");
        } catch (ClassNotFoundException ex) {
            System.getLogger(DBConnection.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (connect != null) {
                connect.close();
            }
        }
    }
}
