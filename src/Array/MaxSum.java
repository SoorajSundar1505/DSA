package Array;

public class MaxSum {
    public static void main(String[] args) {
        int[] nums = {6,10,23,-10};
        int k=2;
        int max_sum = 0;
        for(int i=0;i<k;i++){
            max_sum+=nums[i];
        }
        int curr_sum=max_sum;
        for(int i=k;i<nums.length;i++){
            curr_sum+= nums[i]-nums[i-k];
            max_sum=Math.max(max_sum,curr_sum);
        }
        System.out.println(max_sum);
    }
}
