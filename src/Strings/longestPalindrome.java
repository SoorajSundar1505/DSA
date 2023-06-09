package Strings;

import java.util.HashSet;

public class longestPalindrome {
    public static void main(String[] args) {
        String s = "aabbcc";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        if(s==null || s.length()<0){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count++;
            }else{
                set.add(s.charAt(i));
            }
        }
        if(!set.isEmpty()){
            return count*2+1;
        }
        return count*2;
    }
}
