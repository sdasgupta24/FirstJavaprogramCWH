package com.company;
import java.io.*;
import java.util.*;

public class CWH_13_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = sc.next(); input a word
        //String s2 = sc.nextLine(); // input a sentence or phrase
        //System.out.println(s);
        //System.out.println(s2);
        int a = 6;
        float b = 5.645438f;
        System.out.printf("The value of a is %d and value of b is %f", a, b);
        // %d and % f are used for int and float respectively and called format specifiers
       // System.out.format("The value of a is %d and value of b is %f", a, b); // same functionality
        System.out.printf("The value of a is %d and value of b is %.2f", a, b); // shows only 2 places after decimal
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        // shows upto 2 decimals but with 8 spaces including 5.65
    }

}
