public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /*
         *  Methods do all the work. when we hit run , compiler looks for the main method.
         *  There are 2 memory locations reserved for the java app , stack and heap.
         *   
         *        - when we hit run, main method is called ,and a space will be allocated in stack.
         *        - all the variables inside the main method is local variables to main and once assingend values, have created space inside main area stack.
         *        - if any method m1 is invocated inside main , another space is allocaed to that method in stack.
         *        - local area variables of the same method will be present in the same area.
         *        - if any other method m2 called inside m1, the same scenario will occur.
         *        - if m2 is executed fully and app flow goes to m1 ,space given for m2 in stack is cleared out.
         *        - if m1 is executed fully and app flow goes to main ,space given for m1 in stack is cleared out.
         *        - purpose of the stack area is to maintain method invocation.
         *        - when an object instance is created in main, the variable is called reference variable and it'll be in stack.
         *        - the value of the reference variable, object will be in heap and it's referenced.
         *        - when the corresponding method call is completed, referencing to the object is cut off and it'll get cleansed by garbage collector.
         *        - if the object has it's own variables , that are called instance variables and will be present inside the object.
         *        - if the instance variables is of reference type, the underlying object is created in heap and referenced accordingly.
         */
    }
}
