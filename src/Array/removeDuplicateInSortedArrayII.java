package Array;



//Given an integer array nums sorted in non-decreasing order,
//        remove some duplicates in-place such that each unique element appears at most twice.
//        The relative order of the elements should be kept the same.
//
//        Since it is impossible to change the length of the array in some languages,
//        you must instead have the result be placed in the first part of the array nums.
//        More formally, if there are k elements after removing the duplicates,
//        then the first k elements of nums should hold the final result.
//        It does not matter what you leave beyond the first k elements.
public class removeDuplicateInSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        //op = 5 = {1,1,2,2,3,_}
        int fast=2,slow=2;
        while(fast<nums.length){
            if(nums[slow-2]!=nums[fast]){
                nums[slow]=nums[fast];
                slow+=1;
            }
            fast+=1;
        }
        System.out.println(slow);
    }
}
