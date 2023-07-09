package Array;

import java.util.*;

public class topKfrequentEle {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k =2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num, map.get(num)+1);
            }
        }

        int[] list = new int[k];
        int count = 0;
        for(int i : map.keySet()){
            list[count]=i;
            count++;
            if(count==k) break;
        }
        System.out.println(Arrays.toString(list));
    }
}
