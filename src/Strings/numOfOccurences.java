package Strings;

import java.util.HashMap;
import java.util.Map;

public class numOfOccurences {
    public static void main(String[] args) {
        String s = "Vijai";
        occurences(s);
    }

    public static HashMap<Character,Integer> occurences(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        int count = 1;
        if(s.length()==1){
            hm.put(s.charAt(0),1);
            return hm;
        }
        if(s==null || s.length()==0){
            hm.put('0',-1);
            return hm;
        }

        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),count);
            }else{
                hm.put(s.charAt(i),count+1);
            }
            count=1;
        }
//        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
//            System.out.print(entry.getKey() +" "+ entry.getValue());
//            System.out.println();
//        }

        for(Character c : hm.keySet()){
            System.out.println("key"+" "+c);
        }

        for(Integer c : hm.values()){
            System.out.println("Value"+" "+c);
        }
        return hm;
    }
}
