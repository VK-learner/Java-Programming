package com.company;
import java.util.*;
public class cwh_23_for_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Odd        Even");
        for (int i=0;i<=n;i++){
           // System.out.printf("%d. Vaibhav\n",i);
            System.out.print((i*2+1));
            System.out.print("        ");
            System.out.print((i*2)+"\n");
        }
    }
}
