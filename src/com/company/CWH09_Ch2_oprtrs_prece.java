package com.company;

public class CWH09_Ch2_oprtrs_prece {
    public static void main(String[] args) {
        // Precedence and Associativity
        //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis of
        left to right associativity
        =30-34/2
        =30-17
        =13
         */
        //int b = 60/5 - 34*2;
        /*
        =12-68
        =-56
        Both(* and /) have same precedence but associativity is from left to right
         */

//        System.out.println(a);
//        System.out.println(b);
        // Quick Quiz
         int a = 10;
         int b = 0;
         int c = 0;
         int d = 4;
         int x = 6;
         int y = 1;
         int v = 5;
         int u = 3;
         int k = (x-y)/2;
         int l = (b*b-4*a*c)/(2*a);
         int m = v*v-u*u;
         int n = a*b-d;
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);


    }
}
