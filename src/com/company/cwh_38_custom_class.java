package com.company;
//public class Employee // Error because 1 JAVA file can contain only 1 public Class.

class Employee{
    int id;//Attributes
    String name;//Attributes
    int salary;

    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+name);
    }

    public int getSalary(){
        return salary;
    }
}
public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee harry = new Employee();//Instantiating a new Employee Object.
        Employee john = new Employee();

        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 34000;
        harry.name = "CodeWithHarry";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 18000;
        john.name = "John Khandelwal";
        //Printing the Attributes
        //System.out.println(harry.id);
        //System.out.println(harry.name);

        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}
/*
Any real world Object = Properties + Behaviour.
       Object in OOPs = Attributes + Methods.
 */