package com.company;

/*class "Employee" shows Error because same package can't contain 2 copies of same class name.
the "Employee" class was already created in "cwh_38_custom_class" in "com.company" pkg so it show Error.
*/
/*
Q1. Create a Class Employee with following properties & methods:
Salary(property)(int)
getSalary(method returning int)
name(property)(String)
getName(method returning String)
setName(method changing name)
Q2. Create a Class Cell-Phone with methods to print "ringing...", "vibrating...".
Q3. Create a Class Square with a method to initialize its side, calculating Area, Perimeter etc.
Q4. Create a Class Rectangle and repeat Q3.
Q5. Create a Class TommyVecetti for Rockstar Games capable of hitting (print hitting...), running, firing etc.
Q6. Repeat Q4 for a Circle.
 */
class Employee1{
    int salary;
    String name;
    int id;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return  name;
    }
    public void setName(String n){
        name = n;
    }
}
class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
}
class Square{
    int side;
    public void setSide(int n){
        side = n;
    }
    public int getArea(){
        return side*side;
    }
    public int getPerimeter(){
        return 4*side;
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the Enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the Enemy");
    }
}
public class cwh_39_ch8_ps {
    public static void main(String[] args){
/*Q1.
       Employee1 harry = new Employee1();
       harry.setName("CodeWithHarry");
        harry.salary = 12000;
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
        harry.name = "Vaibhav";
        System.out.println(harry.getName());
Q2.
        CellPhone asus = new CellPhone();
        asus.ring();
        asus.vibrate();
Q3
        Square sq = new Square();
        sq.setSide(10);
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());
Q5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
 */
    }
}
