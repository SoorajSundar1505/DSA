package Array;

import java.util.HashMap;
import java.util.Map;

public class singleNumberII {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};
        HashMap<Integer,Integer> map = new HashMap();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],count++);

            }else{
                map.put(nums[i],count+1);
            }
        }
        System.out.println(map);
        int ans = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                ans=entry.getKey();
            }
        }
    System.out.println(ans);
    }
}
