package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/6/2022
 * Time: 7:36 PM
 */
public class DbConfig {
    public static Connection connection;

    static {
        try {
            connection = DbConfig.connect("test_food_bot");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection connect(String dbName) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/" + dbName;
        String username = "postgres";
        String password = "start123";

        return DriverManager.getConnection(url, username, password);
    }
}
