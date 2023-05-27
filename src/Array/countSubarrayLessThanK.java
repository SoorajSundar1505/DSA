package Array;

public class countSubarrayLessThanK {
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int ans = numSubarrayProductLessThanK(nums,100);
        System.out.println(ans);
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int p = 1;
        int count = 0;
        int start=0,end=0;
        while(end<nums.length){
            p*=nums[end];
            while(start<nums.length && p>=k){
                p=p/nums[start];
                start++;
            }
            if(p<k)
            {count+=end-start+1;
                end++;}
        }
        return count;
    }
}
