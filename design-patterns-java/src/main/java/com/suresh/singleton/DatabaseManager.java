package com.suresh.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.scene.chart.PieChart.Data;

public class DatabaseManager {
    // Use a private static variable to hold DatabaseManager class instance.
    private static volatile DatabaseManager dbManager;
    private static volatile Connection connection;

    // Use a private constructor to ensure Object can't be created from outside.
    private DatabaseManager() {
        if (dbManager != null) {
            throw new RuntimeException("Please use getDbManager method to access Database Manager instance");

        }
    }

    /**
     * 1.Global static method to access Database Manager class instance from outside
     * 2.Use double locking to avoid duplicate object creation.
     */
    public static DatabaseManager getDbManager() {
        if (dbManager == null) {
            synchronized (DatabaseManager.class) {
                if (dbManager == null) {
                    dbManager = new DatabaseManager();
                }

            }

        }
        return dbManager;

    }

    /**
     * 1. Purposefully didn't make getConnection method as static.
     * 2. Want developer to getConnection via DatabaseManager.getDbManager
     */

    public Connection getConnection() {
        if (connection == null) {
            synchronized (DatabaseManager.class) {
                if (connection == null) {
                    String url = "jdbc:derby:memory:sample;create=true";
                    try {
                        connection = DriverManager.getConnection(url);

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
        return connection;

    }

}
