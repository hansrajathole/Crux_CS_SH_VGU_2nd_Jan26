public class Binary_to_dec{
    public static void main(String[] args) {
        
        int num = 100111;
        int des = 10;
        int src = 2;
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