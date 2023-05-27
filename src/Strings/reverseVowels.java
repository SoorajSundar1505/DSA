package Strings;

public class reverseVowels {
    public static void main(String[] args) {
        //reverse string and take vowels
        String s = "leetcode";
        String vowel = "";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ){
                vowel+=s.charAt(i);
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ){
               for(int j=0;j<vowel.length();j++){
                   s=s.replace(s.charAt(i),vowel.charAt(j));
               }
            }
        }
        System.out.println(vowel);
        System.out.println(s);
    }
}
