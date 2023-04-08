package Array;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        pivotIndex(nums);
    }
    public static int pivotIndex(int[] nums) {
        int total=0;
        int leftsum=0;
        for(int num:nums){
            total=total+num;
        }
        for(int i=0;i<nums.length;i++){
            if(total-leftsum-nums[i]==leftsum){
                return i;
            }
            leftsum=leftsum+nums[i];
        }
        return -1;
    }
}
