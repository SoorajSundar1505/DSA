package Strings;
import java.io.*;
public class minDistande {
    public static void main(String[] args) {
        String[] S = {"geeks", "for", "geeks", "contribute", "practice"};
        String word1 = "geeks";
        String word2 = "practice";
        int first = 0, second=0;
        for(int i=0;i<S.length;i++){
            if(S[i].equals(word1)){
                first=i;
            }
            if(S[i].equals(word2)){
                second=i;
                break;
            }
        }
        System.out.println(second-first-1);
    }
}
