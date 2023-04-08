import java.util.Arrays;

public class FindsmallestInt {
    public static void main(String[] args) {
        int[] nums = {0,-1,2,3};
        System.out.println(findsmallestint(nums));
    }
    public static int findsmallestint(int[] nums){
        Arrays.sort(nums);
        int i=0;
        int missing=1;
        while(i<nums.length){
            if(nums[i]==missing){
                i++;
                missing++;
            }else if(nums[i]>missing){
                return missing;
            }else {
                i++;
            }
        }

        return missing;

    }
}
