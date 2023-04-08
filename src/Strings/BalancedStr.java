package Strings;

public class BalancedStr {
    public static void main(String[] args) {
        String s =  "01000111";
        System.out.println(findTheLongestBalancedSubstring(s));
    }
    public static int findTheLongestBalancedSubstring(String s) {
        int res = 0;
        String temp = "01";
        while(temp.length() <= s.length()){
            if(s.contains(temp))
                res = temp.length();
            temp = "0" + temp + "1";
        }
        return res;
    }
}
