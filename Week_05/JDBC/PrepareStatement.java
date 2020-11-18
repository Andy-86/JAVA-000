package io.kimmking.Question6;

import java.sql.*;

/**
 * @author mac
 */
public class PrepareStatement {
    private static String JDBC_URL = "jdbc:mysql://localhost:3306/music";
    private static String JDBC_USER = "root";
    private static String JDBC_PASSWORD = "root";

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            //关闭自动提交
            connection.setAutoCommit(false);
            try (Statement statement = connection.createStatement()) {
                statement.execute("INSERT INTO `song` ( `albummid`, `albumname`, `albumpic_big`, `albumpic_small`, `down_url`, `m4a`, `media_mid`, `singerid`, `singername`, `songmid`, `songname`, `str_media_mid`)\n" +
                        "VALUES\n" +
                        "\t('2','rock','http://a.b.c','http://c.d.f','http://1.2.3','2','2',36,'jack zhou','1','1',NULL)");
                ResultSet result = statement.executeQuery("select songname from song where songid = 2");
                while (result.next()) {
                    System.out.println(result.getString("songname"));
                }
                connection.commit();
            } catch (SQLException e) {
                //回滚事务
                connection.rollback();
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
