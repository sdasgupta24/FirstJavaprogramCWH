package com.company;
import java.io.*;
import java.util.*;

public class CWH14_String_methods {
    public static void main(String[] args) {

      // taking string input in 2 ways within the program
        String name = "Rintun";
        //String name2 = new String("abcd"); // give open quotes and original appears on its own, write the string
        //System.out.println(name2);
        int value = 0;
        value = name.length(); // syntax or format : string name.method name()
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "    Rumi    ";
        System.out.println(nonTrimmedString.trim());
        String Trimmed = nonTrimmedString.trim(); // or u can create a new string to store the trimmed value
        System.out.println(Trimmed); // and then print that

       // indexing starts from 0 always
        System.out.println(name.substring(1)); // starts from index 1 and prints full string
        System.out.println(name.substring(2,5)); // letter at index 2 included but not letter at index 5

        System.out.println(name.replace('n' , 'd'));
        System.out.println(name.replace( "Rin" , "dum")); //rin phrase replaced with dum
        System.out.println(name.replace( "n" , "dum")); // n in all places is replaced with dum

        System.out.println(name.startsWith("Rin"));
        System.out.println(name.endsWith("dum"));

        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));

        System.out.println(name.indexOf("nt"));
        System.out.println(name.indexOf("n"));

        System.out.println(name.indexOf("n",3));
       String newName = "Rintuunnn";
        System.out.println(newName.indexOf("u")); // u is at index 4, thus output is 4
        System.out.println(newName.indexOf("u" ,5));
         // even though u is at index 4, we are asking compiler to start searching from index 5 so output is 5,
        //as u is present on that index as well

        System.out.println(newName.indexOf("u23"));
        // not found any substring called "u23" thus returned -1 value

        System.out.println(newName.lastIndexOf("n"));
        System.out.println(newName.lastIndexOf("n" , 5));
        // lastIndexOf checks from the last character/index i.e backwards

        System.out.println(name.equals("Rintun"));
        System.out.println(name.equals("rintun")); // false as string is case sensitive

        System.out.println(name.equalsIgnoreCase("Rintun"));
        System.out.println(name.equalsIgnoreCase("rINTUN"));
        // ignores case just checks equal or not


    }
}
