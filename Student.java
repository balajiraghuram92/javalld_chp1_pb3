package org.assignment;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Student {
    private int age;
    private String name;

    public int getAge() {  return age; }
    public String getName() {  return name; }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}