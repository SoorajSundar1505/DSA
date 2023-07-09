package Array;

import java.util.ArrayList;
import java.util.List;

public class countOfSmallNumAfterSelf {
    public static void main(String[] args) {
        int[] nums = {5,2,6,1};
        System.out.println(countSmaller(nums));
    }

    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            ans.add(count);
            count=0;
        }
        return ans;
    }
}
