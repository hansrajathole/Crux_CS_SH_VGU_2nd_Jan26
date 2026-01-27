package Lec7;

public class Pattern14 {

    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int row = 1;
        int space = n-1;

        while (row<=n*2-1) {

            //Space 
            int j = 1;
            while (j<=space) {
                System.out.print("  ");
                j++;
            }
            //Star
            int i = 1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }
            //Next line prep
            if(row<n){
                star++;
                space--;
            }else{
                star--;
                space++;
            }

            row++;
            System.out.println();

        }
    }
     
}