package practise.arrays;

public class ArraysPractise {
    public static void main(String[] args) {
        // arrays is used to store collection of elements

        int[] arr1;
        arr1 = new int[100];

        int arr2[] = new int[] {2,45,89,56,93};

        arr1[2] = 40;

        // for (int a : arr2){
        //     System.out.println(a);
        // }

       System.out.println("index of element 99 is "+ arrayElementSearch(arr2,92));

        // for (int i = 0;i<5;i++){
        //     for(int j = 0; j<5;j++){
        //         System.out.println("i "+i+" "+arr1[i]);
        //         System.out.println("j "+j+" "+arr1[j]);
        //     }
        // }
    }

    private static int arrayElementSearch(int[] arr2, int i) {
     
        for(int a =0 ; a < arr2.length; a++){
            if(arr2[a] == i){
                return a;
                // break;
            }
        }
        return -1;
    }
}
