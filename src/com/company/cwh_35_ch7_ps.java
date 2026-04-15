package com.company;

//public class cwh_35_ch7_ps{
/*Q1. WA JP to print multiplication table of n.*/
//static void multiplication(int n){
//    for (int i=1;i<=10;i++){
//    System.out.format("%d x %d = %d\n",n,i,n*i);
//    }
//}
//    public static void main(String[] args) {
//    multiplication(9);
//    }
//}

//public class cwh_35_ch7_ps{
/*Q2. WA JP using fns to print the following pattern.*/
//    static void pattern(int n) {
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<i+1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        pattern(5);
//    }
//}

//public class cwh_35_ch7_ps{
/*Q3. WA recursive fn to calculate sum of 1st n natural no's.
      sum(n) = 1 + 2 + 3 +.... + n
      sum(n) = 1 + 2 + 3 +.... + n-1 + n
      sum(n) = sum(n-1) + n
      sum(3) = 3 +sum(2) => sum(3) = 3 + 2 +sum(1) => /sum(3) = 3 + 2 + 1 */
//    static int sumRec(int n) {
//        //Base Condition
//        if (n==1){
//            return  1;
//        }
//         return n+sumRec(n-1);
//    }
//    public static void main(String[] args) {
//       int c = sumRec(10);
//        System.out.println(c);
//    }
//}

//public class cwh_35_ch7_ps {
/*Q4. WA JP to print the following pattern.*/
//    static void pattern1(int n){
//        for (int i=0; i<n; i++){
//            for (int j=n; j>i; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        pattern1(5);
//    }
//}

//public class cwh_35_ch7_ps {
/*Q5. WA fn to print the nth term of a fibonacci series using recursion.
    0,1,1,2,3,5,8,13,....*/
//    public static int fib(int n){
//        /*if (n==1){
//            return 0;
//        }
//        else if (n==2){
//            return 1;
//        }*/
//        if (n==1 || n==2){
//            return n-1;
//        }
//        else {
//            return fib(n-1) + fib(n -2);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fib(7));
//    }
//}
//public class cwh_35_ch7_ps {
//    /* Q6. Write a fn to find avg of a set of no's passed as arguments using varargs */
//    public static double average(int ...arr){
//        int sum = 0;
//        for (int element : arr) {
//            sum += element;
//        }
//        return arr.length > 0 ? (double) sum / arr.length : 0; // Avoid division by zero
//    }
//    public static void main(String[] args) {
//        double avg = average(5, 3, 4, 8);
//        System.out.println("Average: " + avg);
//    }
//}
/*Q7. Repeat Q4 using recursion*/

public class cwh_35_ch7_ps{
/*Q8. Repeat Q2 using recursion*/
    static void pattern1_rec(int n) {
      if (n>0){
          pattern1_rec(n-1);
          for (int i=0;i<n;i++){
              System.out.print("*");
          }
          System.out.println();
      }
    }
    public static void main(String[] args) {
        pattern1_rec(5);
    }
}
/*
Q9. Write a fn to convert celsius temperature into Fahrenheit.
Q10. Repeat Q3 using iterative approach.
 */
