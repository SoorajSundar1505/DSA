package Array;

import java.util.Arrays;

public class LongestIncreasingSubseq {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,2,3};
        lengthOfLIS(nums);
    }
    public static int lengthOfLIS(int[] nums) {
        int n =nums.length;
        int[] dp = new int[n];
        //Arrays.fill(dp,1);
        int max=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<=i-1;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
