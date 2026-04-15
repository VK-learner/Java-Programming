package com.company;
public class cwh_4_Literals {
    public static void main(String[] args){
        //A constant value which can be assigned to the variable is called as a Literal
        //Primitive Data Types 4 types
        // Integral[byte,short,int,long],
        // Floats[float,double],
        // Char[''],
        // Boolean[true,false]

        byte age = 34;
        int age2 = 56;// we can also write as 56I
        long ageDino = 566666666666666L;// it is a Long literal
        char ch = 'A';
        float f1 = 5.6f;// we used f because by default it is of double type so we use (f or F) to convert it to float
        double d1 = 4.66D;
        boolean a = true;
        String name = "Vaibhav";
        System.out.println(age);
        System.out.println(age2);
        System.out.println(ageDino);
        System.out.println(ch);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(a);
        System.out.println(name);
    }// Keywords: words which are reserved and used by the JAVA compiler. They cannot be used as an identifier.
    // ex default,abstract,byte,continue,for etc
}
