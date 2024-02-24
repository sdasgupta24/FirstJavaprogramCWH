package com.company;

public class CWH_16_17_Conditionals_LogicalOprtrs {
    public static void main(String[] args) {
        int age = 17;
        if (age>=18)
        {
            System.out.println("Yes you can vote");
        }
        else // optional, only if can also work but only else does not
        {
            System.out.println("No you cannot vote yet");
        }
        boolean cond = (age==18);
        if(cond)
        {
            System.out.println("yes u can drive");
        }
        else
        {
            System.out.println("no u can't drive");
        }
        //LOGICAL OPERATORS
        /* AND
        boolean a = true;
        boolean b = false;
        boolean c = true ;
        if (a && b && c )
        {System.out.println("Y");}
        else
        {System.out.println("N");} */

       // OR
        boolean a = true;
        boolean b = false;
        boolean c = true ;
        if (a || b || c )
        {System.out.println("Y");}
        else
        {System.out.println("N");}

        //NOT
        System.out.print("Not(a) is ");
        System.out.println(!a);

        System.out.print("Not(b) is ");
        System.out.println(!b);

    }
}
