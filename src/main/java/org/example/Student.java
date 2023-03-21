package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

    private int age;
    private int gpa;
    private String name;

    public int getAge() {
        return age;
    }

    public int getGpa() {
        return gpa;
    }

    public String getFullName() {
        return name;
    }

    public Student(int age, int gpa, String name) {
        this.age = age;
        this.gpa = gpa;
        this.name = name;
    }

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, 88, "David Goodman"));//3
        students.add(new Student(25, 82, "Mark Rose"));//4
        students.add(new Student(22, 90, "Jane Doe"));//1
        students.add(new Student(25, 90, "Jane Dane"));//2
        return students;
    }

    public static String sort(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed()
                    .thenComparing(Student::getAge)
                        .thenComparing(x -> x.getFullName().split(" ")[1]))
                .map(Student::getFullName)
                .collect(Collectors.joining(","));
    }

}