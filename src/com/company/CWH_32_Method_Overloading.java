package com.company;

public class CWH_32_Method_Overloading {
    static void foo()
    {
        System.out.println("Good morning bro");
    }
    static void foo(int a)
    {
        System.out.println("Good morning "+a+" bro");
    }
    static void foo(int a, int b) // here it is called paramter
    {
        System.out.println("Good morning "+a+" bro");
        System.out.println("Good morning "+b+" bro");
    }
//    static void change(int a)
//    {
//        a = 98;
//    }
//    static void change2(int [] arr)
//    {
//        arr[0] = 98;
//    }
//    static void tellJoke()
//    {
//        System.out.println("I invented a new word!\n"+"Plagarism");
//    }
    public static void main(String[] args) {
        //tellJoke();
        // Case 1 : Changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is= "+x);

//        Case 2 : Changing the element of array
//        int [] marks = {52,73,77,89,98,94};
//        change2(marks);
//        System.out.println("The value of x after running change is = "+marks[0]);

        // METHOD OVERLOADING
        // can't change return type of methods i.e
        // can't write static int foo(int a, int b)
        foo();
        foo(2500);
        foo(2000,3000); //here they are called arguments and these are actual(has value)
    }
}
