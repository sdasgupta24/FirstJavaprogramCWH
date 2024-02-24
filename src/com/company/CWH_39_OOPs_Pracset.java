package com.company;

import java.sql.SQLOutput;

class Employee1
{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}
  class Cellphone
   {
       public void ring()
       {
           System.out.println("Ringing...");
       }

       public void vibrate()
       {
           System.out.println("Vibrating...");
       }
       public void callFriend()
       {
           System.out.println("Calling Vijay...");
       }
   }
   class Square
   {
       int side ;
       public int area()
       {
           return side*side;
       }
       public int perimeter()
       {
           return 4*side;
       }
   }
    class Rectangle
    {
        int l;
        int b;

        public int recArea()
        {
            return l*b;
        }
        public int recPeri()
        {
            return 2*(l+b);
        }
    }
    class Tommy
    {
        public void hit()
        {
            System.out.println("Hitting the enemy");
        }
        public void run()
        {
            System.out.println("Running away from enemy");
        }
        public void fire()
        {
            System.out.println("Firing on enemy");
        }
    }
    class Circle
    {
        double r;
        public double cArea()
        {
            return 3.14*r*r;
        }
        public double cirCum()
        {
            return 2*3.14*r;
        }
    }

public class CWH_39_OOPs_Pracset {
    public static void main(String[] args) {
        // Problem 1
//        Employee1 harry = new Employee1();
//        harry.setName("Code with Harry");// syntax : obj name.method name
//        harry.salary = 233;
//        System.out.println(harry.getName());
//        System.out.println(harry.getSalary());

        //Problem 2
//        Cellphone asus = new Cellphone();
//        asus.callFriend();
//        asus.vibrate();
//        asus.ring();

        //Problem 3
//        Square sq1 = new Square();
//        sq1.side = 5; // giving value to instance variable
//        System.out.println("The area is = "+sq1.area());
//        System.out.println("The perimeter is = "+sq1.perimeter());

        //Problem 4

//        Rectangle rec1 = new Rectangle();
//        rec1.l = 6;
//        rec1.b = 4;
//        System.out.println("The area of rectangle is = "+rec1.recArea());
//        System.out.println("The perimeter of rectangle is = "+rec1.recPeri());

        //Problem 5

//        Tommy p1 = new Tommy();
//        p1.fire();
//        p1.run();
//        p1.hit();

        // Problem 6
//        Circle c1 = new Circle();
//        c1.r = 3.0;
//        System.out.println("The area is = "+Math.round(c1.cArea()*100.0)/100.0); // to bring upto only 2 decimals
//        System.out.println("The circumference is = "+c1.cirCum());
       }
}
