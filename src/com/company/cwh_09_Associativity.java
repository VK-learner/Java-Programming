package com.company;
//in JAVA BODMAS is not used instead we use ASSOCIATIVITY which depends on PRECEDENCE.
//PRECEDENCE means big one evaluates 1st i.e( * is bigger than - so it evaluates 1st.)
//in a given numerical if 2 or more operators are having same PRECEDENCE then we follow ASSOCIATIVITY
//The operators are applied and evaluated based on precedence.
//For example (+,-) has less precedence compared to (*,/). Hence * & / are evaluated 1st.
//In case if we want to change this order we can use parenthesis.
//ASSOCIATIVITY tells the direction of execution of operators. It can either be L to R or R to L
//public class cwh_09_Associativity {
//    public static void main (String[] args) {
//        // PRECEDENCE & ASSOCIATIVITY
//        int a = 6 * 5 - 34 / 2;// 30-34/2 => 30-17 = 13
//        System.out.println(a);
//    /*
//    highest PRECEDENCE goes to * & /. They are then evaluated on the basis of Left to Right ASSOCIATIVITY.
//     */
//        int b = 60 / 5 - 34 * 2;// 12-34*2 => 12-68 = -56
//        System.out.println(b);
//        System.out.println(12-4*2%3/7f);// 12-8%3/7 => 12-2/7 => 12-0.2857 = 11.714286
//    }
//}
public class cwh_09_Associativity {
    public static void main (String[] args) {
    int x=10,y=6 ;//(x-y)/2
        int q1 = (x-y)/2;
        System.out.println(q1);
        int b=10,a=2,c=5;
        float q2 =(b*b-4*a*c)/(2*a);// (b*b -4*a*c)/(2*a);
        System.out.println(q2);
    }
}
