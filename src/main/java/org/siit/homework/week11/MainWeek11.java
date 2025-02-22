package org.siit.homework.week11;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public class MainWeek11 {
    public static void main(String[] args) {
        System.out.println("Start");
    }

    private static void initializeJDBCDriver() {
        try {
            Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException |
                 ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    private static Optional<Connection> getJDBCConnection() {
        try {
            return Optional.ofNullable(DriverManager.getConnection("jdbc:h2:mem:homework_db", "sa", ""));
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Optional.empty();
    }

}