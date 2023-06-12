
public class App {
    public static void main(String[] args) throws Exception {
       
          /* 
       1.Method is simply a collection of instructions and an absolute build block of java
       2. Class is the container of fields/attributes and methods.
       3. main method is the starting point of the java
       4. void dont return any value
       */ 

       System.out.println("Hello, World!");

       String myVar = "Good day 123";

       System.out.println(myVar);

       myVar = "";
       
       System.out.println(myVar);

       myVar = "100";

       System.out.println(myVar);

       int myNum = 100;

       System.out.println(myNum);


       printHello();
       printHello();

       sumThese(myNum,myNum);

       System.out.println(sumThese2(24, 45));

       sumthese3(23,45.67);
    }

    private static void sumthese3(int i, double d) {
        System.out.println(i+d);
    }

    static void printHello(){
        System.out.println("Hello from static method");
    }

    static void sumThese(int a1, int a2) {
        System.out.println(a1+a2);
    }

    static int sumThese2(int a1, int a2) {
      return a1 + a2;
    }
}
