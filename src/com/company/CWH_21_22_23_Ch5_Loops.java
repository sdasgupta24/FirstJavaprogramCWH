package com.company;
import java.util.Scanner;

public class CWH_21_22_23_Ch5_Loops {
    public static void main(String[] args) {
//        System.out.println("Using while Loop:");
//        int i = 100;
//        while(i<=200){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Finish Running While Loop!");

              /* while(true)
                 {
                    System.out.println("I am an infinite while loop!");
                  } */
        //DO WHILE
//        do {
//            System.out.println(i);
//            i++; // increment/decrement has to be done within the loop
//        }
//        while(i<=200); // semicolon is reqd in do while

        // Ques with DO WHILE , printing first 10 natural numbers
//        int a = 1;
//        do {
//            System.out.println(a);
//            a++;
//        }
//        while(a<=10);

        //For Loop , printing first n odd numbers using a for loop
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter the vale of n");
        int n = sc.nextInt();
//        for (int i=0;i<n;i=i+2)
//        {
//            System.out.println(2*i+1);
//        }

        // decrementing loop, printing first n natural nos. in reverse
        for (int i=n;i>0;i--)
        {
            System.out.println(i);
        }
    }
}
