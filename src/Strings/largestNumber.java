package Strings;

import java.util.*;

public class largestNumber {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s = String.valueOf(nums[i]);
            if(s.length()>1){
                for(int j=0;j<s.length();j++){
                    list.add(Integer.parseInt(String.valueOf(s.charAt(j))));
                }
            }else list.add(nums[i]);
        }
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
        }
        System.out.println(sb.toString());
    }
}
