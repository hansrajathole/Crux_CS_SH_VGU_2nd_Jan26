package Lec10;

public class SwapNum {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        a = a+b - (b=a);

        System.out.println(a);
        System.out.println(b);
        
    }
}
