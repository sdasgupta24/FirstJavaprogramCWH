package com.company;

public class CWH_31_Ch7_Methods {
     static int logic(int x, int y)
    {
        int z;
        if (x>y)
        {
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
         x = 555;
        return z;
    }
//     static int mySum (int a, int b)
//          {
//           int c = a + b;
//           return c;
//            }
    public static void main(String[] args) {
//         int a = 5;
//       int b = 7;
//       int c = mySum(a,b);
//        System.out.println(c);
        int a = 5;
        int b = 7;
        int c;
        // method invocation using Object creation (should be used when not using static)
//        CWH_31_Ch7_Methods obj = new CWH_31_Ch7_Methods();
//        c = obj.logic(a,b);
        c = logic(a,b);
        System.out.println(a+" "+b); // value of a and b remains same irrespective of how you change values of x and y in method/function
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);


    }
}
