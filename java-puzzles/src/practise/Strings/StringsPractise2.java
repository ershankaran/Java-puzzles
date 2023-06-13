package practise.Strings;

import java.util.Scanner;

public class StringsPractise2 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter age of Mike:");

        int mikesAge = kb.nextInt();
        System.out.println("Enter age of Bob:");

        int bobsAge = kb.nextInt();

        if (mikesAge == bobsAge) {
            System.out.println("Mike and Bob are of same age");
        } else if (mikesAge > bobsAge) {
            System.out.println("Mike is older than Bob");
        } else {
            System.out.println("Mike is younger than Bob");
        }

        String val1 = "hello";
        String val2 = "there";

        // if(val1 == "hello"){ it's a trap as string is not a primitive, it's an object
        if (val1.equals("hello")) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }

        if (val2.equalsIgnoreCase("THERE")) {
            System.err.println("correct 2");
        }
        
        System.out.println(val1.charAt(2)); // l

        // System.out.println(val2.charAt(-1)); java.lang.StringIndexOutOfBoundsException: String index out of range: -1

        char valC1 = val1.charAt(1);

        System.out.println(valC1); // e

        String str1 = "Hello there yogi there";

        System.out.println(str1.indexOf("there")); //6

        System.out.println(str1.indexOf("there",7)); //17

        System.out.println(str1.indexOf("there",6)); //6

        System.out.println(str1.lastIndexOf("yogi")); // 12

        str1 = "Hello there yogi there yogi";


        System.out.println(str1.indexOf("yogi")); // 12
        System.out.println(str1.lastIndexOf("yogi")); //23






        kb.close();
    }
}
