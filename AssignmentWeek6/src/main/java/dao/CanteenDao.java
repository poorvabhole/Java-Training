package dao;

import connection.ConnectionClass;

import java.sql.*;

public class CanteenDao {

    Statement st = null;
    PreparedStatement pst = null;
    ConnectionClass cc = new ConnectionClass();
    Connection conn = null;

    public void createTable() throws SQLException, ClassNotFoundException {

       // ConnectionClass cc = new ConnectionClass();
        conn = cc.connect();
        st = conn.createStatement();
        String sql = "CREATE TABLE canteen " +
                "(id INTEGER not NULL, " +
                " item_name VARCHAR(25))";

        st.executeUpdate(sql);
        System.out.println("Created table in given database...");

    }
    public void insertTable() throws SQLException, ClassNotFoundException {
       // ConnectionClass cc = new ConnectionClass();
        conn = cc.connect();

        String sql = "INSERT INTO canteen VALUES (3,'Green Tea') ";
        pst = conn.prepareStatement(sql);

        pst.executeUpdate();
        System.out.println("Values added in the table..");

    }
    public void getData() throws SQLException, ClassNotFoundException {
        //ConnectionClass cc = new ConnectionClass();
        conn = cc.connect();
        st = conn.createStatement();
        String sql = "SELECT id, item_name FROM canteen ";

        ResultSet rs = st.executeQuery(sql);
        System.out.println("Values in the table..");
        while (rs.next()){
            System.out.println("ID : " + rs.getInt("id"));
            System.out.print("Item name: " + rs.getString("item_name"));
        }
        rs.close();
    }
    public void deleteData() throws ClassNotFoundException, SQLException {
        conn = cc.connect();

        String sql = "DELETE FROM canteen " + "WHERE id = 2";
        st = conn.createStatement();

        System.out.println("Values are deleted from the table..");
    }

}
