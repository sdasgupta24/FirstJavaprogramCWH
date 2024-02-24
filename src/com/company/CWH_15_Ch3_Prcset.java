package com.company;

public class CWH_15_Ch3_Prcset {
    public static void main(String[] args) {
        //Unable to download prc set 3 so writing questions here

        //Q1 Write a Java program to convert a string to lowercase.

        String name1 = "JacK ReacheR" ;
        name1 = name1.toLowerCase();
        System.out.println(name1);

        //Q2 Write a Java program to replace spaces with underscores.

        String name2 = "I am learning Java";
        name2 = name2.replace(" " , "_");
        System.out.println(name2);

        //Q3 Write a Java program to fill in a letter template which looks like below:
        // letter = “Dear <|name|>, Thanks a lot”
        // Replace <|name|> with a string (some name)

        String name3 = "Dear Rahul, Thanks a lot";
        name3 = name3.replace("Rahul" , "Ravi");
        System.out.println(name3);

        //Q4 Write a Java program to detect double and triple spaces in a string.

        String prb4 = "I have a test in  two   days";
        System.out.println(prb4.indexOf("  "));
        System.out.println(prb4.indexOf("   "));
        // if no triple space, it would give -1 as output

        //Q5 Write a program to format the following letter using escape sequence characters.
        //Letter = “Dear Harry, This Java Course is nice. Thanks”

        String prb5 = "Dear Harry, This Java Course is nice. Thanks";
        System.out.println("Dear Harry,\n\tThis Java Course is nice.\nThanks");
    }
}
