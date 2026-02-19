public class Rotate_Array {

    public static void main(String[] args) {
        

        int arr [] = {1,2,3,4,5};
        int n = arr.length;
        int k = 7;
        k = k%n;
        Print(arr);
        System.out.println();
        Rotate(arr, k, n);
        Print(arr);

        
    }
    public static void Print(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Rotate(int arr[], int k, int n){
        for(int i = 0 ; i<k ; i++){
            int key = arr[n-1];
            int j = n-1;
            while(j>0){
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = key;
        }
    }
}