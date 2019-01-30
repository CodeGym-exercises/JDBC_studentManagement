package com.tainika;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    private static final String CONNECTION =
            "jdbc:mysql://localhost:3306/student_management";

    private static DBConnection dbConnection;
    private Connection connection = null;

    private DBConnection(){

    }

    public Connection getConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(CONNECTION,USERNAME,PASSWORD);
            System.out.println("Connected!! ");
        }catch (SQLException e){
            System.out.println("Err: " + e.getMessage());
        }finally {
            if(connection!=null)
            {connection.close();}
        }

        return connection;
    }

    public static DBConnection getInstance(){
        if(dbConnection==null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
