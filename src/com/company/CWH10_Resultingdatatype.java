package com.company;

public class CWH10_Resultingdatatype {
    public static void main(String[] args) {
  byte x = 5;
  int y = 4;
  short z = 8;
   int a = y+z;
   float b = 6.45f + x; // 6.45 is usually double, f is mentioned to make it floating type.
        System.out.println(b); // The output of b is 11.45 as sum of int and float is always in float
                              // (Refer to chart in notes)

        // Increment and decrement operators
        int g = 8;
         int m = 56;
         int n = m++; // first n is assigned as 56 then m is incremented. m is used first and incremented later
         int o = 67;
         int p = ++o; // first o is incremented and then p is assigned . o is incremented first and used later
        System.out.println(g++);
        System.out.println(++g);
    // short quiz
        int k = 7;
        int l = ++k * 8;
        System.out.println(l);
        // for characters
        char ch = 'a';
        ch++;
        System.out.println(ch);
    }

}
