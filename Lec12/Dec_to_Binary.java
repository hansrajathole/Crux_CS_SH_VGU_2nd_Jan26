public class Dec_to_Binary {
    
    public static void main(String[] args) {
        
        int num = 39;
        int des = 2;
        int src = 10;
        int mul = 1;
        int sum = 0;

        while (num>0) {
            int rem = num%des;
            sum = sum+rem*mul;
            num = num/des;
            mul = mul*src;

        }

        System.out.println(sum);
    }
}