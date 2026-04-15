package com.company;
import java.util.*;
/*Multi Dimensional Arrays are Array of Arrays. Each element of a M-D Array is an Array itself.
* Marks in the previous example4 iswas a 1-D array. */
public class cwh_28_multi_dim_arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        String [][] Array = new String[3][3];
//        for(int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                System.out.printf("Array[%d][%d] = ",i,j);
//                Array[i][j] = sc.nextLine();
//            }
//        }
//
//        for(int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                System.out.print("["+Array[i][j]+"] ");
//            }
//            System.out.println();
//        }
        int [][] Array = new int[3][3];
        Array[0][0] = 1;
        Array[0][1] = 2;
        Array[0][2] = 3;
        Array[1][0] = 4;
        Array[1][1] = 5;
        Array[1][2] = 6;
        Array[2][0] = 7;
        Array[2][1] = 8;
        Array[2][2] = 9;

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
