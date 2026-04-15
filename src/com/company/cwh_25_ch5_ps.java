package com.company;

public class cwh_25_ch5_ps {
    public static void main(String[] args){
//Q1. WA PJ to print the following pattern.
//        for (int i=0;i<4;i++){
//            for (int j=4;j>i;j--){
//            System.out.print("* ");}
//            System.out.println();
//        }
//Q2. WA JP to sum first n even numbers using while loop.
//     int sum = 0;
//     int n = 5;
//     for (int i=0;i<n;i++) {
//     sum = sum +2*i;//0,2,4,6,8 ---> sum = 20
//     }
//     System.out.printf("Sum of first %d Even no's is :%d",n,sum);
//Q3. WA JP to print multiplication table of a given number n.
//        int n = 13;
//        for (int i=0;i<=10;i++) {
//            //System.out.println(n+" x "+i+" = "+(n*i));
//            System.out.printf("%d x %d = %d\n",n,i,n*i);
//        }
//Q4. WA PJ to print the multiplication table of 10 in reverse order.
//        int n = 10;
//        for (int i=10;i>=1;i--){
//            System.out.printf("%d x %d = %d\n",n,i,n*i);
//        }
//Q5. WA JP to find the factorial of a given number using for loops.
//        int n = 5, fact = 1;
//        for (int i=1;i<=n;i++){
//            fact*=i;
//        }
//        System.out.println(fact);
//        int i = 1;// Q6. Repeat Q5 using while loop.
//        while (i <=n){
//            fact *= i;
//            i++;
//        }
//        System.out.println(fact);
//Q7. Repeat 1 using for/while loop.
//Q8. What can be done using 1 type of loop can also be done using the other 2 types of loops, T or F ? --> True.
//Q9. WA JP to calculate the sum of numbers occurring in the multiplication table of 8
        int n=8,i=1,sum=0;
        while(i<=10){
            sum+=(n*i);
            i++;
        }
        System.out.println(sum);
//Q10. A "do while" loop is executed ---> At least once if condition is False.
//Q11. Repeat Q2 using "for loop".
    }
}

/*
int i=0,even=0,odd=0;
     while(i<=10){
         if (i%2==0){
             even+=i;
         }
         else{
             odd+=i;
         }
         i++;
     }
        System.out.println(even);
        System.out.println(odd);
 */