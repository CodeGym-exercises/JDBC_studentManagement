package com.tainika;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        StudentServiceImpl service = new StudentServiceImpl();
        service.addStudent();
    }
}
