public class Max_Array {
    public static void main(String[] args) {
        int arr[] ={1,3,5,2,4,7,8};
        int ans = Max(arr);
        System.out.println(ans);
    }

    public static int Max(int [] arr){
        int max = arr[0];

        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }

        return max;
    } 
}
