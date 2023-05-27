package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findCommonChar {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        int n = words.length;
        List<String> list=new ArrayList<>();
        String first = words[0];
        String second = words[1];
        for(int i=0;i<first.length();i++){
            for(int j=0;j<second.length();j++){
                if(first.charAt(i)==second.charAt(j)){
                    list.add(Character.toString(first.charAt(i)));
                }
            }
        }
        String third = words[2];
        for(int k=0;k<list.size();k++){
            for(int m=0;m<third.length()-1;m++){
                if(!list.get(k).contains(Character.toString(third.charAt(m)))){
                    list.remove(k);
                }
            }
        }
        System.out.println(list);
    }
}
