
public class App {
    public static void main(String[] args) throws Exception {
       
          /* 
       1.Method is simply a collection of instructions and an absolute build block of java
       2. Class is the container of fields/attributes and methods.
       3. main method is the starting point of the java
       */ 

       System.out.println("Hello, World!");

       String myVar = "Good day 123";

       System.out.println(myVar);

       myVar = "";
       
       System.out.println(myVar);


       printHello();
       printHello();
    }

    static void printHello(){
        System.out.println("Hello from static method");
    }
}
