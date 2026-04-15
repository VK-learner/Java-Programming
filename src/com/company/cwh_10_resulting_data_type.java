package com.company;
public class
cwh_10_resulting_data_type {
    public static void main(String[] args){
        /* Resulting data type after arithmetic operation are
        * byte+short=int, short+int=int, long+float=float, int+float=float,
        * char+int=int, char+short=int, long+double=double, float+double=double */
        //Increment and Decrement operators
        int i =56;
        int j =99;
        System.out.println(i++);// output 56 bcoz it 1st takes i=56 then it adds 1 to it i.e i=56+1
        System.out.println(i);// output 57
        System.out.println(++j);// it will 1st add 1 to j i.e j=99+1
        System.out.println(j);
        int y = 7;
        System.out.println(++y *8);//++ has more precedence then * so 8*8 = 64.
        char ch = 'A';
        System.out.println(ch++);//A
        System.out.println(ch);//B
        System.out.println(++ch);//C
    }
}
// a++ = 1st use the value and then increment it.
// ++a = 1st increment the value and then use it.