package Array;

public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {10,11,13,15,17,2,3};
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }
            else if(nums[mid]<nums[start]){
                end=mid;
            }else{
                end--;
            }
        }
        System.out.println(nums[start]);
    }
}
