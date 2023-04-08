package HashSet;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s){
        int max = 0;
        int a = 0;
        int b = 0;
        HashSet<Character> set = new HashSet<>();
        while(a<s.length()){
            if(!set.contains(s.charAt(a))){
                set.add(s.charAt(a));
                max = Math.max(set.size(),max);
                a++;
            }else{
                set.remove(s.charAt(b));
                b++;
            }
        }

        return max;
    }
}
