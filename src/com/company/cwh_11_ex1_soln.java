package com.company;
import java.util.*;
public class cwh_11_ex1_soln {
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int [] arr = new int [5];

    for (int i=0;i<arr.length;i++) {
        arr[i] = sc.nextInt();
    }
    float totalmarks = 0;
    for (int i=0;i<arr.length;i++){
     totalmarks += arr[i];
    }
    float percentage = (totalmarks/500)*100;
    System.out.println("The total marks of " + "all 5 subjects is : "+totalmarks);
    System.out.println("The percentage is : "+totalmarks+"/500*100 = "+percentage+"%");
}
}