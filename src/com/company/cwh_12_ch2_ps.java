package com.company;
import java.util.*;
public class cwh_12_ch2_ps {
        public static void main(String[] args){
// Q1. What will be the result of the following expression. A= 7/4*9/2
            float A = 7/4.0f*9/2.0f;
            System.out.println(A);
//Q2. WA JP to encrypt a Grade by adding 8. Decrypt it to show the  correct grade.
            char grade = 'B';
            grade = (char)(grade +10) ;// Type casting
            System.out.println(grade);
            // Decrypting the grade
            grade = (char)(grade-10);
            System.out.println(grade);
//Q3. Use  comparison operators to find out whether a given number is greater than the user entered number or not.
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            System.out.println(b>8);// returns True if b>8 else False
//Q4. Write the following expression in a JAVA program: (v^2-u^2)/(2as)
            int v=4,a=2,u=2,s=1;
            System.out.println((v*v-u*u)/(2*a*s));
        }
}
