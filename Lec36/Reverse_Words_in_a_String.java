import java.util.Arrays;

public class Reverse_Words_in_a_String{
    public static void main(String [] args){
        String str = "   welcome    to coding blocks   ";
        str = str.trim();
        String arr [] = str.split(" +");
        
        System.out.println(Arrays.toString(arr));
        System.out.println(str);


    }
   

}