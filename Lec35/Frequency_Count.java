public class Frequency_Count {
    public static void main(String[] args) {
        String str = "hellooo";
        int freq[] =  new int[26];

        for(int i = 0; i<str.length() ; i++){
           int idx = str.charAt(i)-97;
           freq[idx]++;
        }

        for(int i = 0 ; i<freq.length ;i++){
            if(freq[i]>0){
               char ch = (char)( i+97);
               System.out.println(ch +"===>" +freq[i]);
            }
        }
    }
}