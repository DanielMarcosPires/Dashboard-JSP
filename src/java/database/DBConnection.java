package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private String url;
    private String user;
    private String password;

    public DBConnection(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection getData() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println(conn);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null; // garante que o método sempre retorna algo
        }
    }
    
    public Connection setData(){
        try {
            String sql = "INSERT INTO USERS(?,?,?)";
        } catch (Exception e) {
        }
    }

}
