package Strings;

import java.util.HashMap;

public class OptimalPartitionOfString {
    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(partitionString(s));
    }

    public static int partitionString(String s) {
        HashMap<Character,Boolean> map = new HashMap<>();
        int index=0;
        int count=0;
        while(index<s.length()){
            if(map.containsKey(s.charAt(index))){
                count++;
                map.clear();
            }
            map.put(s.charAt(index),true);
            index++;
        }
        return count+1;
    }
}

