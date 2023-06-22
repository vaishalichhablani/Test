package org.automation;

public class BODMAS {
    int a,b,c,x,y,z,a1,a2,a3,x1,x2,x3;
    public int Sum(int a,int b)
    {
        c=a+b;
        return c;
    }
    public  int Subtract ( int x, int y) {
         z=x-y;return z;}
     public int Multi ( int a1, int a2){
         a3=a1*a2;return a3;}
     public int div(int x1, int x2){
        x3=x1/x2;   return x3;}
     public static void main (String[] args){
        //((((10+2)+2)-2)*2)/2)
         BODMAS BOD= new BODMAS();
         int Sumresult =BOD.Sum(10,2);
         System.out.println(" FirstSum is :" +Sumresult);
         int Sumresult2=BOD.Sum(Sumresult,2);
         System.out.println(" Second Sum is :" +Sumresult2);
         int Subresult=BOD.Subtract(Sumresult2,2);
         System.out.println("Subtraction  is :" +Subresult);
         int Multiresult=BOD.Multi(Subresult,2);
         System.out.println("Multiplication  is :" +Multiresult);
         int divresult=BOD.div(Multiresult,2);
         System.out.println("Final result of  ((((10+2)+2)-2)*2)/2) is :" +divresult);

         //(((((10*2)-2)+2)-2)/2)
         BODMAS BOD2= new BODMAS();
         int Multiresult2=BOD2.Multi(10,2);
         System.out.println(" Multiplication  is :" +Multiresult2);
         int Subresult2=BOD2.Subtract(Multiresult2,2);
         System.out.println(" Subtraction is :" +Subresult2);
         int Sumresult3=BOD.Sum(Subresult2,2);
         System.out.println(" Sum is :" +Sumresult3);
         int Subresult4=BOD.Subtract(Sumresult3,2);
         System.out.println(" Subtraction is :" +Subresult4);
         int Subresult5=BOD.div(Subresult4,2);
         System.out.println("  Final result of (((((10*2)-2)+2)-2)/2) is :" +Subresult5);



     }
}
