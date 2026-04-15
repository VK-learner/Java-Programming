package com.company;
import java.util.Scanner;
public class cwh_19_ch4_ps {
    public static void main(String[] args) {
/*Q1.        int a = 11;
             if (a=11){  }  */
/*Q2. WA JP to find out whether a student is pass or fail. If it requires total 40% & at least 33% in each subject
to pass. Assume 3 subjects and take marks as an input from the user. */
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your marks of physics: ");
//        int m1 = sc.nextInt();
//        System.out.print("Enter your marks of mathematics: ");
//        int m2 = sc.nextInt();
//        System.out.print("Enter your marks of chemistry: ");
//        int m3 = sc.nextInt();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your over all percentage is "+avg+"%");
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congragulations you have been promoted");
//        }
//        else{
//            System.out.println("Sorry, you have not been promoted! Please try again.");
//        }
/*Q3. Calculate income tax paid by an employee to the govt as per the salary slabs mentioned below:
2.5L to 5L = 5% tax, 5L to 10L = 20% tax, above 10L = 30% tax.
// */
        Scanner vk = new Scanner(System.in);
//        float tax = 0;
//        System.out.print("Enter your Income in LPA : ");
//            float income = vk.nextFloat();
//            if (income<=2.5f){
//                tax = tax+0;
//            }
//            else if(income>2.5f && income<=5f){
//                tax = tax+0.05f*(income-2.5f);
//            }
//            else if(income>5f && income<=10f){
//                tax = tax+0.05f*(5f-2.5f);
//                tax = tax+0.2f*(income-5f);
//            }
//            else if(income>10f){
//                tax = tax+0.05f*(5f-2.5f);
//                tax = tax+0.2f*(10f-5f);
//                tax = tax+0.3f*(income-10f);
//            }
//            if(tax!=0){
//        System.out.printf("\nSir you have to pay %fL to the Government.",tax);}
//            else {
//                System.out.println("Sir you not need to pay any tax as your income is less than 2.5LPA");}
        /*Q.5 WA JP to find out the day of the week given the number [1 for Monday, 2 for Tuesday.....& 7 for Sunday]*/
//                Scanner ip = new Scanner(System.in);
//                int num = ip.nextInt();
//                switch(num){
//                    case 1 -> System.out.println("MONDAY");
//                    case 2 -> System.out.println("TUESDAY");
//                    case 3 -> System.out.println("WEDNESDAY");
//                    case 4 -> System.out.println("THURSDAY");
//                    case 5 -> System.out.println("FRIDAY");
//                    case 6 -> System.out.println("SATURDAY");
//                    case 7 -> System.out.println("SUNDAY");
/*Q6.WA JP to find out the type of website from the url'
 */               Scanner sc = new Scanner(System.in);
                  String website = sc.next();
                  if (website.endsWith(".org")){
                      System.out.println("This is an organizational website");
                  }
                  else if (website.endsWith(".com")){
                      System.out.println("This is an Commercial website");
                  }
                  else if (website.endsWith(".in")){
                      System.out.println("This is an Indian website");
                  }
    }
}//Q5. WA JP to find whether a year entered by the user is a leap year or not. (H.W)
