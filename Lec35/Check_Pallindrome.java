public class Check_Pallindrome{
    public static void main(String[] args) {
        String str = "maam";

        if(isPallindrome(str)){
            System.out.println("String is Pallindrome");
        }else{
            System.out.println("String is not pallindrome");
        }

    }

    public static boolean isPallindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while (i<j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}