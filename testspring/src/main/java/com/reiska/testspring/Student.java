package com.reiska.testspring;

public class Student {
    private String name;
    private int age;

    public Student(){

    }
    
    public Student(String name, int age) {
        this.name = name;
        if(age >= 0)
        this.age = age;
    }
}
