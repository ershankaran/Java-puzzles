package practise.Loops;

public class LoopsPractise {

    public static void main(String[] args) {

        int i = 0;

        // infinite Loops
        // while(true){
        // i++;
        // System.out.println(i);
        // }

        // while( i <= 100) {
        // System.out.println(i);
        // i++;
        // }

        // while(!(i>=100)){
        // System.out.println(i);
        // i++;
        // }

        while (i <= 100) {
            System.out.println(i);
            i++;

            if (i == 90) {
                break;
            }
        }

        System.out.println("loop ends");

        String str = " We have large inventory of things in our warehouse falling into "
                + "the category:Apparel and the slightly more in "
                + "demand category:makeup along with the category:furniture and ...";

        printCategories(str);

    }

    /**
     * 
     * extract all the categories from the given string
     * 
     * @param str
     */
    public static void printCategories(String str) {
        int start, end, i = 0, catLen = 9;
        String catVal;
        System.out.println("Print Categories");
        while (true) {
            start = str.indexOf("category:", i);

            end = str.indexOf(" ", start + catLen);

            if (start == -1) {
                break;
            }
            catVal = str.substring(start + catLen, end);
            System.out.println(catVal);
            i = end + 1;
        }
    }

}
