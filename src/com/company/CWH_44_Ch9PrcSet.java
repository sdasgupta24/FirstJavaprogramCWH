package com.company;

class Cylinder
{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea()
    {
        return 2*3.142*radius*(radius+height);
    }
    public double volume()
    {
        return 3.142*radius*radius*height;
    }
}
 class Rect
 {
     private int len;
     private int bred;

     public Rect()
     {
         this.len = 5;
         this.bred = 3;
     }
     public Rect(int len, int bred)
     {
         this.len = len;
         this.bred = bred;
     }

     public int getLen() {
         return len;
     }

     public int getBred() {
         return bred;
     }
 }
  class Sphere {
      private int r1;
      private int h1;

      public Sphere(int r1, int h1) { //constructor
          this.r1 = r1;
          this.h1 = h1;
      }

      public int getR1() {
          return r1;
      }

      public void setR1(int r1) {
          this.r1 = r1;
      }

      public int getH1() {
          return h1;
      }

      public void setH1(int h1) {
          this.h1 = h1;
      }
  }

public class CWH_44_Ch9PrcSet {
    public static void main(String[] args) {

        //Problem 1
        Cylinder cl = new Cylinder(9,12);
//        cl.setHeight(12);
//        cl.setRadius(7);
        int h = cl.getHeight();
        int r = cl.getRadius();
        System.out.println(h);
        System.out.println(r);

        //Problem 2
        System.out.println("The surface area is "+cl.surfaceArea());
        System.out.println("The volume is "+cl.volume());

        //Problem 3
          // just put values in line 42 while creating object, if setters are not commented, it takes 12 and 7
         // but if commented,only constructor is invoked and it takes h =12 and r =9

        //Problem 4
        Rect rec1 = new Rect(12,7);
        System.out.println(rec1.getBred());
        System.out.println(rec1.getLen());

        //Problem 5
        Sphere s = new Sphere(15,22);
        s.setR1(3);
        s.setH1(7);
        int a = s.getR1();
        int b = s.getH1();
        System.out.println(a);
        System.out.println(b);
    }
}
