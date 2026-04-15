package com.company;
public class cwh_17_logical {//Logical AND &&, Logical OR ||, Logical NOT !
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        if (a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        if (a || b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("For Logical NOT");
        System.out.print("NOT(a) is ");
        System.out.println(!a);
        System.out.print("NOT(b) is ");
        System.out.println(!b);
    }
}
