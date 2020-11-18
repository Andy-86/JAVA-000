package io.kimmking.Question6;

import java.sql.ResultSet;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author mac
 */
public class JdbcTest {
    private static String JDBC_URL = "jdbc:mysql://localhost:3306/music";
    private static String JDBC_USER = "root";
    private static String JDBC_PASSWORD = "root";

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);) {
            try (Statement statement = connection.createStatement()) {
                ResultSet result = statement.executeQuery("select songname from song where songid = 1");
                while (result.next()) {
                    System.out.println(result.getString("songname"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
