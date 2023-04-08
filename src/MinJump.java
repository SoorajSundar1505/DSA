public class MinJump {
    public static void main(String[] args) {
//        int[] nums = {2,3,1,1,4};
//        int jump=0;
//        int n = nums.length;
//        int far = 0;
//        int end=0;
//        for(int i=0;i<n-1;i++){
//            far=Math.max(far,i+nums[i]);  //4
//            if(i==end){
//                jump++;  //jump- 2
//                end=far; //end - 4
//            }
//        }
//        System.out.println(jump);

        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int boundary = 0;
        for(int i=0;i<=boundary;i++){
            boundary=Math.max(boundary,i+nums[i]);
            if(boundary>=nums.length-1) return true;
        }
        return false;

    }
}
