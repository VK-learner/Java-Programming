package com.company;
import java.util.Scanner;
public class cwh_5_lec {
    public static void main(String[] args) {
        System.out.println("Taking Input from the User");
    Scanner vk = new Scanner(System.in);
//         System.out.println("Enter number 1: ");
//1        float num1 = vk.nextFloat();
//        System.out.println("Enter the number 2: ");
//2        int num2 = vk.nextInt();
//3        double sum = num1+num2;
//        System.out.println("Sum of the numbers "+num1+"+"+num2+"="+sum);
        boolean b1 = vk.hasNextInt();
        System.out.println(b1);// gives true if input is an integer or else false
//        String str = vk.nextLine();//5
//        System.out.println(str);//.nextLine() gives all the input value where as .next() gives only
//        the 1st input
        
    }
}
