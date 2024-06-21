package com.immanuel.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.mariadb.jdbc.Connection;
import org.springframework.beans.factory.annotation.Value;

public class ConnectDB {

    @Value("${mariadb.url}")
    String url;

    @Value("${mariadb.user}")
    String user;

    @Value("${mariadb.password}")
    String password;

    Connection connection = null;

    public ConnectDB() {
    }

    public void connect() {

        try {
            connection = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully to MariaDB Database!");
        } catch (SQLException e) {

            e.printStackTrace();
            System.out.println("Connection error!\nTry correcting the entries!!");

        }

    }

}
