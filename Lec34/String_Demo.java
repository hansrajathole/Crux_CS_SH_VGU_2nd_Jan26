public class String_Demo{
    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        // str1 = str1.concat(str4);
        System.out.println(str1);
        System.out.println(str4);

        // str1 = str4+str3;
        // System.out.println(str1);

        // System.out.println(str1 == str2); // compare address
        // System.out.println(str3 == str4);  // compare address
        // System.out.println(str3 ==  str2);  // compare address

        // System.out.println(str1.equals(str2)); // compare value
        // System.out.println(str3.equals(str4)); // compare value
        // System.out.println(equals(str1, str2));
        // System.out.println(equals(str3, str4));


        System.out.println(str1.compareTo(str4)); // ---> +ve    , -ve    , 0
    }

     public static boolean equals(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        for(int i = 0 ; i<s1.length() ; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }

        return true;
     }

  


    }