package com.company;
import java.util.Scanner;
public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st subj marks:");
         int s1 = sc.nextInt();
        System.out.println("Enter your 2nd subj marks:");
        int s2 = sc.nextInt();
        System.out.println("Enter your 3rd subj marks:");
        int s3 = sc.nextInt();
        System.out.println("Enter your 4th subj marks:");
        int s4 = sc.nextInt();
        System.out.println("Enter your 5th subj marks:");
        int s5 = sc.nextInt();
        int sum = s1+s2+s3+s4+s5;
        double prcnt = (sum*100)/500;
        System.out.println("The percentage is:"+prcnt+"%");
        //float a =sc.nextFloat();
        //System.out.println("Enter number 2");
        // int b = sc.nextInt();
        //float b =sc.nextFloat();
        // int sum = a+b;
        //float sum = a+b;
        //System.out.println("The sum of these numbers are:");
        //System.out.println(sum);
        //boolean b1 =sc.hasNextInt();
        //System.out.println(b1);
        //String str = sc.nextLine();
        //System.out.println(str);
    }
}
