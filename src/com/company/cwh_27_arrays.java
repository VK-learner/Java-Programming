package com.company;

public class cwh_27_arrays {
    public static void main(String[] args){
        //int [] marks = {98,45,79,99,80};
        float [] marks = {98.1f,45.87f,79.4f,99.2f,80.75f};
        String [] students = {"Vaibhav","Abhay","Vishal","Aishwarya"};
        System.out.println(marks.length);
        System.out.println(marks[3]);

        //Display the Array (Naive way)
        System.out.println("Printing using Naive way");
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);

        //Displaying the Array (for loop) OR Array traversal.
        System.out.println("Printing using for loop");
        for (int i=0;i< students.length;i++){
            System.out.println(students[i]);
        }
        System.out.println("students Array in reverse order");
        for (int i=students.length-1;i>=0;i--){
            System.out.println(students[i]);
        }
        //Displaying the Array (for each loop)
        for (float element : marks){
            System.out.println(element);
        }
    }
}
