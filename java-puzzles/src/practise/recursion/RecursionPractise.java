package practise.recursion;

public class RecursionPractise {
    public static void main(String[] args) {
        
        // recursion methods needs a base case to prevent infinite loop
        
        printHello(0);
        System.out.println("Print Number");
        printNumber(5);
    }

    private static int printNumber(int i) {
        if(i == 0){
            return 0;
        } else {
            System.out.println(i);
            return printNumber(i-1);            
        }
    }

    private static void printHello(int i) {
        System.out.println("Print Hello"); 
        System.out.println("pre "+i);
        i++;
        if(i < 5) {
            System.out.println("pre 1 "+i);
            printHello(i);
            System.out.println("pre 2 "+i);

        }
        
    }

    /*
     * Output :
     *  Print Hello
        pre 0
        pre 1 1
        Print Hello
        pre 1
        pre 1 2
        Print Hello
        pre 2
        pre 1 3
        Print Hello
        pre 3
        pre 1 4
        Print Hello
        pre 4
        pre 2 4
        pre 2 3
        pre 2 2
        pre 2 1
     */
}
