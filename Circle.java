package org.automation;

public class Circle {
    double radius;
    double area;

    public Circle(){
        radius=1;
    }
    public Circle(double r){
        radius=r;

    }

    public double getArea()
    {
          area= Math.PI* radius*radius;
         return area;
    }

    public static void main (String [] args)
    {

        Circle c1= new Circle(2.0);
         double area1=c1.getArea();
        System.out.println ("area of the circle is"+area1);
        Circle c2= new Circle(12);
        double area2= c2.getArea();
        System.out.println ("area of the circle is"+area2);

        Circle c3= new Circle(24);
        double area3=c3.getArea();
        System.out.println ("area of the circle is" +area3);


    }
}


