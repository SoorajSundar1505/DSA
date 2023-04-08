public class CountZeroSubArray {
    public static void main(String[] args) {
        int[] nums = {0,0,0,2,0,0};
        System.out.println(zeroFilledSubarray(nums));
    }
    public static long zeroFilledSubarray(int[] nums) {
        int count = 0;
        long res = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                count=0;
            }
            res+=count;
        }
        return res;
    }
}
