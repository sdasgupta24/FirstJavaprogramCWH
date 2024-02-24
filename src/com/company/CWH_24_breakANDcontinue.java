package com.company;

public class CWH_24_breakANDcontinue {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++)
//        {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i == 2) {
//                break; // gets out of the loop instantly
//            }
//        }
//        int i = 1;
//        while(i<=5)
//        {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2)
//            {break;}
//            i++;
//        }
        // using Continue with for loop, lets say we have to print all natural nos from 1 to 10 except 2
//        for (int i = 1; i <= 10; i++)
//        {
//            if(i==2)
//            {continue;} //stops executing existing lines in loop and goes to next iteration
//            System.out.println(i);
//        }
//        System.out.println("hello"); // executed as it is out of loop

        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<5);
        System.out.println("Loop ends here");
   }
}
