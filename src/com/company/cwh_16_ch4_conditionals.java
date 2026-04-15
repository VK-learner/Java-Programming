package com.company;
import java.util.*;
public class cwh_16_ch4_conditionals {
    public static void main(String[] args){
        //Decisions making functions in JAVA are : 1) If-Else Statements 2) Switch statements.
       Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean cond = (age>=18);
        if (cond){
            System.out.println("Yes boy you can drive!");
        }
        else {
            System.out.println("No boy you can\'t drive yet!");
        }
    }
}
