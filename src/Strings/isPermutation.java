package Strings;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class isPermutation {
    public static void main(String[] args) {
        String s = "dog";
        String t = "god";
        char[] arr1 =  s.toCharArray();
        char[] arr2 =  t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
        if(arr1.equals(arr2)) {
            System.out.println("permutation");
        }else{
            System.out.println("not");
        }


    }

}
