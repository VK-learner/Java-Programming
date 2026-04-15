package com.company;
//String methods operate on JAVA Strings. They can be used to find length of the string, convert to lower case etc.
//But existing String's can't be changed because Strings are immutable.
public class cwh_14_string_methods {
    public static void main(String[] args){
        String name = "Vaibhav";
        int value = name.length();
//1. length(): returns the length of the string name.
        System.out.println(value);

//2. toLowerCase(): returns a new string which has all the lower case characters from the String name.
        String lstring = name.toLowerCase();//name = "Vaibhav"
        System.out.println(lstring);

//3. toUpperCase(): returns a new string which has all the upper case characters from the String name.
        String ustring = name.toUpperCase();//name = "Vaibhav"
        System.out.println(ustring);

        String nonTrimmedString = "        Vaibhav        ";
        System.out.println(nonTrimmedString);
//4. trim(): returns a new string after removing all the leading and trailing spaces from the original string.
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        String name2 = "Vaibhav Y Kulkarni ";
//5.returns a substring from start to the end.
        System.out.println(name2.substring(5));

//6. substring() returns a substring from start to the end. Start index is included but end index is excluded.
        System.out.println(name2.substring(5,12));

//7. replace(): returns a new string after replacing 'V' with 'Z'. Zaibhav is returned in this case.
        System.out.println(name.replace('V','Z'));//name = "Vaibhav"

        System.out.println(name2.replace("Kulkarni","Joshi"));
        System.out.println(name2.replace("a","GOAT"));//replace the target string by replacement.

//8. startsWith(): returns True if name starts with String "Vai".
        System.out.println(name.startsWith("Vai"));//name = "Vaibhav"

//9. endsWith(): returns True if name ends with String "av".
        System.out.println(name.endsWith("av"));//name = "Vaibhav"

//10.charAt(): returns character at a given index position.
        System.out.println(name.charAt(2));//name = "Vaibhav"

//11. indexOf(): returns the index of the given String.
        System.out.println(name.indexOf("i"));//name = "Vaibhav"

//12. indexOf("EF",8): returns the index of the given String. Starting from the index 8(int). -1 is returned in this case.
        String name3 = "ABCDEFGEFG";//it finds the index of "EF" starting from the index 3 and returns index value.
        System.out.println(name3.indexOf("EF",8));//It the string is not in range it returns -1.
        System.out.println(name3.indexOf("EF",5));

//13. lastIndexOf(): Returns the last index of the given String.
        System.out.println(name3.lastIndexOf("E"));//it searches from last index.
//14.
        System.out.println(name3.lastIndexOf("E",5));

//15. equals("Vaibhav"): Returns True if the given string is equal to "Vaibhav", False otherwise.
        System.out.println(name.equals("Vaibhav"));//name = "Vaibhav"
        System.out.println(name.equalsIgnoreCase("VaIbhaV"));

//Escape Sequence Characters ex:- \n, \t, \', \\, etc...
        System.out.println("My name is\n Vaibhav. Y.\t Kulkarni \"I am studying in \\PDA College of Engineering.");
    }
}
