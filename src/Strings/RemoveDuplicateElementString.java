package Strings;

import java.util.HashSet;

public class RemoveDuplicateElementString {
    public static void main(String[] args) {
        String s = "Good Bye Bye India Good";
        int n = s.length();
        String[] str = s.split(" ");
        HashSet<String> set = new HashSet<>();
        for(String t:str){
            if(!set.contains(t)){
                set.add(t);
            }
        }

        //convert set(anything) to string
        String res = String.join(" ",set);
        System.out.println(res);
    }
}
