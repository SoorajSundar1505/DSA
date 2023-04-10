package Array;

public class JumpGameI {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,0,4,5};
        System.out.println(jump(nums));
    }
    public static boolean jump(int[] nums){
//        int far=0;
//        for(int i=0;i<=far;i++){
//            far = Math.max(far, i+nums[i]);
//            if(far>=nums.length-1) return true;
//        }
//        return false;

        int boundary = 0;
        for(int i=0;i<=boundary;i++){
            boundary=Math.max(boundary,i+nums[i]);
            if(boundary>=nums.length-1) return true;
        }
        return false;

    }
}
