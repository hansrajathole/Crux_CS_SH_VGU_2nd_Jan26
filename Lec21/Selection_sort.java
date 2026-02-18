public class Selection_sort{

    public static void main(String [] args){

        int arr [] = {5, 8,7,3,1,2};
        Selection_sort(arr);
        Print(arr);

    }
    public static void Print(int arr []){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Selection_sort(int [] arr){
        for(int i = 0 ; i<arr.length-1 ; i++){
            int currentInd = i;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[currentInd]> arr[j]){
                    currentInd = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[currentInd];
            arr[currentInd] = temp;
        }
    }

}