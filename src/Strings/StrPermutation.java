package Strings;

import java.util.ArrayList;
import java.util.List;

public class StrPermutation {
    public static void main(String[] args) {
        String s = "abbc";
        String t = "dabbcdeabbcretabbcabbcty";
        int s_len = s.length();
        int t_len = t.length();
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;
//        while(j<t_len){
//            if(s.charAt(i)!=t.charAt(j)){
//                j++;
//            }else{
//                System.out.println(j);
//                i++;
//                j++;
//            }

//            if(i==s_len) i=0;
//        }
//        System.out.println(list);

        while(j<t_len){
            if(t.contains(s)){
                System.out.println(t.indexOf(s));
            }else{
                j++;
            }
        }
    }
}
