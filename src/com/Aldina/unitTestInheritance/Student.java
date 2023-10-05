package com.Aldina.unitTestInheritance;

public class Student {
    public String name;
    public int age;
    public boolean isTired;


    // Polymorfism
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isTired=" + isTired +
                '}';
    }

    public Student(String name, int age, boolean isTired) {
        this.name = name;
        this.age = age;
        this.isTired = isTired;

    }
}
