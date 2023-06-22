package org.automation;

public class Studentt {
    int rollNo;
    int age;
     public void display1()
     {
         System.out.println ("Welcome to all of you");
     }

     public void display2()
    {
        System.out.println("Automation is very easy");

    }
    public static void main(String args[])
    {
        Studentt studentt = new Studentt();
        studentt.display1();
        studentt.display2();
        studentt.rollNo=23;
        studentt.age=21;
        System.out.println(studentt.age);
        System.out.println(studentt.rollNo);
    }

}
