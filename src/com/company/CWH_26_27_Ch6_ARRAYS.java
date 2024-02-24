package com.company;

public class CWH_26_27_Ch6_ARRAYS {
    public static void main(String[] args) {
        /* Store marks of 500 students in a class
        You have 2 options
         1. create 500 variables
         2. Use arrays (obviously) */

        // 3 ways to create an Array :-

        //way 1 Declaration and  memory allocation together in same line
        //int [] marks = new int[5];

        // way 2 Declaration and then memory allocation
//      int [] marks;
//      marks = new int[5];
        //initialization
//      marks [0] = 25;
//      marks [1] = 85;
//      marks [2] = 65;
//      marks [5] = 39; - throws error as it if from 0 to 4 , 5 spaces allocated only

//       way 3 Declaration , memory allocation and initialization all together
//        int marks [] = {34, 25, 67, 56, 98};
//         System.out.println(marks[1]);

        int[] marks = {34, 25, 67, 56, 98};
        //float [] marks = {23.7f, 39.6f, 83.6f};
        //String [] students = {"Harry","Subham","Lovesh", "Kalpana"};
        // System.out.println(marks.length); // o/p - 5
        // System.out.println(students.length); // o/p - 4
//    DISPLAYING ARRAYS USING FOR LOOP
//        for (int i=0;i<marks.length;i++)
//        {
//            System.out.println(marks[i]);
//        }
        //    DISPLAYING ARRAY elements in reverse order  (Quick Quiz)
//        for (int i = marks.length-1;i>=0;i--)
//        {
//            System.out.println(marks[i]);
//        }
//    DISPLAYING ARRAYS USING for-each LOOP
//        for (int element : marks)
//          {
//               System.out.println(element);
//           }

    }
}
