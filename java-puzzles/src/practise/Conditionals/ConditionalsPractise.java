package practise.Conditionals;

public class ConditionalsPractise {

    public static void main(String[] args) {

        // boolean isHungry = false;
        boolean isHungry = 3 < 5 ;
        // boolean check = 7 < 4 ;
        // if(isHungry){
        // if((check)) {
        //     System.out.println("pigout!");
        // } else if (isHungry == false){
        //     System.out.println("No pigout");
        // } else {
        //     System.out.println("OOO");  // picked up 
        // }

        System.out.println(4<2); // false

         if(getValue()) {
            System.out.println("pigout!");
        } else if (isHungry == false){
            System.out.println("No pigout");
        } else {
            System.out.println("OOO");  // picked up 
        }

          System.out.println( "is there a barking trouble ? "+ dogTrouble(true, 0)); // is there a barking trouble ? true

          System.out.println( "is there a barking trouble ? "+ dogTrouble(true, 9)); // is there a barking trouble ? false
    }

    private static boolean dogTrouble(boolean isBarking, int hour) {
        return isBarking && ((hour < 7) || (hour > 20));
    }

    public static boolean getValue(){
        // return false;
        // return (7<3) ;
        // return (7<3) || (5 > 2); // true
        // return (7<3) && (5 > 2); // false
        return (1<3) && ((5>3) || (7 < 1)); //true
    }


    
}
