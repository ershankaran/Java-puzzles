package practise.Loops;

public class LoopsPractise3 {
    

    public static void main(String[] args) {
         int cnt = 0;
       
        for(int idx=0;idx<10000;idx++){

            for(int j =0 ; j <  100 ; j++){
                // System.out.println(" idx - "+idx+" ----  J - "+j);
                for(int i =0 ; i <  100 ; i++){
                    for(int k =0 ; k <  100 ; k++){
                        cnt++;
                    }
                }
            }

    }

    System.out.println(cnt);
        
    }

    

}
