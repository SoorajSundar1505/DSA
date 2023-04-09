package Array;

public class JumpGameII {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums){
        int jump=0;
        int end=0;
        int far=0;
        for(int i=0;i<nums.length-1;i++){
            far=Math.max(far,i+nums[i]);
            if(i==end){
                jump++;
                end=far;
            }
        }
        return jump;
    }
}

//2,3,1,1,4
//i=0 far=2 end=2 jump=1
//i=1 far=4 end=2 jump=1
//i=2 far=4 end=4 jump=2
//i=3 far=4 end=4 jump=2



