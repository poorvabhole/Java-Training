package connection;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


@NoArgsConstructor
public class ConnectionClass {

    static final String URL = "jdbc:mysql://localhost:3306/canteen";
    static final String USER = "root";
    static final String PASS = "root@poorva";

    public static Connection connect() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = null;

        try {
             conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            System.out.println("Error : unable to connect to database");
        }
        System.out.println("connection successful ");
        return conn;
    }

}

