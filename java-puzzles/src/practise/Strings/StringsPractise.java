package practise.Strings;

public class StringsPractise {
    public static void main(String[] args) {

        // print screen
        System.out.println("Hello World String");

        String val1 = "hello";

        System.out.println(val1);  //hello

        System.out.println(val1.length());  // 5  -  h-0 , e-1, l-2, l-3, o-4

        val1 = "Hello     ";
        System.out.println(val1.length()); //10 

        val1 = "ABCDEFG";
        System.out.println(val1.length()); //7

        System.out.println(val1.substring(6)); // G

        System.out.println(val1.substring(7)); //null

        System.out.println(val1.substring(0,2)); //AB

        System.out.println(val1.substring(1,3)); //BC

        System.out.println(val1.substring(3, 6));  //DEF

        System.out.println(val1.substring(3, 7));  //DEFG


        // if loop 

        if(val1.length() == 5){
            System.out.println("length is 5");
        } else if (val1.length() >=5 ) {
            System.out.println("Length is greater than 5");
        } else if(val1.length() <= 5){
            System.out.println("length is less than 5");
        } else {
            System.out.println("undefined");
        }
        
    }
}
