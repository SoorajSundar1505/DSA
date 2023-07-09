package Strings;

public class minWindow {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(min(s,t));
    }

    public static String min(String s, String expected){
        int t_len=expected.length();
        String op = recursion(0,0,t_len,expected,s);
        return op;
    }

    public static String recursion(int i, int j, int len, String expected, String s){
        if(len>s.length()) {
            return "break";
        }
        String actual = "";
        while(i<s.length()){
            while(j<s.length() && j<len){
                actual+=String.valueOf(s.charAt(j));
                j++;
            }
            if(actual.contains(expected)){
                return actual;
            }else{
                len++;
                i++;
                j=i;
                actual="";
            }

        }
        return recursion(i,j,len+1,expected,s);
    }
}
