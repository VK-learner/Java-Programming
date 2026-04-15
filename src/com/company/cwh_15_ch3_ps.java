package com.company;
public class cwh_15_ch3_ps {
    public static void main(String[] args){

        //Q1.
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        //Q2.
        String text = "To Lower    Case";
        text = text.replace(" ","_");
        System.out.println(text);

        //Q3. WA JP to fill in a letter template which looks like, letter = "Dear <|name|>, Thanks a lot"
        String letter = "Dear <|name|>, Thanks a lot!";// to avoid accidental replace we use "<|name|>".
        letter.replace("<|name|>","Harry");
        System.out.println(letter);//op:-"Dear <|name|>, Thanks a lot", because in this "letter ko sirf chalaya hai assign nahi kiya"
        letter = letter.replace("<|name|>","Harry");
        System.out.println(letter);//op:-Dear Harry, Thanks a lot!

        //Q4. WA JP to detect double and triple spaces in a string.
        String myString = "This string contains  double and triple spaces";
        System.out.println(myString.indexOf("   "));//triple space is not there so op is -1.
        System.out.println(myString.indexOf("  "));//double space is at index 20.

        //Q5. WA JP to format the following letter using escape sequence characters.
        String myLetter = "Dear Harry,\n\tThis JAVA course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}
