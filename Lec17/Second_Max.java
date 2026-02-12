public class Second_Max {
    public static void main(String[] args) {
        int arr[] ={1,3,5,2,4,9,8};

        Sec_Max(arr);

    }

    public static void Sec_Max(int arr []){
        int largest = Math.max(arr[0], arr[1]);
        int sLargest = Math.min(arr[0], arr[1]);

        for(int i = 2 ; i<arr.length ; i++){
            if(largest < arr[i]){
                sLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>sLargest){
                sLargest = arr[i];
            }

        }

        System.out.println(sLargest);
    }
}
