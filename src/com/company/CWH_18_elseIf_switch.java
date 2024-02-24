package com.company;
import java.util.Scanner;

public class CWH_18_elseIf_switch {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       /* int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
       // if else if else ladder
        if(a>b && a>c)
        { max = a; }
        else if(b>a && b>c)
        { max = b; }
        else
        { max = c ; }
        System.out.println("The largest no is : "+max); */

        // Switch, can be used with char or String as well
        // used when a choice has to be made btwn a no.of alternatives
       /* int age = sc.nextInt();
        switch(age)
        {
            case 18 :
                System.out.println("You are going to be an adult");
                break; // breaks and comes out of switch case or loop
            case 23 :
                System.out.println("You are going to finish your huger studies");
                break; //If not used, falls through and prints everything after any case matches
            case 60 :
                System.out.println("You are going to retire");
                break;
            default :
                System.out.println("Enjoy");
        }
        System.out.println("Thank you"); */

        String var = "Subham";

        switch (var) // enhanced switch, option given by intelli J IDEA after clicking
                     //on switch(once we use it normally with break and all)
        {
            case "Subham" -> System.out.println("You are going to become an Adult!");
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");

    }
}
