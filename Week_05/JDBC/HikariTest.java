package io.kimmking.Question6;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.CountDownLatch;

/**
 * @author mac
 */
public class HikariTest {
    private static String JDBC_URL = "jdbc:mysql://localhost:3306/music";
    private static String JDBC_USER = "root";
    private static String JDBC_PASSWORD = "root";
    private static CountDownLatch latch = new CountDownLatch(30);

    public static void main(String[] args) throws InterruptedException {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(JDBC_URL);
        config.setUsername(JDBC_USER);
        config.setPassword(JDBC_PASSWORD);
        config.setIdleTimeout(30 * 1000);
        config.setMaximumPoolSize(20);
        DataSource dataSource = new HikariDataSource(config);
        for (int i = 0; i < 30; i++) {
            Thread t = new Thread(new CheckSingerName(dataSource));
            t.start();
        }
        //等待所有线程结束
        latch.await();
    }

    static class CheckSingerName implements Runnable {
        DataSource dataSource = null;

        CheckSingerName(DataSource dataSource) {
            this.dataSource = dataSource;
        }

        @Override
        public void run() {
            try (Connection connection = dataSource.getConnection()) {
                try (Statement statement = connection.createStatement()) {
                    ResultSet result = statement.executeQuery("select * from song");
                    while (result.next()) {
                        System.out.println(result.getString("singername"));
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                latch.countDown();
            }
        }
    }
}
