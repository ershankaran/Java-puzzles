package practise.Loops;

public class LoopsPractise2 {

    public static void main(String[] args) {
        // for Loops

        // for(int i = 0; i<100;i++){
        // System.out.println(i);
        // }

        String str = "Strength is life";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("reverse print");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }

        // print all the even numbers between 0 and 100 inclusive
        System.out.println("\n\n\nprint all the even numbers between 0 and 100 inclusive \n\n\n");
        // for(int i = 0; i<=100;i++){
        //     if(i%2 == 0){
        //         System.out.println(i);
        //     }
        // }
        for(int i= 0 ; i<=100;i=i+2){
            System.out.println(i);
        }

    }
}
