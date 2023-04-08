package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Suraj";
        String rev = recursion(s);
//        for(int i=s.length()-1;i>=0;i--){
//            rev+=s.charAt(i);
//        }
        System.out.println(rev);
    }

    public static String recursion(String s){
        if(s.length()==0) return s;
        return recursion(s.substring(1))+s.charAt(0);
    }
}
