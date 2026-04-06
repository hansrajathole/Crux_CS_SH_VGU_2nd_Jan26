public class Laxicographic {
    public static void main(String[] args) {
        String str1 = new String("Anket");
        String str2 = new String("Ankit");

        System.out.println(str1.compareTo(str2));
        System.out.println(compareTo(str1, str2));

    }

    public static int compareTo(String str1,String str2){
        if(str1 == str2){
            return 0;
        }

        int n = Math.min(str1.length(), str2.length());
        for(int i = 0 ; i<n ; i++){
            if(str1.charAt(i)!= str2.charAt(i)){
                return str1.charAt(i)-str2.charAt(i);
            }
        }
        return str1.length() - str2.length();
     }
}
