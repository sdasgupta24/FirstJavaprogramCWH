package com.company;

public class CWH_33_VarArgs {
//    static int sum(int a, int b)
//    {
//        return a+b;
//    }
//    static int sum(int a, int b, int c)
//    {
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d)
//    {
//        return a+b+c+d;
//    }
//    static int sum(int ...arr)
//    {
//        // Available as int [] arr
//        int result = 0;
//        for (int a: arr)
//        {
//            result += a;
//        }
//        return result;
//    }
    static int sum(int x, int ...arr) // the parameter x has been made compulsory in this case
    {
        int result = x;
        for (int a: arr)
        {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs tutorial");
       // System.out.println("The sum is : " +sum()); // will give error as compulsory value not given
        System.out.println("The sum is : " +sum(4));
        System.out.println("The sum is : " +sum(4,5)); // returns 0 if no value is given
        System.out.println("The sum is : " +sum(6,7,8)); // to do this, another method c has to created ie overload
        System.out.println("The sum is : " +sum(6,7,8, 3));
    }
}
