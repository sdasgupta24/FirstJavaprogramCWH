package com.company;
import java.io.*;
import java.util.*;
public class CWH_Ch2_PrcSet {
    public static void main(String[] args) {
        //Q1
        //float a = 7/4 * 9/2;
        // 7 and 4 both are int,thus dividing them gives 1,similarly 9 divided by 2 is 4 and 4x1 = 4
        //float a = 7/4.0f * 9/2.0f;
        // int and float operation result in float thus ans will be 7.875
        //System.out.println(a);

        //Q2
        char grade = 'B';
        grade = (char) (grade + 8); //type casting
        System.out.println(grade);
        // decrypting
        grade = (char) (grade - 8);
        System.out.println(grade);

        //Q3
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        System.out.println(n>8); // to check if any given no is greater than 8 or not without if else

        //Q4
         int v = 5;
         int u = 3;
         int a = 1;
         int S = 4;

         int ans = (v*v-u*u)/(2*a*S);
        System.out.println(ans);

        //Q5
        System.out.println(7*49/7+35/7);







    }
}
