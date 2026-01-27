package Lec7;

public class Pattern15 {

    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int space = 0;
        int row = 1;

        while (row<=n*2-1) {
           
            // Space
            int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }

            //Star
            int j = 1;
            while (j<= star) {
                System.out.print("* ");
                j++;
            }

            // Next line prep
            if(row<n){
                space += 2;
                star--;
            }else{
                space -= 2;
                star++;
            }

            row++;
            System.out.println();
        }
    }
     
}