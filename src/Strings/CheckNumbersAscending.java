package Strings;

import java.util.ArrayList;
import java.util.List;

public class CheckNumbersAscending {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(s));
    }
    public static boolean areNumbersAscending(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            if(Character.isDigit(c)){
                sb.append(c+" ");
            }
        }
        System.out.println(sb);
        for(int i=0;i<sb.length()-1;i++){
            if(sb.charAt(i)<sb.charAt(i+1)){
                return true;
            }
        }

    return false;
    }
}
