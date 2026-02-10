import java.util.Scanner;

public class Array_Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = input.nextInt();
        }

        Print(arr);
     }
    
     public static void Print(int[] arr){
         for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

     }


}
