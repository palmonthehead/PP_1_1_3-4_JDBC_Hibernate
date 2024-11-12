package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Util {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/user";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    private static final Logger logger = Logger.getLogger(Util.class.getName());

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            logger.info("Connection established");
        } catch (SQLException e) {
            logger.severe("Connection failed");
        }
        return connection;
    }
}
