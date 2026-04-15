package com.company;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class cwh_20_Random {
    public static <IntStream> void main(String[] args){
        Random n = new Random();
        float num1 = n.nextFloat(1,10);
        System.out.println(num1);
        DoubleStream num2 = n.doubles();
        System.out.println(num2);
        IntStream num3 = (IntStream) n.ints();
        System.out.println(num3);
        LongStream num4 = (LongStream) n.longs();
        System.out.println(num4);
    }
}
