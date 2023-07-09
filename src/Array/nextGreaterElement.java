package Array;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] nums = {2,4,5,1,7};
        int next = 0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[j]>nums[i]){
                    int diff = nums[j]-nums[i];
                    min=Math.min(min,diff);
                }
            }
        }
    }
}
