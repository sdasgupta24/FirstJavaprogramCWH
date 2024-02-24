package com.company;

public class CWH_35_Ch7_PrcSet {
    static void multi(int n)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.format("%d x %d = %d\n" ,n, i, n*i);
        }
    }

    static void pattern1(int n)
    {
       for(int i=0;i<n;i++)
       {
         for(int j=0;j<i+1;j++)
         {
             System.out.print("*");
         }
           System.out.println();
       }
    }

    static int sumRec(int n)
    {
       if(n==1) // base condition to terminate recursion and return with 1 value
       {
           return 1;
       }
       return n + sumRec(n-1);
    }

    static void pattern2(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for (int j =1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n )
    {
        /*if(n==1)
        {return 0;}
        else if(n==2)
        {return 1;} */
           //or
        if(n==1 || n==2)
        { return n-1; }
        else
        {
        return fib(n-1) + fib(n-2);
        }
    }

    static int average(int ...arr)
    {
        int result = 0;
        for(int a: arr)
        {
            result += a;
        }
        int avg = result/arr.length;
        return avg;
    }

    static void pattern2_prb7_rec(int n)
    {
        if (n > 0)
        {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            pattern2_prb7_rec(n-1);
        }
    }

    static void pattern1_prb8_rec(int n)
    {
        if (n > 0)
        {
            pattern1_prb8_rec(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static double tempConvrt(double c)
    {
      double f = (9*c+160)/5;
        return f;
    }

    static int sumRec_Iterative(int n)
    {
        int sum = 0;
        if(n==1)
        {
            return 1;
        }
        for(int i=1;i<=n;i++)
        {
             sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
   //Problem 1
       // multi(6);

        //Problem 2
       // pattern1(5);

        //Problem 3
//        int c =sumRec(3);
//        System.out.println(c);

        //Problem 4
       // pattern2(4);

       //Problem 5
//        int result = fib(7);
//        System.out.println(result);

        //Problem 6
//        System.out.println("The average of given number is " + average( 4, 4, 5, 5, 6, 6));

        //Problem 7
//        pattern2_prb7_rec(4);

        //Problem 8
//        pattern1_prb8_rec(4);

        //Problem 9
//       double newT = tempConvrt(5);
//        System.out.println("The converted temp is : "+newT);
//        //or
//        System.out.println("The converted temp is : " + tempConvrt(5));

        //Problem 10
//        int ans = sumRec_Iterative(4);
//        System.out.println(ans);
    }
}
