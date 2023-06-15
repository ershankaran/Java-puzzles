package practise.recursion;

public class RecursionPractise2 {
    public static void main(String[] args) {
        //write a method to append $ to each character of a string. zebra - z$e$b$r$a$
        StringBuilder str = new StringBuilder("zebra");
        append$Char(str);
        // System.out.println(str);
        // str.setCharAt(3, '3'); 
        // System.out.println(str);

        System.out.println(allDollarSign("hello")); //h$e$l$l$o

    }

    // Recursive method
    private static String allDollarSign(String str) {  
        
        if(str.length() <= 1){
            return str;
        }

        return str.charAt(0)+"$"+allDollarSign(str.substring(1));
    }

    //Non Recursive method
    private static void append$Char(StringBuilder str) {
        int a = 0;
        String str2="";   
        while(a < str.length()){
            str2=str2.concat(str.charAt(a)+"$");
            a++;
        }
        System.out.println(str2);
    }
}
