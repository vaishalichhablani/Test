package org.automation;

public class Student {
    int rollNo;
    int age;
    public void display1() {
        System.out.println("We all love automation");
    }
    public void display2() {
        System.out.println("automation is very easy");
    }

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Student student = new Student();
        student.display1();
        student.display2();
        student.age=22;
        student.rollNo=123;

        System.out.println(student.age);
        System.out.println(student.rollNo);
    }
}


