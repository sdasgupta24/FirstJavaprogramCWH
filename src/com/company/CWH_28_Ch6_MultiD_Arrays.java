package com.company;

public class CWH_28_Ch6_MultiD_Arrays {
    public static void main(String[] args) {
        int [][] flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
//        //    DISPLAYING 2-D ARRAYS USING FOR LOOP
//        for(int i=0;i<flats.length;i++)
//        {
//            for(int j=0;j<flats[i].length;j++)
//            {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
        // ANOTHER WAY OF DISPLAYING 2-D ARRAYS
        for (int [] el: flats)
        {
            for(int i=0;i<flats[0].length;i++)
            {
                System.out.print(el[i]+" ");
            }
            System.out.println("");
        }
    }
}
