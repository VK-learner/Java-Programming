package com.company;
/*
Sometimes our program grows in size, and we want to separate the logic of main method to other methods.
We use methods to avoid repeating the Logic i.e. DRY Run = Don't Repeat Yourself.
A method is a function written inside a class. Since JAVA is an Object-Oriented Language,
we need to write the method inside same class.
// */
//public class cwh_31_ch7_methods {
//    static int logic(int x, int y){// x=a & y=b. Here (a,b) values get copied. i.e x=5 & y=7.
//        int z;
//        if (x>y){
//            z = (x+y);
//        }
//        else {
//            z = (x+y)*5;
//        }
//        return z;//laut chalo z ke sath jaha se tum aaye ho means
//        // it goes to the location from where it has been called i.e. to c.
//    }
//    public static void main(String[] args){
//        int a = 5;
//        int b = 7;
//        int c;
//        c = logic(a,b);//it means values of a & b gets copied into logic(int x, int y) i.e. x=a & y=b. c = 60
//
//        int a1 = 2;
//        int b1 = 1;
//        int c1 ;
//        c1 = logic(a1,b1);// c1 = 3
//        System.out.println(c);// op:60
//        System.out.println(c1);// op:3
//    }
//}
/*
Note: In the above eg we have directly used the method in our main method i.e. c = logic(a,b); & c1 = logic(a1,b1);
The values from the method call(a and b) i.e. "c = logic(a,b)"
are copied to the a & b of the function "static int logic(int x, int y)"
Thus even if we modify the values a & b inside the method "static int logic(int x, int y)",
The values in the main method i.e. "static int logic(int x, int y)" will not change.
 */
/*
A method can be called by creating an object of the class in which the method exists followed by the method call.
When we use static keyword for a method then that method not gets associated with the object of that class.
It gets associated with that class only.
If our method uses static keyword we can directly use it
else we have to create an object of that class and then call the method.
example: if we not use static then we can't use that method directly.
To use it we have to create an object of that class then we have to call that method.
Note: Only a static method
 */

public class cwh_31_ch7_methods {
     int logic(int x, int y){// static is not used so we have to create an object for its class.
         //Every object has a copy of the class.
        int z;
        if (x>y){
            z = (x+y);
        }
        else {
            z = (x+y)*5;
        }
        x = 566;//even if the values of parameters of method are changed or x & y value changed
        y = 100; // then also a & b values remain as it is.
        return z;
    }
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c;
        //Method Invocation using Object creation.
        cwh_31_ch7_methods obj1 = new cwh_31_ch7_methods();
        c = obj1.logic(a,b);
        System.out.println(a+" "+b);//values of x,y changed to x=566 & y=100 then also values of main method
        // i.e a=5 & b=7 remains as it is.
        int a1 = 2;
        int b1 = 1;
        int c1 ;
        cwh_31_ch7_methods obj2 = new cwh_31_ch7_methods();
        c1 = obj2.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
