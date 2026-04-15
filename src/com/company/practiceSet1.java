package com.company;
import java.util.Scanner;
public class practiceSet1 {
    public static void main(String[] args) {
//        Scanner ip = new Scanner(System.in);
//        boolean num = ip.hasNextInt();
//        System.out.println(num);
//        if (num) {// if(num==true)
//            System.out.println("The " + num + " is an integer");
//        } else {
//            System.out.println("it is not an integer");
//        }
        String s = "a1b2c3";
        String[] parts = s.split("[^A-Za-z]+");
        System.out.println(parts);
    }
}