package com.company;
import java.util.Scanner;

public class CWH_19_Ch4_pracSet {
    public static void main(String[] args) {
        //Q1 can solve, not doing

        //Q2
        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter marks of 1st subj");
        byte subj1 = sc.nextByte();
        System.out.println("Enter marks of 2nd subj");
        byte subj2 = sc.nextByte();
        System.out.println("Enter marks of 3rd subj");
        byte subj3 = sc.nextByte();
        int tot = (subj1+subj2+subj3);
        float prcnt = (tot/300.0f)*100.0f; // assuming marks is out of 100

        if(prcnt>=40 && subj1>=33 && subj2>=33 && subj3>33)
        {System.out.println("You have passed");}
        else
        {System.out.println("You have failed");} */

        //Q3
        /* float tax = 0;
        System.out.println("Enter your income in lakhs per annum");
        float income = sc.nextFloat();
        if(income<2.5){
           tax = tax + 0;
       }
       else if(income>2.5f && income <= 5f){
          tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
           tax = tax + 0.2f * (income - 5f);
        }
       else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is: " + tax); */

       //Q4
        /*System.out.println("Enter day no.");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        } */
        //Q6
       /* System.out.println("Enter any website url");
        String website = sc.nextLine();
        if(website.endsWith(".org"))
        {
            System.out.println("Organization website");
        } else if (website.endsWith(".com"))
        {
            System.out.println("Commercial website");
        } else if (website.endsWith(".in"))
        {
            System.out.println("Indian website"); */

        // Q5
        System.out.println("Enter any year");
         int Y = sc.nextInt();
         if(Y%400==0)
         {
             System.out.println("Leap year");
        }
         else if(Y%100==0)
         {
             System.out.println("Not a leap year");
         }
         else if (Y%4==0)
         {
             System.out.println("Leap year");
         }
         else
         {
             System.out.println("Not a leap year");
         }

    }
}
