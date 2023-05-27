package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class addK_SubArray {
    public static void main(String[] args) {
        int[] nums = {5,3,2};
        int k = 7;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            int ind = 0;
            map.put(ind,i);
            ind++;
        }
        System.out.println(map);


    }

}
