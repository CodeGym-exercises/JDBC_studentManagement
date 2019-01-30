package com.tainika;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentServiceImpl {
    private Connection connection;
    private PreparedStatement statement;
    private static Set<Student> students = new HashSet<Student>(){};

    public void addStudent() throws SQLException {
        try {
            connection = DBConnection.getInstance().getConnection();
            int studentCode, age;
            String name = "";
//            Student student = new Student(123,"Tien",24);
            String sql = "insert into student(student_code,name,age) value(?,?,?)";
            Scanner scanner = new Scanner(System.in);


            System.out.print("\nEnter student code: " );
            studentCode = scanner.nextInt();
            System.out.print("\nEnter name: " );
            name = scanner.next();
            System.out.print("\nEnter age: " );
            age = scanner.nextInt();

            students.add(new Student(studentCode,name,age));

            statement = connection.prepareStatement(sql);
            statement.setInt(1,studentCode);
            statement.setString(2,name);
            statement.setInt(3,age);

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("err: " + e.getMessage());
        }finally {
            statement.close();
            if(connection!=null)
            {connection.close();}
        }
    }
}
