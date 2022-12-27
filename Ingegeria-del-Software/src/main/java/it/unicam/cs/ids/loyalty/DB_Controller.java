package it.unicam.cs.ids.loyalty;
import java.sql.*;

public class DB_Controller {
//Connessione database
    private static final String url = "jdbc:mysql://127.0.0.1:3306/loyality db";
    private static final String username = "root";
    private static final String password = "";
    private static Connection conn;


    public static void init() {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected!");

        } catch (SQLException e) {
            throw new IllegalStateException("Not connected", e);
        }
    }

    public static void insertQuery(String query) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate(query);
    }

    public static void removeQuery(String query) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(query);
        statement.executeUpdate();
    }

    public static ResultSet selectAllFromTable(String table) throws SQLException {
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM " + table);
        return statement.executeQuery();
    }

    public static int getNumberRows(String query) {
        try {
            Statement statement = conn.createStatement();
            ResultSet resultset = statement.executeQuery(query);
            if (resultset.last()) {
                return resultset.getRow();
            } else {
                return 0; //just cus I like to always do some kinda else statement.
            }
        } catch (Exception e) {
            System.out.println("Error getting row count");
            e.printStackTrace();
        }
        return 0;
    }
}
