package com.company;
//Recursion: A fn in JAVA can call itself. Such calling of fn by itself is called "Recursion".
//Ex: Factorial of a number
// factorial(n) = n*factorial(n-1) for all n>=1.
//factorial(0) = 1
//factorial(n) = n * (n-1) * (n-2) *......1
//factorial(n) = n * factorial(n-1)
//public class cwh_34_recursion {
//    static  int factorial(int n){
//        if (n==0 || n==1){
//            return 1;
//        }
//        else {
//            return n*factorial(n-1);
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("The value of factorial n is : "+factorial(5));
//    }
//}
public class cwh_34_recursion {
    static int factorial_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1;i<=n;i++){
                product*=i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        System.out.println("The value of factorial n is : "+factorial_iterative(6));
    }
}