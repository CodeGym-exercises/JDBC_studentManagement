package com.tainika;

public class Student {
    private Long id;
    private String studentCode;
    private String name;
    private int age;

    public Student() {
    }

    public Student(Long id, String studentCode, String name, int age) {
        this.id = id;
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
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
