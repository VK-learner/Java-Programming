package com.company;

public class cwh_24_break_and_continue {
    public static void main(String[] args){
        //Break and continue using loops
//        for (int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("JAVA is great");
//            if (i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
/*---------------------------------------------------------------------------------------------------------------*/
//        for (int i=0;i<10;i++){
//            if (i==2){//until i==2 it gets ignored. when i==2 then "continue" skips the i==2 iteration i.e 0,1,_,3,4,...9
//                System.out.println("Ending the loop");//op:- 0,1,3,4,...9
//                continue;//it says ye iteration ko skip karo and go to next iteration.
//            }//or it says that ignore the next line go to the next iteration.
//            System.out.println(i);
//            System.out.println("JAVA is great");
//        }
/*----------------------------------------------------------------------------------------------------------------*/
//        do {
//            System.out.println("JAVA is great");
//            if (i == 2) {
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }while(i<5);
/*---------------------------------------------------------------------------------------------------------------*/
      int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("JAVA is great");
        }while(i<5);

    }
}


//---------------------------------------------------------------------------------------------------------------
//           int i = 0;
//           while(i<5){
//               System.out.println("JAVA is great");
//               if (i==2){
//                   System.out.println("Ending the loop");
//                   break;
//               }
//               i++;
//        }
//        int i = 0;
