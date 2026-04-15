package com.company;
/*
void : When we don't want to return anything then we use void as the return type.

static keyword : static keyword is used to associate a method of a given class with that class itself
rather than the object.
Static Method in a class is shared by all the objects.
If Static is not used for method then we have to create an object of the class then we have to call that method to use it.
 */
/*when We make a static method in a class then that method will be accessible
 to all its objects. And we not need to call that method from the class's object.
I can directly access the telljoke() method because static keyword is used.
if we make a method without static keyword then I have to call it using object of that class.*/
//public class cwh_32_method_overloading {
//
//    static  void change(int a){
//        a = 98;
//    }
//    static void change2(int[] arr){
//        arr[0] = 98;
//    }
//
//    static void telljoke(){
//        System.out.println("I invented a new world!\n" +
//                "Plagirism!");
//    }
//
//    //A programs execution starts from main method hence we declare a main method.
//    public static void main(String[] args){
//       // telljoke();
//
//        //Case 1: Changing the integer
////        int x = 45;
////        change(x);
////        System.out.println("The value of x after running change is "+x);// op: 45
////in this case 1 integer copy is passed to change() method. so output in main remains same i.e. 45.
//
//        //Case 2: Changing the Array
//        int [] marks = {52,73,77,89,98,94};
//        change2(marks);
//        System.out.println("The value of x after running change is "+marks[0]);// op: 98
//        /*jab bhi hm int marks[]={}; bana te hai tab ek "array object" ban ta hai i.e. "{52,73,77,89,98,94}"
//        aur marks ek "Reference" hai. That means marks only stores the address of the "object array".
//        so when I write "change2(marks);" this means I am passing my Array obj Reference or its Address
//         to my method "change2()" then arr[0]=98;  will chang the main method value i.e. 98.
//in case 2 reference copy is passed to change2() method. Hence op changes to 98.   */
//    }
//}
//note: in case of Arrays, the ref is passed same is the case for obj passing to methods.

    //Method overloading
    //2 or more methods can have same name but different parameters such methods are called Overloaded methods.
public class cwh_32_method_overloading {
    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a+" Bro!");
    }
//    static double foo(int a){// note:Method overloading cannot be performed by changing the return type of methods.
//        System.out.println("Good Morning "+a+" Bro!");//Error
//    }
    static void foo(int a, int b){// a & b are parameters
        System.out.println("Good Morning "+a+" Bro!");
        System.out.println("Good Morning "+b+" Bro!");
    }
    public static void main(String[] args){
        foo();//note: Arguments are actual values
        foo(2000);//2000 is arguments
        foo(2025,2026);// 2025 & 2026 are arguments
    }
}
//Note: