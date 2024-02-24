package com.company;
import java.util.*;
import java.io.*;

public class personalpractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int h1 = sc.nextInt();
//        int h2 = sc.nextInt();
//        int v1 = sc.nextInt();
//        int v2 = sc.nextInt();
       /* boolean bool = false;

        if(h1==h2)
            bool = true;
        else
        {
            for(int i=1;i<100;i++)
            {   h1 = h1 + v1;
                h2 = h2 + v2;

                if(h1==h2)
                {  bool = true;
                    break;
                }
            }
        }
        System.out.println(bool); */
        // diff approach Big Light
//        if((h1 * v1) == (h2 * v2) || (h1 + v1) == (h2 + v2))
//            System.out.println("true");
//        else
//            System.out.println("false");

        // PRIME NO. CHECK

//        System.out.println("Enter the number to be checked");
//        int n = sc.nextInt();
//        int count = 0;
//        for (double i=0;i<=n/2;i++)
//        {
//           if(n%i==0)
//           {
//               count++;
//           }
//        }
//         if (count>1)
//         {
//             System.out.println("Not a prime number");
//         }
//         else
//         {
//             System.out.println("Prime number");
//         }

        // FIBONACCI series using for loop
//        System.out.println("Enter the no.of terms of fibonacci series u want to print");
//        int N = sc.nextInt();
//        int t1 = 0;
//        int t2 = 1;
//        int t3 = 0;
//        for(int i=1;i<=N;i++)
//        {
//            System.out.print(t1+" ");
//            t3 = t1+t2;
//            t1=t2;
//            t2=t3;
//        }

        // FIBONACCI series using while loop
//        int i = 1;
//         while(i<=N) {
//             System.out.print(t1 + " ");
//             t3 = t1 + t2;
//             t1 = t2;
//             t2 = t3;
//             i++;
//         }

        // GCD using while
//        System.out.println("Enter the nos.");
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        int i = 1;
//        int gcd = 1;
//        while (i <= n1 && i <= n2) {
//            if (n1 % i == 0 && n2 % i == 0) {
//                gcd = i;
//            }
//            i++;
//        }
//        System.out.println("The GCD/HCF of these numbers is : "+gcd);

        // GCD using for loop
//        int gcd = 1;
//        for (int i=1; i<=n1 && i<=n2; i++)
//        {
//            if(n1%i == 0 && n2%i == 0)
//            {
//                gcd = i;
//            }
//        }
//        System.out.println("The GCD/HCF of these numbers is : "+gcd);

        // Factorial of a number
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int frl = 1;
        for(int i=n;i>=1;i--)
        {
           frl =  frl*i;
        }
        System.out.println(frl);
    }
}



