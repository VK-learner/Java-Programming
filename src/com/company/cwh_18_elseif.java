package com.company;
//import java.util.*;
//public class cwh_18_elseif {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();

import java.util.Scanner;

///*instead of using multiple if statements,
//we can also use else-if along with if thus forming an if-else-if-else ladder.*/
//        if (age>56){
//            System.out.println("You are experienced");
//        }
//        else if (age>46){
//            System.out.println("You are semi-experienced");
//        }
//        else if (age>36){
//            System.out.println("You are semi-semi-experienced");
//        }
//        else{
//            System.out.println("You are not experienced");
//        }
//        if (age>2){
//            System.out.println("u r not a baby");
//        }
//    }
//}

public class cwh_18_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
      String text = "Hello, Java!";//1️.getClass() Method (For Objects)
          System.out.println(text.getClass().getSimpleName()); // Output: String
          if (text instanceof String) {//2️.instanceof Operator (For Type Checking)
              System.out.println("It's a String!");
          }
          int num = 42;//3️.Checking Primitives (Using Wrapper Classes)
          System.out.println(((Object) num).getClass().getSimpleName()); // Output: Integer
        switch (age) {
            case 18:
                System.out.println("You are going to become an Adult!");
                break;
            case 23:
                System.out.println("You are going to find a job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life.");
        }
        System.out.println("Thanks for using my JAVA code!");
    }
}

//
//public class cwh_18_elseif {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = new String("Vaibhav");
////        String text = "Hello, Java!";//1️.getClass() Method (For Objects)
////        System.out.println(text.getClass().getSimpleName()); // Output: String
////        if (text instanceof String) {//2️.instanceof Operator (For Type Checking)
////            System.out.println("It's a String!");
////        }
////        int num = 42;//3️.Checking Primitives (Using Wrapper Classes)
////        System.out.println(((Object) num).getClass().getSimpleName()); // Output: Integer
//        switch (str) {//Enhanced Switch is very usse ful because here break statement is not required.
//            case "Vaibhav" -> {
//                System.out.println("You are going to become an Adult!");
//                System.out.println("You are going to become an Adult!");
//                System.out.println("You are going to become an Adult!");
//            }
//            case "Shubham" -> System.out.println("You are going to find a job!");
//            case "Sharan" -> System.out.println("You are going to get retired!");
//            default -> System.out.println("Enjoy your life.");
//        }
//        System.out.println("Thanks for using my JAVA code!");
//    }
//}
