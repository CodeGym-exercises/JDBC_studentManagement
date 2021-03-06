package com.tainika;

public class Student {
    private int id;
    private int studentCode;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int studentCode, String name, int age) {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
    }

    public Student(int id, int studentCode, String name, int age) {
        this.id = id;
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
