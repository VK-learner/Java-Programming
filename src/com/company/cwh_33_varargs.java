package com.company;
//Variable Arguments
public class cwh_33_varargs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b, int c, int d){
//        return a+b+c+d;
//    }
    static int sum(int ...arr){//muj he jit ne bhi arguments miley hai un he ek array me pack kar ke do.
        // Available as int [] arr;
        int result = 0;
        for (int a:arr){
            result+=a;
        }
        return result;
    }
    static int SUM2(int x,int ...arr){
        int result = x;//here we made "x" cumpolsary. If no args is given it show error
        for (int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Welcome to varargs Tutorial");
        System.out.println("sum of 4 & 5 is: "+sum());
        System.out.println("sum of 4 & 5 is: "+sum(4,5));
        System.out.println("sum of 4,5 & 3 is: "+sum(4,5,3));
        System.out.println("sum of 4,5,3 & 2 is: "+sum(4,5,3,2));
        System.out.println("sum of 4,5,3 & 2 is: "+sum(4,5,3,4,33,5,6,7,9));
        System.out.println("sum of 4 & 5 is: "+SUM2(2,6,2));
    }
}
