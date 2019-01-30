package com.tainika;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBConnection dbConnection = DBConnection.getInstance();
        dbConnection.getConnection();
    }
}
