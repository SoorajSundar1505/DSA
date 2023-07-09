package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationStr {
    public static void main(String[] args) {
        String s = "abc";
        solve(s.toCharArray(),0);
    }
    public static void solve(char[] arr, int index){
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if(index== arr.length-1){
//            list.add(String.valueOf(arr));
//            System.out.println(String.valueOf(arr));
            sb.append(String.valueOf(arr));

        }

        for(int i=index;i<arr.length;i++) {
            swap(arr, index, i);
            solve(arr, index + 1);
            swap(arr, index, i);
        }
    }

    public static void swap(char[] arr, int idx1, int idx2){
        char temp = arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
}
