package com.company;
//public class cwh_13_ch3_strings {
//    public static void main(String [] args){
//String is a class in JAVA  it is not a primitive Data Type
// but there is a special support of String in JAVA so we can use it as a Primitive Data Type.
//String is a class but it can be used as a Data Type.
//            String name = new String("Vaibhav Kulkarni");//String Declaration.
//            System.out.println(name);
//            String name2 = "CODE with HARRY";// we can also declare a String like this.
//            System.out.println(name2);
//    }
//}// Strings are immutable.
    import java.util.*;
public class cwh_13_ch3_strings {
    public static void main(String[] args) {
        String name = new String("Vaibhav Kulkarni");//'new String()' is redundant. It is not used just for knowledge.
        String name2 = "Vishal";
        System.out.print("The name is : ");
        System.out.println(name);
        System.out.printf("Hello %s how are you.\nWhat is your brother %s is doing right now ?",name,name2);
        float a=6, b=5.6454f;//System.out.printf(); is used for decimal %d, float %f, char %c, String %s
        System.out.printf("\nThe value of a is %8.2f and the value of b is %.2f",a,b);
        System.out.format("\nThe value of a is %10f and the value of b is %4.1f",a,b);
        //System.out.format();==System.out.printf();
        Scanner vk = new Scanner(System.in);
        String st1 = vk.next();
        String st2 = vk.nextLine();
        System.out.format("st1 is %s and st2 is %s",st1,st2);
    }
}