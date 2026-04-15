package com.company;

public class cwh_29_ch6_ps {
    public static void main(String[] args){
//Q1. Create an Array of 5 floats and calculate their sum.
//        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
//               float sum = 0;
// for (float element : marks){
//            sum+=element;
//        }

//        System.out.println("sum : "+sum);

//       for (int i=0;i<marks.length;i++){//VK
//            sum+=marks[i];}
//       System.out.println("sum = "+sum);
//----------------------------------------------------------------------------------------------------------------------
//Q2. WA JP to find out whether a given integer is present in an array or not.

//        float sum = 0;
//        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};//VK
//        float n=99.2f;
//        boolean isInArray = false;
//        for (float element: marks){
//            if (n==element){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.format("The value %f is in the Array.",n);
//        }
//        else {
//            System.out.format("The value %f is NOT in the Array.",n);
//        }
/*----------------------------------------------------------------------------------------------------------------------
        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};//VK
        float n=45.7f;
        for (int i=0;i<marks.length;i++){
            if(marks[i]==n){
                System.out.println(n+" is in the array at index :"+i);
                break;}}*/
//----------------------------------------------------------------------------------------------------------------------
//Q3. Calculate the average marks from an array containing marks of all students in Physics using for-each loop.
//            float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
//            float sum = 0;
//            for (float element : marks){
//                sum+=element;
//            }
//            System.out.format("Average of marks %8.3f/%d = ",sum,marks.length);
//            System.out.println(sum/marks.length);
//----------------------------------------------------------------------------------------------------------------------
//Q4. Create a JP to add two matrices of size 2x3.
                      //j=0,1,2
//        int [][] mat1 = {{1,2,3},//i=0
//                         {4,5,6}};//i=1
//        int [][] mat2 = {{7,8,9},
//                         {3,7,1}};
//        int [][] result={{0,0,0},
//                         {0,0,0}};
//        for (int i=0;i<mat1.length;i++) {//runs for rows i = 0 to 1
//            for (int j = 0; j <mat1[i].length; j++){//runs for column j = 0 to 2
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println();
//        }
//----------------------------------------------------------------------------------------------------------------------
//Q5. WA JP to reverse an array.
//        int [] array = {1,2,3,4,5,6,7};
//        int l = array.length;
//        int n = Math.floorDiv(l, 2);
//        for (int i=0;i<n;i++){
//            int temp = array[i];
//            array[i]= array[l-1-i];
//            array[l-1-i] = temp;
//        }
//        for (int vk : array){
//            System.out.print(vk+" ");
//        }
//----------------------------------------------------------------------------------------------------------------------
//Q6. WA JP to find the maximum element in an array.
//        int [] array = {1,2100,3,4559,5,34,67};
//        int max = 0;
//        for (int e : array){
//            if (e>max){
//                max = e;
//            }
//        }
//        System.out.println("The value of the maximum element in this array is : "+max);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//----------------------------------------------------------------------------------------------------------------------
//Q7. WA JP to find the minimum element in a JAVA array.
//Q8. WA JP to find weather an array is sorted or not.
        int [] array = {1,2,3,4,5,6,7,8,0};
        boolean isSorted = true;
        for (int i=0;i<array.length-1;i++){
            if (array[i]>array[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }

    }
}