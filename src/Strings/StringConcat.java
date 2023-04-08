package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringConcat {
    public static void main(String[] args) {
        String[] words = {"test","suraj"};
        String s = "testsurajnotestsuraj";
        List<Integer> result = substringConcatOfAllWords(s,words);
        System.out.println(result.toString());
    }

    public static List<Integer> substringConcatOfAllWords(String s, String[] words){
        List<Integer> ans = new ArrayList<>();
        if (s == null || words.length == 0) return ans;
        int n = words.length;  //Array Length
        int  wordLen = words[0].length(); // Length of 1st element in array
        Map<String, Integer> hist = new HashMap<>();
        for (String w : words) {
            hist.put(w, hist.getOrDefault(w, 0)+1);
        }
        Map<String, Integer> curHist = new HashMap<>();
        for (int i = 0; i <= s.length() - n*wordLen; i++) {
            if (hist.containsKey(s.substring(i, i+wordLen))) {
                curHist.clear();
                for (int j = 0; j < n; j++) {
                    String word = s.substring(i + j*wordLen, i+(j+1)*wordLen);
                    if (hist.containsKey(word)) {
                        curHist.put(word, curHist.getOrDefault(word, 0) + 1);
                        if (curHist.get(word) > hist.get(word))
                            break;
                    } else
                        break;
                }
                if (hist.equals(curHist)) ans.add(i);
            }

        }
        return ans;
    }
}
