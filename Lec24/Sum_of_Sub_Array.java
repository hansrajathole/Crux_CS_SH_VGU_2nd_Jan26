public class Sum_of_Sub_Array {
    public static void main(String[] args) {
        
        int arr [] = {1,2,3,4,5};

        int maxSum = 0;
        for(int start = 0 ; start<arr.length ; start++){
           
           int currentSum = 0;
            for(int end = start ; end < arr.length ; end++){
                currentSum += arr[end];
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("max sum of sub Array : "+ maxSum);
    }
}
