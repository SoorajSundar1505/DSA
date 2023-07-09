package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StringGreat {
    public static void main(String[] args) {
        String s = "abBAcC";
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }

        int count = 0;
        for(int i=0;i<list.size();i++){
            for(int j=0;j<s.length();j++){
                if(list.get(i)==s.charAt(j)) {
                    count++;
//                    if(count==1)
                }
            }
        }

        System.out.println(list.get(0)=='B');
    }
}
