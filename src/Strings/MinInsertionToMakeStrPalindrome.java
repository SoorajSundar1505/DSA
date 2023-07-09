package Strings;

public class MinInsertionToMakeStrPalindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        if(s.equals(reverse(s))){
            System.out.println("0");
        }else{
            
        }
    }
    public static String reverse(String s){
        int len = s.length();
        String rev = "";
        for(int i=len-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }

        return rev;
    }
}
