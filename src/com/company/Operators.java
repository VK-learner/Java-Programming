package com.company;
public class Operators {
    public static void main(String[] args){
        int a = 10;//1.Assaignment operator =,+=,*=,-=,/=,%=
        int b =20;
        a +=b;//2.Arithmetic operator  +,-,*,/,%,++,--
        b*=15;
        System.out.println(4.4%1.2);//the % also returns the remainder of decimal values.
        System.out.println("a="+a);
        System.out.println(b);//3.Comparison operator ==,<=,>=,!=
        System.out.println(68<89 || 100<90);
        System.out.println(68<89 && 100<90);//4.Logical operators &&,||,!
        System.out.println(3&6);//5.Bitwise operator &,|
        System.out.println(5|6);//0101 | 0110 = 0111
    }
}// "Precedence" in JAVA calculation not Follow BODMAS instead it follows Precedence & Associativity
//Which means highest precedence operator is executed 1st if both are of equal then we begin from left to right
//*,/ L to R
//+,- L to R
//except ++,= R to L