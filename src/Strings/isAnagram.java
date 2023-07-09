package Strings;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
        Anagram("suraj","vijay");
    }

    public static void Anagram(String s, String t){
        if(s.length()!=t.length()){
            System.out.println("Not Anagram");
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i)){
                flag=false;
                break;
            }
            flag=true;
        }

        if(flag==false) {
            System.out.println("Not Anagram");
        }else{
            System.out.println("Ana");
        }
    }
}
