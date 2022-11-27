package com.suresh;

import java.sql.Connection;

import com.suresh.singleton.DatabaseManager;

/**
 * Get Derby database connection using DatabaseManager single instance via
 * getDbConnection
 * DatabaseManager.getDbManager().getConnection() will fetch
 * derbyDatabaseConnection
 *
 */
public class App {
    public static void main(String[] args) {
        DatabaseManager dbManager = DatabaseManager.getDbManager();
        Connection connection = dbManager.getConnection();
        System.out.println("Get Database Connection: " + connection);
    }
}
