package Lec10;

public class forLoopDemo {
    public static void main(String[] args) {
        

        // first way
        for(int i = 1;i<=10 ;i++ ){
            System.out.println(i);
        }

         // sec way
         int i = 1;
        for(;i<=10 ;i++ ){
            System.out.println(i);
        }

          // Third way
         int j = 1;
        for(;j<=10 ;){
            System.out.println(j);
            j++;
        }

          // Four way
       
        for( int k = 1;k<=10 ;){
            System.out.println(k);
            k++;
        }
    }
}
