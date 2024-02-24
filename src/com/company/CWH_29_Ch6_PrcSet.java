package com.company;

public class CWH_29_Ch6_PrcSet {
    public static void main(String[] args) {
        //Q1
//        float sum = 0;
//        float [] arr = {23.7f, 39.6f, 83.6f, 63.4f, 99.2f};
//        for(int i=0;i<arr.length;i++)
//        {
//            sum = sum + arr[i];
//        }
//        System.out.println("The sum of all elements is :"+sum);
        //OR

//        for(float el:arr)
//        {
//            sum += el;
//        }
//        System.out.println("The sum of all elements is :"+sum);

        //Q2
//        int[] marks = {34, 25, 67, 56, 98};
//                int num = 25;
//                boolean IsinArray = false;
//        for(int el:marks)
//        {
//            if (num==el)
//            {
//                IsinArray = true;
//                break;
//            }
//        }
//         if (IsinArray = true )
//         {
//             System.out.println("The number is present");
//         }
//         else
//         {
//             System.out.println("The number is not present");
//         }

        //Q3
//        double sum = 0; double avg = 0;
//        int[] marks = {48, 55, 67, 56, 98};
//        for(int i=0;i<marks.length;i++)
//        {
//            sum = sum + marks[i];
//        }
//        avg = sum/marks.length;
//        System.out.println("The avg marks of all students is :"+avg);

        //Q4
//        int[][] mat1 = {{1,2,3},
//                           {4,5,6}};
//        int[][] mat2 = {{2,6,13},
//                            {3,7,1}};
//        int [][] result = {{0,0,0},
//                            {0,0,0}};
//        for(int i=0;i<mat1.length;i++) // row no.of times i.e 2 in this case
//        {
//            for(int j=0;j<mat1[i].length;j++) // column no.of times i.e 3 in this case
//            {
//                result[i][j] = mat1[i][j]+mat2[i][j];
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println("");
//        }

        //Q5
//        int[] arr = {34, 25, 67, 56, 98, 76};
//        int l = arr.length;
//        int temp =0;
//        int n = Math.floorDiv(arr.length,2); // Divides the 2 digits but ignores anything after decimal in answer
//        for(int i=0;i<=n;i++)
//        {
//            temp = arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]= temp;
//        }
//        for(int el:arr)
//        {
//            System.out.print(el+" ");
//        }

        //Q6
//        int[] arr = {34, 25, 67, 561, 98, 76};
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("The highest number in the array is "+max);
                //OR
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        int[] arr = {34, 25, 67, -561, 98, 76};
//        int max = Integer.MIN_VALUE ; // takes the smallest integer no possible(-2147..), to make this code run for -ve integer too
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("The highest number in the array is "+max);

//        //Q7
//       int[] arr = {34, 25, 67, 561, 8, 76};
//       int min = arr[0];
//       for(int el:arr)
//        {
//           if(el<min)
//            {
//             min = el;
//            }
//        }
//        System.out.println("The smallest number in the array is "+min);

           //Q8
//       boolean isSorted = true;
//        int[] arr = {34, 25, 67, 561, 855, 76};
//                for (int i=0;i<arr.length;i++)
//                {
//                    if(arr[i]>arr[i+1])
//                    {
//                        isSorted = false;
//                        break;
//                    }
//                }
//                if(isSorted)
//                  System.out.println("The array is sorted");
//                else
//                    System.out.println("The array is not sorted");
    }
}
