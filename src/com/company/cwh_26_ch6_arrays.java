package com.company;

public class cwh_26_ch6_arrays {
    public static void main(String[] args){
        /*Classroom of 500 students - you have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays(recommended):- It's a collection of similar type of data.
        --> Accessing elements in array is faster so we use Array.
         */
 //1. Declaration and memory allocation.
//        int [] marks = new int[5];
//        Initialization.
//        marks[0]= 100;
//        marks[1]= 69;
//        marks[2]= 77;
//        marks[3]= 88;
//        marks[4]= 99;
//2. Declaration and then memory allocation.
//        int [] marks;
//        marks = new int[5];
//        Initialization.
//        marks[0]= 100;
//        marks[1]= 69;
//        marks[2]= 77;
//        marks[3]= 88;
//        marks[4]= 99;
//3.  Declaration, memory allocation and initialization together.
        int marks2[] = {2,44,5,78,9};
//System.out.println(marks[0]+" "+marks[3]);
        System.out.println(marks2[0]+" "+marks2[3]);
    }
}
