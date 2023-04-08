package Array;

import java.util.Arrays;

public class RunninhSumOfArray {
    public static void main(String[] args) {
//        Input: nums = [1,2,3,4]
//        Output: [1,3,6,10]

        int[] nums = {1,2,3,4};
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
